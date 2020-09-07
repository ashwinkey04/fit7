package com.ashwinkey04.fit7

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.InnerPadding
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import com.ashwinkey04.fit7.ui.Fit7Theme
import com.ashwinkey04.fit7.ui.purple500

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
        Surface(color = colors.surface) {
            content()
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!", modifier = Modifier.padding(16.dp), color = colors.primary)
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
        Column(modifier = Modifier.fillMaxHeight()){
            Column(modifier = Modifier.weight(1f)) {
                val names = listOf<String>("Ashwin", "Android", "Compose")
                for (name in names){
                    Greeting(name)
                    Divider(color = colors.primary)
                }
            }
            Counter()
            BottomNavigation() {

            }
        }
}

@Composable
fun Counter() {
    val count = remember { mutableStateOf(0) }
    Button(onClick = { count.value++ }) {
        Text("I've been clicked ${count.value} times")
    }
}