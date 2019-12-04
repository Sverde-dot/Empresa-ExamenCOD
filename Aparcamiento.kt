//Creamos primero la clase Aparcamiento con data class
data class Aparcamiento (
//Ahora crearemos las variables nombre, plazas y plazas libre.
//Estas se hacen con var (nombre de la variable): tipo ="datos"
    var nombre: String = "Aparcamiento falso123"){

    var plazas: Int= 123
    var plibres: Int = 100
//Para acabar hacemos un metodo de nombre init en el que marcamos los datos del garage
    init {
        println("El garage...")

        nombre = nombre +" "+plazas+" "+plibres
    }
}