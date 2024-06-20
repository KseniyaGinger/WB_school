package ru.wildberries.school.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ru.wildberries.school.R

@Preview(showBackground = true)
@Composable
fun WbAvatarsPreview() {
    WbAvatars()
}

@Composable
fun WbAvatars() {
    Column (
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        WBAvatarRegular()
        WBAvatarMeeting()
    }
}

@Composable
fun WBAvatarRegular(){
    Image(
        painter = painterResource(
            R.drawable.change_avatar
        ),
        contentDescription = null
    )
}

@Composable
fun WBAvatarMeeting() {
    Image(
        painter = painterResource(
            R.mipmap.ic_launcher_foreground_av_meeting
        ),
        contentDescription = null
    )
}