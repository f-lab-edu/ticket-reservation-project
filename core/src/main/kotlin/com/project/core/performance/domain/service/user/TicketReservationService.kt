package com.project.core.performance.domain.service.user

import com.project.core.performance.domain.entity.Ticket
import com.project.core.performance.domain.vo.SeatNumber
import com.project.core.performance.domain.vo.TicketStatus

class TicketReservationService(
    private val ticketReservationRepository: com.project.core.performance.domain.repository.TicketReservationRepository
) {

    fun getAllAvailableTicketsInfo(performanceDetailId: Long): List<com.project.core.performance.domain.entity.Ticket>?{
        return ticketReservationRepository.findAllTicketsWhereIsAvailable(performanceDetailId)
    }

    fun getTicket(performanceDetailId: Long, seatNumber: com.project.core.performance.domain.vo.SeatNumber): com.project.core.performance.domain.entity.Ticket? {
        return ticketReservationRepository.findTicketByPerformanceDetailIdAndSeatNumber(performanceDetailId, seatNumber)
    }

    fun getTickets(performanceDetailId: Long, seatNumbers: List<com.project.core.performance.domain.vo.SeatNumber>): List<com.project.core.performance.domain.entity.Ticket>? {
        return ticketReservationRepository.findTicketsByPerformanceDetailIdAndIsInSeatNumbers(performanceDetailId, seatNumbers)
    }

    fun reserveTicket(performanceDetailId: Long, seatNumber: com.project.core.performance.domain.vo.SeatNumber): com.project.core.performance.domain.entity.Ticket? {

        val ticket = this.getTicket(performanceDetailId, seatNumber)?: throw Exception("티켓 정보가 올바르지 않습니다.")

        return when(ticket.ticketStatus){

            TicketStatus.AVAILABLE -> {

                ticket.ticketStatus = TicketStatus.RESERVED

                ticketReservationRepository.save(ticket)
            }

            TicketStatus.RESERVED -> {
                throw Exception("이마이나 예약된 티켓 입니다.")
            }
        }

    }

    fun reserveTickets(performanceDetailId: Long, seatNumbers: List<SeatNumber>): List<Ticket>? {

        val tickets = this.getTickets(performanceDetailId, seatNumbers)?: throw Exception("티켓 정보가 올바르지 않습니다.")

        val reservedTickets = tickets.map { ticket ->

            when(ticket.ticketStatus){

                TicketStatus.AVAILABLE -> {
                    ticket.ticketStatus = TicketStatus.RESERVED
                    ticket
                }
                TicketStatus.RESERVED -> {
                    throw Exception("이마이나 예약된 티켓 입니다.")
                }
            }
        }

        return ticketReservationRepository.saveAll(reservedTickets)
    }
    

}