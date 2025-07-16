package com.project.core.domain.performance.vo

import java.time.LocalDate

// 공연 기본 정보
data class PerformanceBaseInfo(
    val performanceName: String,
    val performanceDescription: String,
    val performanceHallInfo: PerformanceHallInfo,
    val startDate: PerformanceDate,
    val endDate: PerformanceDate
)
