package com.example.makemon

import android.content.Context
import android.util.Log
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun main() {
        test()
    }
}

object SingletonClass {
    fun printName(name: String) {
        println("name: $name")
    }
}

class SingletonClassTwo private constructor() {
    companion object {
        private var instance: SingletonClassTwo? = null

        private lateinit var context: Context

        fun getInstance(_context: Context) : SingletonClassTwo {
            return instance ?: synchronized(this) {
                instance ?: SingletonClassTwo().also {
                    context = _context
                    instance = it
                }
            }
        }
    }

    fun printName(name: String) {
        println("name: $name")
    }
}

private fun test() {
    SingletonClass.printName("daekwan")

    /*val singletonOne = SingletonClassTwo.getInstance(this)
    val singletonTwo = SingletonClassTwo.getInstance(this)

    singletonOne.printName("kang")
    SingletonClassTwo.getInstance(this).printName("Hello")*/
}