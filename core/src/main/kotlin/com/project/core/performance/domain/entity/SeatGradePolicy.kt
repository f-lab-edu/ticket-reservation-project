package com.project.core.performance.domain.entity

import com.project.core.performance.domain.vo.SeatGrade
import com.project.core.performance.domain.vo.SeatPrice
import jakarta.persistence.Column
import jakarta.persistence.Embedded
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import java.math.BigDecimal

@Entity
class SeatGradePolicy(

    @ManyToOne
    @JoinColumn(name = "seat_id")
    var seat: Seat,

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var seatGradePolicyId: Long? = null,

    @Embedded
    var seatGrade: SeatGrade,

    @Embedded
    var seatPrice: SeatPrice,

    @Column(name = "total_seat_count", nullable = false)
    var totalSeatCount: Int,

    @Column(name = "total_seat_price", nullable = false)
    var totalSeatPrice: BigDecimal
) {
}