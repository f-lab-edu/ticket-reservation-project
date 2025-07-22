package com.project.core.performance.domain.repository

import com.project.core.performance.domain.entity.SeatGradePolicy
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface SeatGradePolicyRepository: JpaRepository<SeatGradePolicy, Long> {
}