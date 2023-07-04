class Ex12 {
    companion object{
       fun linhaTempo(){
           print("Digite o seu ano de nascimento: ")
           val nascimento = readln().toInt()

           var idade = 0

           println("\nAno\t\t  Idade")
           for(i: Int in nascimento until 2024 ){
               println("$i\t\t$idade")
               idade++
           }
       }
    }
}