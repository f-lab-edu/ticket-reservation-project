package com.project.core.domain.performance.vo

import java.time.LocalDateTime

// 예매 시작 시간, 예매 종료 시간에 대한 정보
data class BookingDateTime(
    val startDateTime: LocalDateTime,
    val endDateTime: LocalDateTime
){
    init {
        require(startDateTime.isBefore(endDateTime)){ "startDateTime 은 endDateTime 보다 작아야 합니다" }
    }
}
