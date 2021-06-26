package com.example.test123


import com.google.common.truth.Truth.assertThat
import org.junit.Test

//in this test only the first answer is correct
class AnswersUtilTest {

    @Test
    fun optionOne() {
        val result = AnswersUtil.validateAnswer(
            option1 = "right",
            option2 = "wrong",
            option3 = "wrong",
            option4 = "wrong"

            )
        assertThat(result).isTrue()
    }

    @Test
    fun optionTwo() {
        val result = AnswersUtil.validateAnswer(
            option1 = "wrong",
            option2 = "right",
            option3 = "wrong",
            option4 = "wrong"

            )
        assertThat(result).isFalse()
    }

    @Test
    fun optionThree() {
        val result = AnswersUtil.validateAnswer(
            option1 = "wrong",
            option2 = "wrong",
            option3 = "right",
            option4 = "wrong"

            )
        assertThat(result).isFalse()
    }

    @Test
    fun optionfour() {
        val result = AnswersUtil.validateAnswer(
            option1 = "wrong",
            option2 = "wrong",
            option3 = "wrong",
            option4 = "right"

            )
        assertThat(result).isFalse()
    }

}