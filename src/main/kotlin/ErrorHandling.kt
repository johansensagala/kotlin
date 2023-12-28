fun main() {
    try {
        val hasil = bagi(10, 0)
        println("Hasil pembagian: $hasil")
    } catch (e: ArithmeticException) {
        println("Terjadi kesalahan aritmatika: ${e.message}")
    } finally {
        println("Program selesai dijalankan.")
    }
}

fun bagi(a: Int, b: Int): Int {
    return a / b
}
