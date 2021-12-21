package version1

fun main() {
    val anios = 70
    val capas = 5
    println("¿Que mensaje quiere poner?")
    val mensaje = readLine()
    print("\n")
    if (mensaje != null) {
        require(mensaje.length + 2 <= anios){"No cabe el mensaje en la tarta"}
        imprimirMensaje(mensaje)
    }
    imprimirVelas(anios)
    imprimirCapaSup(anios)
    imprimirCapasInf(anios,capas)

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