package com.project.core.domain.performance.repository

import com.project.core.domain.performance.entity.PerformanceDetail
import com.project.core.domain.performance.entity.Ticket
import com.project.core.domain.performance.vo.SeatNumber

interface TicketReservationRepository {

    fun save(ticket: Ticket): Ticket?

    fun saveAll(tickets: List<Ticket>): List<Ticket>?

    fun findAllTicketsWhereIsAvailable(performanceDetailId: Long): List<Ticket>?

    fun findTicketByPerformanceDetailIdAndSeatNumber(performanceDetailId: Long, seatNumber: SeatNumber): Ticket?

    fun findTicketsByPerformanceDetailIdAndIsInSeatNumbers(performanceDetailId: Long, seatNumbers: List<SeatNumber>): List<Ticket>?

}