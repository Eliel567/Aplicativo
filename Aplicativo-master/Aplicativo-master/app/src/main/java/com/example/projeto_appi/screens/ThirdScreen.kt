package com.example.projeto_appi.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import java.lang.reflect.Modifier

@Composable
fun ThirdScreen(){
    var email by remember { mutableStateOf(TextFieldValue("")) }
    var password by remember { mutableStateOf(TextFieldValue("")) }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Criar Conta") }
            )
        }
    ) {
        Column(
            modifier = Modifier
                padding(16.dp)
                fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            TextField(
                value = email,
                onValueChange = { email = it },
                label = { Text("E-mail") },
                modifier = androidx.compose.ui.Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(16.dp))

            TextField(
                value = password,
                onValueChange = { password = it },
                label = { Text("Senha") },
                visualTransformation = PasswordVisualTransformation(),
                modifier = androidx.compose.ui.Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.
            height(16.dp))

            Button(
                onClick = {
                }
            ) {
                Text("Criar Conta")
            }
        }
    }
}
}