fun main() {
    mediaTurmas()
}

fun mediaTurmas(){
    print("Digite a quantidade de turmas: ")
    val turma = readln().toInt()

    var mediaEscola = 0.0

    for(i:Int in 1 .. turma){
        print("\nDigite a quantidade de alunos da $i° turma: ")
        val alunos = readln().toInt()

        var mediaTurma = 0.0
        for(j:Int in 1..alunos){
            print("Digite a média, no semestre, do $j° aluno da  $i° turma: ")
            mediaTurma += readln().toDouble()
        }
        mediaEscola+=mediaTurma/alunos
        println("A média da $i° turma é: ${mediaTurma/alunos}")

    }

    println("\nA média da escola é: ${mediaEscola/turma}")
}