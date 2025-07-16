package com.project.core.domain.performance.entity

import com.project.core.domain.performance.vo.SeatGrade
import com.project.core.domain.performance.vo.SeatNumber
import com.project.core.domain.performance.vo.SeatPrice

class Seat(
    private val performanceId: Long,
    private val seatId: Long,
    private val seatNumber: SeatNumber,
    private val seatGrade: SeatGrade,
    private val seatPrice: SeatPrice
)