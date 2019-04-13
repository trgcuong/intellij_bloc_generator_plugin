package com.bloc.intellij_generator_plugin.generator.components

import com.bloc.intellij_generator_plugin.generator.Generator

class BlocExportsGenerator(
    blocName: String
) : Generator(blocName, templateName = "bloc_exports") {

    override fun fileName() = "bloc.${fileExtension()}"
}