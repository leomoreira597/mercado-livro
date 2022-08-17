package com.mercadolivro.service

import com.mercadolivro.exception.AuthException
import com.mercadolivro.repository.CustomerRepository
import com.mercadolivro.security.UserCustomDetails
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.stereotype.Service

@Service
class UserDetailsCustomService(
    private val customerRepository: CustomerRepository
) : UserDetailsService {
    override fun loadUserByUsername(id: String): UserDetails {
        val customer =
            customerRepository.findById(id.toInt()).orElseThrow { AuthException("Falha Revise as Informções", "4787") }
        return UserCustomDetails(customer)
    }
}