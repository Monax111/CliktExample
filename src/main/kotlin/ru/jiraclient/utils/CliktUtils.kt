package ru.jiraclient.utils

import com.github.ajalt.clikt.completion.CompletionCandidates
import com.github.ajalt.clikt.core.ParameterHolder
import com.github.ajalt.clikt.parameters.options.option

fun ParameterHolder.optionWithEnv(
    help: String = "",
    metavar: String? = null,
    hidden: Boolean = false,
    envvar: String,
    envvarSplit: Regex? = null,
    helpTags: Map<String, String> = emptyMap(),
    completionCandidates: CompletionCandidates? = null
) = option(
    help = help.plus(" Can be set as ENV with name $envvar"),
    metavar = metavar,
    hidden = hidden,
    envvar = envvar,
    envvarSplit = envvarSplit,
    helpTags = helpTags,
    completionCandidates = completionCandidates
)
