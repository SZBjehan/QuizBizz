package com.example.test123

object CorrectAnswers {
    private val ques = IntArray(5)  //suppose we have 5 correct answers


    fun validateCorrectAnswers(
        CorrectAnswers: Int
    ): Boolean {
        if(CorrectAnswers == 5 ){
            return true
        }
        return false
    }

}