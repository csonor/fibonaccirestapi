package hu.obuda.devops.fibonaccirestapi.service

import org.springframework.stereotype.Service

@Service
class FibonacciService {
    fun fibonacci(n: Int): Int {
        val fib = IntArray(n + 1)
        fib[0] = 0
        fib[1] = 1
        for (i in 2..n) {
            fib[i] = fib[i - 1] + fib[i - 2]
        }
        return fib[n]
    }
}
