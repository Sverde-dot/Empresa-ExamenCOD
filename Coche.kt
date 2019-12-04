//Creamos primero la clase coche con data class
data class Coche (
//Ahora crearemos las variables de este tiene matrícula, hora de entrada y hora de salida.
//Estas se hacen con var (nombre de la variable): tipo ="datos"
    var matricula: String = "12345678A"){
    var entrada: String = "10:00"
    var salida: String = "12:00"
//Para acabar hacemos un metodo de nombre init en el que marcamos los datos del coche
    init {
//Primero pondre para que se muestre en pantalla algo como "El coche" aunque su funcion sea inutil 
        println("El coche...")
//y en este caso voy a marcar que (matricula) contenga ademas (entrada) y (salida)
        matricula = matricula +" Entro a las "+entrada+" Y salio a las "+salida
    }
}
