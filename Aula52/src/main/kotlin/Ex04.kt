fun main() {
    println("---------- LOJA DE ANIMAIS ----------")
    registrarAnimais()
}

fun registrarAnimais(){
    print("Digite a quantidade de animais: ")
    val quantidade = readln().toInt()

    var gatos = 0
    var cachorros = 0

    for(i:Int in 1 .. quantidade){
        var tipo:String
        do{
            print("\nInforme o tipo do $i° animal: ")
            tipo = readln()

            when(tipo.lowercase()){
                "gato" -> gatos++
                "cachorro" -> cachorros++
                else -> println("Por favor, informe se o animal é 'gato' ou 'cachorro'")
            }
        }while (tipo!="gato" && tipo!="cachorro")
    }

    println("\nQuantidade de animais: $quantidade\n" +
            "Quantidade de gatos: $gatos\n" +
            "Quantidade de cachorros: $cachorros")

}