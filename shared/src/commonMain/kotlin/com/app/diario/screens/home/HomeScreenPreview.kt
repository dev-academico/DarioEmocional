package com.app.diario.screens.home

import Theme
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true, name = "Lista Com Itens")
@Composable
private fun HomeScreenWithItemsPreview() {
    val sampleEntries =
        listOf(
            Entry("1", "Primeiro Dia", "Um limão, mil limões..."),
            Entry("2", "Ideias de Projeto", "Construir uma tela em Compose."),
        )

    Theme (
    ) { HomeScreen(
        entries = sampleEntries,
        onEntryClick = {},
    ) }
}

@Preview(showBackground = true, name = "Lista Vazia")
@Composable
private fun HomeScreenEmptyPreview() {
    Theme (
    ) { HomeScreen(
        entries = emptyList(),
        onEntryClick = {},
    ) }

}
