package version2

fun main() {
    println("¿Cuantos años cumple?")
    val anios = readLine()?.toInt()
    println("¿Cuantos capas de pastel quiere?")
    val capas = readLine()?.toInt()
    println("¿Que mensaje quiere poner?")
    val mensaje = readLine()
    print("\n")
    if (mensaje != null && anios != null) {
        require(mensaje.length + 2 <= anios){"No cabe el mensaje en la tarta"}
        imprimirMensaje(mensaje.padStart(anios/2,' '))
    }
    if (anios != null) {
        imprimirVelas(anios)
    }
    if (anios != null) {
        imprimirCapaSup(anios)
    }
    if (anios != null && capas != null) {
        imprimirCapasInf(anios,capas)
    }
}
fun imprimirVelas(anios : Int){
    repeat(anios){ print(",")}
    print("\n")
    repeat(anios){ print("|")}
}
fun imprimirCapaSup(anios: Int){
    print("\n")
    repeat(anios){ print("=")}
}
fun imprimirCapasInf(anios: Int,capas : Int){
    repeat(capas){
        print("\n")
        repeat(anios){ print("@")}
    }
}
fun imprimirMensaje(mensaje : String){
    print("-..-..-..-..-..-..-..-..-..-..-..-..-..-..-..-..-..-..-..-..-..-..-..-..-..-..-\n${mensaje.uppercase()}\n-..-..-..-..-..-..-..-..-..-..-..-..-..-..-..-..-..-..-..-..-..-..-..-..-..-..-\n")
}