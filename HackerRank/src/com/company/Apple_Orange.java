package com.company;

public class Apple_Orange {

    public static void main(String[] args) {

        countApplesAndOranges(7, 11, 5, 15, new int[]{-2, 22, 1}, new int[]{5, -6});

        System.out.println(kangaroo(4602, 8519, 7585, 8362));
        System.out.println(Integer.MAX_VALUE);
    }


    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {

        int apple = 0;
        int orange = 0;
        for (int x : apples) {
            if (x + a >= s && x + a <= t) {
                apple++;
            }
        }
        for (int x : oranges) {
            if (x + b >= s && x + b <= t) {
                orange++;
            }
        }

        System.out.println(apple + "\n" + orange);

    }


    static String kangaroo(double x1, int v1, double x2, int v2) {
        for(int x = 0; x <= Integer.MAX_VALUE; x++){
            if (x1 == x2){
                return "YES";
            }

            if (!(0 <= x1) || !(x1 < x2)  || !(x2< Integer.MAX_VALUE)){
                return "NO";
            }

            if (!(1 <= v1) || !(v1 <= 100000) || !(1 <= v2) || !(v2 <= Integer.MAX_VALUE)){
                return "NO";
            }
            x1 = x1 + v1;
            x2 = x2 + v2;


        }


        return "NO";


//        return kangaroo(x1+v1, v1, x2+v2, v2);



    }

}
