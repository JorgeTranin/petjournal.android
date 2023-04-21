package com.soujunior.petjournal.ui.loginScreen.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.soujunior.petjournal.ui.loginScreen.LoginScreenViewModel
import com.soujunior.petjournal.ui.states.States
import com.soujunior.petjournal.ui.util.isEmail
import org.koin.androidx.compose.getViewModel

@Composable
fun Footer(navController: NavController) {
    val email by States.localEmailState.current
    val password by States.localPasswordState.current
    val loginScreenViewModel: LoginScreenViewModel = getViewModel()
    var isLoginVisible = false

    if (isEmail(email) && password.length >= 8) {
        isLoginVisible = true
    }

    ButtonLogin(isLoginVisible = isLoginVisible, loginScreenViewModel)
    Spacer(modifier = Modifier.padding(top = 20.dp))

    Text(
        text = "Não tem uma conta? Inscreva-se",
        style = MaterialTheme.typography.body1,
        modifier = Modifier.clickable(onClick = { navController.navigate("register") })
    )
}