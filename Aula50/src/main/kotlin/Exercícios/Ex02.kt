package Exercícios

class Ex02 {
    companion object{
        fun informarDia(){
            val diasSemana = arrayOf("Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado")
            print("Digite um número inteiro de 1 a 7: ")
            val dia = readln().toInt()

            when(dia){
                1 -> println(diasSemana[0])
                2 -> println(diasSemana[1])
                3 -> println(diasSemana[2])
                4 -> println(diasSemana[3])
                5 -> println(diasSemana[4])
                6 -> println(diasSemana[5])
                7 -> println(diasSemana[6])
                else -> println("O digitado está fora do intervalo!")
            }
        }
    }
}