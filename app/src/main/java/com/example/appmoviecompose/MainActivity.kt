package com.example.appmoviecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.appmoviecompose.navagation.MovieNavagation
import com.example.appmoviecompose.ui.theme.AppMovieComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp {
                // MainContent()
                MovieNavagation()
            }
        }
    }
}

@Composable
fun MyApp(content: @Composable () -> Unit) {
    AppMovieComposeTheme {
        // A surface container using the 'background' color from the theme
        // Surface(modifier = Modifier.fillMaxSize(),
        // color = MaterialTheme.colors.background) {
        // Greeting("Android")
        content()
    }
}

/*@Composable
fun Greting(name: String) {
    Text(text = "Hello $name!")
}*/

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    /*AppMovieComposeTheme {
        Greeting("Android")
    }*/

    MyApp {
        // MainContent()
        MovieNavagation()
    }
}
