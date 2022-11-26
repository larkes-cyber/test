package com.example.travenor.presentation.screen.trailer.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonColors
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.travenor.presentation.theme.LightPrimaryBlue
import com.example.travenor.presentation.theme.SubtitleColor
import com.example.travenor.presentation.theme.geometr

@Composable
fun ButtonTrailerComponent(text:String){
    Button(
        onClick = { },
        shape = RoundedCornerShape(16.dp),
        modifier = Modifier
            .height(56.dp)
            .fillMaxWidth(),
        colors = ButtonDefaults.buttonColors(backgroundColor = LightPrimaryBlue)
    ) {
        Text(
            text = text,
            color = Color.White,
            style = TextStyle(
                fontSize = 16.sp
            ),
            fontFamily = geometr,
            fontWeight = FontWeight.Black,
            fontStyle = FontStyle.Normal,
            textAlign = TextAlign.Center
        )
    }
}