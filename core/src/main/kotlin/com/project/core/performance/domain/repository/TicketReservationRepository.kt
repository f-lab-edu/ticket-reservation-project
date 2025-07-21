package com.project.core.performance.domain.repository

import com.project.core.performance.domain.entity.PerformanceDetail
import com.project.core.performance.domain.entity.Ticket
import com.project.core.performance.domain.vo.SeatNumber

interface TicketReservationRepository {

    fun save(ticket: com.project.core.performance.domain.entity.Ticket): com.project.core.performance.domain.entity.Ticket?

    fun saveAll(tickets: List<com.project.core.performance.domain.entity.Ticket>): List<com.project.core.performance.domain.entity.Ticket>?

    fun findAllTicketsWhereIsAvailable(performanceDetailId: Long): List<com.project.core.performance.domain.entity.Ticket>?

    fun findTicketByPerformanceDetailIdAndSeatNumber(performanceDetailId: Long, seatNumber: com.project.core.performance.domain.vo.SeatNumber): com.project.core.performance.domain.entity.Ticket?

    fun findTicketsByPerformanceDetailIdAndIsInSeatNumbers(performanceDetailId: Long, seatNumbers: List<com.project.core.performance.domain.vo.SeatNumber>): List<com.project.core.performance.domain.entity.Ticket>?

}