package lesson_5

import io.kotest.matchers.shouldBe
import lesson_5.Helper.Companion.isUpperCase
import lesson_5.Helper.Companion.validatePhone
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class Homework {

    @Test
    @DisplayName("Valid phones")
    fun testPhone() {
        val phoneNumber1 = "+72345671890"
        val phoneNumber2 = "82345671890"
        val phoneNumber3 = "+71"

        phoneNumber1.validatePhone() shouldBe true
        phoneNumber2.validatePhone() shouldBe true
        phoneNumber3.validatePhone() shouldBe false
    }

    @Test
    @DisplayName("Upper Case text")
    fun upperCase() {
        val upperCase1 = "ABCD"
        val upperCase2 = "ABcd"
        val upperCase3 = "abcdef"
        val upperCase4 = "123 !@#"

        upperCase1.isUpperCase() shouldBe true
        upperCase2.isUpperCase() shouldBe false
        upperCase3.isUpperCase() shouldBe false
        upperCase4.isUpperCase() shouldBe true

    }
}

class Helper {
    companion object {
        fun String.validatePhone(): Boolean {
            val regex = Regex("^\\+?[7-8][0-9]{10,12}$")
            return regex.matches(this)
        }

        fun String.isUpperCase(): Boolean {
            // Проверяем, что строка не пустая и все буквы — заглавные
            return this.isNotEmpty() && this == this.uppercase()
        }
    }
}