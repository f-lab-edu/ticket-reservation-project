package com.project.core.performance.domain.entity

import com.project.core.performance.domain.vo.*
import jakarta.persistence.Embedded
import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne

@Entity
class Ticket(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var ticketId: Long,

    @Embedded
    var performanceDateTime: PerformanceDateTime,

    @Embedded
    var bookingDateTime: BookingDateTime,

    @Embedded
    var performanceBaseInfo: PerformanceBaseInfo,

    @Embedded
    var seatNumber: SeatNumber,

    @Embedded
    var seatGrade: SeatGrade,

    @Embedded
    var seatPrice: SeatPrice,

    @Enumerated(value = EnumType.STRING)
    var ticketStatus: TicketStatus
)