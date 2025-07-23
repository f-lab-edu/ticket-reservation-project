package com.project.core.performance.domain.service.user

import com.project.core.performance.domain.entity.Seat
import com.project.core.performance.domain.entity.SeatDetail
import com.project.core.performance.domain.entity.SeatGradePolicy
import com.project.core.performance.domain.vo.SeatGrade
import com.project.core.performance.domain.vo.SeatNumber
import com.project.core.performance.domain.vo.SeatPrice
import java.math.BigDecimal

interface UserSeatService {

    fun getSeat(seatId: Long): Seat

    fun getSeatGradePolicy(seatId: Long): List<SeatGradePolicy>

    fun getSeatDetails(seatId: Long): Seat

    fun getSeatDetailById(seatDetailId: Long): SeatDetail

    fun getSeatDetailByNumber(seatNumber: SeatNumber): SeatDetail

    fun getSeatDetailByGrade(seatGrade: SeatGrade): List<SeatDetail>

    fun getSeatGradeTotalCount(seatGradePolicyId: Long): Int

    fun getSeatGradeTotalPrice(seatGradePolicyId: Long): BigDecimal

    fun getSeatDetailPrice(seatDetailId: Long): SeatPrice

    fun getSeatDetailGrade(seatDetailId: Long): SeatGrade

    fun getSeatDetailNumber(seatDetailId: Long): SeatNumber
}