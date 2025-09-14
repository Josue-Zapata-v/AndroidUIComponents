package com.example.androiduicomponents

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.androiduicomponents.ui.theme.AndroidUIComponentsTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.width
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AndroidUIComponentsTheme {
        Greeting("Android")
    }
}

@Preview(showBackground = true)
@Composable
fun LazyColumnPreview() {
    AndroidUIComponentsTheme {
        Box(modifier = Modifier.height(200.dp)) {
            MyLazyColumnExample()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LazyRowPreview() {
    AndroidUIComponentsTheme {
        Box(modifier = Modifier.width(350.dp)) {
            MyLazyRowExample()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GridPreview() {
    AndroidUIComponentsTheme {
        Box(modifier = Modifier.height(150.dp)) {
            MyGridExample()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ConstraintLayoutPreview() {
    AndroidUIComponentsTheme {
        Box(modifier = Modifier.height(100.dp)) {
            MyConstraintLayoutExample()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ScaffoldPreview() {
    AndroidUIComponentsTheme {
        Box(modifier = Modifier.height(100.dp)) {
            MyScaffoldExample()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SufacePreview() {
    AndroidUIComponentsTheme {
        Box(modifier = Modifier.height(100.dp)) {
            MySurfaceExample()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ChipPreview() {
    AndroidUIComponentsTheme {
        Box(modifier = Modifier.width(200.dp)) {
            MyChipExample()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun FlowRowPreview() {
    AndroidUIComponentsTheme {
        Box(modifier = Modifier.width(200.dp)) {
            MyFlowRowExample()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AlertDialogPreview() {
    AndroidUIComponentsTheme {
        MyAlertDialogExample(
            showDialog = true,
            onDismiss = {}
        )
    }
}

@Preview(showBackground = true)
@Composable
fun CardPreview() {
    AndroidUIComponentsTheme {
        Box(modifier = Modifier.height(100.dp)) {
            MyCardExample()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CheckboxPreview() {
    AndroidUIComponentsTheme {
        Box(modifier = Modifier.width(200.dp)) {
            MyCheckboxExample()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun FloatingActionButtonPreview() {
    AndroidUIComponentsTheme {
        Box(modifier = Modifier.height(100.dp)) {
            MyFloatingActionButtonExample()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun IconPreview() {
    AndroidUIComponentsTheme {
        Box(modifier = Modifier.height(100.dp)) {
            MyIconExample()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ImagePreview() {
    AndroidUIComponentsTheme {
        Box(modifier = Modifier.height(100.dp)) {
            MyImageExample()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ProgressBarPreview() {
    AndroidUIComponentsTheme {
        Box(modifier = Modifier.width(100.dp)) {
            MyProgressBarExample()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RadioButtonPreview() {
    AndroidUIComponentsTheme {
        Box(modifier = Modifier.width(200.dp)) {
            MyRadioButtonExample()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SliderPreview() {
    AndroidUIComponentsTheme {
        Box(modifier = Modifier.width(200.dp)) {
            MySliderExample()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SpacerPreview() {
    AndroidUIComponentsTheme {
        Box(modifier = Modifier.width(200.dp)) {
            MySpacerExample()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SwitchPreview() {
    AndroidUIComponentsTheme {
        Box(modifier = Modifier.width(200.dp)) {
            MySwitchExample()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TopAppBarPreview() {
    AndroidUIComponentsTheme {
        Box(modifier = Modifier.height(100.dp)) {
            MyTopAppBarExample()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BottomNavigationPreview() {
    AndroidUIComponentsTheme {
        Box(modifier = Modifier.height(100.dp)) {
            MyBottomNavigationExample()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DialogPreview() {
    AndroidUIComponentsTheme {
        Box(modifier = Modifier.height(100.dp)) {
            MyDialogExample(
                showDialog = true,
                onDismiss = {}
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DividerPreview() {
    AndroidUIComponentsTheme {
        Box(modifier = Modifier.height(100.dp)) {
            MyDividerExample()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DropdownMenuPreview() {
    AndroidUIComponentsTheme {
        Box(modifier = Modifier.width(200.dp)) {
            MyDropdownMenuExample()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LazyVerticalGridPreview() {
    AndroidUIComponentsTheme {
        Box(modifier = Modifier.height(150.dp)) {
            MyLazyVerticalGridExample()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun NavigationRailPreview() {
    AndroidUIComponentsTheme {
        Box(modifier = Modifier.height(200.dp)) {
            MyNavigationRailExample()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun OutlinedTextFieldPreview() {
    AndroidUIComponentsTheme {
        Box(modifier = Modifier.width(200.dp)) {
            MyOutlinedTextFieldExample()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SnackbarPreview() {
    AndroidUIComponentsTheme {
        Box(modifier = Modifier.height(100.dp)) {
            MySnackbarExample()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TooltipPreview() {
    AndroidUIComponentsTheme {
        Box(modifier = Modifier.height(100.dp)) {
            MyTooltipExample()
        }
    }
}


@Preview(showBackground = true)
@Composable
fun TabRowPreview() {
    AndroidUIComponentsTheme {
        Box(modifier = Modifier.height(100.dp)) {
            MyTabRowExample()
        }
    }
}




















