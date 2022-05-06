package com.github.raink1208.pageembed

import net.dv8tion.jda.api.entities.MessageEmbed

class PageEmbed private constructor(val title: String, val fields: List<MessageEmbed.Field>, val separateCount: Int){
    class PageEmbedBuilder {
        var title = ""
        var separateCount = 10
        private val fields = mutableListOf<MessageEmbed.Field>()

        fun addField(field: MessageEmbed.Field): PageEmbedBuilder {
            fields.add(field)
            return this
        }

        fun build(): PageEmbed {
            return PageEmbed(title, fields, separateCount)
        }
    }
}