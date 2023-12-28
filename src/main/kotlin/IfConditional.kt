fun main () {
    val nilai_bhs_inggris: Int = 85
    val nilai_bhs_indonesia: Int = 95
    val nilai_mtk: Int = 80

    val nilai_rata_rata = (nilai_bhs_inggris + nilai_bhs_indonesia + nilai_mtk) / 3

    if (nilai_bhs_inggris >= 80 &&
        nilai_bhs_indonesia >= 80 &&
        nilai_mtk >= 80 &&
        nilai_rata_rata >= 80) {
        println("Selamat, anda lulus!")
    } else {
        println("Maaf, anda tidak lulus")
    }
}
