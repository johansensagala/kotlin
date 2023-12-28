fun main() {
    val angka1 = 10
    val angka2 = 3

    val hasilPenjumlahan = angka1 + angka2
    val hasilPengurangan = angka1 - angka2
    val hasilPerkalian = angka1 * angka2
    val hasilPembagian = angka1 / angka2
    val sisaBagi = angka1 % angka2

    println("Penjumlahan: $hasilPenjumlahan")
    println("Pengurangan: $hasilPengurangan")
    println("Perkalian: $hasilPerkalian")
    println("Pembagian: $hasilPembagian")
    println("Sisa Bagi: $sisaBagi")

    var angka = 5
    angka++
    println("Penambahan Unary: $angka")

    angka--
    println("Pengurangan Unary: $angka")
}
