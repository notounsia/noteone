package com.notocode.noteone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.notocode.noteone.ui.theme.NoteoneTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NoteoneTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Column (Modifier.padding(16.dp)) {
                        LazyColumn {
                             items(1){
                                 Card(Modifier.fillMaxWidth()) {
                                     Column(Modifier.padding(8.dp)) {
                                         Text(text = "Catatanku")
                                         Spacer(modifier = Modifier.height(16.dp))
                                         Text(text = "Deskripsi Catatanku Lagi")
                                     }
                                 }
                            }
                        }
                    }
                }
            }
        }
    }
}

