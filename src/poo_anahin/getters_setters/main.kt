package poo_anahin.getters_setters

fun main() {

    val javi = User("el Mio@ja.com","1234")
    val javi2 = User("el Mio@ja.com","1234567")
    val javi3 = User("el Mio@ja.com","123456")

    println(javi.email)
    val Bd = AddUserUsc().invoke(javi)
    val Bd2 = AddUserUsc().invoke(javi2)
    val Bd3 = AddUserUsc().invoke(javi3)

    if (Bd != null) {
        println("EL USUARIO A SIDO REGISTRADO: ${Bd.email}")
    }else{
        println("Usuario null")
    }
    if (Bd2 != null) {
        println("EL USUARIO A SIDO REGISTRADO: ${Bd2.email}")
    }else{
        println("Usuario null")
    }
    if (Bd3 != null) {
        println("EL USUARIO A SIDO REGISTRADO: ${Bd3.email}")
    }else{
        println("Usuario null")
    }


    val user = Javi("Irene")
    println("objeto-------${user.name}")
}

class Javi( name: String){


    var name = name
    set(value) {
        println("variable-----valor de name: $name")
        field = value.lowercase()
    }
    init {
        this.name = name
        println("init----------")
    }


}