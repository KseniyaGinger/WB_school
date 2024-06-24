package ru.wildberries.school.ui.theme

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun WbTextField(
    modifier: Modifier = Modifier,
    searchIcon: ImageVector,
    placeholderText: String = "Поиск"
) {
    val searchQuery = remember { mutableStateOf(TextFieldValue("")) }

    TextField(
        value = searchQuery.value,
        onValueChange = {
            searchQuery
                .value = it
        },
        placeholder = {
            Text(
                text = placeholderText,
                fontFamily = SFProDisplay,
                fontSize = 16.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color(0xFFADB5BD),
            )
        },
        leadingIcon = {
            Icon(
                imageVector = searchIcon,
                contentDescription = null,
                tint = Color(0xFFADB5BD)
            )
        },
        colors = TextFieldDefaults.colors
            (
            unfocusedContainerColor = Color(0xFFF7F7FC),
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            cursorColor = Color.Transparent
        ),
        shape = RoundedCornerShape(16.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun TextFieldPreview() {
    WbTextField(
        searchIcon = Icons.Default.Search,
    )
}
