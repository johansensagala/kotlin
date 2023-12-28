import kotlin.math.PI

// Fungsi tanpa parameter dan tanpa return
fun greet() {
    println("Hello, World!")
}

// Fungsi dengan parameter dan tanpa return
fun intro(nama: String) {
    println("Hello, $nama")
}

// Fungsi tanpa parameter dan dengan return
fun pi(): Double {
    return PI
}

// Fungsi dengan parameter dan dengan return
fun hitungLuasLingkaran(jariJari: Double): Double {
    return pi() * jariJari * jariJari
}

// Fungsi dengan default argument
fun hitungVolumeTabung(jariJari: Double, tinggi: Double = 1.0): Double {
    return pi() * jariJari * jariJari * tinggi
}

fun main() {
    greet()
    intro("Johansen")
    println("Nilai pi adalah: ${pi()}")

    val jariJariLingkaran = 5.0
    val luasLingkaran = hitungLuasLingkaran(jariJariLingkaran)
    println("Luas lingkaran dengan jari-jari $jariJariLingkaran adalah: $luasLingkaran")

    val jariJariTabung = 3.0
    val tinggiTabung = 8.0
    val volumeTabung = hitungVolumeTabung(jariJariTabung, tinggiTabung)
    println("Volume tabung dengan jari-jari $jariJariTabung dan tinggi $tinggiTabung adalah: $volumeTabung")
}
