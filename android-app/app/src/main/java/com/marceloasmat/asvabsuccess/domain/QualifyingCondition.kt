package com.marceloasmat.asvabsuccess.domain

data class QualifyingCondition(
    val topics: List<SectionTopic>,
    val minimumScore: Int,
)