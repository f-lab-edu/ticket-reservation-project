package com.project.core.performance.domain.service.user

import com.project.core.common.vo.PagedResult
import com.project.core.performance.domain.entity.Performance
import com.project.core.performance.domain.entity.PerformanceDetail
import com.project.core.performance.domain.entity.Seat
import com.project.core.performance.domain.vo.BookingDateTime
import com.project.core.performance.domain.vo.PerformanceDateTime
import java.time.LocalDateTime

//사용자 측면 공연 정보 조회 도메인 서비스
interface UserPerformanceService {

    // 공연 단일 조회 (공연 상세 포함)
    fun getPerformance(performanceId: Long): Performance

    fun getPerformanceBaseInfo(performanceId: Long): Performance

    // 공연 리스트 조회 (페이징)
    fun getPerformancesPaged(cursor: String?, size: Int): PagedResult<Performance>

    // 공연 상세 단일 조회
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

    fun getSeatByPerformanceId(performanceId: Long): Seat

}