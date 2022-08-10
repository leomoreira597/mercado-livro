package com.mercadolivro.validation

import javax.validation.Constraint
import javax.validation.Payload
import kotlin.reflect.KClass

@Constraint(validatedBy = [SoldStatusValidation::class])
@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.FIELD)
annotation class SoldStatus(
    val message:String = "Este livro não está ativo",
    val groups: Array<KClass<*>> = [],
    val payload: Array<KClass<out Payload>> = []
)
