package school.a6array;

public class ArrayTools {

    public static void main(String[] args) {

        int[] d = {};
        int[] b = {100, -50, -3, -3, -50, 10, 2};
        int[] c = {100, 50, 5};
        System.out.println(countMin(b));
//        System.out.println(sumOfArray(b));
//        System.out.println(sumOfArray(c));
//        System.out.println(maxOfArray(b));
//        System.out.println(maxOfArray(c));
        int[] a = {1,2,3,4,5};
        int[] e = {1,2,2,4,5};
        System.out.println(isSorted(c)); //ocekavame false
        System.out.println(isSorted(b)); //ocekavame false
        System.out.println(isSorted(a)); //ocekavame true
        System.out.println(isSorted(e)); //ocekavame false
    }

    public static int sumOfArray(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];

        }
        return sum;
    }

    public static int maxOfArray(int[] a) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }

        }
        return max;

    }

    public static int firstMinIndex(int[] a) {
        //int min = Integer.MAX_VALUE, pak prochazam cely pole
        int loc = 0;
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
                loc = i;
            }

        }
        return loc;
    }

    public static int lastMinIndex(int[] a) {
        int loc = 0;
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] <= min) {
                min = a[i];
                loc = i;
            }

        }
        return loc;
    }

    public static int countMin2(int[] a) {

        int count = 1;
        int min = a[firstMinIndex(a)];
        for (int i = 0; i < a.length; i++) {
            if (a[i] == min) {
                count++;
            }
        }
        return count;
    }

    public static int countMin(int[] a) {

        int count = 1;
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] == min) {
                count++;
            }
            if (a[i] < min) {
                count = 1;
                min = a[i];
            }
        }
        return count;
    }
    /**
     * 
     * @param a
     * @param number
     * @return the index the number is on, or -1 if there is no such number
     */
    public static int findFirstIndex(int[] a, int number){
        for (int i = 0; i < a.length; i++) {
            if (a[i] == number) {
                return i;
            }
        }
        return -1;
    }
    
    public static boolean isSorted(int[] a)
    {
        //boolean sorted = true; 
        for(int i = 0; i < a.length-1 ; i++)
        {
            if(a[i] >= a[i+1])
            {
              return false;  
               // sorted = false;
//                break;
            }  
        }
        return true;
        //return sorted;
    }
}
