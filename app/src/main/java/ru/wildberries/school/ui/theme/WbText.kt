package ru.wildberries.school.ui.theme

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun ShowWbText() {
    WbTextColumn()
}


@Composable
fun WbTextColumn() {
    WbSchoolTheme {
        Column(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxSize()
        ) {
            WbText(
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold
            )
            WbText(
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )
            WbText(
                fontSize = 18.sp,
                fontWeight = FontWeight.SemiBold
            )
            WbText(
                fontSize = 16.sp,
                fontWeight = FontWeight.SemiBold
            )
            WbText(
                fontSize = 14.sp,
                fontWeight = FontWeight.SemiBold
            )
            WbText(
                fontSize = 14.sp,
                fontWeight = FontWeight.Normal
            )
            WbText(
                fontSize = 12.sp,
                fontWeight = FontWeight.Normal
            )
            WbText(
                fontSize = 10.sp,
                fontWeight = FontWeight.Normal
            )
            WbText(
                fontSize = 10.sp,
                fontWeight = FontWeight.SemiBold
            )
        }
    }
}

@Composable
fun WbText(
    text: String = "The quick brown box jumps over the lazy dog",
    fontSize: androidx.compose.ui.unit.TextUnit,
    fontWeight: FontWeight,
    modifier: Modifier = Modifier
) {
    Text(
        text = text,
        fontSize = fontSize,
        fontWeight = fontWeight,
        fontFamily = SFProDisplay,
        modifier = modifier
    )
}
