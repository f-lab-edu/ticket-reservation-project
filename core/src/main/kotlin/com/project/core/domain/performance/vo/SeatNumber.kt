package com.project.core.domain.performance.vo

data class SeatNumber(
    val area: String,
    val number: Int
){
    init {
        require(area.isNotBlank()){"영역값은 빈값을 허용하지 않습니다."}
        require(number > 0){"숫자값은 0 보다 큰값이어야 합니다."}
    }
}
