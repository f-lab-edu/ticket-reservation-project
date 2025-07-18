package com.project.core.domain.performance.entity

import com.project.core.domain.performance.vo.SeatGradePolicy

class Seat(
    var performanceId: Long?= null,
    var seatId: Long ?= null,
    var seatGradePolicies: List<SeatGradePolicy>,
    var seatDetails: List<SeatDetail> = emptyList()
)