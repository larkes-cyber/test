package com.example.travenor.presentation.screen.auth

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.travenor.presentation.navigation.Screen
import com.example.travenor.presentation.screen.auth.components.*

@Composable
fun AuthScreen(navController: NavController) {

    val buttonState = remember{
        mutableStateOf(false)
    }

    Box(Modifier.fillMaxSize()){
        Column(
            Modifier
                .align(Alignment.Center)
                .padding(horizontal = 20.dp)
        ) {
            AuthTitleComponent(title = "Sign in now")
            Spacer(Modifier.height(12.dp))
            AuthSubtitleComponent(subtitle = "Please sign in to continue our app",size = 16)
            Spacer(Modifier.height(40.dp))
            AuthLoginFieldComponent()
            Spacer(Modifier.height(20.dp))
            AuthPasswordFieldComponent()
            Spacer(Modifier.height(16.dp))
            HighLightRedirectComponent(text = "Forget Password?", route = Screen.SplashScreen.route, navController = navController)
            Spacer(Modifier.height(40.dp))
            AuthButtonComponent("Sign In")
            Spacer(Modifier.height(40.dp))
            AuthFooterComponent(signUp = true, route = Screen.SplashScreen.route, navController = navController)
        }
    }
}