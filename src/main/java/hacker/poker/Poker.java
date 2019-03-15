package hacker.poker;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Poker
{

    /*
     * Given a set of 5 playing card identifiers such as 2H, 7C, QS, 10D, 2D;
     * determine if this hand is better than some other hand, according to the rules of poker.
     *
     * Hands will be a string with 5 cards comma separated,
     * each card will have 1-2 digits or JQKA and a suit indicator C,D,S,H (i.e. 10C, KH)
     *
     * Possible Hand Types Below:
     *   Straight flush
     *   Four of a kind
     *   Full house
     *   Flush
     *   Straight
     *   Three of a kind
     *   Two pair
     *   One pair
     *
     * The goal of this is to compare between the hand types.
     * Comparing 2 of the same type (i.e. 2 straights) to determine a winner is outside the scope
     * and will not be tested.
     *
     * Implement PokerHand.isGreaterThan(...) method and return whether or not the first hand wins over the second hand.
     */

    static class PokerHand
    {
        private enum Combination
        {
            None,
            OnePair,
            TwoPair,
            ThreeOfaKind,
            Straight,
            Flush,
            FullHouse,
            FourOfaKind,
            StraightFlush
        }

        private String handAsString;

        public PokerHand(String hand)
        {
            handAsString = hand;
        }

        public Boolean isGreaterThan(PokerHand hand2)
        {
            return this.getPokerHandCombination().ordinal() > hand2.getPokerHandCombination().ordinal();
        }

        private int getCardValue(String inputCard)
        {
            double value = 0;

            if (inputCard.length() > 1 && inputCard.length() <= 3)
            {
                String number = inputCard.substring(0, inputCard.length() - 1);
                String suit = inputCard.substring(inputCard.length() - 1);


                if (number.matches("\\d+"))
                {
                    value = Math.pow(2, Integer.parseInt(number) - 2);
                }
                else
                {
                    switch (number)
                    {
                        case "J":
                            value = Math.pow(2, 9);
                            break;
                        case "Q":
                            value = Math.pow(2, 10);
                            break;
                        case "K":
                            value = Math.pow(2, 11);
                            break;
                        case "A":
                            value = Math.pow(2, 12);
                            break;
                    }
                }

                switch (suit)
                {
                    case "C":
                        value += Math.pow(2, 13);
                        break;
                    case "D":
                        value += Math.pow(2, 14);
                        break;
                    case "S":
                        value += Math.pow(2, 15);
                        break;
                    case "H":
                        value += Math.pow(2, 16);
                }

            }
            return (int) value;
        }

        private Combination getPokerHandCombination()
        {

            List<Integer> cardsInHand = Stream.of(handAsString.split(",")).map(this::getCardValue).collect(Collectors.toList());
            int binarySum = cardsInHand.stream().reduce((i1, i2) -> i1 | i2).orElse(0);

            if (isStraightFlush(binarySum)) return Combination.StraightFlush;
            else if (isFlush(binarySum)) return Combination.Flush;
            else if (isStraight(binarySum)) return Combination.Straight;

            //clear suits
            int mask = 0b00001111111111111;
            Map<Integer, Integer> cardsMapWithoutSuit = new HashMap<>();

            for (Integer card : cardsInHand)
            {
                int value = card & mask;
                int count = cardsMapWithoutSuit.getOrDefault(value, 0);
                cardsMapWithoutSuit.put(value, count + 1);
            }

            if (isFourOfaKind(cardsMapWithoutSuit)) return Combination.FourOfaKind;
            else if (isFullHouse(cardsMapWithoutSuit)) return Combination.FullHouse;
            else if (isThreeOfaKind(cardsMapWithoutSuit)) return Combination.ThreeOfaKind;
            else if (isTwoPair(cardsMapWithoutSuit)) return Combination.TwoPair;
            else if (isOnePair(cardsMapWithoutSuit)) return Combination.OnePair;

            return Combination.None;
        }

        private boolean isStraightFlush(int sum)
        {
            if (isFlush(sum))
            {
                return isStraight(sum);
            }
            return false;
        }

        private boolean isFlush(int sum)
        {
            int result = sum & 0b11110000000000000;
            return result == Math.pow(2, 13) || result == Math.pow(2, 14) || result == Math.pow(2, 15)
                    || result == Math.pow(2, 16);
        }

        private boolean isStraight(int sum)
        {
            int mask = 0b00000000000011111;

            for (int i = 0; i < 9; i++)
            {
                if ((sum & mask) == mask)
                {
                    return true;
                }
                else
                    mask = mask << 1;
            }
            return false;
        }


        private boolean isFourOfaKind(Map<Integer, Integer> cardsMapWithoutSuit)
        {
            return cardsMapWithoutSuit.values().stream().anyMatch(count -> count == 4);
        }

        private boolean isThreeOfaKind(Map<Integer, Integer> cardsMapWithoutSuit)
        {
            return cardsMapWithoutSuit.values().stream().anyMatch(count -> count == 3);
        }

        private boolean isFullHouse(Map<Integer, Integer> cardsMapWithoutSuit)
        {
            return cardsMapWithoutSuit.keySet().size() == 2;
        }

        private boolean isTwoPair(Map<Integer, Integer> cardsMapWithoutSuit)
        {
            return cardsMapWithoutSuit.keySet().size() == 3;
        }

        private boolean isOnePair(Map<Integer, Integer> cardsMapWithoutSuit)
        {
            return cardsMapWithoutSuit.keySet().size() == 4;
        }

        @Override
        public String toString()
        {
            return handAsString;
        }

    }

    public static void testHand1IsGreaterThanHand2(String hand1AsString,
                                                   String hand2AsString,
                                                   Boolean expectedResult)
    {
        PokerHand hand1 = new PokerHand(hand1AsString);
        PokerHand hand2 = new PokerHand(hand2AsString);
        System.out.println("Hand1[" + hand1 + "] > Hand2[" + hand2 + "] \t-- " +
                "expected: " + expectedResult + ", actual: " + hand1.isGreaterThan(hand2));

    }

    public static void main(String[] args)
    {

        testHand1IsGreaterThanHand2(
                "8C,9C,10C,JC,QC", // straight flush
                "6S,7H,8D,9H,10D",
                true);

        testHand1IsGreaterThanHand2(
                "4H,4D,4C,4S,JS", //four of a kind
                "6C,6S,KH,AS,AD",
                true);

        testHand1IsGreaterThanHand2(
                "6C,6D,6H,9C,KD",
                "5C,3C,10C,KC,7C", // flush
                false);

        testHand1IsGreaterThanHand2(
                "4H,4D,4C,KC,KD", // full house
                "9D,6S,KH,AS,AD",
                true);

        testHand1IsGreaterThanHand2(
                "6C,6D,6H,9C,KD",
                "2C,3C,4S,5S,6S", // straight
                false);

        testHand1IsGreaterThanHand2(
                "7C,7D,7S,3H,4D", // three of a kind
                "9S,6S,10D,AS,AD",
                true);

        testHand1IsGreaterThanHand2(
                "2S,2D,JH,7S,AC",
                "8C,8H,10S,KH,KS", // two pair
                false);

        testHand1IsGreaterThanHand2(
                "AC,AH,3C,QH,10C", // one pair
                "3S,2D,KH,JS,AD",
                true);

//        testHand1IsGreaterThanHand2(
//                "2H,3D,5S,9C,KD", // high card 9
//                "2C,3H,4S,8C,KH",
//                true);
//
//        testHand1IsGreaterThanHand2(
//                "2C,3H,4S,8C,KH",
//                "2H,3D,5S,9C,KD", // high card 9
//                false);
//
//        testHand1IsGreaterThanHand2(
//                "5D,3D,7D,QD,AD",
//                "5C,3C,7C,QC,KC", // flush
//                true);
    }
}
