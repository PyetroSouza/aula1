/*
fun 27-08.main(){
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
    println(altura)
    println("*****************\nOitavo Exemplo: \n**********************")
    //Kotlin não faz conversão automática entre tipos númericos
    val x = 10
    val y = x.toDouble() //obrigatório
    val z = x //não funciona

    //20/08/2026
    // No kotlin as operações seguem o "tipo mais forte"

    println("*****************\nOperadores: \n**********************")
    //Operadores Aritméticos
    val a = 10
    val b = 3
    println(a + b)
    println(a - b)
    println(a * b)
    println(a / b)
    println(a % b)

    //Operadores Comparação
    val c = 5
    val d = 10
    println(c == d)
    println(c != d)
    println(c > d)
    println(c < d)
    println(c >= d)
    println(c <= d)

    //Operadores Atribuição
    var e = 10
    e += 5 // x = x + 5
    e -= 5 //x = x - 5
    e *= 5 //x = x * 5
    e /= 5 // x = x / 5
    e %= 5 // x = x % 5

    //Operadores Lógicos
    // “&&” - E (and)
    // “||” - OU (or)
    // “!” - NÃO (not)

    val anosDeVida = 20
    val habilitado = true
    println(idade >= 18 && habilitado) //true
    println(idade >= 18 || habilitado) //true
    println(!habilitado) //false
    println("*****************\nFunção: \n**********************")

    //Função = estrutura básica
    fun nomeDaFuncao() {
        println("Função de teste")

    }

    //Parâmetros
    fun mandaSalve(nome: String) {
        println("Salve $nome!")
    }
    mandaSalve("joao")
    //fun 27-08.main(){
    //mandaSalve("joao")
    // }
    fun mensagemParabens(nome: String, idade: Int) {
        println("Parabéns $nome pelos $idade anos de vida!")
    }
    mensagemParabens("nome", idade = 28)

    //Funções com retorno (tem que deixar a "assinatura" no retorno da função)
    fun soma(a: Int, b: Int): Int {
        return a + b
    }

    val result = soma(a = 10, b = 3)
    println(result)

    //Função com expressão única
    fun soma2(a: Int, b: Int) = a + b
    val resulta = soma2(10, 3)
    println(resulta)

    //Função com variáveis
    val soma3: (Int, Int) -> Int = { a, b -> a + b }
    val resultado = soma3(10, 3)
    println(resultado)

    println("*****************\nEstrutura de decisão \n**********************")
    //Estruturas de decisão - If / Else
    val dinheiro = 18
    if (dinheiro >= 18) {
        println("Maior de dinheiro")
    } else {
        println("Menor de dinheiro")
    }
    //If encadeado
    val nota = 7
    if (nota >= 9) {
        println("Excelente")
    } else if (nota >= 6) {
        println("Bom")
    } else {
        println("Reprovado")
    }

    //If pode ser usado como expressão que retorna valor
    val maioridadeIdade = 20
    val status = if (maioridadeIdade >= 18) {
        "Maior de idade"
        print("teste")
        print(false)
    } else {
        "Menor de idade"
    }
    println(status)
    //Pode utilizar como o "ternário"
    println(if (maioridadeIdade >= 18) "Maior" else "Menor de idade")

    println("*****************\nWhen\n**********************")
    val dia = 3
    when (dia) {
        1 -> println("Domingo")
        2 -> println("Segunda")
        3 -> println("Terça")
        else -> println("Dia inválido")
    }
    val nomeDia = when (dia) {
        1 -> "Domingo"
        2 -> "Segunda"
        3 -> "Terça"
        else -> "Outro dia"
    }

    val valor = 9
    when (valor) {
        9, 10 -> println("Excelente")
        7, 8 -> println("Bom")
        6 -> println("Regular")
        else -> println("Reprovado")
    }

    when {
        valor > 9 -> println("Excelente")
        valor > 6 -> println("Regular")
        else -> println("Reprovado")
    }

    println("*****************\nNull safety\n**********************")
//Em Java há um problema quando uma variável possui um valor nulo e tentamos
//utilizá-la, um erro conhecido por null pointer exception
//O Kotlin evita este tipo de erro em tempo de compilação

//    var nome: String = "joão"
//    nome = null
    // Nulo não pode ser um valor "não nulo" tipo String

//Para permitir que uma variável receba um valor nulo, é necessário declarar
//explicitamente utilizando o “?”

    var nome: String? = "joão"
    nome = null
    //Mas para utilizar esta variável, o compilador nos obriga a realizar uma validação antes
    if (nome != null) {
        println(nome.length)
    }
    //Dá para utilizar o operador "?"(safe call), que veririfca se a variável é nula e, caso seja, ignroa a chamada
    var nomeSafeCall: String? = null
    println(nomeSafeCall?.length)
    println("*****************\nCollections\n**********************")
    println("*****************\nArray\n**********************")
    //Collections - Arrays (avô das collections)
    //Array:
    // - Permite repetição
    // - Permite alteração
    // - Acesso por índice *pouco utilizado

    var numeros = arrayOf(1, 2, 2)
    println(numeros[0])
    numeros[1] = 50
    println(numeros[1])

    //- Somente armazena elementos do mesmo tipo da variável na declaração
    // - Tamanho Fixo

    println("*****************\nList\n**********************")
    //List comum (imútavel)
    //- Mantém ordem de inserção dos elementos (acesso por índice)
    //- Permite repetição
    //- Não permite alteração (apenas leitura)
    var frutas = listOf("Banana", "Maçã", "Maçã")
    println(frutas[0])
    //Não dá para adicionar e nem remover

    //MÉTODOS ÚTEIS
    println(frutas.size) //3
    println(frutas.first()) // Banana
    println(frutas.last()) // Laranja
    println(frutas.contains("Maçã")) //true

//24/08
    //MutableList
    // Funciona como a lista comum
    // Permite alteração
    // Tamanho dinâmico
    var carros = mutableListOf("Corsa", "Celta")
    println(carros.size)
    println(carros.last())
    println(carros.add("Fusca"))
    println(carros.last())

    println("*****************\nSet\n**********************")
    /*
    Set comum (imutável):
       ● Não permite repetição (ignora repetidos automaticamente)
       ● Não garante a ordem de inserção (não ordenado)
       ● Acesso de valor por método
       ● Não permite a alteração
     */

    val cores = setOf("Azul", "Verde", "Azul")
    println(cores)
    //cores.add("Amarelo") não funciona
    //cores.remove("Verde") não funciona

    /*
    MutableSet (mutável):
    ● Funciona como o Set comum
    ● Permite a alteração
     */
    val coloridos = mutableSetOf("Azul", "Verde", "Azul")
    coloridos.add("Amarelo")
    coloridos.add("Azul") //ignorado
    coloridos.remove("Verde")
    println(coloridos) //[Azul, Amarelo]

    println("*****************\nMap\n**********************")
    /*
    Collections - Map
    Map comum (imutável):
    ● Trabalha com chave => valor
    ● Não permite a alteração
     */
    val pessoas = mapOf(
        "Joao" to 20,
        "Maria" to 30,
    )
    println(pessoas["Joao"])
    println(pessoas["Pedro"]) //Não funciona
    //println(pessoas["Maria"] = 27)

    //MutableMap (mutável)
    // -Funciona como o Map comum
    // - Permite a alteração
    val produtos = mutableMapOf(
        "pc" to "computador", //to é o ":" do JSON
        "cl" to "celular"
    )
    println(produtos["pc"]) //computador
    produtos["ms"] = "mouse"
    produtos.remove("pc")
    println(produtos)

    println("*****************\nWhile\n**********************")
    //Estrutura de repetição
    //Estrtura básica
    var i = 0 //serve como contador
    while (i < 0) {
        println(i)

        i++
    }
    println("*****************\nIntervalo\n**********************")
    //São operadores utilizados para gerar os "ranges" (intervalos)

    1..5 //1 a 5
    1 until 5 //1 a 4
    5 downTo 1 //5 a 1
    1..10 step 2 //1, 3, 5, 7, 9

    println("*****************\nFor\n**********************")
    //Estrtura de repetição, em Kotlin, o for funciona com ranges
    for (i in 1..10) { //in: dentro desse intervalo de...
        println(i)
    }
    //var frutas = listOf("Banana", "Maçã", "Maçã")
    for (frutas in frutas) {
        println(frutas)
    }

    for (indices in frutas.indices) {
        println(frutas[indices])
    } //imprime 0,1,2

    for ((indice, frutas) in frutas.withIndex()) {
        println("A $frutas está na posição $indice")
    }

    println("*****************\nWhen\n**********************")
    //idade = 27
    when (idade) {
        in 0..12 -> println("Criança")
        in 12..17 -> println("Adolescente")
        in 18..59 -> println("Adulto")
        else -> println("idoso")
    }
}










