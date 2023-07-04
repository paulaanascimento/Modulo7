package funções

fun main() {
    print("Digite o peso: ")
    val peso = readln().toDouble()

    print("Digite a altura: ")
    val altura = readln().toDouble()

    calcularIMC(peso, altura)
}

fun calcularIMC(peso:Double, altura:Double){
    val imc = peso/(altura * altura)

    if(imc < 18.5){
        println("\nClassificação: Magreza")
    } else if((imc >= 18.5) && (imc <= 24.9)){
        println("\nClassificação: Normal")
    } else if((imc >= 25.0) && (imc <= 29.9)){
        println("\nClassificação: Sobrepeso")
    } else if((imc >= 30.0) && (imc <= 39.9)){
        println("\nClassificação: Obesidade")
    } else println("\nClassificação: Obsidade Grave")
}