package com.eydsh.expensetracker.ui

import androidx.lifecycle.ViewModel
import com.eydsh.expensetracker.data.auth.AuthRepository
import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseUser
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class EntryViewModel @Inject constructor(
    private val auth: AuthRepository<AuthResult, FirebaseUser>
): ViewModel() {
    private val _currentUser = MutableStateFlow<FirebaseUser?>(value = auth.getCurrentUser())
    val currentUser: StateFlow<FirebaseUser?> = _currentUser.asStateFlow()
}