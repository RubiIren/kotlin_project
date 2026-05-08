package lesson_6

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class StudentEnumTest {

    @Test
    @DisplayName("Check all student data enum")
    fun studentAllDataEnumTest(): Unit {
        val testStudent = StudentDataClass(1, "Roman", "Kapralov", 19, 2)
        val enumStudent = StudentEnum.KAPRALOV.toStudent()

        enumStudent shouldBe testStudent
    }

    @Test
    @DisplayName("Check student data enum")
    fun studentDataEnumTest(): Unit {
        val testStudent = StudentDataClass(1, "Roman", "Kapralov", 19, 2)

        StudentEnum.KAPRALOV.studentId shouldBe testStudent.studentId
        StudentEnum.KAPRALOV.firstName shouldBe testStudent.firstName
        StudentEnum.KAPRALOV.lastName shouldBe testStudent.lastName
        StudentEnum.KAPRALOV.age shouldBe testStudent.age
        StudentEnum.KAPRALOV.course shouldBe testStudent.course


    }
}