import java.util.*

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")
}

fun fishFood (day: String) : String {
    return when (day) {
        "Monday" ->  "flakes"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Sunday" -> "plankton"
        else -> "nothing"
    }
}

fun randomDay() : String {
    val week = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(week.size)]
}

fun main(args: Array<String>) {
    val decorations = listOf ("rock", "pagoda", "plastic plant", "alligator", "flowerpot")
    val eager = decorations.filter{it[0] == 'p'}
    println("eager: $eager")
    val filtered = decorations.asSequence().filter{it[0] == 'p'}
    println("filtered: $filtered")
    val newList = filtered.toList()
    println("new list: ${filtered.first()}")
}
