package DSA;

public class EvenDigits {
    public static void main(String[] args) {
       int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(digit2(345678));
    }


        public int findNumbers(int[] nums){
            int count=0;
            for(int num:nums){
                if(even(num)){
                    count++;
                }
            }
            return count;
        }
        boolean even(int num) {
            int numOfDigit=digits(num);
            if(numOfDigit%2==0){
                return true;
            }
            return false;
        }
        static int digit2(int num) {
            return(int)(Math.log10(num)) + 1;
        }
        int digits(int num) {
            if (num < 0) {
                num = num * -1;
            }
            if(num==0){
                return 1;
            }
            int count = 0;
            while (num > 0) {
                count++;
                num = num / 10;
            }
            return count;

        }
    }

