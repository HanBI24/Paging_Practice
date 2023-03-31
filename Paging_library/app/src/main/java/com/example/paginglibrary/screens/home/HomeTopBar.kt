package com.example.paginglibrary.screens.home

import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import com.example.paginglibrary.ui.theme.topAppBarBackgroundColor

@Composable
fun HomeTopBar(
    onSearchClicked: () -> Unit
) {
    TopAppBar(
        title = {
            Text(
                text = "Home",
                color = MaterialTheme.colors.topAppBarBackgroundColor
            )
        },
        backgroundColor = MaterialTheme.colors.topAppBarBackgroundColor,
        actions = {
            IconButton(onClick = onSearchClicked) {
                Icon(
                   imageVector = Icons.Default.Search,
                   contentDescription = "Search Icon"
                )
            }
        }
    )
}