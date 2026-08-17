/*
fun main(){
    print("Hello World")
}
*/
/****************************************************
var - O valor pode ser alterado
val - o valor não pode ser alterado (valor constante)
 ****************************************************/

fun main() {
    println("*****************\nPrimeiro Exemplo: \n**********************")
    val texto = "Boa tarde, pessoal!"
    println(texto)
    println(texto.length)
    println(texto.uppercase())
    println(texto.contains("pessoal"))

    println("*****************\nSegundo Exemplo: \n**********************")
    val acerto = "que acerto Kauan"
    println("Bom, $acerto") /*Codadenar*/

    println("*****************\nTerceiro Exemplo: \n**********************")
    val textoQuebrado = """
        Texto escrito
        em várias linhas
        para teste
       """.trimIndent() //tirar a identação do texto
    //As 3 aspas duplas, preserva o enter, ou seja, o que eu escrever será o que vai ser mostrado, pois entre as 3 aspas
    println(textoQuebrado)

    println("*****************\nQuarto Exemplo: \n**********************")
    val caractere = '-'
    println(caractere) //Char: armazena um único caractere e usa-se aspas simples ''

    println("*****************\nQuinto Exemplo: \n**********************")
    val bloqueado: Boolean = false
    println(bloqueado)

    println("*****************\nSexto Exemplo: \n**********************")
    val idade: Int = 27
    println(idade)
    //Armazena um valor inteiro de até 32 bits
    //Passando do intervalo de 2147483648 até 2147483647, se usa o Long

    val populacao = 7_000_000_000L //Dá para seperar com o "_" para separar as centenas e facilitar
    println(populacao)
    //Armazena um valor inteiro de um até 64 bits
    // É obrigatório adicionar um "L" quando o valor ultrapassa o limite do Int

    println("*****************\nSétimo Exemplo: \n**********************")
    //Float armazena um valor decimal de até 32 bits
    //É obrigatório adicionar um "F" ao final

    val peso = 73.5f //Pode ser o MAIÚSCULO ou mininúsculo
    println(peso)

    //Para 64 bits, é o Double
    //É mais preciso do que o Float (e é padrão para números decimais em Kotlin)

    val altura = 1.73
    println (altura)
    println("*****************\nOitavo Exemplo: \n**********************")
    //Kotlin não faz conversão automática entre tipos númericos
    val x = 10
    val y = x.toDouble() //obrigatório
    val z = x //não funciona
}
