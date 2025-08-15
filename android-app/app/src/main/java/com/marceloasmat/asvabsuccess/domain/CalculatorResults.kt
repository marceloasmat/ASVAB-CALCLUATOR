package com.marceloasmat.asvabsuccess.domain

data class CalculatorResults (
    val qualified : List<NavyRate>,
    val waiverable : List<NavyRate>,
    val unqualified : List<NavyRate>,
)