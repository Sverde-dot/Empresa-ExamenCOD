// Una vez tengamos las clases "Coche" y "Aparcamiento" tenemos que hacer en el main
// Fun main, y al igual que en java debemos crear un objeto para guardar los datos de cada clase
fun main() {
//Para este ejercicio usare miCoche para guardar los datos del coche y miAparcamiento para Aparcamiento
    var miCoche = Coche()
    var miAparcamiento = Aparcamiento()

//Ahora mostramos los datos por pantalla llamando a miCoche y al dato matricula
//y miAparcamiento para mostrar el dato matricula
    println(miCoche.matricula)
    println(miAparcamiento.nombre)
}