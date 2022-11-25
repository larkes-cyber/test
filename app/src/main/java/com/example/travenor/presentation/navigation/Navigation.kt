package com.example.travenor.presentation

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.travenor.presentation.navigation.Screen

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.SplashScreen.route){
        composable(route = Screen.SplashScreen.route){
            SplashScreen(navController = navController)
        }
        composable(
            route = Screen.AuthScreen.route + "/{name}",
            arguments = listOf(
                navArgument("name"){
                    type = NavType.StringType
                    defaultValue = "lol"
                }
            )
        ){entry ->
            AuthScreen(navController = navController, some = entry.arguments?.getString("name")!!)
        }
    }

}

@Composable
fun SplashScreen(navController: NavController){
    Column(Modifier.fillMaxSize()) {
        Text("first", modifier = Modifier.align(Alignment.CenterHorizontally))
        Spacer(modifier = Modifier.height(15.dp))
        Button(onClick = {
            navController.navigate(Screen.AuthScreen.withArgs("arg"))
        }, modifier = Modifier.align(Alignment.End)) {

        }
    }
}

@Composable
fun AuthScreen(navController: NavController, some:String){
    Column(Modifier.fillMaxSize()) {
        Text("second", modifier = Modifier.align(Alignment.CenterHorizontally))
        Spacer(modifier = Modifier.height(15.dp))
        Button(onClick = { navController.navigate(Screen.SplashScreen.route) }, modifier = Modifier.align(Alignment.End)) {

        }
    }
}