package com.project.core.domain.performance.entity

import com.project.core.domain.performance.vo.PerformanceDate
import com.project.core.domain.performance.vo.PerformanceTime

class PerformanceDetail(
    val performanceId: Long,
    val performanceDetailId: Long,
    val startDate: PerformanceDate,
    val endDate: PerformanceDate,
    val startTime: PerformanceTime,
    val endTime: PerformanceTime
)