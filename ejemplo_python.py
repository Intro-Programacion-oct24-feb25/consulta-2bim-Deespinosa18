def fibonacci(n):

    if n <= 1:
        return n

    else:
        return fibonacci(n - 1) + fibonacci(n - 2)


num = 5
print("El", num, "º número de Fibonacci es:", fibonacci(num ))
