package com.project.core.domain.performance.entity

import com.project.core.domain.performance.vo.SeatGrade
import com.project.core.domain.performance.vo.SeatNumber
import com.project.core.domain.performance.vo.SeatPrice

class SeatDetail(
    var seatNumber: SeatNumber,
    var seatGrade: SeatGrade,
    var seatPrice: SeatPrice
)