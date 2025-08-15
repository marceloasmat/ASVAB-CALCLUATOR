package com.marceloasmat.asvabsuccess.data

import com.marceloasmat.asvabsuccess.domain.CalculatorResults
import com.marceloasmat.asvabsuccess.domain.UserTestScores

class AsvabCalculator {

    fun checkScores(testResults: UserTestScores): CalculatorResults{
        return CalculatorResults(
            qualified = emptyList(),
            waiverable = emptyList(),
            unqualified = emptyList(),
        )
    }
}