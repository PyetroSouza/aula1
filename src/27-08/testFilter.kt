package `27-08`

fun main() {
    println("*****************\nFilter\n**********************")
    //Funções de interação com collections - filter
    //Estrutura básica ('quais elementos quero manter?")
    val numeros = (1..10).toList()

    val pares = numeros.filter { numeros -> numeros % 2 == 0 }
    println(pares) //[2, 4, 6, 8, 10]

    // Para simplificar com único parâmetro
    //numeros.filter { it % 2 == 0}

    val numerosPares = numeros.filter { it % 2 == 0 }

    println("*****************\nMap\n**********************")
    //Estrutura básica ("Como eu quero trasnformar cada elemento?")
    val dobro = numeros.map { numeros -> numeros * 2 }
    println(dobro) //[2, 4, 6, 8, 10, 12, 16, 18, 20]

    //Para simplificar com único parâmetro
    //numeros.map {numeros -> numeros * 2}
    val dobroMap = numeros.map { it * 2 }

    println("*****************\nReduce\n**********************")
    //Estrutura básica (“como eu quero juntar tudo em um único valor?”):
    val soma = numeros.reduce { acumulador, numeros -> acumulador + numeros }
    println(soma) //15

    println("*****************\nEncadeamento\n**********************")
    //É possível encadear operações
    val result = numeros
    .filter { it % 2 == 0 }
    .map { numeros -> numeros * 2 }
    .reduce { acc, n -> acc * n }
    println(result) //12 (filtrou pares, dobrou e somou tudo)
}

