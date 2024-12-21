# Find the Number of Set Bits in a Given Integer

## Problem Statement
Determine the number of set bits (1s) in the binary representation of a given integer  N .

## Solution Explanation
To count the number of set bits in an integer, you can repeatedly use the bitwise operation:

N = N & (N - 1)

### Why It Works
- **Bitwise AND with (N - 1)**: The operation  text{N & (N - 1)}  unsets the least significant set bit in  N .
- When  N  is decremented by 1, all bits to the right of the least significant set bit (including the set bit itself) are inverted.
- Performing  text{N & (N - 1)}  results in  N  with the least significant set bit turned off.
- Repeating this process will eventually turn all set bits to 0, allowing us to count how many times this operation was performed, which corresponds to the number of set bits.

### Example
Consider  N = 13  (binary `1101`):
1. Initial  N = 13  (binary `1101`).
2. Perform  N = N & (N - 1) :
   -  13 & 12 = 1101 & 1100 = 1100  (unset the least significant set bit).
3. Now,  N = 12  (binary `1100`).
4. Perform  N = N & (N - 1) :
   -  12 & 11 = 1100 & 1011 = 1000  (unset the least significant set bit).
5. Now,  N = 8  (binary `1000`).
6. Perform  N = N & (N - 1) :
   -  8 & 7 = 1000 & 0111 = 0000  (unset the least significant set bit).
7. Now,  N = 0 .

Counting the operations: 3 times (which is the number of set bits in the binary representation of 13).
