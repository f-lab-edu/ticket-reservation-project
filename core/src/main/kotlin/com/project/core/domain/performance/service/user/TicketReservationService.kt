package com.project.core.domain.performance.service.user

import com.project.core.domain.performance.entity.Ticket
import com.project.core.domain.performance.repository.TicketReservationRepository
import com.project.core.domain.performance.vo.SeatNumber
import com.project.core.domain.performance.vo.TicketStatus

class TicketReservationService(
    private val ticketReservationRepository: TicketReservationRepository
) {

    fun getAllAvailableTicketsInfo(performanceDetailId: Long): List<Ticket>?{
        return ticketReservationRepository.findAllTicketsWhereIsAvailable(performanceDetailId)
    }

    fun getTicket(performanceDetailId: Long, seatNumber: SeatNumber): Ticket? {
        return ticketReservationRepository.findTicketByPerformanceDetailIdAndSeatNumber(performanceDetailId, seatNumber)
    }

    fun getTickets(performanceDetailId: Long, seatNumbers: List<SeatNumber>): List<Ticket>? {
        return ticketReservationRepository.findTicketsByPerformanceDetailIdAndIsInSeatNumbers(performanceDetailId, seatNumbers)
    }

    fun reserveTicket(performanceDetailId: Long, seatNumber: SeatNumber): Ticket? {

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