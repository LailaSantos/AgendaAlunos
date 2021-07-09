package com.example.agendaalura.ui.activity


import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.agendaalura.DAO.AlunoDAO
import com.example.agendaalura.R
import com.example.agendaalura.model.Aluno

class FormularioAluno : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formulario_aluno)
        setTitle("Novo aluno")

        val dao = AlunoDAO()

        var name = findViewById<EditText>(R.id.form_name)
        var phone = findViewById<EditText>(R.id.form_phone)
        var email = findViewById<EditText>(R.id.form_email)

        val botaoSave = findViewById<Button>(R.id.btn_save)

        botaoSave.setOnClickListener {

            val alunoCriado = Aluno(name = "", phone = "", email = "")
            alunoCriado.name = name.text.toString()
            alunoCriado.phone = phone.text.toString()
            alunoCriado.email =  email.text.toString()

            dao.salvar(alunoCriado)
            finish()

//            Log.d("name", name.text.toString())
//            Log.d("phone", phone.text.toString())
//            Log.d("email", email.text.toString())
        }
    }
}