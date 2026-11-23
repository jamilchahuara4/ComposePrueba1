package com.jamil.composeprueba1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jamil.composeprueba1.ui.theme.ComposePrueba1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Prueba1()

        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposePrueba1Theme {
        Greeting("Hola DAM")
    }
}

@Composable
fun Prueba1(){

    Column(modifier = Modifier.padding(all = 50.dp)) {
        Row() {
            Text(text = "Fila 1")
            Spacer(modifier = Modifier.width(40.dp))
            Text(text = "Fila 2")
        }
        Text(text = "Hola clase de DAM")
        Text(text = "Esta sería la segunda columna")
    }
}

@Composable
@Preview
fun Prueba1Preview(){
    Prueba1()
}