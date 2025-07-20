package com.project.core.domain.performance.repository

import com.project.core.domain.common.vo.PagedResult
import com.project.core.domain.performance.entity.PerformanceAggregate
import com.project.core.domain.performance.entity.PerformanceDetail
import com.project.core.domain.performance.entity.Seat
import java.time.LocalDateTime

interface UserPerformanceRepository {

    fun findPerformanceCursor(): PagedResult<PerformanceAggregate>?

    fun findPerformanceCursorWhereIsActive(): PagedResult<PerformanceAggregate>?

    fun findByPerformanceIdAndDateTimeBetweenIsActive(
        performanceId: Long,
        startDateTime: LocalDateTime,
        endDateTime: LocalDateTime
    ): List<PerformanceDetail>?

    fun findByPerformanceId(id: Long): PerformanceAggregate?

    fun findByPerformanceDetailId(id: Long): PerformanceDetail?

    fun findSeatByPerformanceId(id: Long): Seat
}