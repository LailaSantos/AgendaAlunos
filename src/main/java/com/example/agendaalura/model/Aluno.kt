package com.example.agendaalura.model



class Aluno(public var name: String, public var phone: String, public var email: String) {

    override fun toString(): String {
        return name
    }
}