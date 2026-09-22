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
class MainActivity: ComponentActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BanderasTheme() {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BanderaAlemania(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}
@Composable
fun BanderaAlemania(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxSize()) {
        Box(Modifier.weight(1f).fillMaxWidth().background(Color.Black))
        Box(Modifier.weight(1f).fillMaxWidth().background(Color(0xFFDD0000)))
        Box(Modifier.weight(1f).fillMaxWidth().background(Color(0xFFFFCE00)))
    }
}

@Preview(showBackground = true)
@Composable
fun BanderaAlemaniaPreview() {
    Surface {
        BanderaAlemania(modifier = Modifier.fillMaxSize())
    }
}