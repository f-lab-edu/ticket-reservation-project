package com.project.core.performance.domain.repository

import java.time.LocalDateTime

interface UserPerformanceRepository {

    fun findPerformanceCursor(): com.project.core.common.vo.PagedResult<com.project.core.performance.domain.entity.Performance>?

    fun findPerformanceCursorWhereIsActive(): com.project.core.common.vo.PagedResult<com.project.core.performance.domain.entity.Performance>?

    fun findByPerformanceIdAndDateTimeBetweenIsActive(
        performanceId: Long,
        startDateTime: LocalDateTime,
        endDateTime: LocalDateTime
    ): List<com.project.core.performance.domain.entity.PerformanceDetail>?

    fun findByPerformanceId(id: Long): com.project.core.performance.domain.entity.Performance?

    fun findByPerformanceDetailId(id: Long): com.project.core.performance.domain.entity.PerformanceDetail?

    fun findSeatByPerformanceId(id: Long): com.project.core.performance.domain.entity.Seat?

    fun findSeatDetailById(seatDetailId: Long): com.project.core.performance.domain.entity.SeatDetail?
}