package com.app.diario.screens.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.app.diario.components.CardDiario

data class Entry(
    val id: String,
    val title: String,
    val content: String,
)

@Composable
fun HomeScreen(
    entries: List<Entry>,
    onEntryClick: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    if (entries.isEmpty()) {
        Box(
            modifier = modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Text(text = "Nenhuma nota encontrada.")
        }
    } else {
        LazyColumn(
            modifier = modifier.fillMaxSize(),
            contentPadding = PaddingValues(all = 16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(
                items = entries,
                key = { it.id }
            ) { entry ->
                CardDiario(
                    title = entry.title,
                    content = entry.content,
                    onClick = { onEntryClick(entry.id) }
                )
            }
        }
    }
}