fun main () {
    for (i in 1..10) {
        if (i == 3) {
            continue
        }
        if (i == 8) {
            break
        }
        println(i)
    }
}