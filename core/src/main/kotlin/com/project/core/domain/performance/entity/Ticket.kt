package com.project.core.domain.performance.entity

import com.project.core.domain.performance.vo.PerformanceBaseInfo
import com.project.core.domain.performance.vo.SeatGrade
import com.project.core.domain.performance.vo.SeatNumber
import com.project.core.domain.performance.vo.SeatPrice
import com.project.core.domain.performance.vo.TicketStatus

class Ticket(
    var ticketId: Long,
    var performanceDetailId: Long,
    var seatDetailId: Long,
    var performanceBaseInfo: PerformanceBaseInfo,
    var performanceDetail: PerformanceDetail,
    var seatNumber: SeatNumber,
    var seatGrade: SeatGrade,
    var seatPrice: SeatPrice,
    var ticketStatus: TicketStatus
)