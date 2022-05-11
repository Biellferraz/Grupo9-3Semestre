package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Agendamento : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agendamento)
        val dia = intent.getIntExtra("dia", 0)
        val mes = intent.getIntExtra("mes", 0)
        val ano = intent.getIntExtra("ano",0)
        val horario = intent.getStringExtra("horario")
        findViewById<TextView>(R.id.horaioMarcado).text = "${dia}/${mes}/${ano} às ${horario}"

        var spinnerModalidade = findViewById<Spinner>(R.id.spinner_modalidade)

        spinnerModalidade.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                adapterView: AdapterView<*>?,
                view: View?,
                posisao: Int,
                id: Long
            ) {

            /*    Toast.makeText(
                    this@Agendamento,
                    "voce selecionou ${adapterView?.getItemAtPosition(posisao).toString()}",
                    Toast.LENGTH_SHORT
                ).show()
*/
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {

            }
        }

//        var spinnerHorario = findViewById<Spinner>(R.id.spinner_horario)

//        spinnerHorario.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
//            override fun onItemSelected(
//                adapterView: AdapterView<*>?,
//                view: View?,
//                posisao: Int,
//                id: Long
//            ) {
//
//             /*   Toast.makeText(
//                    this@Agendamento,
//                    "voce selecionou ${adapterView?.getItemAtPosition(posisao).toString()}",
//                    Toast.LENGTH_SHORT
//                ).show()*/
//
//            }
//
//            override fun onNothingSelected(p0: AdapterView<*>?) {
//            }
//        }
        var spinnerQuadra = findViewById<Spinner>(R.id.spinner_quadra)

        spinnerQuadra.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                adapterView: AdapterView<*>?,
                view: View?,
                posisao: Int,
                id: Long
            ) {

/*
                Toast.makeText(
                    this@Agendamento,
                    "voce selecionou ${adapterView?.getItemAtPosition(posisao).toString()}",
                    Toast.LENGTH_SHORT
                ).show()
*/

            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        var spinnerCentro = findViewById<Spinner>(R.id.spinner_centro)

        spinnerCentro.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                adapterView: AdapterView<*>?,
                view: View?,
                posisao: Int,
                id: Long
            ) {



            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }


    }

    fun agendar(v: View) {
        val pagamento: Intent = Intent(baseContext, Pagamento::class.java)

        startActivity(pagamento)
    }
}