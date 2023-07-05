fun main() {
    verificarFerias()
}

fun verificarFerias(){
    print("Digite a quantidade de funcionários: ")
    val quantidade = readln().toInt()

    var temDireitoFerias = 0
    var naoTemDireitoFerias = 0

    for(i:Int in 1 .. quantidade){
        print("\nInforme o nome do $i° funcionário: ")
        val nome = readln()

        print("Informe, em meses, o tempo de serviço que $nome tem na empresa: ")
        val tempo = readln().toInt()

        if(tempo >= 12){
            println("\n$nome tem direito à férias.")
            temDireitoFerias++
        } else{
            println("\n$nome não tem direito à férias.")
            naoTemDireitoFerias++
        }
    }

    println("\nQuantidade de funcionários: $quantidade\n" +
            "Possuem direito à férias: $temDireitoFerias\n" +
            "Não possuem direito à férias: $naoTemDireitoFerias")

}