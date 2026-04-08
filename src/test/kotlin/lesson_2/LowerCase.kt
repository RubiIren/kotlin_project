package lesson_2

import io.kotest.matchers.string.shouldBeLowerCase
import io.qameta.allure.Feature
import io.qameta.allure.Story
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Tags

@Feature("Case size")
@Story("Lower Case Tests")
@Tags(Tag("lowerCase"), Tag("regress"), Tag("case"))
class LowerCase {

    @Test
    @DisplayName("Test lowerCase")
    fun multiplication() {
        val a = "cats"

        a.shouldBeLowerCase()
        println("$a написано в нижнем регистре")
    }
}