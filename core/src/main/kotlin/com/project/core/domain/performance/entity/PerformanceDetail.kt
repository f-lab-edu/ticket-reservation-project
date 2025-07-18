package com.project.core.domain.performance.entity

import com.project.core.domain.performance.vo.BookingDateTime
import com.project.core.domain.performance.vo.PerformanceDateTime
import com.project.core.domain.performance.vo.PerformanceDetailStatus

class PerformanceDetail(
    var performanceId: Long,
    var performanceDetailId: Long,
    var performanceDateTime: PerformanceDateTime,
    var bookingDateTime: BookingDateTime,
    var status: PerformanceDetailStatus,
    var tickets: List<Ticket> = emptyList(),
)