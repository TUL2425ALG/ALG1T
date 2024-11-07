package school.a5libraryclasses;

public class NaturalNumberTools {
    /**
     * Test whether the given number is prime, has no other divisors than 1 and itself
     * @param number given natural number
     * @return true if the given number is prime, false otherwise
     */
    public static boolean testPrime(int number) {
        boolean isPrimeNumber = true;

        if (number <= 1) {
            isPrimeNumber = false;
        }
        int possibleDivisor = 2;
        while (possibleDivisor <= Math.sqrt(number) && isPrimeNumber) { //for (int i = 2; i <= Math.sqrt(number) && isPrimeNumber; i++) {
            if (number % possibleDivisor == 0) {
                isPrimeNumber = false;
                //break;
            }
            possibleDivisor++;
        }
        return isPrimeNumber;
    }
    
    /**
     * Returns greatest common divisor of two natural numbers
     * @param number1 - first number
     * @param number2 - second number
     * @return returns the divisor if found otherwise 1
     */
    public static int greatestCommonDivisor(int number1, int number2){
        int gcd = 1;
        if(number2 > number1)
        {
            int a = number1;
            number1 = number2;
            number2 = a;
        }
        
        for(int i = number2; number2 >= 2; i--)
        {
            if ((number1 % i == 0) && (number2 % i == 0)) {
                gcd = i;
                break;
                //return i;
            }
            
        }
        return gcd;
        //return 1;
    }
    
    /**
     * Computes the factorial of a non-negative integer {@code i}.
     * The factorial of a number {@code n} is the product of all positive integers less than or equal to {@code n}.
     * 
     * <p>For example:</p>
     * <ul>
     *   <li>{@code factorial(0)} returns {@code 1}</li>
     *   <li>{@code factorial(5)} returns {@code 120} (5 * 4 * 3 * 2 * 1)</li>
     * </ul>
     * 
     * @param i The non-negative integer whose factorial is to be computed.
     * @return The factorial of the integer {@code i}.
     */
    public static int factorial(int i) {
        int result = 1;
        
        for (int j = i; j > 0; j--) {
            result *= j;
        }
        
        return result;
    }
    
    
    
    //testing main
    public static void main(String[] args) {
        System.out.println(testPrime(45)); //ocekavany vysledek false
        System.out.println(testPrime(53)); //ocekavany vysledek true
        System.out.println(testPrime(1)); //limitni stav - ocekavany vysledek false
        System.out.println(testPrime(-1)); //nevalidni stav - ocekavany vysledek false
        
        
        System.out.println(greatestCommonDivisor(20, 12)); //4
        System.out.println(greatestCommonDivisor(12, 20 )); //4
        System.out.println(greatestCommonDivisor(12, 2 )); //2
        System.out.println(greatestCommonDivisor(1, 1 )); //1
        System.out.println(greatestCommonDivisor(12, 1 )); //1
        System.out.println(greatestCommonDivisor(13, 20 )); //1
        
//        System.out.println(factorial(0)); // 1
//        System.out.println(factorial(1)); // 1
//        System.out.println(factorial(2)); // 2
//        System.out.println(factorial(10)); // 3628800
        
        //NaturalNumberTools.
        //String s;
        //s.
        
    }
}
