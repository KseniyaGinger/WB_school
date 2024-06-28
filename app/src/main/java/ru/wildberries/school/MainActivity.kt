package ru.wildberries.school

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import ru.wildberries.school.ui.theme.WbAvatarEdit
import ru.wildberries.school.ui.theme.WbAvatars
import ru.wildberries.school.ui.theme.WbButtons
import ru.wildberries.school.ui.theme.WbChipsRow
import ru.wildberries.school.ui.theme.WbCommunityCard
import ru.wildberries.school.ui.theme.WbMeetingCard
import ru.wildberries.school.ui.theme.WbSchoolTheme
import ru.wildberries.school.ui.theme.WbTextColumn
import ru.wildberries.school.ui.theme.WbTextField
import ru.wildberries.school.ui.theme.WbVisitors

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WbSchoolTheme {
                LazyColumn {
                    item {
                        WbButtons()
                        Spacer(
                            modifier = Modifier
                                .height(10.dp)
                        )
                        WbTextColumn()
                        Spacer(
                            modifier = Modifier
                                .height(10.dp)
                        )
                        WbAvatars()
                        Spacer(modifier = Modifier
                            .height(10.dp)
                        )
                        WbTextField(
                            searchIcon = Icons.Default.Search,
                            placeholderText = "Поиск"
                        )
                        Spacer(modifier = Modifier
                            .height(10.dp)
                        )
                        WbChipsRow(
                            modifier = Modifier,
                            chips = listOf(
                                "Python",
                                "Junior",
                                "Moscow"
                            )
                            )
                        Spacer(modifier = Modifier
                            .height(10.dp)
                        )
                        WbMeetingCard(
                            "Developer meeting",
                            "13.09.2024 — Москва",
                            chips = listOf(
                                "Python",
                                "Junior",
                                "Moscow"
                            ),
                            "Закончилась",
                            icon = R.mipmap.ic_launcher_foreground_av_meeting
                        )
                        Spacer(modifier = Modifier
                            .height(10.dp)
                        )
                        WbVisitors()
                        Spacer(modifier = Modifier
                            .height(10.dp)
                        )
                        WbCommunityCard(
                            title = "Designa",
                            description = "10 000 человек",
                            icon = R.mipmap.ic_launcher_designa
                        )
                        Spacer(modifier = Modifier
                            .height(10.dp)
                        )
                    }
                }
            }
        }
    }
    companion object{
        val images = listOf(
            R.mipmap.ic_pasha,
            R.mipmap.ic_hasbulla,
            R.mipmap.ic_pasha,
            R.mipmap.ic_hasbulla,
            R.mipmap.ic_pasha,
            R.mipmap.ic_hasbulla,
        )
    }
}






