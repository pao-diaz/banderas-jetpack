package com.example.banderasjetpack

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun BanderaEspana(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxSize()) {
        Box(Modifier.weight(1f).fillMaxWidth().background(Color(0xFFAA151B))) // Rojo (peso 1)
        Box(Modifier.weight(2f).fillMaxWidth().background(Color(0xFFF1BF00))) // Amarillo (peso 2)
        Box(Modifier.weight(1f).fillMaxWidth().background(Color(0xFFAA151B))) // Rojo (peso 1)
    }
}

@Preview(showBackground = true)
@Composable
fun BanderaEspanaPreview() {
    Surface {
        BanderaEspana(modifier = Modifier.fillMaxSize())
    }
}