package lesson_4

data class Cat(
        val name: String,
        var age: Int?,
        var breed: String? = null,
        var color: String? = null,
        var favoriteFood: String? = null,
        var ownerName: String? = null,
        var isVaccinated: Boolean? = null
    )

