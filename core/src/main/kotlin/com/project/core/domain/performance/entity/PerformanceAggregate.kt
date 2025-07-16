package com.project.core.domain.performance.entity

import com.project.core.domain.performance.vo.PerformanceBaseInfo
import com.project.core.domain.performance.vo.PerformanceStatus

class PerformanceAggregate(
    val performanceId: Long,
    val performanceInfo: PerformanceBaseInfo,
    val performanceDetails: List<PerformanceDetail>,
    val seats: List<Seat>,
    val performanceStatus: PerformanceStatus
){

}