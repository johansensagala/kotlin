fun main() {
    print("Masukkan nama Anda: ")
    val nama: String? = readLine()

    if (nama != null) {
        println("Halo, $nama!")
    } else {
        println("Tidak ada nama yang dimasukkan.")
    }
}
