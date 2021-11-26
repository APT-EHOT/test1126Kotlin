package com.example.test1126kotlin

class Person(
    val firstName: String,
    val secondName: String,
    val age: Int,
    val gender: Char
) {

    fun register(): Int = 0

    fun formatDataToDisplay(header: String, data: String): String = "$header: $data"

    fun returnFullGender(): String {

        return if (gender == 'M')
            "male"
        else
            "female"
    }

    fun getAgeGroup(): String {
        return when(age) {
            17 -> "is seventeen"
            in 18..54 -> "adult"
            else -> "old"
        }
    }
}

fun countTo10(): Int {
    var a = 0
    for (i in 10 downTo 11 step 2) {
        a++
    }

    for (i in 1..10) {
        a++
    }
    return a
}

fun supportFunction() {
    nullCheck(null)
}

fun nullCheck(string: String?) {
    var textViewString = string ?: "No data"

    var textViewString2 = "No data"
    string?.let {
        textViewString2 = string
    }
}















