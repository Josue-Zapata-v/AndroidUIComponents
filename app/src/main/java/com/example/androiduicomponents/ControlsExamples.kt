package com.example.androiduicomponents

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.selection.selectable
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import com.example.androiduicomponents.ui.theme.AndroidUIComponentsTheme

// 1. AlertDialog
@Composable
fun MyAlertDialogExample(showDialog: Boolean, onDismiss: () -> Unit) {
    if (showDialog) {
        AlertDialog(
            onDismissRequest = { onDismiss() },
            title = { Text("Título") },
            text = { Text("Este es un mensaje dentro del AlertDialog.") },
            confirmButton = {
                TextButton(onClick = { onDismiss() }) {
                    Text("Aceptar")
                }
            },
            dismissButton = {
                TextButton(onClick = { onDismiss() }) {
                    Text("Cancelar")
                }
            }
        )
    }
}

// 2. Card
@Composable
fun MyCardExample() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Text("Contenido dentro de una Card", modifier = Modifier.padding(16.dp))
    }
}

// 3. Checkbox
@Composable
fun MyCheckboxExample() {
    var checked by remember { mutableStateOf(false) }
    Row(verticalAlignment = Alignment.CenterVertically) {
        Checkbox(
            checked = checked,
            onCheckedChange = { checked = it }
        )
        Text("Opción seleccionable")
    }
}

// 4. FloatingActionButton
@Composable
fun MyFloatingActionButtonExample() {
    FloatingActionButton(onClick = { }) {
        Text("+")
    }
}

// 5. Icon
@Composable
fun MyIconExample() {
    Icon(
        painter = painterResource(id = android.R.drawable.ic_menu_camera),
        contentDescription = "Icono de cámara"
    )
}

// 6. Image
@Composable
fun MyImageExample() {
    Image(
        painter = painterResource(id = android.R.drawable.ic_menu_gallery),
        contentDescription = "Imagen de ejemplo"
    )
}

// 7. ProgressBar (CircularProgressIndicator)
@Composable
fun MyProgressBarExample() {
    CircularProgressIndicator()
}

// 8. RadioButton
@Composable
fun MyRadioButtonExample() {
    var selected by remember { mutableStateOf(false) }
    Row(verticalAlignment = Alignment.CenterVertically) {
        RadioButton(
            selected = selected,
            onClick = { selected = !selected }
        )
        Text("Opción seleccionada")
    }
}

// 9. Slider
@Composable
fun MySliderExample() {
    var sliderValue by remember { mutableStateOf(0f) }
    Column {
        Slider(
            value = sliderValue,
            onValueChange = { sliderValue = it },
            valueRange = 0f..10f
        )
        Text("Valor: ${sliderValue.toInt()}")
    }
}

// 10. Spacer
@Composable
fun MySpacerExample() {
    Column {
        Text("Arriba")
        Spacer(modifier = Modifier.height(16.dp))
        Text("Abajo")
    }
}

// 11. Switch
@Composable
fun MySwitchExample() {
    var checked by remember { mutableStateOf(false) }
    Row(verticalAlignment = Alignment.CenterVertically) {
        Switch(
            checked = checked,
            onCheckedChange = { checked = it }
        )
        Text(if (checked) "Encendido" else "Apagado")
    }
}

// 12. TopAppBar
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTopAppBarExample() {
    TopAppBar(
        title = { Text("TopAppBar Example") }
    )
}


