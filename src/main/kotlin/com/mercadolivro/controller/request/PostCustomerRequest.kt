package com.mercadolivro.controller.request

import com.mercadolivro.model.CustomerModel
import com.mercadolivro.validation.EmailAvailable
import javax.validation.constraints.Email
import javax.validation.constraints.NotEmpty

data class PostCustomerRequest(

    @field:NotEmpty
    var name: String,

    @field:Email(message = "verifique se está no formato adequado como 'exemplo@exemplo.com'")
    @EmailAvailable
    var email: String,

    @field:NotEmpty(message = "Senha deve ser informada")
    var password: String
    )