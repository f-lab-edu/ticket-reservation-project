package com.project.core.performance.domain.entity

import com.project.core.performance.domain.vo.BookingDateTime
import com.project.core.performance.domain.vo.PerformanceDateTime
import com.project.core.performance.domain.vo.PerformanceDetailStatus
import jakarta.persistence.Entity
import java.time.LocalDateTime

@Entity
class PerformanceDetail(
    var performanceId: Long,
    var performanceDetailId: Long,
    var performanceDateTime: PerformanceDateTime,
    var bookingDateTime: BookingDateTime,
    var status: PerformanceDetailStatus,
    var tickets: List<Ticket> = emptyList(),
){
    // 공연 시간 이전 확인 메서드
    fun isBeforePerformanceStartTime(time: LocalDateTime): Boolean {
        return time.isBefore(performanceDateTime.startDateTime)
    }

    // 공연 시간 이후 확인 메서드
    fun isAfterPerformanceEndTime(time: LocalDateTime): Boolean {
        return time.isAfter(performanceDateTime.endDateTime)
    }

    // 공연 시간 내 확인 메서드
    fun isInPerformanceTime(time: LocalDateTime): Boolean {
        return !isBeforePerformanceStartTime(time) && !isAfterPerformanceEndTime(time)
    }

    // 예매 시간 이전 확인 메서드
    fun isBeforeBookingStartTime(time: LocalDateTime): Boolean {
        return time.isBefore(bookingDateTime.startDateTime)
    }

    // 예매 시간 이후 확인 메서드
    fun isAfterBookingEndTime(time: LocalDateTime): Boolean {
        return time.isAfter(bookingDateTime.endDateTime)
    }

    // 예매 시간 내 확인 메서드
    fun isInBookingTime(time: LocalDateTime): Boolean {
        return !isBeforeBookingStartTime(time) && !isAfterBookingEndTime(time)
    }

    fun activatePerformanceDetail() {

        require(status == PerformanceDetailStatus.INACTIVE || status == PerformanceDetailStatus.DRAFT) { "공연 상세정보는 생성 상태와 비활성 상태에서만 활성 상태로 변경 가능합니다." }

        this.status = PerformanceDetailStatus.ACTIVE
    }

    fun inactivatePerformanceDetail() {

        require(status == PerformanceDetailStatus.ACTIVE) { "공연 상세정보는 활성 상태에서만 비활성 상태로 변경 가능합니다." }

        this.status = PerformanceDetailStatus.INACTIVE
    }

    fun completePerformanceDetail() {

        require(status == PerformanceDetailStatus.ACTIVE) { "공연 상세정보는 활성 상태에서만 완료 상태로 변경 가능합니다." }

        this.status = PerformanceDetailStatus.COMPLETED
    }


}