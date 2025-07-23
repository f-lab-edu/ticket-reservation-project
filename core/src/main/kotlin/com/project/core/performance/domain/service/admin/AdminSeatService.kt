package com.project.core.performance.domain.service.admin

import com.project.core.performance.domain.service.admin.dto.SeatDeleteRequestDomainDto
import com.project.core.performance.domain.service.admin.dto.SeatDeleteResponseDomainDto
import com.project.core.performance.domain.service.admin.dto.SeatDetailDeleteRequestDomainDto
import com.project.core.performance.domain.service.admin.dto.SeatDetailDeleteResponseDomainDto
import com.project.core.performance.domain.service.admin.dto.SeatDetailSaveRequestDomainDto
import com.project.core.performance.domain.service.admin.dto.SeatDetailSaveResponseDomainDto
import com.project.core.performance.domain.service.admin.dto.SeatDetailSelectRequestDomainDto
import com.project.core.performance.domain.service.admin.dto.SeatDetailSelectResponseDomainDto
import com.project.core.performance.domain.service.admin.dto.SeatDetailUpdateRequestDomainDto
import com.project.core.performance.domain.service.admin.dto.SeatDetailUpdateResponseDomainDto
import com.project.core.performance.domain.service.admin.dto.SeatGradePolicyDeleteRequestDomainDto
import com.project.core.performance.domain.service.admin.dto.SeatGradePolicyDeleteResponseDomainDto
import com.project.core.performance.domain.service.admin.dto.SeatGradePolicySaveRequestDomainDto
import com.project.core.performance.domain.service.admin.dto.SeatGradePolicySaveResponseDomainDto
import com.project.core.performance.domain.service.admin.dto.SeatGradePolicySelectRequestDomainDto
import com.project.core.performance.domain.service.admin.dto.SeatGradePolicySelectResponseDomainDto
import com.project.core.performance.domain.service.admin.dto.SeatGradePolicyUpdateRequestDomainDto
import com.project.core.performance.domain.service.admin.dto.SeatGradePolicyUpdateResponseDomainDto
import com.project.core.performance.domain.service.admin.dto.SeatSaveRequestDomainDto
import com.project.core.performance.domain.service.admin.dto.SeatSaveResponseDomainDto
import com.project.core.performance.domain.service.admin.dto.SeatSelectRequestDomainDto
import com.project.core.performance.domain.service.admin.dto.SeatSelectResponseDomainDto
import com.project.core.performance.domain.service.admin.dto.SeatUpdateRequestDomainDto
import com.project.core.performance.domain.service.admin.dto.SeatUpdateResponseDomainDto

interface AdminSeatService {

    fun saveSeat(dto: SeatSaveRequestDomainDto): SeatSaveResponseDomainDto

    fun updateSeat(dto: SeatUpdateRequestDomainDto): SeatUpdateResponseDomainDto

    fun deleteSeat(dto: SeatDeleteRequestDomainDto): SeatDeleteResponseDomainDto

    fun getSeat(dto: SeatSelectRequestDomainDto): SeatSelectResponseDomainDto

    fun saveSeatGradePolicy(dto: SeatGradePolicySaveRequestDomainDto): SeatGradePolicySaveResponseDomainDto

    fun updateSeatGradePolicy(dto: SeatGradePolicyUpdateRequestDomainDto): SeatGradePolicyUpdateResponseDomainDto

    fun deleteSeatGradePolicy(dto: SeatGradePolicyDeleteRequestDomainDto): SeatGradePolicyDeleteResponseDomainDto

    fun getSeatGradePolicy(dto: SeatGradePolicySelectRequestDomainDto): SeatGradePolicySelectResponseDomainDto

    fun saveSeatDetail(dto: SeatDetailSaveRequestDomainDto): SeatDetailSaveResponseDomainDto

    fun updateSeatDetail(dto: SeatDetailUpdateRequestDomainDto): SeatDetailUpdateResponseDomainDto

    fun deleteSeatDetail(dto: SeatDetailDeleteRequestDomainDto): SeatDetailDeleteResponseDomainDto

    fun getSeatDetail(dto: SeatDetailSelectRequestDomainDto): SeatDetailSelectResponseDomainDto
}