package gerais

fun main() {
    print("\nO valor convertido para reais é: ${converterDolarParaReal()}")
}

fun converterDolarParaReal():Double{
    print("Digite a cotação atual do dólar: ")
    val cotacao = readln().toDouble()

    print("Digite a quantidade de dólares: ")
    val quantidade  = readln().toDouble()

    return cotacao * quantidade
}