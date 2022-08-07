package com.mercadolivro.controller.request

import javax.validation.constraints.Email
import javax.validation.constraints.NotEmpty

data class PutCustomerRequest(
    @field:NotEmpty
    var name: String,

    @field:Email(message = "verifique se está no formato adequado como 'exemplo@exemplo.com'")
    var email: String
    )