# Most Significant Bit (MSB) and Least Significant Bit (LSB)

## Least Significant Bit (LSB)
The Least Significant Bit (LSB) is the rightmost bit in a binary number. It represents the smallest possible value in the binary representation, which corresponds to 2^0 or 1 in decimal notation. The LSB determines whether the number is odd or even:
- If the LSB is 1, the number is odd.
- If the LSB is 0, the number is even.

### Example:
For the binary number `1011`:
- The LSB is 1 (rightmost bit).

## Most Significant Bit (MSB)
The Most Significant Bit (MSB) is the leftmost bit in a binary number. It represents the largest possible value in the binary representation based on the number of bits. For an  n -bit binary number, the MSB corresponds to 2^{n-1}.

In the context of signed binary numbers (using two's complement), the MSB also indicates the sign of the number:
- If the MSB is 1, the number is negative.
- If the MSB is 0, the number is positive or zero.

### Example:
For the binary number `1011`:
- The MSB is 1 (leftmost bit).

## Summary
- **LSB (Least Significant Bit)**: The rightmost bit in a binary number. It has the least weight (value of 2^0).
- **MSB (Most Significant Bit)**: The leftmost bit in a binary number. It has the most weight (value of 2^{n-1} for an  n -bit number).

### Visual Representation:
For an 8-bit binary number `11001010`:
- **MSB**: 1 (leftmost bit)
- **LSB**: 0 (rightmost bit)


### Applications
- **LSB**: Often used in bitwise operations, encryption algorithms, and determining parity (odd or even).
- **MSB**: Used in determining the magnitude and sign of binary numbers, especially in signed integer representations.

Understanding MSB and LSB is fundamental in fields such as computer architecture, digital electronics, and programming.

# java code
```java
import java.util.Scanner;

public class CountSetBits {

    // Function to count the number of set bits in an integer
    public static int countSetBits(int N) {
        int count = 0;
        while (N > 0) {
            N = N & (N - 1); // Unset the least significant set bit
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        // Create a scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Count the number of set bits
        int setBitsCount = countSetBits(number);

        // Print the result
        System.out.println("Number of set bits in " + number + " is: " + setBitsCount);
    }
}
```
