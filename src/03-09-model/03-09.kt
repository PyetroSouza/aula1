package `03-09-model`

import `03-09-model`.Carro

fun main (){
    val carro = Carro2()
    val carroTunado = CarroTunado()

    carro.modelo = "fusca"
    carro.ano = -20
    carro.rodar(carro.consultarKm())

    println(carro.modelo)
    println(carro.ano)
    carro.acelerar()

    carroTunado.modelo = "fusca"
    carroTunado.ano = 1990
    carroTunado.ranking = 'f'

     carro.acelerar()
    carroTunado.acelerar()


//    carro.modelo = "fusca"
//    carro.ano = 1994

    println(carro)
}