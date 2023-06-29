package ex09

class Mensagem {
    companion object {
        fun imprimirMensagemUsuario() {
            print("Digite uma frase: ")
            val frase = readln()

            println("\n" + frase)
        }
    }
}