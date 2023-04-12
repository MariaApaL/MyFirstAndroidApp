package com.apa.accenture.myfirstapp

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

//Todas las apps que usan Hilt deben contener una clase Application anotada con @HiltAndroidApp.
//
//@HiltAndroidApp activa la generación de código de Hilt, incluida una clase base para tu aplicación que sirve
//como contenedor de dependencia a nivel de la aplicación.

@HiltAndroidApp
class SuperheroApp:Application() {
}