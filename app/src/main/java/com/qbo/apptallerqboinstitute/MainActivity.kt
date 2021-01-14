package com.qbo.apptallerqboinstitute

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {

    val listalumnos = ArrayList<String>()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btncalcular.setOnClickListener {
            //Toast.makeText(applicationContext, "HOLA MUNDO", Toast.LENGTH_LONG).show()
            if(etnombre.text.toString() == ""){
                etnombre.error = "Obligatario"
            }else if(etnotaexaparcial.text.toString() == ""){
                etnotaexaparcial.error = "Obligatorio"
            }else if(etnotaexafinal.text.toString() == ""){
                etnotaexafinal.error = "Obligatorio"
            }else{
                var nombre : String = etnombre.text.toString()
                var exaparcial : Double = etnotaexaparcial.text.toString().toDouble()
                var exafinal : Double = etnotaexafinal.text.toString().toDouble()
                var notafinal : Double
                notafinal = (exaparcial + exafinal)/ 2
                val formato = DecimalFormat("##.00")
                var resultadofinal = "Alumno: $nombre - Nota: ${formato.format(notafinal)}"
                tvresultado.text = resultadofinal
                listalumnos.add(resultadofinal)
                val adapter = ArrayAdapter(this,
                android.R.layout.simple_list_item_1,
                listalumnos)
                lvalumnos.adapter = adapter
                etnombre.setText("")
                etnotaexafinal.setText("")
                etnotaexaparcial.setText("")

            }

        }


        //Variables en Kotlin:
        var titulo = "QBO Institute"
        var subtitulo: String = "Taller virtual"
        var numero1 : Int = 0
        var numero2 : Double = 0.0
        var respuesta : Boolean
        //Constantes en Kotlin:
        val mensaje = "Hola mundo"
    }

    fun mostrarMensaje(){

    }

    fun imprimirMensaje(mensaje: String){

    }

    fun enviarMensaje(numero1: Int, numero2: Int): Boolean{
        return false
    }



}