package ru.wildberries.school.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.indication
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.wear.compose.material3.ripple
import ru.wildberries.school.R

@Preview(showBackground = true)
@Composable
fun WbAvatarsPreview() {
    WbAvatars()
}

@Composable
fun WbAvatars() {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        WbAvatarRegular(
            icon = R.drawable.change_avatar__1_
        )
        WbAvatarMeeting(
            icon = R.mipmap.ic_launcher_foreground_av_meeting,
            modifier = Modifier
        )
        WbAvatarEdit(icon = R.drawable.change_avatar__1_, onClick = {})
    }
}

@Composable
fun WbAvatarRegular(
    icon: Int
) {
    Image(
        painter = painterResource(icon),
        contentDescription = null,
    )
}

@Composable
fun WbAvatarEdit(
    modifier: Modifier = Modifier,
    icon: Int,
    onClick: () -> Unit,
    fabIcon: Int = R.drawable.baseline_add_24
) {
    BoxWithConstraints(
        modifier = modifier
            .defaultMinSize(100.dp, 100.dp)
            .background(Color.Transparent),
//        contentAlignment = Alignment.Center
    ) {
        val fabSize = 40.dp
        val fabOffset = maxWidth * 0.05f

        Image(
            painter = painterResource(icon),
            contentDescription = null,
        )
        FloatingActionButton(
            onClick = onClick,
            containerColor = Color(0xFF29183B),
            contentColor = MaterialTheme.colorScheme.surface,
            modifier = Modifier
                .size(fabSize)
                .align(Alignment.BottomEnd)
                .offset(x = (-fabOffset.value).dp, y = (-fabOffset.value).dp)
                .clip(RoundedCornerShape(40.dp))
                .border(8.dp, Color(0xFF29183B), RoundedCornerShape(24.dp))
        ) {
            Icon(
                painter = painterResource(fabIcon),
                contentDescription = "Add",
                modifier = Modifier.size(fabSize)
            )
        }
    }
}


@Composable
fun WbAvatarMeeting(
    icon: Int,
    modifier: Modifier
) {
    Image(
        painter = painterResource(icon),
        contentDescription = null,
        modifier = modifier
            .size(64.dp)
    )
}
