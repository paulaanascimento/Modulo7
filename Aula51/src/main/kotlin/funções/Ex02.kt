package funções

fun main() {
    println("Meu nome é ${nomeUsuario()}")
}

fun nomeUsuario(): String {
    print("Digite o seu nome: ")

    return readln()
}