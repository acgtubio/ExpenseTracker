package com.eydsh.expensetracker.data.auth

interface AuthRepository<K, T> {
    fun getCurrentUser(): T?
    suspend fun loginWithEmailAndPassword(): K
    suspend fun registerWithEmailAndPassword(): K
    fun logout()
}