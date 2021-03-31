fun main(parametro: Array<String>) {
    // Clase 09
    /*

    var x = 1
    while (x <= 100) {
        println(x)
        x++
    }
    */

    /*
    print("Ingrese un numero: ")
    var num = readLine()!!.toInt()

    if (num > 0) {
        var cont = 1
        while (cont <= num) {
            println(cont)
            cont++
        }
    }
    */

    // Clase 10
    /*
    var num = 0
    do {
        print("Ingrese un numero entre 0 y 999: ")
        num = readLine()!!.toInt()
        if ((num > 0) && (num <=999)) {
            if (num < 10) {
                println("1 digito")
            } else if(num < 100) {
                println("2 digitos")
            } else {
                println("3 digitos")
            }

        }

    } while (num!=0)
    */
    /*
    var suma = 0
    var cont=0
    var num = 0
    do {
        print("Ingrese un numero: ")
        num = readLine()!!.toInt()
        suma = suma + num

        if (num != 0)
            cont++

    } while(num != 0)

    println("El promedio es ${suma/cont}")
    */

    // Clase 11
    /*
    for(i in 1..10)
        println(i)

    for(i in 10 downTo 1 step 2)
        println(i)
    */
    /*
    var suma=0
    var numeros=3

    for (i in 1..numeros) {
        print("Ingrese el numero $i: ")
        suma = suma + readLine()!!.toInt()
    }

    print("El promedio es ${suma/numeros}")
    */

    // Clase 12
    /*
    print("Ingrese la coordenada X: ")
    var x = readLine()!!.toInt()
    print("Ingrese la coordenada Y: ")
    var y = readLine()!!.toInt()

    when {
        x > 0 && y > 0 -> print("Cuadrante 1")
        x < 0 && y > 0 -> print("Cuadrante 2")
        x < 0 && y < 0 -> print("Cuadrante 3")
        x > 0 && y < 0 -> print("Cuadrante 4")
        else -> print("Datos mal ingresados")
    }
    */
    /*
    var promedio = 0
    for(i in 1..3) {
        print("Ingrese la nota $i: ")
        promedio = promedio + readLine()!!.toInt()
    }

    promedio = promedio/3

    when {
        promedio >= 6 -> print("Usted es un Capo")
        promedio >= 4 -> print("Reguleque nomas")
        else -> print("Dediquese a otra cosa")
    }
    */

}
