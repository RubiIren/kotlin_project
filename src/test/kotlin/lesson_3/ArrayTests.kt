package lesson_3

import io.kotest.matchers.collections.shouldBeEmpty
import io.kotest.matchers.collections.shouldContain
import io.kotest.matchers.collections.shouldNotBeEmpty
import io.kotest.matchers.shouldBe
import io.qameta.allure.Feature
import io.qameta.allure.Story
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Tags
import org.junit.jupiter.api.Test

@Feature("Array")
@Story("Array tests")
@Tags(Tag("array"), Tag("regress"))
class ArrayTests {

    @Test
    @DisplayName("Check empty string array")
    fun checkEmptyStringArray() {
        val people: Array<String> = arrayOf()
        people.shouldBeEmpty()
    }

    @Test
    @DisplayName("Check empty int array")
    fun checkEmptyIntArray() {
        val numbers: Array<Int> = arrayOf()
        numbers.shouldBeEmpty()
    }


    @Test
    @DisplayName("Check not empty string array")
    fun checkNotEmptyStringArray() {
        val people: Array<String> = arrayOf("apple", "banana", "cherry")
        people.shouldNotBeEmpty()
    }

    @Test
    @DisplayName("Check not empty int array")
    fun checkNotEmptyIntArray() {
        val numbers: Array<Int> = arrayOf(1, 2, 3, 4, 5)
        numbers.shouldNotBeEmpty()
    }

    @Test
    @DisplayName("Check first element string array")
    fun checkFirstElementStringArray() {
        val people: Array<String> = arrayOf("apple", "banana", "cherry")
        people[0].shouldBe("apple")
    }

    @Test
    @DisplayName("Check first element int array")
    fun checkFirstElementIntArray() {
        val numbers: Array<Int> = arrayOf(1, 2, 3, 4, 5)
        numbers[0].shouldBe(1)
    }

    @Test
    @DisplayName("Array should contain")
    fun arrayShouldContain() {
        val people: Array<String> = arrayOf("apple", "banana", "cherry")
        people.shouldContain("banana")
    }
}