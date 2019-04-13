package com.bloc.intellij_generator_plugin.generator

import com.bloc.intellij_generator_plugin.generator.components.BlocEventGenerator
import com.bloc.intellij_generator_plugin.generator.components.BlocExportsGenerator
import com.bloc.intellij_generator_plugin.generator.components.BlocGenerator
import com.bloc.intellij_generator_plugin.generator.components.BlocStateGenerator

object BlocGeneratorFactory {

    fun getBlocGenerators(blocName: String): List<Generator> {
        val exports = BlocExportsGenerator(blocName)
        val bloc = BlocGenerator(blocName)
        val event = BlocEventGenerator(blocName)
        val state = BlocStateGenerator(blocName)
        return listOf(exports, bloc, event, state)
    }
}