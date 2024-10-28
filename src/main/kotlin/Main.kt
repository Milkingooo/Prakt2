fun main() {
        //ex1
        val age1 = 42
        val age2 = 21

        //ex2
        val avg1 = (age1 + age2) / 2

        //ex4
        val firstName = "Мася"
        val lastName = "Трушин"

        //ex5
        val fullName = "$firstName $lastName"

        //ex6
        val myDetails = "Привет, меня зовут $fullName, я диктор канала Мастерская Настроения"
        println(myDetails)

        //ex7
        val triple: Triple<Int, Int, Int> = Triple(1, 12, 2024)

        //ex8, 9
        val (month, day, year) = triple
        println("Месяц: $month, Год: $year")

        //ex10
        val newMonth = 10
        val newTriple: Triple<Int, Int, Int> = Triple(newMonth, day, year)
        println(newTriple)

}