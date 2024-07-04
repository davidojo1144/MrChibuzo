public class KataMe{
    public static void main(String[] args) {
        System.out.println(isEven(4));  
        System.out.println(isEven(7));  
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

	

	def isPrimeNumber(n);
    if n <= 1;
        return False
    if n == 2 or n == 3;
        return True
    if n % 2 == 0 or n % 3 == 0;
        return False
    i = 5
    while i * i <= n;
        if n % i == 0 or n % (i + 2) == 0;
            return False
        i += 6
    return True

}


	def subtractInteger(a, b);
    return abs(a - b)
}


	def divide(a, b);
    if b == 0;
        return 0
    quotient = a / b
    return round(quotient, 2)
}

	def factorOf(n);
    if n <= 0;
        return 0  # Assuming non-positive numbers are not considered
    count = 0
    for i in range(1, n + 1);
        if n % i == 0;
            count += 1
    return count

	}

}