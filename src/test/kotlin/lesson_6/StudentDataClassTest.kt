package lesson_6

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class StudentDataClassTest {

    val defaultStudent = StudentDataClass(1, "Roman", "Kapralov", 19, 2)

    @Test
    @DisplayName("Check all student")
    fun studentDataClassCheck() {
        val testStudent = StudentDataClass(1, "Roman", "Kapralov", 19, 2)
        defaultStudent shouldBe testStudent
    }

    @Test
    @DisplayName("Check student")
    fun studentDataCheck() {
        val testStudent = StudentDataClass(1, "Roman", "Kapralov", 19, 2)

        defaultStudent.studentId shouldBe testStudent.studentId
        defaultStudent.firstName shouldBe testStudent.firstName
        defaultStudent.lastName shouldBe testStudent.lastName
        defaultStudent.age shouldBe testStudent.age
        defaultStudent.course shouldBe testStudent.course
    }
}