package com.marceloasmat.asvabsuccess.domain

class ScoreEvaluator {
    fun evaluate(userTestScores: UserTestScores, navyRate: NavyRate): Boolean {
        var results = 0
        navyRate.qualifyingCondition.topics.forEach { topic ->
            val score = userTestScores.scores.find { it.sectionTopic == topic }?.score ?: 0
            results += score
        }
        return results >= navyRate.qualifyingCondition.minimumScore
    }
}
