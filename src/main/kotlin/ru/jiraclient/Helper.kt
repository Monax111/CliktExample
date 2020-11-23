package ru.jiraclient

import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.parameters.options.required
import ru.jiraclient.utils.optionWithEnv



open class Helper : CliktCommand() {
    private val jql: String by optionWithEnv(envvar = "MY_JQL").required()
    override fun run() {
        println(jql)
    }

}

fun main(args: Array<String>) = Helper().main(args)
