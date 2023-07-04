package gerais

fun main() {
    val nome = nomeVendedor()
    val salario = salarioFixo()
    val totalVendas = totalVendas()

    println("\nNome: $nome\n" +
            "Salário Fixo: $salario\n" +
            "Salário Final: ${calcularSalarioFinal(totalVendas, salario)}")
}

fun nomeVendedor():String{
    print("Digite o nome do vendedor: ")
    return readln()
}

fun salarioFixo():Double{
    print("Digite o salário fixo: ")
    return readln().toDouble()
}

fun totalVendas():Double{
    print("Digite o total de vendas efetuadas por ele (em dinheiro): ")
    return readln().toDouble()
}

fun calcularSalarioFinal(totalVendas:Double, salarioFixo:Double) : Double{
    return totalVendas * 0.15 + salarioFixo
}