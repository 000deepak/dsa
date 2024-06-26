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
