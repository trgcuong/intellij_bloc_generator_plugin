package com.bloc.intellij_generator_plugin.generator.components

import com.bloc.intellij_generator_plugin.generator.Generator

class BlocGenerator(
    blocName: String
) : Generator(blocName, templateName = "bloc") {

    override fun fileName() = "${snakeCase()}_bloc.${fileExtension()}"
}