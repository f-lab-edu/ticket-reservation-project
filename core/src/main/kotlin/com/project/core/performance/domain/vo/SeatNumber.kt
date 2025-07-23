package com.project.core.performance.domain.vo

import jakarta.persistence.Embeddable

@Embeddable
data class SeatNumber(
    val area: String,
    val number: String
){
    init {
        require(area.isNotBlank()){"영역값은 빈값을 허용하지 않습니다."}
    }
}
