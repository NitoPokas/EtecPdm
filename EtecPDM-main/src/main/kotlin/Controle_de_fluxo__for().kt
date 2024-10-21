fun main() {
    // Tarefa 1: Imprimindo números em ordem crescente

    for (i in 1..50) {
        print("$i ")
    }
    println() 

    // Tarefa 2: Imprimindo números em ordem decrescente

    for (i in 50 downTo 1) {
        print("$i ")
    }
    println() 

    // Tarefa 3: Imprimindo números excluindo múltiplos de 5

    for (i in 1..50) {
        if (i % 5 != 0) {
            print("$i ")
        }
    }
    println() 

    // Tarefa 4: Somando todos os números no intervalo de 1 a 500

    var soma = 0
    for (i in 1..500) {
        soma += i
    }
    println("Soma de 1 a 500: $soma")

    // Tarefa 5: Imprimindo uma escada de caracteres de libra

    val n = 5 // Defina o valor de 'n' aqui ou altere conforme necessário
    for (i in 1..n) {
        for (j in 1..i) {
            print("#")
        }
        println() 
    }
}

