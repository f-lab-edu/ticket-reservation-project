package com.project.core.domain.performance.service.user

import com.project.core.domain.common.vo.PagedResult
import com.project.core.domain.performance.entity.PerformanceAggregate
import com.project.core.domain.performance.entity.PerformanceDetail
import com.project.core.domain.performance.entity.Seat
import com.project.core.domain.performance.repository.UserPerformanceRepository
import com.project.core.domain.performance.vo.PerformanceDateTime
import java.time.LocalDateTime

//사용자 측면 공연 정보 조회 서비스
class UserPerformanceInfoService(
    private val userPerformanceRepository: UserPerformanceRepository,
) {

    fun listPerformances(cursor: String?, size: Int): PagedResult<PerformanceAggregate>? {
        return userPerformanceRepository.findPerformanceCursorWhereIsActive()
    }

    fun getPerformance(performanceId: Long): PerformanceAggregate? {
        return userPerformanceRepository.findByPerformanceId(performanceId)
    }

    fun listPerformancesDetails(
        performanceId: Long,
        performanceDateTime: PerformanceDateTime
    ): List<PerformanceDetail>? {

        val currentDateTime = LocalDateTime.now()

        if (performanceDateTime.startDateTime.isBefore(currentDateTime)) {
            performanceDateTime.copy(startDateTime = currentDateTime)
        }

        return userPerformanceRepository.findByPerformanceIdAndDateTimeBetweenIsActive(
            performanceId = performanceId,
            startDateTime = performanceDateTime.startDateTime,
            endDateTime = performanceDateTime.endDateTime
        )

    }

    fun getPerformanceDetail(performanceDetailId: Long): PerformanceDetail? {
        return userPerformanceRepository.findByPerformanceDetailId(performanceDetailId)
    }

    fun getSeats(performanceId: Long): Seat {
        return userPerformanceRepository.findSeatByPerformanceId(performanceId)
    }

}