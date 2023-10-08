package com.gold24park.multimodule.feature.games

import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.util.fastForEach
import com.gold24park.multimodule.core.designsystem.MultiModuleTheme

class GamesActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val favoriteGames = listOf("RDR2", "Kingdom come deliverance", "Cyberpunk 2077")

        setContent {
            MultiModuleTheme {
                Column(modifier = Modifier.padding(20.dp)) {
                    Text(
                        "Favorite Games",
                        style = MaterialTheme.typography.headlineLarge
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    favoriteGames.fastForEach {
                        Text(
                            it,
                            style = MaterialTheme.typography.bodyMedium
                        )
                    }
                }
            }
        }
    }
}