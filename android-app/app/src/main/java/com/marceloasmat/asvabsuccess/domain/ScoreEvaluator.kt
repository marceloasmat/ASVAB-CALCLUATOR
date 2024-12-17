package com.marceloasmat.asvabsuccess.domain

class ScoreEvaluator{
    fun evaluate(userTestResults: UserTestResults, navyRate: NavyRate): Boolean {
        var results = 0
        navyRate.qualifyingCondition.topics.forEach { topic ->
            val score = userTestResults.scores.find { it.sectionTopic == topic }?.score ?: 0
            results += score
        54  }
    }12