package com.example.androiduicomponents

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.FlowColumn

// 1. LazyColumn
@Composable
fun MyLazyColumnExample() {
    LazyColumn(modifier = Modifier.fillMaxSize()) {
        items(5) { index ->
            Text("Item #$index", modifier = Modifier.padding(8.dp))
        }
    }
}

// 2. LazyRow
@Composable
fun MyLazyRowExample() {
    LazyRow(modifier = Modifier.fillMaxWidth()) {
        items(3) { index ->
            Text("Row Item #$index", modifier = Modifier.padding(8.dp))
        }
    }
}

// 3. Grid (LazyVerticalGrid)
@Composable
fun MyGridExample() {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = Modifier.fillMaxSize()
    ) {
        items(6) { index ->
            Text("Grid Item #$index", modifier = Modifier.padding(16.dp))
        }
    }
}

// 4. ConstraintLayout
@Composable
fun MyConstraintLayoutExample() {
    ConstraintLayout(modifier = Modifier.fillMaxSize()) {
        val (text1, text2) = createRefs()

        Text(
            "Hello Constraint",
            modifier = Modifier.constrainAs(text1) {
                top.linkTo(parent.top, margin = 16.dp)
                start.linkTo(parent.start)
            }
        )

        Text(
            "Below first text",
            modifier = Modifier.constrainAs(text2) {
                top.linkTo(text1.bottom, margin = 8.dp)
                start.linkTo(text1.start)
            }
        )
    }
}

// 5. Scaffold
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyScaffoldExample() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Scaffold Example") }
            )
        },
        floatingActionButton = {
            FloatingActionButton(onClick = { }) {
                Text("+")
            }
        }
    ) { innerPadding ->
        Column(modifier = Modifier.padding(innerPadding)) {
            Text("Body content here", modifier = Modifier.padding(16.dp))
        }
    }

}


// 6. Surface
@Composable
fun MySurfaceExample() {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        color = MaterialTheme.colorScheme.primary
    ) {
        Text("Inside Surface", modifier = Modifier.padding(24.dp))
    }
}

// 7. Chip (usando FilterChip)
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyChipExample() {
    FilterChip(
        selected = true,
        onClick = { },
        label = { Text("Chip Example") }
    )
}

// 9. FlowRow
@OptIn(ExperimentalLayoutApi::class)
@Composable
fun MyFlowRowExample() {
    FlowRow(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        repeat(5) { index ->
            Text("Item $index", modifier = Modifier.padding(8.dp))
        }
    }
}

// 10. FlowColumn
@OptIn(ExperimentalLayoutApi::class)
@Composable
fun MyFlowColumnExample() {
    FlowColumn(
        modifier = Modifier.fillMaxHeight(),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        repeat(5) { index ->
            Text("Col Item $index", modifier = Modifier.padding(8.dp))
        }
    }
}