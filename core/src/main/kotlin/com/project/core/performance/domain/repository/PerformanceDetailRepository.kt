package com.project.core.performance.domain.repository

import com.project.core.performance.domain.entity.PerformanceDetail
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PerformanceDetailRepository: JpaRepository<PerformanceDetail, Long> {
}