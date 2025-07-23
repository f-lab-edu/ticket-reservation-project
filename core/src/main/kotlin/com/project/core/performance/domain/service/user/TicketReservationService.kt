package com.project.core.performance.domain.service.user

import com.project.core.performance.domain.entity.Ticket
import com.project.core.performance.domain.vo.TicketStatus

interface TicketReservationService {

    fun getTicket(ticketId: Long): Ticket

    fun getTicketByPerformanceDetailIdAndSeatDetailId(performanceDetailId: Long, seatDetailId: Long): Ticket

    fun reserveTicket(ticketId: Long): Ticket

    fun cancelTicket(ticketId: Long): Ticket

    fun isTicketReserved(ticketId: Long): Boolean

    fun getTicketStatus(ticketId: Long): TicketStatus

}