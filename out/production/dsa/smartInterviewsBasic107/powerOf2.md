# Checking if a Given Number N is a Power of 2

To determine if a given number  N  is a power of 2, you can use the bitwise operation:

N & (N - 1) == 0

## Explanation

A number  N  is a power of 2 if it has exactly one bit set to 1 in its binary representation. For example:
-  2^0 = 1  (binary `0001`)
-  2^1 = 2  (binary `0010`)
-  2^2 = 4  (binary `0100`)
-  2^3 = 8  (binary `1000`)

In general, for a number that is a power of 2, the binary representation has a single bit set to 1 and all other bits are 0.

## Using the Formula:  N & (N - 1) == 0} 

### Why It Works

1. **Subtracting 1 from N**:
   - When you subtract 1 from  N , the single 1-bit in  N  turns into a 0, and all the bits to the right of it become 1.
   - For example, if  N = 8  (binary `1000`), then  N - 1 = 7  (binary `0111`).

2. **Bitwise AND Operation**:
   - The bitwise AND operation between  N  and  N - 1  will result in 0 if  N  is a power of 2 because there are no overlapping 1-bits in their binary representations.
   - Using the same example:  N = 8  (binary `1000`) and  N - 1 = 7  (binary `0111`).
   -  8 & 7 = 1000 & 0111 = 0000 .

### Example Calculations

**Example 1: Check if  N = 8  is a power of 2**

-  N = 8  (binary `1000`)
-  N - 1 = 7  (binary `0111`)
-  N & (N - 1) = 1000 & 0111 = 0000 

Since the result is 0,  N = 8  is a power of 2.

**Example 2: Check if  N = 10  is a power of 2**

-  N = 10  (binary `1010`)
-  N - 1 = 9  (binary `1001`)
-  N & (N - 1) = 1010 & 1001 = 1000 

Since the result is not 0,  N = 10  is not a power of 2.

### Additional Condition:  N  Should Be Positive
To handle the edge case where  N = 0 , which is not a power of 2, you should also ensure  N  is positive:

N > 0 and N & (N - 1) == 0

## Summary

- **Formula**:  N & (N - 1) == 0} 
- **Explanation**: This works because a power of 2 has exactly one bit set in its binary representation, and subtracting 1 flips all the bits to the right of this bit, resulting in no common 1-bits.
- **Edge Case**: Ensure  N  is positive to avoid false positives for  N = 0 .

By using this method, you can efficiently determine if a number is a power of 2.

![Power of 2 Check](https://i.imgur.com/W9YyCfq.png)
