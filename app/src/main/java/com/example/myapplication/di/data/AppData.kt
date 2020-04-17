package com.example.myapplication.di.data

import dagger.Module
import dagger.Provides
import javax.inject.Inject

data class TestData(
    var name: String
)

@Module
class AppData @Inject constructor() {
    @Provides
    fun data() : TestData {
        return TestData("ewrwerwe")
    }
}