package com.example.makemon.di.component

import com.example.makemon.di.builder.ActivityBuilder
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        ActivityBuilder::class
    ]
)

interface AppComponent {
}