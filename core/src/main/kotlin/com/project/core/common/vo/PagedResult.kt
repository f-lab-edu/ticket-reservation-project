package com.project.core.common.vo

data class PagedResult<T>(
    val content: List<T> = emptyList(),
    val hasNext: Boolean,
    val nextCursor: String?,
    val size: Int
)
