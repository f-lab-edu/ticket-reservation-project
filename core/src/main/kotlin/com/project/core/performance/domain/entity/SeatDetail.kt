package com.project.core.performance.domain.entity

import com.project.core.performance.domain.vo.SeatGrade
import com.project.core.performance.domain.vo.SeatNumber
import com.project.core.performance.domain.vo.SeatPrice

class SeatDetail(
    var seatId: Long,
    var seatDetailId: Long,
    var seatNumber: SeatNumber,
    var seatGrade: SeatGrade,
    var seatPrice: SeatPrice
)