package com.project.core.performance.domain.vo

// 공연 기본 정보
data class PerformanceBaseInfo(
    val performanceName: String,
    val performanceDescription: String,
    val performanceHallInfo: PerformanceHallInfo
)
