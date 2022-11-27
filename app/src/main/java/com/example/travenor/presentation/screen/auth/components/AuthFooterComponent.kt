package com.example.travenor.presentation.screen.auth.components

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun AuthFooterComponent(signUp:Boolean, route:String, navController: NavController) {
    Column(Modifier.fillMaxWidth()) {
        Row(Modifier.align(Alignment.CenterHorizontally)) {
            AuthSubtitleComponent(subtitle = if(signUp) "Don’t have an account?" else "Or connect", size = 14)
          //  Spacer(Modifier.width(8.dp))
            HighLightRedirectComponent(text = if(signUp) "Sign up" else "Sign in" , route = route, navController = navController)
            //TODO: Remove fillmaxwidth from HighLightRedirectComponent
        }
        //Spacer(Modifier.height(20.dp))
        AuthSubtitleComponent(subtitle = "Or connect", size = 14)
    }
}