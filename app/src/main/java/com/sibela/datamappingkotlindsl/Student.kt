package com.sibela.datamappingkotlindsl

class Student(
    val name: String?,
    val standard: Int,
    val rollNumber: Int
) {

    private constructor(builder: Builder) : this(builder.name, builder.standard, builder.rollNumber)

    companion object {
        inline fun student(block: Builder.() -> Unit) = Builder().apply(block).build()
    }

    class Builder {
        var name: String? = null
        var standard: Int = 0
        var rollNumber: Int = 0
        fun build() = Student(this)
    }
}