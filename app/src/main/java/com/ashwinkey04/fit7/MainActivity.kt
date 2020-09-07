package com.ashwinkey04.fit7

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Divider
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import com.ashwinkey04.fit7.ui.Fit7Theme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Fit7Theme {
                // A surface container using the 'background' color from the theme
                SampleScreen()
            }
        }
    }
}

@Composable
fun Fit7Base(content: @Composable () -> Unit) {
    Fit7Theme {
        Surface(color = Color.Gray) {
            content()
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!", modifier = Modifier.padding(16.dp))
}

@Preview("Something")
@Composable
fun DefaultPreview() {
    Fit7Base {
        SampleScreen()
    }
}

@Composable
fun SampleScreen() {
    Column {
        Greeting("Ashwin")
        Divider(color = Color.Black)
        Greeting("there")
    }
}