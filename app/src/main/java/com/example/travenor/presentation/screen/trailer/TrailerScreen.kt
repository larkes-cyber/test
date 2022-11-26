package com.example.travenor.presentation.screen.trailer

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.travenor.R
import com.example.travenor.presentation.screen.trailer.components.*

@Composable
fun TrailerScreen(navController: NavController) {

    Column(Modifier.fillMaxSize()) {

        ImageTrailerComponent(R.drawable.trailer_first)

        Spacer(Modifier.height(33.dp))
        TitleTrailerComponent(title = "Life is short and the world is wide")

        Spacer(Modifier.height(19.dp))
        SubtitleTrailerComponent(subtitle = "At Friends tours and travel, we customize reliable and trutworthy educational tours to destinations all over the world")

        Spacer(Modifier.height(24.dp))
        Box(
            Modifier.align(Alignment.CenterHorizontally)
        ){
            NavBarTrailer(epoch = 1)
        }

        Spacer(Modifier.height(38.dp))
        Box(Modifier.padding(horizontal = 20.dp)) {
            ButtonTrailerComponent("Get Started")
        }


    }



}