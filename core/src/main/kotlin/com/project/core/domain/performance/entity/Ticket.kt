package com.project.core.domain.performance.entity

import com.project.core.domain.performance.vo.PerformanceBaseInfo
import com.project.core.domain.performance.vo.TicketStatus

class Ticket(
    var ticketId: Long,
    var performanceDetailId: Long,
    var performanceBaseInfo: PerformanceBaseInfo,
    var performanceDetail: PerformanceDetail,
    var seatDetail: SeatDetail,
    var ticketStatus: TicketStatus
)