class UglyNumber {

    /*
     * Write a program to check whether a given number is an ugly number.
     * 
     * Ugly numbers are positive numbers whose prime factors only include 2, 3, 5.
     */

    public static void main(String[] args) {
        System.out.println(isUgly(6));
    }

    public static boolean isUgly(int num) {
        if (num <= 0)
            return false;
        if (num == 1)
            return true;

        while (num != 1) {
            if (num % 2 == 0) {
                num /= 2;
            } else if (num % 3 == 0) {
                num /= 3;
            } else if (num % 5 == 0) {
                num /= 5;
            } else
                return false;
        }

        return true;
    }

}