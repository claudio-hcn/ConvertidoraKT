package com.example.convertidorakt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import java.io.IOException
import java.lang.NullPointerException
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {
    private var txtPesos: EditText? = null
    private var txtConversion: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtPesos = findViewById<View>(R.id.txt_pesos) as EditText
        txtConversion = findViewById(R.id.txt_conv)
    }
    fun dolares(view: View?){
        try {
            val decimalFormat = DecimalFormat("#0.##")
            val valorPesos = txtPesos!!.text.toString()
            val valPesos = valorPesos.toFloat()
            val valDolares = valPesos / 814
            val valDolar = decimalFormat.format(valDolares.toDouble())
            txtConversion!!.text = "$$valorPesos equivalen a USD $valDolar"

        }catch (e: Exception){
            txtConversion!!.text="ingrese un valor en pesos"
        }


        }
    fun euros(view: View?){
        try {
            val decimalFormat = DecimalFormat("#0.##")
            val valorPesos = txtPesos!!.text.toString()
            val valPesos = valorPesos.toFloat()
            val valEuros = valPesos / 945
            val valEuro = decimalFormat.format(valEuros.toDouble())
            txtConversion!!.text = "$$valorPesos equivalen a €$valEuro"
        }catch (e: Exception){
            txtConversion!!.text="ingrese un valor en pesos"
        }
    }
    }
