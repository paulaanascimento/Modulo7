class Ex07 {
    companion object{
        fun calcularMedia(){
            print("Digite a quantidade de alunos que tem na sala: ")
            val quantidade = readln().toInt()

            val notas = IntArray(quantidade)

            var i = 0
            while(i < quantidade){
                print("Digite a nota do ${i+1}º aluno: ")
                notas[i] = readln().toInt()
                i++
            }
            println("A media da turma é ${notas.average()}")
        }
    }
}