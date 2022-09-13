package arrays.Basic;

import arrays.ReadNumber;

class Armstrong {
    public static void main(String[] args) {

        System.out.println(Armstrong.isArmstrong(153));

    }

    static boolean isArmstrong(int x) {
        String str = Integer.toString(x);
        int n = str.length();
        int temp = x;
        int sum = 0;

        while (temp != 0) {
            int r = temp % 10;
            System.out.println("%" + " " + temp % 10);
            sum = (int) (sum + Math.pow(r, n));
            System.out.println("/" + " " + temp / 10);
            temp = temp / 10;
        }

        // If satisfies Armstrong condition
        return (sum == x);
    }
}
