package com.example.test123

object WrongAnswers {
    private val ques = IntArray(5)  //suppose we have 5 incorrect answers


    fun validateIncorrectAnswers(
        IncorrectAnswers: Int
    ): Boolean {
        if(IncorrectAnswers == 5 ){
            return true
        }
        return false
    }
}