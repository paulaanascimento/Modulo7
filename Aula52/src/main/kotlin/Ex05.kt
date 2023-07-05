fun main() {
    println("\nOlá, ${nomeUsuario()}. Espero que tenha um ótimo dia!")
}

fun nomeUsuario():String{
    print("Digite o seu primeiro nome: ")
    return readln()
}
