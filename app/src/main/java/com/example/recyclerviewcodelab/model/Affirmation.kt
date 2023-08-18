package com.example.recyclerviewcodelab.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Affirmation(
    @StringRes val stringResourseId: Int,
    @DrawableRes val imageResourseId: Int
)