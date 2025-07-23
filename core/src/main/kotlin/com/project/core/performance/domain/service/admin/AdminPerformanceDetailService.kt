package com.project.core.performance.domain.service.admin

import com.project.core.performance.domain.service.admin.dto.PerformanceDetailDeleteRequestDomainDto
import com.project.core.performance.domain.service.admin.dto.PerformanceDetailDeleteResponseDomainDto
import com.project.core.performance.domain.service.admin.dto.PerformanceDetailSaveRequestDomainDto
import com.project.core.performance.domain.service.admin.dto.PerformanceDetailSaveResponseDomainDto
import com.project.core.performance.domain.service.admin.dto.PerformanceDetailSelectRequestDomainDto
import com.project.core.performance.domain.service.admin.dto.PerformanceDetailSelectResponseDomainDto
import com.project.core.performance.domain.service.admin.dto.PerformanceDetailStatusUpdateRequestDomainDto
import com.project.core.performance.domain.service.admin.dto.PerformanceDetailStatusUpdateResponseDomainDto
import com.project.core.performance.domain.service.admin.dto.PerformanceDetailUpdateRequestDomainDto
import com.project.core.performance.domain.service.admin.dto.PerformanceDetailUpdateResponseDomainDto

interface AdminPerformanceDetailService {

    fun savePerformanceDetail(dto: PerformanceDetailSaveRequestDomainDto): PerformanceDetailSaveResponseDomainDto

    fun updatePerformanceDetail(dto: PerformanceDetailUpdateRequestDomainDto): PerformanceDetailUpdateResponseDomainDto

    fun deletePerformanceDetail(dto: PerformanceDetailDeleteRequestDomainDto): PerformanceDetailDeleteResponseDomainDto

    fun getPerformanceDetail(dto: PerformanceDetailSelectRequestDomainDto): PerformanceDetailSelectResponseDomainDto

    fun getPerformanceDetailsByCondition(dto: PerformanceDetailSelectRequestDomainDto): List<PerformanceDetailSelectResponseDomainDto>

    fun updatePerformanceDetailStatus(dto: PerformanceDetailStatusUpdateRequestDomainDto): PerformanceDetailStatusUpdateResponseDomainDto

}