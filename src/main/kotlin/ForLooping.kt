fun main () {
    val numbers = intArrayOf(10, 20, 30, 40, 50)

    for ((index, value) in numbers.withIndex()) {
        println("Index: $index, Value: $value")
    }
}