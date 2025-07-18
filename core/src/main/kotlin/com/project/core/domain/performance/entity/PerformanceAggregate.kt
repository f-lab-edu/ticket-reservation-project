package com.project.core.domain.performance.entity

import com.project.core.domain.performance.vo.PerformanceBaseInfo
import com.project.core.domain.performance.vo.PerformanceStatus

class PerformanceAggregate(
    var performanceId: Long? = null,
    var performanceInfo: PerformanceBaseInfo,
    var performanceDetails: List<PerformanceDetail> = emptyList(),
    var seat: Seat,
    var performanceStatus: PerformanceStatus
){

}