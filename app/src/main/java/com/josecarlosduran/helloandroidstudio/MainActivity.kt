package com.josecarlosduran.helloandroidstudio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.strictmode.CredentialProtectedWhileLockedViolation

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Leccion 1
        //variablesYConstantes()
        //Leccion 2
        //tiposDeDatos()
        //Leccion 3
        //sentenciaIf()
        //Leccion 4
        //sentenciaWhen()
        //Leccion 5
        //arrays()
        //Leccion 6
        //maps()
        //Leccion 7
        //loops()
        //Leccion 8
        nullSafety()
    }

    /*
        Aqui vamos a hablar de variables y constantes
     */

    private fun variablesYConstantes(){
        // Variables

        var myFirstVariable = "Hello Hackermen!"
        var myFirstNumber = 1

        println(myFirstVariable)

        myFirstVariable = "Bienvenidos a Kotlin"
        println(myFirstVariable)

        // No podemos asignar un tipo INT a una variable tipo String
        //myFirstVariable= 1

        var mySecondVariable = "Un lenguaje para android"
        println(mySecondVariable)

        mySecondVariable = myFirstVariable
        println(mySecondVariable)

        // Constantes

        val myFirstConstant = "Esto es una constante"
        println(myFirstConstant)


    }
    /*
        Aqui vamos a hablar de tipos de datos (DataTypes)
     */

    private fun tiposDeDatos(){

        // String

        val myString = "Hola Hackermen"
        val myString2 = "Bienvenido"
        val myString3 = myString + " " +  myString2

        println(myString3)

        // Enteros (Byte, Short, Int, Long)

        val myInt = 1
        val myInt2 = 2
        val myInt3 = myInt + myInt2
        println(myInt3)

        // Decimales (Float, Double)

        val myFloat: Float = 1.5f
        val myDouble = 1.5
        val myDouble2 = 2.6
        val myDouble3 = 1
        val myDouble4 = myDouble + myDouble2 + myDouble3
        println(myDouble4)

        // Boolean (Bool)

        val myBool = true
        val myBool2 = false
        println(myBool == myBool2)

    }


    private fun sentenciaIf(){

        val myNumber = 7

        if (myNumber <= 10 && myNumber > 5 ){
            println("$myNumber es menor o igual que 10 y mayor que 5")
        }
        else if (myNumber == 60){
            println("$myNumber es igual que 60")
        }
        else{
            println("$myNumber es mayor que 10 o menor o igual que 5")
        }




    }


    private fun sentenciaWhen(){
        val country = "España"

        when (country) {
            "España", "Mexico", "Peru", "Colombia", "Argentina" -> {
                println("El idioma es español")
            }
            "EEUU" -> {
                println("El idioma es ingles")
            }
            "Francia" -> {
                println("El idioma es frances")
            }
            else -> {
                println("Idioma no reconocido")
            }
        }
        val age  = 10

        when (age) {
            1, 2, 3 -> {
                println("Eres un bebe")
            }
            in 1..10 -> {
                println("Eres un niño")
            }
            in 11..17 -> {
                println("Eres un adolescente")
            }
            in 18..69 -> {
                println("Eres un adulto")
            }
            in 70..99 -> {
                println("Eres un anciano")
            }
            else -> {
                println("WTF!!!")
            }
        }


    }

    private fun arrays(){

        val name = "Jose"
        val surname = "Duran"
        val company = "My Company"
        val age = "42"

        // Creacion de un array

        val myArray = arrayListOf<String>()

        //Añadir datos de un en uno

        myArray.add(name)
        myArray.add(surname)
        myArray.add(company)
        myArray.add(age)

        println(myArray)

        //Añadir un conjunto de datos

        myArray.addAll(listOf("Bienvenido","aprendiendo","Kotlin"))
        println(myArray)

        //Acceso a datos
        val myCompany = myArray[2]
        println(myCompany)

        //Eliminar datos
        myArray.removeAt(4)
        println(myArray)

        //Recorrer datos
        myArray.forEach {
            println(it)
        }

        //otras
        println(myArray.count())

        myArray.clear()

        println(myArray.count())
    }

    private fun maps(){
        var myMap: Map<String,Int> = mapOf()
        println(myMap)

        //Añadiendo valores
        //myMap = mapOf("Jose" to 1, "Pedro" to 2,"Sara" to 3) // Este mapa seria inmutable
        myMap = mutableMapOf("Jose" to 1, "Pedro" to 2,"Sara" to 3)
        println(myMap)

        //Añadir un solo valor
        myMap["Ana"] = 7
        myMap.put("Maria",8)
        println(myMap)
        //Actualizar un valor (la clave es unica)
        myMap.put("Jose",10)
        println(myMap)
        //Acceso a un dato
        println(myMap["Jose"])

        //Eliminar un dato
        myMap.remove("Ana")
        println(myMap)
    }

    private fun loops(){
        val myArray : List<String> = listOf("Bienvenido","aprendiendo","Kotlin")
        val myMap : MutableMap<String,Int> = mutableMapOf("Jose" to 1, "Pedro" to 2,"Sara" to 3)

        // For

        for (myString in myArray){
            println(myString)
        }

        for (myElement in myMap){
            println("${myElement.key}-${myElement.value}")
        }

        for (x in 0..10){
            println(x)
        }

        for (x in 0..10 step 2){
            println(x)
        }

        for (x in 10 downTo 0 step 2){
            println(x)
        }

        // While

        var x = 0

        while (x < 10){
            println(x)

            x++

        }

    }

    private fun nullSafety(){
        var myString = "Jose"

        // myString = null Esto da error de compilacion

        var mySafetyString : String? = "Jose Null Safety"

        //Safe Call

        println(mySafetyString?.length)


        mySafetyString = null


        //Safe Call

        println(mySafetyString?.length)?: println("es nula")

        mySafetyString = "Jose"


        //Safe Call
        mySafetyString?.let {
            println(it)
        }?:println("es nula")



    }
}
