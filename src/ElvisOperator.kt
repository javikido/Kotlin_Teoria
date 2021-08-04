// con ? podemos dejar camino a una variable para que pueda ser tambien nulla
var javi: String? = "javi"
var desconocido: String? = null


fun main() {

    // el elvis operator nos devuelve un valor por defecto en caso de null

    var hijo = javi?.length  // ? si es nulo accede a el length
    var hija = desconocido?.length ?: "Irene"   // elvis comprueba la lenght y si no devuelve irene
    println(hijo)
    println(hija)

    var hija2: Int = desconocido?.length ?: 10   // elvis comprueba la lenght y si no devuelve el valor aunque no sea del mismo tipo
    println(hija2)




}