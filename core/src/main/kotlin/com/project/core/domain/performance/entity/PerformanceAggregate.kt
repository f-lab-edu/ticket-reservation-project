package com.project.core.domain.performance.entity

import com.project.core.domain.performance.vo.PerformanceBaseInfo

class PerformanceAggregate(
    private val performanceId: Long,
    private val performanceInfo: PerformanceBaseInfo,
    private val performanceDetails: List<PerformanceDetail>,
    private val seats: List<Seat>
) {

}