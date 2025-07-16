package com.project.core.domain.performance.vo

import java.math.BigDecimal

data class SeatGradePolicy(
    val seatGrade: SeatGrade,
    val seatPrice: SeatPrice,
    val totalSeatCount: Int,
    val totalSeatPrice: BigDecimal
)
