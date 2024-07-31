package com.example.market_r.screens

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.market_r.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
@Preview
fun HomeDevicesScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Market-R", fontSize = 22.sp) },
                navigationIcon = {
//                        IconButton({ }) {
//                            Icon(
//                                Icons.Filled.Menu,
//                                contentDescription = "Меню"
//                            )
//                        }
                },
                actions = {
                    IconButton({ }) {
                        Icon(
                            imageVector = ImageVector.vectorResource(id = R.drawable.settings),
                            contentDescription = "Settings",
                        )
                    }
                    IconButton({ }) {
                        Icon(
                            imageVector = ImageVector.vectorResource(id = R.drawable.filter_list),
                            contentDescription = "Filter list",
                        )
                    }
                    IconButton({ }) {
                        Icon(
                            imageVector = ImageVector.vectorResource(id = R.drawable.search),
                            contentDescription = "Search",
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.DarkGray,
                    titleContentColor = Color.LightGray,
                    navigationIconContentColor = Color.LightGray,
                    actionIconContentColor = Color.LightGray
                )
            )
        }
    ) {
        Text("Bruh Bruh Bruh", fontSize = 28.sp, modifier = Modifier.padding(it))
    }
}