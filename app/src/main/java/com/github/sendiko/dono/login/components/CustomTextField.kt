package com.github.sendiko.dono.login.components

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

/**
 * A customizable text field component with a label and leading icon.
 *
 * This composable displays a [Text] as a label above an [OutlinedTextField].
 * It also supports a placeholder (hint) and a leading icon.
 *
 * @param modifier Modifier to be applied to the Column and the OutlinedTextField.
 * @param label The label text displayed above the text field.
 * @param hint The hint (placeholder) text displayed inside the text field when it is empty.
 * @param value The current text value of the text field.
 * @param onValueChange Callback invoked when the text value changes.
 * @param leadingIcon A composable displayed at the start of the text field.
 */
@Composable
fun CustomTextField(
    modifier: Modifier = Modifier,
    label: String,
    hint: String,
    value: String,
    onValueChange:  (String) -> Unit,
    leadingIcon: @Composable (() -> Unit),
) {
    Column(
        modifier = modifier
    ) {
        Text(
            text = label,
            style = MaterialTheme.typography.labelLarge
        )
        OutlinedTextField(
            modifier = modifier,
            value = value,
            onValueChange = onValueChange,
            leadingIcon = leadingIcon,
            placeholder = {
                Text(text = hint)
            }
        )
    }
}