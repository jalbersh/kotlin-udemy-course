package hacker.solutionk

class Singleton private constructor() {
    companion object {
        private var INSTANCE: Singleton ? = null
        fun getInstance(): Singleton{
            if(INSTANCE == null){
                INSTANCE = Singleton()
            }
            return INSTANCE!!
        }
    }

}