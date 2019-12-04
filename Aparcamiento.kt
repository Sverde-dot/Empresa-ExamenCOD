//Creamos primero la clase Aparcamiento con data class
data class Aparcamiento (
//Ahora crearemos las variables nombre, plazas y plazas libre.
//Estas se hacen con var (nombre de la variable): tipo ="datos"
    var nombre: String = "Aparcamiento falso123"){
    var plazas: Int= 123
    var plibres: Int = 100
//Para acabar hacemos un metodo de nombre init en el que marcamos los datos del garage
    init {
//Primero pondre para que se muestre en pantalla algo como "El garage" aunque su funcion sea inutil        
        println("El garage...")
//y en este caso voy a marcar que (nombre) contenga ademas (plazas) y (plibres)
        nombre = nombre +" "+plazas+" "+plibres
    }
}
