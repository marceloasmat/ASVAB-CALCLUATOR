package com.marceloasmat.asvabsuccess

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

import androidx.navigation.compose.rememberNavController
import com.marceloasmat.asvabsuccess.domain.NavyRate
import com.marceloasmat.asvabsuccess.domain.QualifyingCondition
import com.marceloasmat.asvabsuccess.domain.SectionTopic
import com.marceloasmat.asvabsuccess.domain.TestScore
import com.marceloasmat.asvabsuccess.domain.UserTestResults
import com.marceloasmat.asvabsuccess.ui.theme.AsvabSuccessTheme
import kotlinx.serialization.Serializable

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val navyCounselor = NavyRate(
            name = "Navy Counselor",
            qualifyingCondition = QualifyingCondition(
                topics = listOf(
                    SectionTopic.GeneralScience, SectionTopic.MathematicsKnowledge, SectionTopic.Verbal,
                ),
                minimumScore = 156,
            )

        )
        val userTestResults = UserTestResults(
            scores = listOf(
                TestScore(score = 80, sectionTopic = SectionTopic.Verbal),
                TestScore(score = 73, sectionTopic = SectionTopic.GeneralScience),
                TestScore(score = 55, sectionTopic = SectionTopic.MathematicsKnowledge),
                TestScore(score = 63, sectionTopic = SectionTopic.ParagraphComprehension),
                TestScore(score = 58, sectionTopic = SectionTopic.ArithmeticReasoning),
                TestScore(score = 50, sectionTopic = SectionTopic.ElectronicsInformation),
                TestScore(score = 32, sectionTopic = SectionTopic.AutoShop),
                TestScore(score = 60, sectionTopic = SectionTopic.AssemblingObjects),
                TestScore(score = 55, sectionTopic = SectionTopic.NavyAdvancedPlacementTest),
                TestScore(score = 60, sectionTopic = SectionTopic.WordKnowledge),
                TestScore(score = 52, sectionTopic = SectionTopic.MechanicalComprehension),
            )
        )
        enableEdgeToEdge()
        setContent {
            AsvabSuccessTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    val navController = rememberNavController()
                    NavHost(navController = navController, startDestination = HomeDestination){
                        composable<HomeDestination> {
                            HomeScreen(onCalculateClick = {
                                navController.navigate(JobResultsDestination)
                            })
                        }
                        composable<JobResultsDestination> {
                            JobResultsScreen()
                        }
                    }
                }
            }
        }
    }
}
@Serializable
object HomeDestination
@Serializable
object JobResultsDestination


@Serializable
enum class JobResultsTabDestination{
    QualifiedJobsDestination,
    WaiverableJobsDestination,
    UnqualifiedJobsDestination

}


