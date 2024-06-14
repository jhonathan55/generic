package com.example.generic.interfaces

import androidx.compose.runtime.Composable

interface ComponentGeneric<T> {
    @Composable
    fun Render(data: T) {
    }
}