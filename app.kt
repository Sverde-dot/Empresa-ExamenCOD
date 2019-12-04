// Una vez tengamos las clases "Coche" y "Aparcamiento" tenemos que hacer en el main
// Fun main, y al igual que en java debemos crear un objeto para guardar los datos de cada clase
fun main() {
//Para este ejercicio usare miCoche para guardar los datos del coche y miAparcamiento para Aparcamiento
//Ademas el ejercicio nos pide varios coches por lo que cambiaremos la matricula a otras diferentes
//Para hacer esto generare miCocheA-B para cambiarle la matricula a otra   
    var miCocheA = Coche(matricula = "87654321B")
    var miCocheB = Coche(matricula = "76437641C")
    var miCoche = Coche()
    var miAparcamiento = Aparcamiento()

//Ahora mostramos los datos por pantalla llamando a miCoche y al dato matricula
//y miAparcamiento para mostrar el dato matricula
//Por ultimo mostramos miCocheA-B y comprobamos si hay mas de un coche    
    println(miCoche.matricula)
    println(miCocheA.matricula)
    println(miCocheB.matricula)
    println(miAparcamiento.nombre)
}
