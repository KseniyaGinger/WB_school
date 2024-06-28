package ru.wildberries.school.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ru.wildberries.school.R
import androidx.compose.ui.layout.Layout
import ru.wildberries.school.MainActivity.Companion.images


@Composable
fun WbVisitors(
    modifier: Modifier = Modifier
) {
    LazyRow (){
        item {
            Spacer(modifier = modifier.width(16.dp))
        }

        item {
            OverlappingRow(overlappingPercentage = 0.33f) {
                for (i in images) {
                    Image(
                        painter = painterResource(id = i),
                        contentDescription = "image_$i",
                        contentScale = ContentScale.Crop,
                        modifier = modifier
                            .size(64.dp)
                            .clip(RoundedCornerShape(24.dp))
                            .border(4.dp, Color(0xFFbD2D5F9), RoundedCornerShape(24.dp))
                    )
                }
            }
        }

        item {
            Spacer(modifier = modifier.width(16.dp))
        }
    }
}


@Composable
fun OverlappingRow(
    modifier: Modifier = Modifier,
    overlappingPercentage: Float,
    content: @Composable () -> Unit
) {

    val factor = (1 - overlappingPercentage)

    Layout(
        modifier = modifier,
        content = content,
        measurePolicy = { measurables, constraints ->
            val placeables = measurables.map { it.measure(constraints) }
            val widthsExceptFirst = placeables.subList(1, placeables.size).sumOf { it.width }
            val firstWidth = placeables.getOrNull(0)?.width ?: 0
            val width = (widthsExceptFirst * factor + firstWidth).toInt()
            val height = placeables.maxOf { it.height }
            layout(width, height) {
                var x = 0
                for (placeable in placeables) {
                    placeable.placeRelative(x, 0, 0f)
                    x += (placeable.width * factor).toInt()
                }
            }
        }
    )
}

@Preview(showBackground = true)
@Composable
fun WbVisitorsPreview() {
    WbVisitors()
}



