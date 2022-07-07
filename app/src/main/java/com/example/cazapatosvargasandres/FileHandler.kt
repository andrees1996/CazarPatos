package com.example.cazapatosvargasandres

interface FileHandler {
    fun SaveInformation (datosGrabar: Pair<String,String>)
    fun ReadInformation(): Pair<String,String>
}