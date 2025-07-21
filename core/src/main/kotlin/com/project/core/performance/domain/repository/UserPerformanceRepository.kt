package com.project.core.performance.domain.repository

import com.project.core.common.vo.PagedResult
import com.project.core.performance.domain.entity.PerformanceAggregate
import com.project.core.performance.domain.entity.PerformanceDetail
import com.project.core.performance.domain.entity.Seat
import com.project.core.performance.domain.entity.SeatDetail
import java.time.LocalDateTime

interface UserPerformanceRepository {

    fun findPerformanceCursor(): com.project.core.common.vo.PagedResult<com.project.core.performance.domain.entity.PerformanceAggregate>?

    fun findPerformanceCursorWhereIsActive(): com.project.core.common.vo.PagedResult<com.project.core.performance.domain.entity.PerformanceAggregate>?

    fun findByPerformanceIdAndDateTimeBetweenIsActive(
        performanceId: Long,
        startDateTime: LocalDateTime,
        endDateTime: LocalDateTime
    ): List<com.project.core.performance.domain.entity.PerformanceDetail>?

    fun findByPerformanceId(id: Long): com.project.core.performance.domain.entity.PerformanceAggregate?

    fun findByPerformanceDetailId(id: Long): com.project.core.performance.domain.entity.PerformanceDetail?

    fun findSeatByPerformanceId(id: Long): com.project.core.performance.domain.entity.Seat?

    fun findSeatDetailById(seatDetailId: Long): com.project.core.performance.domain.entity.SeatDetail?
}