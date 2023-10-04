fun main() {
    //Verificar el tipo de dato asignado por defecto a un numero de tipo decimal 
    val decimal = 3.0 
    println("El tipo de dato por defecto es: ${decimal::class.simpleName}")
    
    // Para convertir la variable de tipo decimal a valor flotante 
    val flotante: Float = decimal.toFloat()
    println("La variable decimal convertida a numero flotante es: $flotante")
    
    // Declarar una variable constante con el valor de PI
    val PI = 3.1416 
    
    //Calcular perimetro de un circulo y almacenarlo en una variable 
    val radio = flotante 
    val perimetrocirculo = 2 * PI * radio 
    
    //Imprimir el resultado utilizando un string template 
    println("El perimetro del circulo es: $perimetrocirculo")
}