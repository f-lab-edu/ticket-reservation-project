package com.project.core.domain.performance.vo

import java.time.LocalDateTime

// 공연 시작, 종료 시간에 대한 정보
data class PerformanceDateTime(
    val startDateTime: LocalDateTime,
    val endDateTime: LocalDateTime
)
