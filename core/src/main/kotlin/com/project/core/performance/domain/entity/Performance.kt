package com.project.core.performance.domain.entity

import com.project.core.performance.domain.vo.PerformanceBaseInfo
import com.project.core.performance.domain.vo.PerformanceStatus
import com.project.core.performance.domain.vo.PerformanceStatus.*
import jakarta.persistence.Embedded
import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.OneToMany
import jakarta.persistence.OneToOne

@Entity
class Performance(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var performanceId: Long? = null,

    @Embedded
    var performanceInfo: PerformanceBaseInfo,

    @OneToMany
    @JoinColumn(name = "performancedetail_id")
    var performanceDetails: MutableList<PerformanceDetail> = mutableListOf(),

    @OneToOne
    var seat: Seat,

    @Enumerated(value = EnumType.STRING)
    private var performanceStatus: PerformanceStatus = DRAFT
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

        require(this.performanceStatus == DRAFT || this.performanceStatus == INACTIVE) {
            "공연은 생성 상태와 비활성 상태에서만 활성상태로 변경 가능합니다."
        }

        this.performanceStatus = ACTIVE
    }

    //공연 비활성 상태 변경
    fun inactivatePerformance() {

        require(this.performanceStatus == ACTIVE) {
            "공연은 활성 상태에서만 비활성 상태로 변경 가능합니다."
        }

        this.performanceStatus = INACTIVE
    }

    //공연 완료 상태 변경
    fun completePerformance() {

        require(this.performanceStatus == ACTIVE) {
            "공연은 활성 상태에서만 완료 상태로 변경 가능합니다."
        }

        this.performanceStatus = COMPLETED
    }
}