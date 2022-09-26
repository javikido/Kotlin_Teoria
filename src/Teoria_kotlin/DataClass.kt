package Teoria_kotlin
// lo primero que se puede notar a diferencia de una clase es que no hace falta las funciones
// y que los atributos se declaran en el constructor
// LAS DATACLASS COMPARAN CON EL METODO EQUALS LOS ATRIBUTOS Y NO LAS DIRECIONES DE MEMORIA COMO
// LAS CLASES NORMALES
// TAMBIEN EL METODO PRINT ES DIFERENTE YA QUE IMPRIME LOS ATRIBUTOS Y NO LA DIRECION EN MEMORIA

fun main() {
    // varias formas de llamar al objeto dataclass
    val objetoHumano: Humano = Humano("Blanco","javier","hombre")
    val objetoHumano2: Humano = Humano(nombre = "javier",sexo = "macho",raza = "negro")
    val objetoHumano3 = Humano("blanco",sexo = "mujer",nombre = "susana")

    val humanito = Humanito("humana","nombre class")


    // una vez crado el objeto la val no se puede cambiar
    // en este caso raza es val y nombre es var

    objetoHumano.nombre = "paco"
    // objetoHumano.raza = "perro"   .error no compilaria

    // COMPARANDO OBJETOS PARA VER QUE NO LO HACE CON LAS DIRECONES DE MEMORIA
    println("SON IGUALES LOS OBJETOS 1 Y 2: ${objetoHumano == objetoHumano2}")

    println("comparando el metodo print de las class")
    println(objetoHumano)
    println(objetoHumano2)
    println(objetoHumano3)
    println("comparando el metodo print de las dataclass")
    println(humanito)
    println(humanito.nombre)
}

data class Humano(val raza: String,var nombre: String,var sexo: String)

class  Humanito(val raza: String,var nombre: String)

