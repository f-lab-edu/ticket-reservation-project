package com.project.core.domain.performance.vo

import java.math.BigDecimal

data class SeatPrice(
    val price: BigDecimal
){
    init {
        require(price >= BigDecimal.ZERO) {"좌석 가격은 0원 이상이야 합니다"}
    }
}
