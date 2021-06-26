package com.example.test123

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class NoOfQuestionsTest{

    @Test
    fun InQuestionNo1() {
        val result = NoOfQuestions.validateNoOfQuestions(
            questionNo = 1
        )
        assertThat(result).isFalse()
    } @Test
    fun InQuestionNo2() {
        val result = NoOfQuestions.validateNoOfQuestions(
            questionNo = 2
        )
        assertThat(result).isFalse()
    } @Test
    fun InQuestionNo3() {
        val result = NoOfQuestions.validateNoOfQuestions(
            questionNo = 3
        )
        assertThat(result).isFalse()
    } @Test
    fun InQuestionNo4() {
        val result = NoOfQuestions.validateNoOfQuestions(
            questionNo = 4
        )
        assertThat(result).isFalse()
    } @Test
    fun InQuestionNo5() {
        val result = NoOfQuestions.validateNoOfQuestions(
            questionNo = 5
        )
        assertThat(result).isFalse()
    } @Test
    fun InQuestionNo6() {
        val result = NoOfQuestions.validateNoOfQuestions(
            questionNo = 6
        )
        assertThat(result).isFalse()
    } @Test
    fun InQuestionNo7() {
        val result = NoOfQuestions.validateNoOfQuestions(
            questionNo = 7
        )
        assertThat(result).isFalse()
    } @Test
    fun InQuestionNo8() {
        val result = NoOfQuestions.validateNoOfQuestions(
            questionNo = 8
        )
        assertThat(result).isFalse()
    }
    @Test
    fun InQuestionNo9() {
        val result = NoOfQuestions.validateNoOfQuestions(
            questionNo = 9
        )
        assertThat(result).isFalse()
    }
    @Test
    fun InQuestionNo10() {
        val result = NoOfQuestions.validateNoOfQuestions(
            questionNo = 10
        )
        assertThat(result).isFalse()
    }
    @Test
    fun InQuestionNo11plus() {
        val result = NoOfQuestions.validateNoOfQuestions(
            questionNo = 11
        )
        assertThat(result).isTrue()
    }


}