package com.project.core.performance.domain.service.user

import com.project.core.performance.domain.entity.Ticket
import com.project.core.performance.domain.vo.TicketStatus

class TicketReservationServiceImpl : TicketReservationService {
    override fun getTicket(ticketId: Long): Ticket {
        TODO("Not yet implemented")
    }

    override fun getTicketByPerformanceDetailIdAndSeatDetailId(
        performanceDetailId: Long,
        seatDetailId: Long
    ): Ticket {
        TODO("Not yet implemented")
    }

    override fun reserveTicket(ticketId: Long): Ticket {
        TODO("Not yet implemented")
    }

    override fun cancelTicket(ticketId: Long): Ticket {
        TODO("Not yet implemented")
    }

    override fun isTicketReserved(ticketId: Long): Boolean {
        TODO("Not yet implemented")
    }

    override fun getTicketStatus(ticketId: Long): TicketStatus {
        TODO("Not yet implemented")
    }
}