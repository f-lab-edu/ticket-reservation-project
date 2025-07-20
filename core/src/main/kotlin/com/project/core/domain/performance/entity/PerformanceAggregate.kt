package com.project.core.domain.performance.entity

import com.project.core.domain.performance.vo.PerformanceBaseInfo
import com.project.core.domain.performance.vo.PerformanceStatus

class PerformanceAggregate(
    var performanceId: Long? = null,
    var performanceInfo: PerformanceBaseInfo,
    var performanceDetails: MutableList<PerformanceDetail> = mutableListOf(),
    var seat: Seat,
    private var performanceStatus: PerformanceStatus = PerformanceStatus.DRAFT
){

    //공연 기본정보 수정
    fun modifyPerformanceInfo(performanceInfo: PerformanceBaseInfo) {
        this.performanceInfo = performanceInfo
    }

    //공연 상세정보 추가
    fun addPerformanceDetail(performanceDetail: PerformanceDetail) {
        this.performanceDetails.add(performanceDetail)
    }

    //공연 상세정보 삭제
    fun deletePerformanceDetail(performanceDetailId: Long) {
        this.performanceDetails.removeIf { it.performanceDetailId == performanceDetailId }
    }

    //공연 활성 상태 변경
    fun activatePerformance() {

        require(this.performanceStatus == PerformanceStatus.DRAFT || this.performanceStatus == PerformanceStatus.INACTIVE) {
            "공연은 생성 상태와 비활성 상태에서만 활성상태로 변경 가능합니다."
        }

        this.performanceStatus = PerformanceStatus.ACTIVE
    }

    //공연 비활성 상태 변경
    fun inactivatePerformance() {

        require(this.performanceStatus == PerformanceStatus.ACTIVE) {
            "공연은 활성 상태에서만 비활성 상태로 변경 가능합니다."
        }

        this.performanceStatus = PerformanceStatus.INACTIVE
    }

    //공연 완료 상태 변경
    fun completePerformance() {

        require(this.performanceStatus == PerformanceStatus.ACTIVE) {
            "공연은 활성 상태에서만 완료 상태로 변경 가능합니다."
        }

        this.performanceStatus = PerformanceStatus.COMPLETED
    }
}