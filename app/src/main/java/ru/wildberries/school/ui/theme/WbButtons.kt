@file:Suppress("IMPLICIT_CAST_TO_ANY")

package ru.wildberries.school.ui.theme

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Transparent
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun ShowWbButtons() {
    WbButtons()
}


@Composable
fun WbButtons() {
    WbSchoolTheme {
        Row(
            modifier = Modifier
                .width(400.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Column(
                modifier = Modifier
                    .padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                WbButton()
                WbButton(
                    isPrimary = false,
                )
                WbButton(
                    enabled = false,
                )
            }
            Column(
                modifier = Modifier
                    .padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                WbButtonOutline()
                WbButtonOutline(
                    isPrimary = false,
                )
                WbButtonOutline(
                    enabled = false,
                    text = "Button",
                )
            }
            Column(
                modifier = Modifier
                    .padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                WbButtonText()
                WbButtonText(
                    isPrimary = false
                )
                WbButtonText(
                    enabled = false
                )
            }
        }
    }
}


@Composable
fun WbButton(
    onClick: () -> Unit = {},
    modifier: Modifier = Modifier,
    isPrimary: Boolean = true,
    enabled: Boolean = true,
    text: String = "Button",
) {
    val containerColor = if (isPrimary)
        Color(0xFF9A41FE) else
        Color(0xFF660EC8)

    Button(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        colors = ButtonDefaults.buttonColors(
            containerColor = containerColor,
            contentColor = White,
            disabledContainerColor = Color(0xFF80B7A3F1),
            disabledContentColor = White
        )
    ) {
        Text(text = text)
    }
}

@Composable
fun WbButtonOutline(
    onClick: () -> Unit = {},
    modifier: Modifier = Modifier,
    isPrimary: Boolean = true,
    enabled: Boolean = true,
    text: String = "Button",
) {
    val contentColor = if (isPrimary) Color(0xFF9A41FE) else Color(0xFF660EC8)

    OutlinedButton(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        colors = ButtonDefaults.outlinedButtonColors(
            containerColor = White,
            contentColor = contentColor,
            disabledContainerColor = White,
            disabledContentColor = Color(0xFF80B7A3F1)
        ),
        border = ButtonDefaults
            .outlinedButtonBorder
            .copy(
                brush = SolidColor(
                    if (isPrimary) {
                        if (enabled) Color(0xFF9A41FE) else Color(0xFF80B7A3F1)
                    } else {
                        if (enabled) Color(0xFF660EC8) else Color(0xFF660EC8)
                    }
                )
            )
    ) {
        Text(text = text)
    }
}

@Composable
fun WbButtonText(
    onClick: () -> Unit = {},
    modifier: Modifier = Modifier,
    isPrimary: Boolean = true,
    enabled: Boolean = true,
    text: String = "Button",
) {
    val contentColor = if (isPrimary) Color(0xFF9A41FE) else Color(0xFF660EC8)

    TextButton(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        colors = ButtonDefaults.buttonColors(
            containerColor = Transparent,
            contentColor = contentColor,
            disabledContainerColor = Transparent,
            disabledContentColor = Color(0xFF80B7A3F1)
        )
    ) {
        Text(text = text)
    }
}