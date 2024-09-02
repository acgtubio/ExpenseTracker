package com.eydsh.expensetracker.di

import com.eydsh.expensetracker.data.auth.AuthRepository
import com.eydsh.expensetracker.data.auth.FirebaseAuthRepository
import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AuthModule {
    @Provides
    @Singleton
    fun provideAuth(): AuthRepository<AuthResult, FirebaseUser> {
        return FirebaseAuthRepository(Firebase.auth)
    }
}