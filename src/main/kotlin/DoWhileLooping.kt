fun main () {
    var userInput: String?

    do {
        print("Masukkan sebuah kata (ketik 'exit' untuk keluar): ")
        userInput = readLine()

        println("Anda memasukkan: $userInput")
    } while (userInput != "exit")
}