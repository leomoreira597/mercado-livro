package com.mercadolivro.service

import com.mercadolivro.events.PurchaseEvents
import com.mercadolivro.model.PurchaseModel
import com.mercadolivro.repository.PurchaseReporitory
import javassist.NotFoundException
import org.springframework.context.ApplicationEventPublisher
import org.springframework.stereotype.Service

@Service
class PurchaseService(
    private val purchaseRepository: PurchaseReporitory,
    private val applicationEventPublisher: ApplicationEventPublisher,
    private val bookService: BookService
) {
    fun create(purchaseModel: PurchaseModel) {
        purchaseRepository.save(purchaseModel)
        applicationEventPublisher.publishEvent(PurchaseEvents(this, purchaseModel))

    }

    fun update(purchaseModel: PurchaseModel) {
        purchaseRepository.save(purchaseModel)
    }
}
