// Fungsi lambda tanpa parameter
val helloLambda: () -> Unit = {
    println("Hello, Lambda!")
}

// Fungsi lambda dengan parameter
val greetLambda: (String) -> Unit = { nama ->
    println("Hello, $nama!")
}

// Fungsi lambda dengan parameter dan nilai kembalian
val squareLambda: (Int) -> Int = { angka ->
    angka * angka
}

fun main() {
    helloLambda()
    greetLambda("Johansen")

    val hasil = squareLambda(5)
    println("Hasil kuadrat: $hasil")
}
