fun main() {
    println("TABUADA DE MULTIPLICAÇÃO")
    tabuada()
}

fun tabuada(){
    for(i:Int in 1..9){
        println("\nTABUADA DO $i")
        for(j:Int in 1..10){
            println("$i * $j = ${i*j}")
        }
    }
}