package com.bloc.intellij_generator_plugin.generator.components

import com.bloc.intellij_generator_plugin.generator.Generator

class BlocStateGenerator(
    blocName: String
) : Generator(blocName, templateName = "bloc_state") {

    override fun fileName() = "${snakeCase()}_state.${fileExtension()}"
}