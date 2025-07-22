package com.project.core.performance.domain.vo

import jakarta.persistence.Embeddable
import java.math.BigDecimal

@Embeddable
data class SeatPrice(
    val price: BigDecimal
){
    init {
        require(price >= BigDecimal.ZERO) {"좌석 가격은 0원 이상이야 합니다"}
    }
}
