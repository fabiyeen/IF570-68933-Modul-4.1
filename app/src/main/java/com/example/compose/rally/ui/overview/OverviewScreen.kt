package com.example.compose.rally.ui.overview

import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.VectorConverter
import androidx.compose.animation.core.animateValue
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.ui.unit.Dp
...

val infiniteElevationAnimation = rememberInfiniteTransition()
val animatedElevation: Dp by infiniteElevationAnimation.animateValue(
    initialValue = 1.dp,
    targetValue = 8.dp,
    typeConverter = Dp.VectorConverter,
    animationSpec = infiniteRepeatable(
        animation = tween(500),
        repeatMode = RepeatMode.Reverse
    )
)
Card(elevation = animatedElevation) {