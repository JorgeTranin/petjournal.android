package com.soujunior.petjournal.ui.appArea.speciesChoiceScreen.components

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.soujunior.petjournal.R
import com.soujunior.petjournal.ui.appArea.registerPetScreen.components.RoundedSquare
import com.soujunior.petjournal.ui.util.Constants.BIRD
import com.soujunior.petjournal.ui.util.Constants.CAT
import com.soujunior.petjournal.ui.util.Constants.DOG
import com.soujunior.petjournal.ui.util.Constants.FISH
import com.soujunior.petjournal.ui.util.Constants.REPTILE
import com.soujunior.petjournal.ui.util.Constants.RODENT

@Composable
fun GridVectors(
    selectedSpecies: (String) -> Unit
) {
    val defaultSize = 13
    var selectedItem by remember { mutableStateOf("") }

    Row(
        modifier = Modifier.padding(vertical = 2.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Box(
            modifier = Modifier
                .border(
                    width = 2.dp,
                    color = if (selectedItem == DOG) Color.Red else Color.Gray,
                    shape = MaterialTheme.shapes.medium
                )
                .padding(bottom = 8.dp)
                .clickable {
                    selectedItem = DOG
                    selectedSpecies(DOG)
                },
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                RoundedSquare(
                    size = calcDefault(defaultSize, 8),
                    topLeftRadius = defaultSize.dp,
                    topRightRadius = defaultSize.dp,
                    bottomLeftRadius = defaultSize.dp,
                    bottomRightRadius = defaultSize.dp,
                    image = painterResource(id = R.drawable.specie_dog),
                    material = Color.White,
                )
                Text(
                    text = "Cachorro",
                    color = MaterialTheme.colorScheme.primary,
                    fontWeight = FontWeight.Bold
                )
            }
        }

        Box(
            modifier = Modifier
                .border(
                    width = 2.dp,
                    color = if (selectedItem == BIRD) Color.Red else Color.Gray,
                    shape = MaterialTheme.shapes.medium
                )
                .padding(bottom = 8.dp)
                .clickable {
                    selectedItem = BIRD
                    selectedSpecies(BIRD)
                },
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                RoundedSquare(
                    size = calcDefault(defaultSize, 8),
                    topLeftRadius = defaultSize.dp,
                    topRightRadius = defaultSize.dp,
                    bottomLeftRadius = defaultSize.dp,
                    bottomRightRadius = defaultSize.dp,
                    image = painterResource(id = R.drawable.specie_bird),
                    material = Color.White,
                )
                Text(
                    text = "Pássaro",
                    color = MaterialTheme.colorScheme.primary,
                    fontWeight = FontWeight.Bold
                )
            }
        }

        Box(
            modifier = Modifier
                .border(
                    width = 2.dp,
                    color = if (selectedItem == CAT) Color.Red else Color.Gray,
                    shape = MaterialTheme.shapes.medium
                )
                .padding(bottom = 8.dp)
                .clickable {
                    selectedItem = CAT
                    selectedSpecies(CAT)
                },
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                RoundedSquare(
                    size = calcDefault(defaultSize, 8),
                    topLeftRadius = defaultSize.dp,
                    topRightRadius = defaultSize.dp,
                    bottomLeftRadius = defaultSize.dp,
                    bottomRightRadius = defaultSize.dp,
                    image = painterResource(id = R.drawable.specie_cat),
                    material = Color.White,
                )
                Text(
                    text = "Gato",
                    color = MaterialTheme.colorScheme.primary,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }

    Row(
        modifier = Modifier.padding(vertical = 2.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Box(
            modifier = Modifier
                .border(
                    width = 2.dp,
                    color = if (selectedItem == FISH) Color.Red else Color.Gray,
                    shape = MaterialTheme.shapes.medium
                )
                .padding(bottom = 8.dp)
                .clickable {
                    selectedItem = FISH
                    selectedSpecies(FISH)
                },
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                RoundedSquare(
                    size = calcDefault(defaultSize, 8),
                    topLeftRadius = defaultSize.dp,
                    topRightRadius = defaultSize.dp,
                    bottomLeftRadius = defaultSize.dp,
                    bottomRightRadius = defaultSize.dp,
                    image = painterResource(id = R.drawable.specie_fish),
                    material = Color.White,
                )
                Text(
                    text = "Peixe",
                    color = MaterialTheme.colorScheme.primary,
                    fontWeight = FontWeight.Bold
                )
            }
        }

        Box(
            modifier = Modifier
                .border(
                    width = 2.dp,
                    color = if (selectedItem == REPTILE) Color.Red else Color.Gray,
                    shape = MaterialTheme.shapes.medium
                )
                .padding(bottom = 8.dp)
                .clickable {
                    selectedItem = REPTILE
                    selectedSpecies(REPTILE)
                },
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                RoundedSquare(
                    size = calcDefault(defaultSize, 8),
                    topLeftRadius = defaultSize.dp,
                    topRightRadius = defaultSize.dp,
                    bottomLeftRadius = defaultSize.dp,
                    bottomRightRadius = defaultSize.dp,
                    image = painterResource(id = R.drawable.specie_reptile),
                    material = Color.White,
                )
                Text(
                    text = "Réptil",
                    color = MaterialTheme.colorScheme.primary,
                    fontWeight = FontWeight.Bold
                )
            }
        }
        Box(
            modifier = Modifier
                .border(
                    width = 2.dp,
                    color = if (selectedItem == RODENT) Color.Red else Color.Gray,
                    shape = MaterialTheme.shapes.medium
                )
                .padding(bottom = 8.dp)
                .clickable {
                    selectedItem = RODENT
                    selectedSpecies(RODENT)
                },
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                RoundedSquare(
                    size = calcDefault(defaultSize, 8),
                    topLeftRadius = defaultSize.dp,
                    topRightRadius = defaultSize.dp,
                    bottomLeftRadius = defaultSize.dp,
                    bottomRightRadius = defaultSize.dp,
                    image = painterResource(id = R.drawable.specie_rodent),
                    material = Color.White,
                )
                Text(
                    text = "Roedor",
                    color = MaterialTheme.colorScheme.primary,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}

//// Gustavo isso aqui talvez possa ir pra UTILS e ser reutilizado dps de alguns ajustes.
private fun calcDefault(sizeToMultiply: Int, quantity: Int): Dp {
    return (sizeToMultiply * quantity).dp
}

@Preview
@Composable
fun PreviewGid() {
    GridVectors() {}
}
