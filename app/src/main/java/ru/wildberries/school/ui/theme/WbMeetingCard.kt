package ru.wildberries.school.ui.theme

import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.ColumnScopeInstance.weight
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ru.wildberries.school.R

@Preview(showBackground = true)
@Composable
fun MeetingCardPreview() {
    Column {
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
    }
}


@Composable
fun WbMeetingCard(
    title: String,
    description: String,
    chips: List<String>,
    status: String,
    icon: Int
) {
    Card(
        modifier = Modifier
            .padding(16.dp),
        shape = RoundedCornerShape(0),
        colors = CardDefaults.cardColors(
            containerColor = Color.Transparent
        )
    ) {
        Column {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                WbAvatarMeeting(
                    icon = icon,
                    modifier = Modifier
                )
                MeetingData(
                    title = title,
                    dateLocation = description,
                    status = status,
                    chips = chips
                )
            }
            HorizontalDivider(
                color = Color(0xFFA4A4A4),
                thickness = 1.dp,
                modifier = Modifier
                    .padding(vertical = 8.dp)
            )
        }
    }
}


@Composable
fun MeetingData(
    title: String,
    dateLocation: String,
    status: String,
    chips: List<String>,
) {
    Column(
        modifier = Modifier
            .padding(vertical = 8.dp)
            .padding(start = 12.dp, end = 32.dp)
    ) {
        Text(
            text = title,
            fontSize = 14.sp,
            fontFamily = SFProDisplay,
            fontWeight = FontWeight.SemiBold,
            color = Color(0xFF29183B)
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = dateLocation,
            fontSize = 12.sp,
            fontFamily = SFProDisplay,
            fontWeight = FontWeight.Normal,
            color = Color(0xFFA4A4A4)
        )
        Spacer(modifier = Modifier.height(10.dp))
        WbChipsRow(modifier = Modifier, chips = chips)
    }
    Text(
        text = status,
        fontSize = 10.sp,
        fontFamily = SFProDisplay,
        fontWeight = FontWeight.Normal,
        color = Color(0xFFA4A4A4),
        modifier = Modifier
            .padding(vertical = 12.dp, horizontal = 16.dp)
    )
}


