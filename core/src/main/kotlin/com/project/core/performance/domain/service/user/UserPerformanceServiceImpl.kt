package com.project.core.performance.domain.service.user

import com.project.core.common.vo.PagedResult
import com.project.core.performance.domain.entity.Performance
import com.project.core.performance.domain.entity.PerformanceDetail
import com.project.core.performance.domain.entity.Seat
import com.project.core.performance.domain.repository.PerformanceDetailRepository
import com.project.core.performance.domain.repository.PerformanceRepository
import com.project.core.performance.domain.vo.BookingDateTime
import com.project.core.performance.domain.vo.PerformanceDateTime
import org.springframework.stereotype.Service
import java.time.LocalDateTime


@Service
class UserPerformanceServiceImpl(
    private val performanceRepository: PerformanceRepository,
    private val performanceDetailRepository: PerformanceDetailRepository
): UserPerformanceService {

    override fun getPerformance(performanceId: Long): Performance {
        TODO("Not yet implemented")
    }

    override fun getPerformanceBaseInfo(performanceId: Long): Performance {
        TODO("Not yet implemented")
    }

    override fun getPerformancesPaged(cursor: String?, size: Int): PagedResult<Performance> {
        TODO("Not yet implemented")
    }

    override fun getPerformanceDetail(performanceDetailId: Long): PerformanceDetail {
        TODO("Not yet implemented")
    }

    override fun getPerformanceDateTime(performanceDetailId: Long): PerformanceDateTime {
        TODO("Not yet implemented")
    }

    override fun getBookingDateTime(performanceDetailId: Long): BookingDateTime {
        TODO("Not yet implemented")
    }

    override fun getPerformanceDetailsByTime(
        performanceId: Long,
        startDateTime: LocalDateTime,
        endDateTime: LocalDateTime
    ): List<PerformanceDetail> {
        TODO("Not yet implemented")
    }

    override fun isPerformanceDetailBookable(performanceDetailId: Long): Boolean {
        TODO("Not yet implemented")
    }

    override fun getSeatByPerformanceId(performanceId: Long): Seat {
        TODO("Not yet implemented")
    }


}