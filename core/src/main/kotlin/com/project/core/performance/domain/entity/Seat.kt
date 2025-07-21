package com.project.core.performance.domain.entity

import com.project.core.performance.domain.vo.SeatGradePolicy

class Seat(
    var performanceId: Long?= null,
    var seatId: Long ?= null,
    var seatGradePolicies: List<SeatGradePolicy>,
    var seatDetails: List<SeatDetail> = emptyList()
)