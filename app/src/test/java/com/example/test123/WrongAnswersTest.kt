package com.example.test123

import com.google.common.truth.Truth
import org.junit.Assert.*
import org.junit.Test

class WrongAnswersTest{

    @Test
    fun OneIncorrect() {
        val result = WrongAnswers.validateIncorrectAnswers(
            IncorrectAnswers = 1
        )
        Truth.assertThat(result).isFalse()
    }

    @Test
    fun TwoIncorrect() {
        val result = WrongAnswers.validateIncorrectAnswers(
            IncorrectAnswers = 2
        )
        Truth.assertThat(result).isFalse()
    }

    @Test
    fun ThreeIncorrect() {
        val result = WrongAnswers.validateIncorrectAnswers(
            IncorrectAnswers = 3
        )
        Truth.assertThat(result).isFalse()
    }

    @Test
    fun FourIncorrect() {
        val result = WrongAnswers.validateIncorrectAnswers(
            IncorrectAnswers = 4
        )
        Truth.assertThat(result).isFalse()
    }

    @Test
    fun FiveIncorrect() {
        val result = WrongAnswers.validateIncorrectAnswers(
            IncorrectAnswers = 5
        )
        Truth.assertThat(result).isTrue()
    }

    @Test
    fun SixIncorrect() {
        val result = WrongAnswers.validateIncorrectAnswers(
            IncorrectAnswers = 6
        )
        Truth.assertThat(result).isFalse()
    }

    @Test
    fun SevenIncorrect() {
        val result = WrongAnswers.validateIncorrectAnswers(
            IncorrectAnswers = 7
        )
        Truth.assertThat(result).isFalse()
    }

    @Test
    fun EightIncorrect() {
        val result = WrongAnswers.validateIncorrectAnswers(
            IncorrectAnswers = 8
        )
        Truth.assertThat(result).isFalse()
    }

    @Test
    fun NineIncorrect() {
        val result = WrongAnswers.validateIncorrectAnswers(
            IncorrectAnswers = 9
        )
        Truth.assertThat(result).isFalse()
    }

    @Test
    fun TenIncorrect() {
        val result = WrongAnswers.validateIncorrectAnswers(
            IncorrectAnswers = 10
        )
        Truth.assertThat(result).isFalse()
    }
}