package com.alien.gradletest

import org.junit.Assert.assertEquals
import org.junit.Test
import org.mindrot.jbcrypt.BCrypt

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }


    @Test
    fun getCode() {
        val hashed = BCrypt.hashpw("admin123", BCrypt.gensalt())
        System.out.println(hashed)
        if (BCrypt.checkpw("admin123", hashed))
            System.out.println("It matches")
    }
}
