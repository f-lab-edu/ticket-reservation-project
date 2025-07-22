package com.project.core.performance.domain.repository

import com.project.core.performance.domain.entity.SeatDetail
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface SeatDetailRepository: JpaRepository<SeatDetail, Long> {
}