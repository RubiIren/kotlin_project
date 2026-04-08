package lesson_2

import io.kotest.matchers.shouldBe
import io.qameta.allure.Feature
import io.qameta.allure.Story
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Tags

@Feature("Triangle")
@Story("Right-angled triangle")
@Tags(Tag("triangle"), Tag("regress"))
class Triangle {
    val a = 3
    val b = 4
    val c = 5

    @Test
    @DisplayName("Test right-angled triangle")
    fun right_angled() {
        val sum_ab_2 = a * a + b * b
        val c_2 = c * c

        sum_ab_2 shouldBe c_2

        println("При a = $a, b = $b, c = $c треугольник прямоугольный")
    }
}