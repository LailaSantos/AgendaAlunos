package com.example.agendaalura.ui.activity

import android.R.layout
import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.example.agendaalura.DAO.AlunoDAO
import com.example.agendaalura.R
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

    private lateinit var listaAlunos: ListView

    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTitle("Lista de Alunos")

        val btnNovoAluno = findViewById<FloatingActionButton>(R.id.btn_float)

        btnNovoAluno.setOnClickListener {
            val intent = Intent(this, FormularioAluno::class.java)
            startActivity(intent)
        }
    }

    override fun onResume() {
        val dao = AlunoDAO()
        super.onResume()
        listaAlunos = findViewById(R.id.list_view)
        listaAlunos.adapter = ArrayAdapter(this, layout.simple_list_item_1, dao.todos())
//        Log.d("listaaa", dao.todos().toString())
    }
}