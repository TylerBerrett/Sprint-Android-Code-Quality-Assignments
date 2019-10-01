package com.lambdaschool.sprintchallenge3_pokeapi

import java.io.Serializable

data class Sprites (val front_default: String)

data class Move(val name: String)

data class MoveList(val move: Move)

data class Type(val name: String)

data class TypeList(val type: Type)


data class Pokemon (
        val name: String,
        val sprites: Sprites,
        val id: Int,
        val moves: List<MoveList>,
        val types: List<TypeList>
)

data class PassPokemon(
        var name: String,
        var sprites: String,
        var id: Int,
        var moves: ArrayList<String>,
        var type: ArrayList<String>
): Serializable
