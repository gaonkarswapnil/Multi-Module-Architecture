package com.example.presentation.navigation

sealed class Screens(val route: String) {
    object ListOfUsers: Screens("listOfUser")
}