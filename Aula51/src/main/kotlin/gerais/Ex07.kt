package gerais

fun main() {
    println("O valor da venda é: ${calcularValorVenda()}")
}

fun calcularValorVenda():Double{
    print("Digite o preço de custo: ")
    val custo = readln().toDouble()

    print("Digite o percentual para acréscimo: ")
    val percentual  = readln().toDouble()

    return  custo + custo * percentual
}