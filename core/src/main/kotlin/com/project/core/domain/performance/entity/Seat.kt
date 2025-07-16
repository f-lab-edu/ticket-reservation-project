package com.project.core.domain.performance.entity

import com.project.core.domain.performance.vo.SeatGrade
import com.project.core.domain.performance.vo.SeatNumber
import com.project.core.domain.performance.vo.SeatPrice

class Seat(
    val performanceId: Long,
    val seatId: Long,
    val seatNumber: SeatNumber,
    val seatGrade: SeatGrade,
    val seatPrice: SeatPrice
)