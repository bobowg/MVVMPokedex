package com.example.mvvmpokedex.pokemondetail

import androidx.lifecycle.ViewModel
import com.example.mvvmpokedex.data.remote.responses.Pokemon
import com.example.mvvmpokedex.repository.PokemonRepository
import com.example.mvvmpokedex.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonDetailViewModel @Inject constructor(
    private val repository: PokemonRepository
) : ViewModel() {
    suspend fun getPokemonInfo(pokemonName: String): Resource<Pokemon> {
        return repository.getPokemonInfo(pokemonName)
    }
}