package com.marceloasmat.asvabsuccess.data

import com.marceloasmat.asvabsuccess.domain.CalculatorResults
import com.marceloasmat.asvabsuccess.domain.NavyRate
import com.marceloasmat.asvabsuccess.domain.SectionTopic
import com.marceloasmat.asvabsuccess.domain.UserTestScores

class AsvabCalculator {

    fun checkScores(testResults: UserTestScores): CalculatorResults{
        val qualifiedTotals = mutableListOf<NavyRate>()
        val waiverableTotals = mutableListOf<NavyRate>()
        val unqualifiedTotals = mutableListOf<NavyRate>()
        NavyRate.entries.forEach { navyRate ->
            when (navyRate) {
                NavyRate.AviationBoatswainMate ->{
                    val ve = testResults.scores.find { it.sectionTopic == SectionTopic.Verbal }!!.score
                    val ar = testResults.scores.find { it.sectionTopic == SectionTopic.ArithmeticReasoning }!!.score
                    val mk = testResults.scores.find { it.sectionTopic == SectionTopic.MathematicsKnowledge }!!.score
                    val asScore = testResults.scores.find { it.sectionTopic == SectionTopic.AutoShop }!!.score
                    val total = ve + ar + mk + asScore
                    if(total >= 161){
                        qualifiedTotals.add(navyRate)
                    }else if (total >= 149){
                        waiverableTotals.add(navyRate)
                    }else{
                        unqualifiedTotals.add(navyRate)
                    }
                }
                NavyRate.AviationMachinistMate ->{

                }
                NavyRate.AviationSupportEquipment ->{

                }
                NavyRate.NavalAircrewman ->{

                }
                NavyRate.AircrewRescueSwimmer ->{

                }

            }

        }
        return CalculatorResults(
            qualified = qualifiedTotals,
            waiverable = waiverableTotals,
            unqualified = unqualifiedTotals,
        )
    }
}