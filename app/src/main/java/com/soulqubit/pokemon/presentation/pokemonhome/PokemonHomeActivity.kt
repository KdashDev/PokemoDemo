package com.soulqubit.pokemon.presentation.pokemonhome

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.soulqubit.pokemon.R
import com.soulqubit.pokemon.presentation.pokemonhome.theme.PokemoDemoTheme

class PokemonHomeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PokemoDemoTheme {
                CircularImage(painterResource(id = R.drawable.ic_launcher_background))
            }
        }
    }

    @Composable
    fun CircularImage(
        painter: Painter,
        modifier: Modifier = Modifier,
        contentDescription: String? = null,
        contentScale: ContentScale = ContentScale.Fit
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = modifier
                    .size(50.dp)
                    .clip(CircleShape),
                Alignment.Center
            ) {
                Image(
                    painter = painter,
                    contentDescription = contentDescription,
                    contentScale = contentScale
                ) 
            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {

        PokemoDemoTheme {
            CircularImage(painterResource(id = R.drawable.ic_launcher_background))
        }
    }
}