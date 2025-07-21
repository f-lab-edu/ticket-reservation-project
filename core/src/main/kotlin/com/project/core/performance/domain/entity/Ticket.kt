package com.project.core.performance.domain.entity

import com.project.core.performance.domain.vo.PerformanceBaseInfo
import com.project.core.performance.domain.vo.SeatGrade
import com.project.core.performance.domain.vo.SeatNumber
import com.project.core.performance.domain.vo.SeatPrice
import com.project.core.performance.domain.vo.TicketStatus

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