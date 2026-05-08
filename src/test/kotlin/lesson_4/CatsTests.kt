package lesson_4

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class CatsTests {
    val maf = Cat("Maf", null, null, "black", null, "Rubi", true)

    @Test
    @DisplayName("Age null check")
    fun ageNullCheck() {
        maf.age?.let { println("Maf age: $it") } ?: println("Maf age is null")
        maf.age shouldBe null
    }


    @Test
    @DisplayName("Breed null check")
    fun breedNullCheck() {
        maf.breed?.let { println("Maf breed: $it") } ?: println("Maf breed is null")
        maf.breed shouldBe null
    }

    @Test
    @DisplayName("Color null check")
    fun colorNullCheck() {
        maf.color?.let { println("Maf color: $it") } ?: println("Maf color is null")
        maf.color shouldBe "black"
    }

    @Test
    @DisplayName("Favorite food null check")
    fun foodNullCheck() {
        maf.favoriteFood?.let { println("Maf favorite food: $it") } ?: println("Maf favorite food is null")
        maf.favoriteFood shouldBe null
    }

    @Test
    @DisplayName("Owner Name null check")
    fun ownerNameNullCheck() {
        maf.ownerName?.let { println("Maf owner name: $it") } ?: println("Maf owner name is null")
        maf.ownerName shouldBe "Rubi"
    }

    @Test
    @DisplayName("Vaccinated null check")
    fun isVaccinatedNullCheck() {
        maf.isVaccinated?.let { println("Maf vaccinated: $it") } ?: println("Maf vaccinated is null")
        maf.isVaccinated shouldBe true
    }

    @Test
    @DisplayName("Apply test")
    fun testApply() {
        maf.apply {
            age = 12
            breed = "no"
            favoriteFood = "no"
        }
        maf.age shouldBe 12
        maf.breed shouldBe "no"
        maf.favoriteFood shouldBe "no"

        println("Maf age new = " + maf.age)
        println("Maf breed new = " + maf.breed)
        println("Maf favorite food new = " + maf.favoriteFood)

        println(maf)
    }
}

