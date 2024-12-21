# Decimal to Binary Conversion

## Positive Decimal to Binary Conversion
To convert a positive decimal number to binary:
1. **Divide the number by 2.**
2. **Write down the remainder (0 or 1).**
3. **Divide the quotient obtained in the previous step by 2.**
4. **Repeat steps 2 and 3 until the quotient is 0.**
5. **The binary representation is the remainders read in reverse order.**

**Example: Convert 19 to binary**

| Division by 2 | Quotient | Remainder |
|---------------|----------|-----------|
| 19 ÷ 2        | 9        | 1         |
| 9 ÷ 2         | 4        | 1         |
| 4 ÷ 2         | 2        | 0         |
| 2 ÷ 2         | 1        | 0         |
| 1 ÷ 2         | 0        | 1         |

Reading the remainders in reverse order, 19 in binary is **10011**.

![Decimal to Binary](https://i.imgur.com/7VXszVh.png)

## Binary to Decimal Conversion
To convert a binary number to decimal:
1. **Write down the binary number.**
2. **Multiply each bit by 2 raised to the power of its position, starting from 0 at the rightmost bit.**
3. **Sum all the values obtained.**

**Example: Convert 1011 to decimal**

\[ (1 \times 2^3) + (0 \times 2^2) + (1 \times 2^1) + (1 \times 2^0) \]

\[ = 8 + 0 + 2 + 1 \]

\[ = 11 \]

![Binary to Decimal](https://i.imgur.com/6RjnsMI.png)

# Negative Decimal to Binary Conversion

## Negative Decimal to Binary Conversion (Two's Complement Method)
To convert a negative decimal number to binary using two's complement:
1. **Convert the absolute value of the number to binary.**
2. **Find the one's complement by inverting the digits (0 to 1 and 1 to 0).**
3. **Add 1 to the one's complement.**

**Example: Convert -19 to binary (8-bit)**

1. Convert 19 to binary: **00010011**
2. One's complement of 00010011: **11101100**
3. Add 1: **11101100 + 1 = 11101101**

So, -19 in 8-bit binary is **11101101**.

![Negative Decimal to Binary](https://i.imgur.com/PJ96wAf.png)

## Binary to Negative Decimal Conversion (Two's Complement)
To convert a binary number in two's complement to decimal:
1. **Check if the number is negative (leftmost bit is 1).**
2. **If negative, invert the bits to find the one's complement.**
3. **Add 1 to the one's complement to get the magnitude.**
4. **Convert the magnitude to decimal and add a negative sign.**

**Example: Convert 11101101 to decimal (8-bit)**

1. The leftmost bit is 1 (negative number).
2. Invert the bits: **00010010**
3. Add 1: **00010010 + 1 = 00010011**
4. Convert 00010011 to decimal: **19**

So, 11101101 in decimal is **-19**.

![Binary to Negative Decimal](https://i.imgur.com/8EczSLI.png)

# Summary
- **Positive Decimal to Binary:** Repeated division by 2.
- **Binary to Positive Decimal:** Sum of powers of 2.
- **Negative Decimal to Binary:** Two's complement (invert and add 1).
- **Binary to Negative Decimal:** Identify negative, invert, add 1, convert, and add negative sign.


# decimal to binary
```java
//using stringbuilder
public class DecimalToBinary {

    // Function to convert decimal to binary
    public static String decimalToBinary(int N) {
        // Edge case for 0
        if (N == 0) {
            return "0";
        }

        // StringBuilder to hold binary representation
        StringBuilder binary = new StringBuilder();

        // Perform division and record remainders
        while (N > 0) {
            int remainder = N % 2;
            binary.append(remainder);
            N = N / 2;
        }

        // Reverse the string since we appended remainders from least significant bit
        return binary.reverse().toString();
    }

    public static void main(String[] args) {
        // Create a scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Convert the number to binary and print the result
        String binaryRepresentation = decimalToBinary(number);
        System.out.println("Binary representation of " + number + " is: " + binaryRepresentation);
    }
}


//inbuilt method
public class BinaryRepresentation {
    public static void main(String[] args) {
        // Example usage
        int number = 19;
        System.out.println("Binary representation of " + number + " is: " + toBinary(number));
    }

    // Function to convert a number to its binary representation
    public static String toBinary(int number) {
        // Use built-in method to convert to binary string
        return Integer.toBinaryString(number);
    }
}
```

# binary to decimal
```java
import java.util.Scanner;

public class BinaryToDecimal {

    // Function to convert binary to decimal
    public static int binaryToDecimal(String binaryString) {
        // Initialize result to 0
        int decimal = 0;
        // Iterate over each character in the binary string
        for (int i = 0; i < binaryString.length(); i++) {
            // Get the current character ('0' or '1')
            char c = binaryString.charAt(i);
            // Convert char to int (either 0 or 1)
            int digit = Character.getNumericValue(c);
            // Calculate decimal value by shifting and adding current bit
            decimal = decimal * 2 + digit;
        }
        return decimal;
    }

    public static void main(String[] args) {
        // Create a scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a binary number: ");
        String binaryNumber = scanner.nextLine();

        // Convert the binary number to decimal
        int decimalRepresentation = binaryToDecimal(binaryNumber);

        // Print the result
        System.out.println("Decimal representation of " + binaryNumber + " is: " + decimalRepresentation);
    }
}
```