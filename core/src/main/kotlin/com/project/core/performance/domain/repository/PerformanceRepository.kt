package com.project.core.performance.domain.repository

import com.project.core.performance.domain.entity.Performance
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PerformanceRepository: JpaRepository<Performance, Long>