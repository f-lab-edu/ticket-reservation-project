package com.project.core.domain.performance.entity

import com.project.core.domain.performance.vo.SeatGrade
import com.project.core.domain.performance.vo.SeatNumber
import com.project.core.domain.performance.vo.SeatPrice

class SeatDetail(
    val seatNumber: SeatNumber,
    val seatGrade: SeatGrade,
    val seatPrice: SeatPrice
)