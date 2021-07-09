package com.example.agendaalura.DAO


import android.util.Log
import com.example.agendaalura.model.Aluno
import java.util.*


class AlunoDAO {

    fun salvar(aluno: Aluno) {
        alunos.add(aluno)
    }

    fun todos(): List<Aluno> {
        return ArrayList(alunos)

//        Log.d("lista alunoss", alunos.toString())
    }

    companion object {
        private val alunos: MutableList<Aluno> = ArrayList()
    }
}
