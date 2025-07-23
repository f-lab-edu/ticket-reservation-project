package com.project.core.performance.domain.service.user

import com.project.core.common.vo.PagedResult
import com.project.core.performance.domain.entity.Performance
import com.project.core.performance.domain.entity.PerformanceDetail
import com.project.core.performance.domain.entity.Seat
import com.project.core.performance.domain.vo.BookingDateTime
import com.project.core.performance.domain.vo.PerformanceDateTime
import com.project.core.performance.domain.vo.PerformanceStatus
import java.time.LocalDateTime

//사용자 측면 공연 정보 조회 도메인 서비스
interface UserPerformanceService {

    // 공연 단일 조회 (공연 상세 포함)
    fun getPerformance(performanceId: Long): Performance

    fun getPerformanceBaseInfo(performanceId: Long): Performance

    // 공연 리스트 조회 (페이징)
    fun getPerformancesPaged(cursor: String?, size: Int): PagedResult<Performance>


    fun getSeatByPerformanceId(performanceId: Long): Seat

    fun getPerformanceStatus(performanceId: Long): PerformanceStatus



}