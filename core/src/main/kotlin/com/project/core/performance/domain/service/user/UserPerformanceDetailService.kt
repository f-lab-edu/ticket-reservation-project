package com.project.core.performance.domain.service.user

import com.project.core.performance.domain.entity.PerformanceDetail
import com.project.core.performance.domain.vo.BookingDateTime
import com.project.core.performance.domain.vo.PerformanceDateTime
import com.project.core.performance.domain.vo.PerformanceDetailStatus
import com.project.core.performance.domain.vo.PerformanceStatus
import java.time.LocalDateTime

interface UserPerformanceDetailService {

    fun getPerformanceDetail(performanceDetailId: Long): PerformanceDetail

    fun getPerformanceDateTime(performanceDetailId: Long): PerformanceDateTime

    fun getBookingDateTime(performanceDetailId: Long): BookingDateTime

    // 공연 상세 리스트 조회 (공연 날짜 기준)
    fun getPerformanceDetailsByTime(
        performanceId: Long,
        startDateTime: LocalDateTime,
        endDateTime: LocalDateTime
    ): List<PerformanceDetail>

    // 공연 예매 가능 여부 조회
    fun isPerformanceDetailBookable(performanceDetailId: Long): Boolean

    fun getPerformanceDetailStatus(performanceDetailId: Long): PerformanceDetailStatus
}