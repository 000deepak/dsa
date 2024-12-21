//static void decimalToBinaryOctal(int decimalNum, int base) {
//        int resNum = 0;
//        int power = 0;
//
//        while (decimalNum > 0) {
//            System.out.println(decimalNum);
//            //811 -> 405 -> 202 -> 101 -> 50 & and so on
//
//            int rem = decimalNum % base; // remainder
//            System.out.println(rem);
//            // 1-> 1 -> 0 -> 1 -> 0 & and so on
//
//            decimalNum /= base; // gives quotient
//            System.out.println(decimalNum);
//            //405-> 202 -> 101 -> 50 -> 25 & and so on
//
//            resNum += rem * Math.pow(10, power);
//            System.out.println("sum  " + resNum);
//            // 1-> 11 -> 11 -> 1011 -> 1011  & and so on
//            //explaination : initial resNum = 0, rem = 1, power = 0, & 10^0 ==1
//            // 1        -> 0 + 1 * 10^0
//            // 11       -> 1 + 1 * 10^1
//            // 11       -> 11 + 1 * 10^2
//            // 1011     -> 11 + 1 * 10^3
//            // 1011     -> 1011 + 1 * 10^4
//
//            power++;
//        }
//        System.out.println("Result is " + resNum);
//    }
//
//    //decimal to hexdecimal
//    static void decimalToHexadecimal(int decimalNum) {
//        char[] hexDigits = new char[32]; // To hold the hexadecimal digits (enough for 32-bit integers)
//        int index = 0; // Tracks the position for the next digit
//
//        while (decimalNum > 0) {
//            System.out.println("Current Decimal: " + decimalNum);
//
//            int rem = decimalNum % 16; // Remainder for base 16
//            System.out.println("Remainder: " + rem);
//
//            // Convert remainder to hexadecimal digit
//            if (rem < 10) {
//                hexDigits[index] = (char) ('0' + rem); // 0-9 digits
//            } else {
//                //'A' + 1 = 'B' (because ASCII value of 'A' is 65, and adding 1 gives 66, which corresponds to 'B')
//                //if rem = 15 then rem - 10 is 5 & 'A' + 5 = 'F'.
//                hexDigits[index] = (char) ('A' + rem - 10); // A-F letters
//            }
//            System.out.println("Hex Digit: " + hexDigits[index]);
//
//            // Move to the next position
//            index++;
//
//            // Update decimalNum to the quotient
//            decimalNum /= 16;
//        }
//
//        // Print the result in reverse order
//        System.out.print("Hexadecimal Result: ");
//        for (int i = index - 1; i >= 0; i--) {
//            System.out.print(hexDigits[i]);
//        }
//        System.out.println(); // Move to the next line
//    }
//
//
//    //binary octal to decimal
//    static void AnyBaseToDecimal(int binaryNum, int base) {
//        int resNum = 0;
//        int power = 0;
//        while (binaryNum > 0) {
//            int unitDigit = binaryNum % 10;
//            resNum += unitDigit * Math.pow(base, power);
//            power++;
//            binaryNum /= 10;
//        }
//        System.out.println("Result is " + resNum);
//    }
//
//    //hexadecimal to decimal
//    static void HexadecimalToDecimal(String hexNum) {
//        int resNum = 0; // Resulting decimal number
//        int power = 0;  // Tracks the position (rightmost digit has power 0)
//
//        // Process the hexadecimal string from right to left
//        for (int i = hexNum.length() - 1; i >= 0; i--) {
//            char hexDigit = hexNum.charAt(i); // Current hex character
//
//            // Convert hex character to its integer value
//            int value;
//            if (hexDigit >= '0' && hexDigit <= '9') {
//                value = hexDigit - '0'; // Characters '0' to '9'
//            } else if (hexDigit >= 'A' && hexDigit <= 'F') {
//                value = hexDigit - 'A' + 10; // Characters 'A' to 'F'
//            } else if (hexDigit >= 'a' && hexDigit <= 'f') {
//                value = hexDigit - 'a' + 10; // Handle lowercase hex (optional)
//            } else {
//                throw new IllegalArgumentException("Invalid hexadecimal digit: " + hexDigit);
//            }
//
//            // Update the result
//            resNum += value * Math.pow(16, power);
//            power++; // Move to the next position (higher power of 16)
//        }
//
//        System.out.println("Result is " + resNum);
//    }
