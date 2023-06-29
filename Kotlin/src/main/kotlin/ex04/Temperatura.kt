package ex04

class Temperatura {
    companion object {
        fun mostraClima() {
            print("Digite a temperatura em Graus Célsius: ")
            val temperatura = readln().toDouble()

            if(temperatura <= 18){
                println("O clima está frio")
            } else if(temperatura >18 && temperatura <=23){
                println("O clima está agradável")
            } else if(temperatura >23 && temperatura <=35){
                println("O clima está quente")
            } else println("O clima está muito quente")
        }
    }
}