
# Checking if the i-th Bit is Set in a Number N

In binary representation, each bit of a number has a position, starting from the rightmost bit (Least Significant Bit, LSB) which is considered position 0. Checking if the i-th bit of a number \( N \) is set (i.e., whether it is 1) can be done using bitwise operations.

## Methods to Check if the i-th Bit is Set

### Method 1: Using Bitwise AND and Shift Left

**Formula:**
\[ \text{(N \& (1 << i)) \neq 0} \]

**Explanation:**
1. **Shift left (`1 << i`)**: Create a number with only the i-th bit set to 1. This is done by shifting the number 1 left by \( i \) positions.
   - For example, if \( i = 3 \), then \( 1 << 3 \) results in `00001000` in binary (which is 8 in decimal).
2. **Bitwise AND (`N & (1 << i)`)**: Perform a bitwise AND operation between \( N \) and the result from the previous step. This operation will only be non-zero if the i-th bit of \( N \) is 1.
3. **Check if non-zero**: If the result of the bitwise AND operation is not zero, then the i-th bit of \( N \) is set.

**Example:**
- Check if the 3rd bit is set in \( N = 13 \) (binary `1101`).
  - `1 << 3` gives `00001000`.
  - `N & (1 << 3)` gives `1101 & 1000` which is `1000`.
  - Since `1000` (8 in decimal) is non-zero, the 3rd bit is set.

### Method 2: Using Shift Right and Bitwise AND

**Formula:**
\[ \text{((N >> i) \& 1) \neq 0} \]

**Explanation:**
1. **Shift right (`N >> i`)**: Shift the bits of \( N \) right by \( i \) positions. This moves the i-th bit to the least significant bit (0th position).
   - For example, if \( N = 13 \) (binary `1101`) and \( i = 3 \), then `N >> 3` results in `0001` (1 in decimal).
2. **Bitwise AND with 1 (`(N >> i) & 1`)**: Perform a bitwise AND operation between the result from the previous step and `1`. This will isolate the least significant bit.
3. **Check if non-zero**: If the result of the bitwise AND operation is not zero, then the i-th bit of \( N \) is set.

**Example:**
- Check if the 3rd bit is set in \( N = 13 \) (binary `1101`).
  - `N >> 3` gives `0001`.
  - `(N >> 3) & 1` gives `1 & 1` which is `1`.
  - Since `1` is non-zero, the 3rd bit is set.

## Summary
Both methods provide a way to check if the i-th bit of a number \( N \) is set:
- **Method 1**: `(N & (1 << i)) != 0`
  - Uses a bitwise AND with a shifted bit to isolate the i-th bit.
- **Method 2**: `((N >> i) & 1) != 0`
  - Uses a right shift followed by a bitwise AND to check the least significant bit.

Both methods are efficient and commonly used in programming for bit manipulation tasks.

![Bit Checking](https://i.imgur.com/OoCxeH6.png)
