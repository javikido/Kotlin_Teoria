package Teoria_kotlin

fun main(args: Array<String>) {

    // con when lo podemos usar normal o asociando Teoria_kotlin.a una variable o funcion

    // uso normal del when
    var pasword = "dd"
    when (pasword.length) {
        0 -> println("Escribe una contraseña")
        1, 2, 3 -> println("Contraseña demasiado floja")
        in 3..5 -> println("contraseña poco segura")
        else -> println("Introduce mayusculas y numeros")
    }


    // Uso 2 añadimos Teoria_kotlin.a una funcion
    ejemplo("jsjsj")
    ejemplo2("Teoria_kotlin.getJavi")

    // llamada Teoria_kotlin.a Teoria_kotlin.dameAlgo
    dameAlgo("Teoria_kotlin.getJavi el campeon")




}

// crear una funcion que devuelva un elemento usando una when

fun dameAlgo(objeto: Any): Any{
    var resultado = when(objeto){
        is Int -> println("es un Entero: $objeto")
        is String -> println(" es un string $objeto")
        in 1..100 -> println(" es un nuemro entero: $objeto")
        else -> println(" es cualquier cosa: $objeto")
    }

    return resultado
}


// añadimos un when Teoria_kotlin.a una funcion
fun ejemplo(password: String) = when (password.length) {
    0 -> println("Escribe una contraseña")
    1, 2, 3 -> println("Contraseña demasiado floja")
    in 3..5 -> println("contraseña poco segura")
    else -> println("Introduce mayusculas y numeros")
}

fun ejemplo2(password: String) = if (password.length < 10){
    println("La contraseña tiene que ser mayor de 10")
}else {
    println("Contraseña correcta")
}
