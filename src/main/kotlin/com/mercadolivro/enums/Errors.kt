package com.mercadolivro.enums

enum class Errors(val code:String, val message:String) {
    ML001("ML-001", "Requisição invalida"),
    ML101("ML-101", "Livro [%s] não existe"),
    ML102("ML-102", "Não pode atualizar livro com o status [%s]"),
    ML201("ML-201", "Cliente [%s] não existe")
}