package ru.wildberries.school

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ru.wildberries.school.ui.theme.SFProDisplay
import ru.wildberries.school.ui.theme.WbAvatars
import ru.wildberries.school.ui.theme.WbButtons
import ru.wildberries.school.ui.theme.WbChipsRow
import ru.wildberries.school.ui.theme.WbSchoolTheme
import ru.wildberries.school.ui.theme.WbTextColumn
import ru.wildberries.school.ui.theme.WbTextField

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WbSchoolTheme {
                LazyColumn {
                    item {
                        WbButtons()
                        WbTextColumn()
                        WbAvatars()
                        WbTextField(
                            searchIcon = Icons.Default.Search,
                            placeholderText = "Поиск"
                        )
                        WbChipsRow(
                            modifier = Modifier
                                .padding(start = 16.dp)
                                )
                    }
                }
            }
        }
    }
}







