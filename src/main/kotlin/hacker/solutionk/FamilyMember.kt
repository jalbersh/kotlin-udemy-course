package hacker.solutionk

import hacker.solutionk.FamilyBudget

internal class FamilyMember {
    @FamilyBudget(userRole = "SENIOR", budgetLimit = 100)
    fun seniorMember(budget: Int, moneySpend: Int) {
        println("Senior Member")
        println("Spend: $moneySpend")
        println("Budget Left: " + (budget - moneySpend))
    }

    @FamilyBudget(userRole = "JUNIOR", budgetLimit = 50)
    fun juniorUser(budget: Int, moneySpend: Int) {
        println("Junior Member")
        println("Spend: $moneySpend")
        println("Budget Left: " + (budget - moneySpend))
    }
}
