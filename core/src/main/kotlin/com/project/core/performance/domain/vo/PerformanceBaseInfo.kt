package com.project.core.performance.domain.vo

import jakarta.persistence.Embeddable

// 공연 기본 정보
@Embeddable
data class PerformanceBaseInfo(
    val performanceName: String,
    val performanceDescription: String,
    val performanceHallInfo: PerformanceHallInfo
)
