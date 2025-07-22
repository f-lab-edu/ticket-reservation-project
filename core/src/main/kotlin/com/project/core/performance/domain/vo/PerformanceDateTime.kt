package com.project.core.performance.domain.vo

import jakarta.persistence.Embeddable
import java.time.LocalDateTime

// 공연 시작, 종료 시간에 대한 정보
@Embeddable
data class PerformanceDateTime(
    val startDateTime: LocalDateTime,
    val endDateTime: LocalDateTime
){
    init {
        require(startDateTime.isBefore(endDateTime)){ "startDateTime 은 endDateTime 보다 작아야 합니다." }
    }
}
