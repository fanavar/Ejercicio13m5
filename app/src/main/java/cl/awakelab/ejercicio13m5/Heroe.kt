package cl.awakelab.ejercicio13m5


data class Heroe(
    val superHero: String,
    val publisher: String,
    val realName: String,
    val photo: String
)

fun main()  {


    var cantidad: Int = 1

    var heroes = mutableListOf<Heroe>()

    while(cantidad == 1) {
        print("nombre: ")
        var nombre = readln()
        print("publisher: ")
        var publisher = readln()
        print("nombre real: ")
        var realName = readln()
        print("foto: ")
        var photo = readln()

        heroes.add(Heroe(nombre, publisher, realName, photo))
        print("ingresa el número 1 para seguir: ")
        cantidad = readln().toInt()
    }

    for(h in heroes){
        println(h)
    }
}