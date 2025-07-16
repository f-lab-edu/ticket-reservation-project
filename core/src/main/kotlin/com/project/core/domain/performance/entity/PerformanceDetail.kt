package com.project.core.domain.performance.entity

import com.project.core.domain.performance.vo.BookingDateTime
import com.project.core.domain.performance.vo.PerformanceDateTime

class PerformanceDetail(
    val performanceId: Long,
    val performanceDetailId: Long,
    val performanceDateTime: PerformanceDateTime,
    val bookingDateTime: BookingDateTime
)