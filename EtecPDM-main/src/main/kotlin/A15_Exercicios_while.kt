// Nome: Pablo Renato Moscardi - 3º Jogos

// A - Código para inverter o texto usando while( ):

fun main() {
    print("Digite um texto: ")
    val input = readLine() ?: ""
    
    var index = input.length - 1
    var reversedText = ""
    
    while (index >= 0) {
        reversedText += input[index]
        index--
    }
    
    println("Texto invertido: $reversedText")
}


// B - Função que verifica a quantidade de caracteres "x" e "o" com while( ):
fun verificarXO(text: String): Boolean {
    var xCount = 0
    var oCount = 0
    var index = 0

    while (index < text.length) {
        when (text[index].lowercaseChar()) {
            'x' -> xCount++
            'o' -> oCount++
        }
        index++
    }
    
    return if (xCount == 0 && oCount == 0) {
        false
    } else {
        xCount == oCount
    }
}

fun main() {
    print("Digite um texto: ")
    val input = readLine() ?: ""

    val resultado = verificarXO(input)
    println("A quantidade de 'x' e 'o' é a mesma? $resultado")
}
