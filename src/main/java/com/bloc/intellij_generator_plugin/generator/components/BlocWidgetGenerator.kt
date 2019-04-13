package com.bloc.intellij_generator_plugin.generator.components

import com.bloc.intellij_generator_plugin.generator.Generator

class BlocWidgetGenerator(
    blocName: String
) : Generator(blocName, templateName = "bloc_widget") {

    override fun fileName() = "${snakeCase()}_widget.${fileExtension()}"
}