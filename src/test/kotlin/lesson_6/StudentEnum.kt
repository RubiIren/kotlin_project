package lesson_6

enum class StudentEnum(
    val studentId: Int,
    val firstName: String,
    val lastName: String,
    val age: Int,
    val course: Int
) {
    KAPRALOV(1, "Roman", "Kapralov", 19, 2),
    YURCHENKO(99, "Marina", "Yurchenko", 21, 4);


    // Преобразуем элемент Enum в StudentDataClass
    fun toStudent(): StudentDataClass = StudentDataClass(
        studentId = studentId,
        firstName = firstName,
        lastName = lastName,
        age = age,
        course = course
    )
}