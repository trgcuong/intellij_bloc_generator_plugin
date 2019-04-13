package com.bloc.intellij_generator_plugin.generator

import com.bloc.intellij_generator_plugin.generator.components.*

object BlocGeneratorFactory {

    fun getBlocGenerators(blocName: String): List<Generator> {
        val exports = BlocExportsGenerator(blocName)
        val bloc = BlocGenerator(blocName)
        val event = BlocEventGenerator(blocName)
        val state = BlocStateGenerator(blocName)
        val widget = BlocWidgetGenerator(blocName)
        return listOf(exports, bloc, event, state, widget)
    }
}