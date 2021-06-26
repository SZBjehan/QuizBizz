package com.example.test123

object AnswersUtil {
    private val options = listOf("right", "wrong", "wrong", "wrong")

    fun validateAnswer(
        option1: String,
        option2: String,
        option3: String,
        option4: String
    ): Boolean {
        if(option1 != "right" ){
            return false
        }
        return true
    }

}