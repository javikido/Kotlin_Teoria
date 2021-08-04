// operador elvis

class Persona1(var nombre: String, var apellido: String, val edad: Int?)

fun main() {
    val javi= Persona1("javi","fernandez",null)
    val irene= Persona1("Irene","fernandez",19)

    // guardo un valor nulo aposta
    var edadJavi = javi.edad
    println(edadJavi)

    var edadIrene = irene.edad ?: 15
    println(edadIrene)

    // compruebo el valor nulo y lo cambio por 0
    edadJavi = javi.edad ?: 0
    println(edadJavi)
}