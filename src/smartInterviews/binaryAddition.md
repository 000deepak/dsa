# Binary Addition and Subtraction

## Binary Addition
Binary addition follows the same principles as decimal addition but uses only two digits (0 and 1). The possible combinations for adding two binary digits are:

- 0 + 0 = 0
- 0 + 1 = 1
- 1 + 0 = 1
- 1 + 1 = 10 (which is 0 with a carry of 1)

When performing binary addition, you add each pair of digits, starting from the rightmost bit, and propagate any carry to the next higher bit.

**Example: Add 1011 and 1101**

  1011
+ 1101
------
 11000


Step-by-step process:
1. Rightmost bit: 1 + 1 = 10 (write down 0, carry 1)
2. Next bit: 1 + 0 + 1 (carry) = 10 (write down 0, carry 1)
3. Next bit: 0 + 1 + 1 (carry) = 10 (write down 0, carry 1)
4. Leftmost bit: 1 + 1 (carry) = 10 (write down 1, carry 1)
5. Extra carry: Write down the carry 1 at the leftmost position.

Result is **11000**.

![Binary Addition](https://i.imgur.com/LKybm4F.png)

## Binary Subtraction
Binary subtraction is similar to decimal subtraction, but with binary digits (0 and 1). The key rule is:

- 0 - 0 = 0
- 1 - 0 = 1
- 1 - 1 = 0
- 0 - 1 = 1 with a borrow of 1 from the next higher bit

**Example: Subtract 1101 from 10111**

  10111
-  1101
-------
   1010


Step-by-step process:
1. Rightmost bit: 1 - 1 = 0
2. Next bit: 1 - 0 = 1
3. Next bit: 1 - 1 = 0
4. Next bit: 0 - 1 (borrow) = 1 (write down 1, borrow 1)
5. Next bit: 1 - 1 (borrow) = 0

Result is **1010**.

![Binary Subtraction](https://i.imgur.com/dXN8FFz.png)

## Binary Subtraction Using Two's Complement
To subtract using two's complement:
1. **Find the two's complement** of the subtrahend (number to be subtracted).
2. **Add** it to the minuend (number from which you subtract).
3. **Ignore any overflow** beyond the fixed number of bits.

**Example: Subtract 1101 from 10111**

1. Find the two's complement of 1101:
    - One's complement of 1101: 0010
    - Add 1: 0010 + 1 = 0011

2. Add the two's complement of 1101 to 10111:
    ```
          10111
        + 0011
        ------
         11010
    ```

3. Ignore any overflow beyond the fixed number of bits.

Result is **1010**.

![Two's Complement Subtraction](https://i.imgur.com/O1Fy8Wm.png)

# Summary
- **Binary Addition:** Add corresponding bits, propagate carry.
- **Binary Subtraction:** Subtract corresponding bits, borrow when needed.
- **Subtraction Using Two's Complement:** Find two's complement of subtrahend, add to minuend, ignore overflow.
