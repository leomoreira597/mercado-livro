package com.mercadolivro.validation

import com.mercadolivro.service.BookService
import com.mercadolivro.service.CustomerService
import javax.validation.ConstraintValidator
import javax.validation.ConstraintValidatorContext

class SoldStatusValidation(private var bookService: BookService): ConstraintValidator<SoldStatus, Set<Int>> {
    override fun isValid(value: Set<Int>?, context: ConstraintValidatorContext?): Boolean {
        if(value.isNullOrEmpty()){
            return false
        }
        return bookService.checkIdsStatus(value)
    }


}