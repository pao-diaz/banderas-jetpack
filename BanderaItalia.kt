package com.example.banderasjetpack

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun BanderaItalia(modifier: Modifier = Modifier) {
    Row(modifier = modifier.fillMaxSize()) {
        Box(Modifier.weight(1f).fillMaxHeight().background(Color(0xFF009246))) // Verde
        Box(Modifier.weight(1f).fillMaxHeight().background(Color.White))      // Blanco
        Box(Modifier.weight(1f).fillMaxHeight().background(Color(0xFFCE2B37))) // Rojo
    }
}

@Preview(showBackground = true)
@Composable
fun BanderaItaliaPreview() {
    Surface {
        BanderaItalia(modifier = Modifier.fillMaxSize())
    }
}