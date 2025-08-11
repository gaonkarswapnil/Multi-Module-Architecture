package com.example.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.presentation.screens.ListOfUsers

@Composable
fun SetUpNav(navHostController: NavHostController){
    NavHost(
        navHostController,
        startDestination = Screens.ListOfUsers.route,
    ){
        composable(Screens.ListOfUsers.route){
            ListOfUsers()
        }
    }
}