package com.github.sendiko.dono.login.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun CustomTextField(
    modifier: Modifier = Modifier,
    label: String,
    hint: String,
    value: String,
    onValueChange:  (String) -> Unit,
    leadingIcon: @Composable (() -> Unit),
) {

}