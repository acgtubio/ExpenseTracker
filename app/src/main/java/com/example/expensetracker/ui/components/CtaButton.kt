package com.example.expensetracker.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.expensetracker.ui.theme.DarkPrimaryColor
import com.example.expensetracker.ui.theme.PrimaryColor

@Composable
fun CtaButton(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier
) {
    Button(
        onClick = onClick,
        modifier = modifier
            .padding(8.dp)
            .clip(CircleShape)
            .height(48.dp),
        colors = ButtonColors(
            containerColor = DarkPrimaryColor,
            contentColor = PrimaryColor,
            disabledContentColor = Color.Black,
            disabledContainerColor = Color.Gray
        )
    ) {
        Text(
            text = text,
            color = PrimaryColor
        )
    }
}