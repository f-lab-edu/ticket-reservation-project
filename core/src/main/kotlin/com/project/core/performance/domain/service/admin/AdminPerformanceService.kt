package com.project.core.performance.domain.service.admin

import com.project.core.common.vo.PagedResult
import com.project.core.performance.domain.entity.Performance
import com.project.core.performance.domain.service.admin.dto.PerformanceDeleteRequestDomainDto
import com.project.core.performance.domain.service.admin.dto.PerformanceDeleteResponseDomainDto
import com.project.core.performance.domain.service.admin.dto.PerformancePagedRequestDomainDto
import com.project.core.performance.domain.service.admin.dto.PerformanceSaveRequestDomainDto
import com.project.core.performance.domain.service.admin.dto.PerformanceSaveResponseDomainDto
import com.project.core.performance.domain.service.admin.dto.PerformanceSelectRequestDomainDto
import com.project.core.performance.domain.service.admin.dto.PerformanceSelectResponseDomainDto
import com.project.core.performance.domain.service.admin.dto.PerformanceStatusUpdateRequestDomainDto
import com.project.core.performance.domain.service.admin.dto.PerformanceStatusUpdateResponseDomainDto
import com.project.core.performance.domain.service.admin.dto.PerformanceUpdateRequestDomainDto
import com.project.core.performance.domain.service.admin.dto.PerformanceUpdateResponseDomainDto

interface AdminPerformanceService {

    fun savePerformance(dto: PerformanceSaveRequestDomainDto): PerformanceSaveResponseDomainDto

    fun updatePerformance(dto: PerformanceUpdateRequestDomainDto): PerformanceUpdateResponseDomainDto

    fun deletePerformance(dto: PerformanceDeleteRequestDomainDto): PerformanceDeleteResponseDomainDto

    fun getPerformancesPaged(dto: PerformancePagedRequestDomainDto): PagedResult<PerformanceSelectResponseDomainDto>

    fun getPerformance(dto: PerformanceSelectRequestDomainDto): PerformanceSelectResponseDomainDto

    fun updatePerformanceStatus(dto: PerformanceStatusUpdateRequestDomainDto): PerformanceStatusUpdateResponseDomainDto


}