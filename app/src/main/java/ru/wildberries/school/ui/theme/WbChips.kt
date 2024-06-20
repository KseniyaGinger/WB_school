package ru.wildberries.school.ui.theme

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.w3c.dom.Text

@Composable
fun WbChip(
    modifier: Modifier,
    text: String
) {
    var selected by remember { mutableStateOf(false) }

    FilterChip(
        border = null,
        shape = RoundedCornerShape(50.dp),
        modifier = Modifier
            .padding(start = 16.dp),
        onClick = { selected = !selected },
        label = {
            Text(text)
        },
        selected = selected,
        leadingIcon = if (selected) {
            {
                Icon(
                    imageVector = Icons.Filled.Done,
                    contentDescription = "Done icon",
                    modifier = Modifier.size(FilterChipDefaults.IconSize)
                )
            }
        } else {
            null
        },
        colors = FilterChipDefaults.filterChipColors(
            containerColor = Color(0xFF80B7A3F1),
            labelColor = Color(0xFF660EC8)
        )
    )

}

@Composable
fun WbChipsRow(
    modifier: Modifier
) {
    val chipList = listOf(
        "Python",
        "Junior",
        "Moscow"
    )
    LazyRow(
        modifier = Modifier
            .padding(16.dp)
    ) {
        chipList.forEach {
            item {
                WbChip(
                    modifier = modifier,
                    text = it
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ShowChips() {
    WbChipsRow(modifier = Modifier)
}