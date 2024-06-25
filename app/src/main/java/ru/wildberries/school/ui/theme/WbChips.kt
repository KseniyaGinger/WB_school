package ru.wildberries.school.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.SuggestionChip
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

//@Composable
//fun WbChip(
//    modifier: Modifier,
//    text: String
//) {
//    var selected by remember { mutableStateOf(false) }
//
//    FilterChip(
//        border = null,
//        shape = RoundedCornerShape(16.dp),
//        modifier = modifier
//            .padding(start = 0.dp, end = 4.dp)
//            .height(24.dp)
//            .wrapContentWidth(),
//        onClick = { selected = !selected },
//        label = {
//            Text(
//                text,
//                fontSize = 10.sp,
//                modifier = Modifier
//                    .padding(horizontal = 0.dp),
//                fontFamily = SFProDisplay,
////                fontSize = 10.sp
//            )
//        },
//        selected = selected,
//        leadingIcon = if (selected) {
//            {
//                Icon(
//                    imageVector = Icons.Filled.Done,
//                    contentDescription = "Done icon",
//                    modifier = Modifier.size(16.dp),
//                )
//            }
//        } else {
//            null
//        },
//        colors = FilterChipDefaults.filterChipColors(
//            containerColor = Color(0xFFF5ECFF),
//            labelColor = Color(0xFF660EC8)
//        )
//    )
//}

@Composable
fun WbChip(
    text: String,
    modifier: Modifier = Modifier,
    backgroundColor: Color = Color(0xFFF5ECFF),
    contentColor: Color = Color(0xFF660EC8),
) {
    Box(
        modifier = modifier
            .background(color = backgroundColor, shape = RoundedCornerShape(40.dp))
            .padding(horizontal = 10.dp, vertical = 2.dp)
    ) {
        Text(
            text = text,
            color = contentColor,
            fontFamily = SFProDisplay,
            fontSize = 10.sp
        )
    }
}


@Composable
fun WbChipsRow(
    modifier: Modifier,
) {
    val chipList = listOf(
        "Python",
        "Junior",
        "Moscow"
    )
    LazyRow(
        modifier = Modifier,
        horizontalArrangement = Arrangement.spacedBy(4.dp)
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
fun ChipsPreview() {
    WbChipsRow(modifier = Modifier)
}