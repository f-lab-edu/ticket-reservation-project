package com.project.core.domain.performance.entity

import com.project.core.domain.performance.vo.PerformanceBaseInfo

class PerformanceAggregate(
    val performanceId: Long,
    val performanceInfo: PerformanceBaseInfo,
    val performanceDetails: List<PerformanceDetail>,
    val seats: List<Seat>
) {

}