package com.project.core.domain.performance.vo

import java.math.BigDecimal

data class SeatGradePolicy(
    val seatGrade: SeatGrade,
    val seatPrice: SeatPrice,
    val totalSeatCount: Int,
    val totalSeatPrice: BigDecimal
){
    init {
        // 해당 등급의 좌석이 0 개인 경우도 고려
        require(totalSeatCount >= 0) {"등급 당 좌석수는 0 이상 이어야 합니다."}
        require(totalSeatPrice >= BigDecimal.ZERO) {"등급 당 좌석금액은 0 이상 이어야 합니다."}
    }
}
