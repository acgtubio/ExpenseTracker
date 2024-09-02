package com.eydsh.expensetracker.data.auth

import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser

class FirebaseAuthRepository(
    private val firebaseAuth: FirebaseAuth
): AuthRepository<AuthResult, FirebaseUser> {
    override fun getCurrentUser(): FirebaseUser? {
        return firebaseAuth.currentUser
    }

    override suspend fun loginWithEmailAndPassword(): AuthResult {
        TODO("Not yet implemented")
    }

    override suspend fun registerWithEmailAndPassword(): AuthResult {
        TODO("Not yet implemented")
    }

    override fun logout() {
        TODO("Not yet implemented")
    }

}