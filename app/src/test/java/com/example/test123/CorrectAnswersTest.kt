package com.example.test123

import com.google.common.truth.Truth.assertThat
import org.junit.Test


class CorrectAnswersTest{

    @Test
    fun OneCorrect() {
        val result = CorrectAnswers.validateCorrectAnswers(
            CorrectAnswers = 1
        )
        assertThat(result).isFalse()
    }

    @Test
    fun TwoCorrect() {
        val result = CorrectAnswers.validateCorrectAnswers(
            CorrectAnswers = 2
        )
        assertThat(result).isFalse()
    }

    @Test
    fun ThreeCorrect() {
        val result = CorrectAnswers.validateCorrectAnswers(
            CorrectAnswers = 3
        )
        assertThat(result).isFalse()
    }

    @Test
    fun FourCorrect() {
        val result = CorrectAnswers.validateCorrectAnswers(
            CorrectAnswers = 4
        )
        assertThat(result).isFalse()
    }

    @Test
    fun FiveCorrect() {
        val result = CorrectAnswers.validateCorrectAnswers(
            CorrectAnswers = 5
        )
        assertThat(result).isTrue()
    }

    @Test
    fun SixCorrect() {
        val result = CorrectAnswers.validateCorrectAnswers(
            CorrectAnswers = 6
        )
        assertThat(result).isFalse()
    }

    @Test
    fun SevenCorrect() {
        val result = CorrectAnswers.validateCorrectAnswers(
            CorrectAnswers = 7
        )
        assertThat(result).isFalse()
    }

    @Test
    fun EightCorrect() {
        val result = CorrectAnswers.validateCorrectAnswers(
            CorrectAnswers = 8
        )
        assertThat(result).isFalse()
    }

    @Test
    fun NineCorrect() {
        val result = CorrectAnswers.validateCorrectAnswers(
            CorrectAnswers = 9
        )
        assertThat(result).isFalse()
    }

    @Test
    fun TenCorrect() {
        val result = CorrectAnswers.validateCorrectAnswers(
            CorrectAnswers = 10
        )
        assertThat(result).isFalse()
    }
}