/**
 * Declaracion de la función main vacia pero que realizan algo
 * todos los pasos del código se incluiyen dentro de esta función
 */
fun main() {
    /**var dato = 0
    print("Introduce un numero: ")
    dato = readLine()!!.toInt()
    println("$dato")**/
    /** declaracion de la variable de tipo val
     **/

    /**
     * se crea una variable
     * llamada numbers de tipo MutableList<Int> porque contendrá una lista el cual puede variar de números enteros
     */
    val numbers: MutableList<Int> = mutableListOf()
    //
    for (i in 1..10) {

        numbers.add((5..9).random())
    }
    // ciclo for que ayuda a que defina la posicion de la variable i
    for (i in 0..9) {
        /**
         * linea de codigo en donde imprime en consola la lista
         */
        println("LISTA EN POSICIÓN ${i}: ${numbers.elementAt(i)}")
    }//forma de llamar al metodo recursivo que recibe dos parametros
    metodoRecursivo(0, numbers)
}
/**
 * Declaracion de la función metodoRrecursivo con argumentos,
 * con una lista mutable de numeros enteros
 * lo cual significa que se podra modificar cuando se requiera
 */
fun metodoRecursivo(int:Int, lista:MutableList<Int>)
{
    /**if que valida que la variable int debe ser menor que diez
     **/
if (int<10)
{
    /**if que indica que si la variable lista es igual a 5 retornara un valor
 **/
    if(lista.elementAt(int) == 5)
    {
        /**Es la parte en donde se indica lo que sera mostrado en consola
         * el cual es la variable int
         **/
        println("ES 5 EN: $int")
    }
    /**técnica de programación que nos permite que un bloque
     * de instrucciones se ejecute n veces que en este caso es la lista
     **/
    metodoRecursivo(int+1, lista)
}
}
