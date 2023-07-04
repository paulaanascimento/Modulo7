package Exercícios

class Ex05 {
    companion object{
        fun listaCompras(){
            print("Digite a quantidade de itens que deseja adicionar à lista: ")
            val quantidade = readln().toInt()

            val listaCompras = arrayOfNulls<String>(quantidade)

            for(i: Int in listaCompras.indices){
                print("Digite o ${i+1} item da lista: ")
                listaCompras[i] = readln()
            }

            println("\n---- Lista ----")
            listaCompras.forEach { produto -> println(produto) }
        }
    }
}