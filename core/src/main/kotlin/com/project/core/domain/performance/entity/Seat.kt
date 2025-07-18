package com.project.core.domain.performance.entity

import com.project.core.domain.performance.vo.SeatGrade
import com.project.core.domain.performance.vo.SeatGradePolicy
import com.project.core.domain.performance.vo.SeatNumber
import com.project.core.domain.performance.vo.SeatPrice

class Seat(
    var performanceId: Long?= null,
    var seatId: Long ?= null,
    var seatGradePolicies: List<SeatGradePolicy>,
    var seatDetails: List<SeatDetail> = emptyList()
)