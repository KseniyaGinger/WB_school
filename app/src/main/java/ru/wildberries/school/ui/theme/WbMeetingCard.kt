package ru.wildberries.school.ui.theme

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.AbsoluteCutCornerShape
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
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun MeetingCardPreview() {
    WbMeetingCard()
}

@Composable
fun WbMeetingCard() {
    Card(
        modifier = Modifier
            .padding(16.dp),
        shape = AbsoluteCutCornerShape(0),
        colors = CardDefaults.cardColors(
            containerColor = Color.Transparent
        )
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            WBAvatarMeeting()
            MeetingData()
            MeetingStatus(
                text = "Закончилась",
                modifier = Modifier
                    .padding(vertical = 12.dp)
            )
        }
        HorizontalDivider(
            modifier = Modifier
                .padding(8.dp),
            color = Color(0xFFA4A4A4),
            thickness = 1.dp
        )
    }
}


@Composable
fun MeetingData() {
    Column(
        modifier = Modifier
            .padding(vertical = 8.dp, horizontal = 12.dp)
            .width(200.dp)
    ) {
        MeetingInfo(
            text = "Developer meeting",
        )
        MeetingDateInfo(
            text = "13.09.2024 — Москва",
        )
        WbChipsRow(
            modifier = Modifier
        )
    }
}

@Composable
fun MeetingInfo(
    text: String,
    fontSize: TextUnit = 14.sp,
    fontFamily: FontFamily = SFProDisplay,
    fontWeight: FontWeight = FontWeight.SemiBold,
    spacing: Dp = 10.dp
) {
    Text(
        text = text,
        fontSize = fontSize,
        fontFamily = fontFamily,
        fontWeight = fontWeight,
        color = Color(0xFF29183B)
    )
    Spacer(modifier = Modifier.height(spacing))
}

@Composable
fun MeetingDateInfo(
    text: String,
    fontSize: TextUnit = 12.sp,
    fontFamily: FontFamily = SFProDisplay,
    fontWeight: FontWeight = FontWeight.Normal,
    spacing: Dp = 10.dp
) {
    Text(
        text = text,
        fontFamily = fontFamily,
        fontSize = fontSize,
        fontWeight = fontWeight,
        color = Color(0xFFA4A4A4)
    )
    Spacer(modifier = Modifier.height(spacing))
}

@Composable
fun MeetingStatus(
    text: String,
    fontSize: TextUnit = 10.sp,
    fontWeight: FontWeight = FontWeight.Normal,
    modifier: Modifier = Modifier,
    spacing: Dp = 8.dp
) {
    Text(
        text = text,
        fontSize = fontSize,
        fontWeight = fontWeight,
        fontFamily = SFProDisplay,
        modifier = modifier,
        color = Color(0xFFA4A4A4)
    )
    Spacer(modifier = Modifier.height(spacing))
}



