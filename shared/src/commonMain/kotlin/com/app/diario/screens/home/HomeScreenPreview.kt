package com.app.diario.screens.home

import Theme
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true, name = "Lista Com Itens")
@Composable
private fun HomeScreenWithItemsPreview() {
    val sampleEntries =
        listOf(
            Entry("1", "21/01/2004", "Um limão, mil limões..."),
            Entry("2", "12/04/2005", "Eu nasci a 10mil anos atrás...."),
        )
    Theme {
        HomeScreen(
            entries = sampleEntries,
            onEntryClick = {},
        )
    }
}

@Preview(showBackground = true, name = "Lista Vazia")
@Composable
private fun HomeScreenEmptyPreview() {
    Theme {
        HomeScreen(
            entries = emptyList(),
            onEntryClick = {},
        )
    }
}
