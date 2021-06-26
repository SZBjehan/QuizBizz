package com.example.test123

object NoOfQuestions {
    private val ques = IntArray(10)

    fun validateNoOfQuestions(
        questionNo: Int
    ): Boolean {
        if(questionNo >= 11 ){
            return true
        }
        return false
    }
}