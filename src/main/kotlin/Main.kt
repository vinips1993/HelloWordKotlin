package org.example

// Função que imprime o texto fornecido
fun imprimir(texto: String?) {
    println(texto)  // Imprime o texto que pode ser nulo

    // Declarando uma variável mutável (pode ser alterada)
    var x = 10
    // Declarando uma variável mutável do tipo Float
    var y: Float = 9.9f

    // Imprime o valor de x incrementado em 2
    println("Valor de X: ${x + 2}")

    // Condicional para verificar o valor de y
    if (y > 10) {
        println("Maior que 10")
    } else if (y < 20) {
        println("Menor que 20")
    } else {
        println("...")
    }

    // Declaração de uma variável imutável (não pode ser alterada)
    val a = "20"
    // Converte y para um valor inteiro
    val b = y.toInt()

    // Função para comparar dois textos
    fun compararTextos(a: String = "", b: String = "") {
        if (a === b) {
            println("São Iguais")
        } else {
            println("São diferentes")
        }
    }

    // Função para comparar dois textos com valores fixos
    fun compararTextos() {
        val a = "A"
        val b = "B"

        if (a === b) {
            println("São Iguais")
        } else {
            println("São diferentes")
        }
    }
}

// Função principal que inicia a execução do programa
fun main() {
    // Função para mostrar o contato com valores padrão
    fun mostrarContato(nome: String = "João", telefone: String = "Sem telefone") {
        println("Nome: $nome")
        println("Telefone: $telefone")
    }

    // Chamadas de função para teste
    imprimir("Texto de exemplo")
    mostrarContato()
    mostrarContato("Maria", "1234-5678")
}
