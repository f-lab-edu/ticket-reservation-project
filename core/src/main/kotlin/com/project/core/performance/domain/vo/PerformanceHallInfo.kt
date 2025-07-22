package com.project.core.performance.domain.vo

import jakarta.persistence.Embeddable

@Embeddable
data class PerformanceHallInfo(
    val hallName: String,
    val hallLocation: String
)
