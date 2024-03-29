package com.example.ricknmorty.ui.character

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.ricknmorty.R
import com.example.ricknmorty.core.utils.forEachPair
import com.example.ricknmorty.model.character.CharacterModel
import com.example.ricknmorty.ui.theme.Shapes
import com.example.ricknmorty.ui.theme.Typography
import com.example.ricknmorty.ui.utils.loadImage
import com.skydoves.landscapist.CircularReveal
import com.skydoves.landscapist.glide.GlideImage

@Composable
fun CharacterCard(
    model: CharacterModel,
    onClick: () -> Unit
) {
    Card(
        shape = Shapes.medium,
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
            .clickable(onClick = onClick),
        elevation = 5.dp
    ) {
        Column {
            GlideImage(
                imageModel = model.image,
                contentScale = ContentScale.Crop,
                circularReveal = CircularReveal(duration = 150),
                placeHolder = ImageBitmap.imageResource(id = R.drawable.im_placeholder)
            )
            Text(
                text = model.name,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(12.dp),
                style = Typography.h2
            )
            val additionalInfo = listOf(
                "Gender:" to model.gender,
                "Type:" to model.type,
                "origin:" to model.origin.name
            )
            HorizontalKeyValueInfo(
                pairs = additionalInfo,
                modifier = Modifier
                    .padding(12.dp)
                    .fillMaxWidth()
            )
        }
    }
}

@Composable
fun HorizontalKeyValueInfo(
    pairs: List<Pair<String, String>>,
    modifier: Modifier
) {
    Column {
        pairs.forEachPair { k, v ->
            Row(
                modifier = modifier
            ) {
                Text(
                    text = k,
                    modifier = Modifier
                        .fillMaxWidth(0.5F)
                        .wrapContentWidth(Alignment.Start)
                        .align(Alignment.CenterVertically),
                    style = Typography.body2
                )
                Text(
                    text = v,
                    modifier = Modifier
                        .fillMaxWidth(0.5F)
                        .wrapContentWidth(Alignment.End)
                        .align(Alignment.CenterVertically),
                    style = Typography.body1
                )
            }
        }
    }
}
