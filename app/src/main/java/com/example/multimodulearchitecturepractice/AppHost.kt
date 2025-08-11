package com.example.multimodulearchitecturepractice

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.example.presentation.navigation.SetUpNav

@Composable
fun AppHost(modifier: Modifier = Modifier) {
    val navHostController = rememberNavController()
    SetUpNav(navHostController)
}