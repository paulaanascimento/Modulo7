fun main() {
    println("---------- CAIXA DE SUPERMERCADO ----------")
    println("\nTotal a ser pago: ${calcularTotalCompra()}")
}

fun calcularTotalCompra():Double{
    print("Digite quantos tipos de produtos o cliente comprou: ")
    val tipos = readln().toInt()

    var total = 0.0

    for(i:Int in 1 .. tipos){
        print("\nDigite o nome do $i° produto: ")
        val nome = readln()
        print("Digite o preço unitário do produto: ")
        val preco = readln().toDouble()
        print("Digite a quantidade de $nome que o cliente comprou: ")
        val quantidade = readln().toInt()
        total += preco * quantidade
    }

    return total
}