package `03-09-model`

open class Carro(
    var modelo: String,
    var ano: Int,
    val portas: Int = 4
) {
    init {
        println("Carro do modelo: $modelo criado: $ano")
    }
}

open class Carro2(){
    var modelo: String = ""
    get() = field.uppercase()
    var ano: Int = 0
    set(value) {
        field = if (value >= 0) value else 0
    }
    open fun acelerar(){
        println("VRUM-VRUM")
    }

    private var kilomester: Double = 0.0

    fun rodar(km: Double){
        kilomester += km
    }

    fun consultarKm(): Double {
        return kilomester
    }
}


