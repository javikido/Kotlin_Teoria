fun main() {
    // la funcion let nos permite ejecutar un codigo cuando no es null
    // hace falta ? para que actue como un elvis o eso parece

    var nula: String? = null
    nula?.let {
        it -> println(it)
    }

    println( nula ?: "no es nula" )

    nula = "javi"
    nula?.let {
        println(it)
    }
}