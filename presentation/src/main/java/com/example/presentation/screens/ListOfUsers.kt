package com.example.presentation.screens

import android.util.Log
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.presentation.component.SingleUser
import com.example.presentation.viewmodel.UserViewModel

@Composable
fun ListOfUsers(modifier: Modifier = Modifier) {
    val viewModel: UserViewModel = hiltViewModel()

    val data = viewModel.userList.collectAsState().value

    LazyColumn {
        items(data){
            SingleUser(it)
        }
    }

}