package com.project.core.performance.domain.service.user

import com.project.core.performance.domain.entity.Seat
import com.project.core.performance.domain.entity.SeatDetail
import com.project.core.performance.domain.entity.SeatGradePolicy
import com.project.core.performance.domain.repository.SeatDetailRepository
import com.project.core.performance.domain.repository.SeatGradePolicyRepository
import com.project.core.performance.domain.repository.SeatRepository
import com.project.core.performance.domain.vo.SeatGrade
import com.project.core.performance.domain.vo.SeatNumber
import com.project.core.performance.domain.vo.SeatPrice
import org.springframework.stereotype.Service
import java.math.BigDecimal

@Service
class UserSeatServiceImpl(
    private val seatRepository: SeatRepository,
    private val seatGradePolicyRepository: SeatGradePolicyRepository,
    private val seatDetailRepository: SeatDetailRepository
) : UserSeatService {
    override fun getSeat(seatId: Long): Seat {
        TODO("Not yet implemented")
    }

    override fun getSeatGradePolicy(seatId: Long): List<SeatGradePolicy> {
        TODO("Not yet implemented")
    }

    override fun getSeatDetails(seatId: Long): Seat {
        TODO("Not yet implemented")
    }

    override fun getSeatDetailById(seatDetailId: Long): SeatDetail {
        TODO("Not yet implemented")
    }

    override fun getSeatDetailByNumber(seatNumber: SeatNumber): SeatDetail {
        TODO("Not yet implemented")
    }

    override fun getSeatDetailByGrade(seatGrade: SeatGrade): List<SeatDetail> {
        TODO("Not yet implemented")
    }

    override fun getSeatGradeTotalCount(seatGradePolicyId: Long): Int {
        TODO("Not yet implemented")
    }

    override fun getSeatGradeTotalPrice(seatGradePolicyId: Long): BigDecimal {
        TODO("Not yet implemented")
    }

    override fun getSeatDetailPrice(seatDetailId: Long): SeatPrice {
        TODO("Not yet implemented")
    }

    override fun getSeatDetailGrade(seatDetailId: Long): SeatGrade {
        TODO("Not yet implemented")
    }

    override fun getSeatDetailNumber(seatDetailId: Long): SeatNumber {
        TODO("Not yet implemented")
    }
}