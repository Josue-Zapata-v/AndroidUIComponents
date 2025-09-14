package com.example.androiduicomponents

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import kotlinx.coroutines.launch

// 1. BottomNavigation
@Composable
fun MyBottomNavigationExample(selectedIndex: Int = 0, onItemSelected: (Int) -> Unit = {}) {
    NavigationBar {
        val items = listOf("Home", "Profile", "Settings")
        items.forEachIndexed { index, item ->
            NavigationBarItem(
                icon = { Icon(Icons.Default.Favorite, contentDescription = item) },
                label = { Text(item) },
                selected = index == selectedIndex,
                onClick = { onItemSelected(index) }
            )
        }
    }
}

// 2. Dialog
@Composable
fun MyDialogExample(showDialog: Boolean, onDismiss: () -> Unit) {
    if (showDialog) {
        AlertDialog(
            onDismissRequest = { onDismiss() },
            title = { Text("Dialog Title") },
            text = { Text("Este es un ejemplo de Dialog.") },
            confirmButton = {
                TextButton(onClick = { onDismiss() }) { Text("Aceptar") }
            },
            dismissButton = {
                TextButton(onClick = { onDismiss() }) { Text("Cancelar") }
            }
        )
    }
}

// 3. Divider
@Composable
fun MyDividerExample() {
    Divider(
        color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.12f),
        thickness = 1.dp,
        modifier = Modifier.padding(vertical = 8.dp)
    )
}

// 4. DropDownMenu
@Composable
fun MyDropdownMenuExample() {
    var expanded by remember { mutableStateOf(false) }
    var selectedItem by remember { mutableStateOf("Opc1") }

    Box {
        TextButton(onClick = { expanded = true }) { Text(selectedItem) }
        DropdownMenu(expanded = expanded, onDismissRequest = { expanded = false }) {
            listOf("Opc1", "Opc2", "Opc3").forEach { label ->
                DropdownMenuItem(text = { Text(label) }, onClick = {
                    selectedItem = label
                    expanded = false
                })
            }
        }
    }
}

// 5. LazyVerticalGrid
@Composable
fun MyLazyVerticalGridExample() {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = Modifier.fillMaxSize()
    ) {
        items(6) { index ->
            Text("Grid Item #$index", modifier = Modifier.padding(16.dp))
        }
    }
}

// 6. NavigationRail
@Composable
fun MyNavigationRailExample(selectedIndex: Int = 0, onItemSelected: (Int) -> Unit = {}) {
    NavigationRail {
        val items = listOf("Home", "Profile", "Settings")
        items.forEachIndexed { index, item ->
            NavigationRailItem(
                icon = { Icon(Icons.Default.Favorite, contentDescription = item) },
                label = { Text(item) },
                selected = index == selectedIndex,
                onClick = { onItemSelected(index) }
            )
        }
    }
}

// 7. OutlinedTextField
@Composable
fun MyOutlinedTextFieldExample() {
    var text by remember { mutableStateOf("") }
    OutlinedTextField(
        value = text,
        onValueChange = { text = it },
        label = { Text("Ingrese texto") },
        modifier = Modifier.fillMaxWidth()
    )
}

// 8. Snackbar
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MySnackbarExample() {
    val snackbarHostState = remember { SnackbarHostState() }
    val scope = rememberCoroutineScope()
    Column {
        Button(onClick = {
            scope.launch {
                snackbarHostState.showSnackbar("Mensaje de Snackbar")
            }
        }) {
            Text("Mostrar Snackbar")
        }

        SnackbarHost(hostState = snackbarHostState)
    }
}
// 9. TabRow
@Composable
fun MyTabRowExample() {
    var selectedTab by remember { mutableStateOf(0) }
    val tabs = listOf("Tab 1", "Tab 2", "Tab 3")
    TabRow(selectedTabIndex = selectedTab) {
        tabs.forEachIndexed { index, title ->
            Tab(selected = selectedTab == index, onClick = { selectedTab = index }) {
                Text(title, modifier = Modifier.padding(16.dp))
            }
        }
    }
}

// 10. Tooltip (simplificado)
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTooltipExample() {
    ExposedDropdownMenuBox(expanded = false, onExpandedChange = {}) {
        Text("Tooltip simulado")
    }
}

