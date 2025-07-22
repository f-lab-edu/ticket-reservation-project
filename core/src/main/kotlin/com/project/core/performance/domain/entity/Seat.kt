package com.project.core.performance.domain.entity

import jakarta.persistence.Embedded
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.OneToMany
import jakarta.persistence.OneToOne

@Entity
class Seat(
    @OneToOne
    @JoinColumn(name = "performance_id")
    var performance: Performance?= null,

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var seatId: Long ?= null,

    @OneToMany(mappedBy = "seat")
    var seatGradePolicies: MutableList<SeatGradePolicy>? = mutableListOf(),

    @OneToMany(mappedBy = "seat")
    var seatDetails: MutableList<SeatDetail> = mutableListOf(),

)