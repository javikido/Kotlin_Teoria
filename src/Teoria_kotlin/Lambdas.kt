package Teoria_kotlin

fun main() {
    // declaracion de una lambda
    var lambda: (String)-> Int = { it -> it.length} // puedes usar el it o darle un nombre Teoria_kotlin.a it
    miPrintln()

    // para imvocar Teoria_kotlin.a la lambda tienes que poner los ()
    // SI NO DEVUELVE NADA NO SIRVE DE NADA UN PRINTLN
    println("Sin parentesis"+lambda)
    println("Con parentesis longitud de: "+lambda("Teoria_kotlin.getJavi"))
    miPrintln()


    // NO DEVUELVEN NADA SOLO EJECUTA EL CUERPO
    var lambda3: () -> Unit= { println("Esta lambda no hace nada")}
    lambda3()
    miPrintln()

    // CON 1 PARAMETRO Y UNIENDO LA DECLARACION Y ASIGNACION
    var lamUnParametro: (Int) -> Int = {n -> n+10}
    println(lamUnParametro(10))
    miPrintln()

    // CON 2 PARAMETRO
    var dosParametro:(Int,Int) -> Int= {a,b -> (a+b)+40}
    println(dosParametro(10,20))
    miPrintln()


    // SIN DECLARACION SOLO IMPLEMENTACION
    var lambda4 = { it: Int -> it + 10}
    println(lambda4)
    println(lambda4(20))
    miPrintln()






}

fun miPrintln(){
    println("****************************************")
}