package hu.obuda.devops.fibonaccirestapi.service

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class FibonacciServiceTest {

    private val underTest = FibonacciService()
    @Test
    fun shouldReturn0WhenCall1() {
        // when
        val result: Int = underTest.fibonacci(1)
        // then
        Assertions.assertEquals(1, result)
    }

    @Test
    fun shouldReturnCorrectValues() {
        var result: Int = underTest.fibonacci(2)
        Assertions.assertEquals(1, result)

        result = underTest.fibonacci(46)
        Assertions.assertEquals(18363119031, result)

        result = underTest.fibonacci(45)
        Assertions.assertEquals(1134903170, result)
    }
}
