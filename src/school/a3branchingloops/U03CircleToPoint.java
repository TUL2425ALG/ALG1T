package school.a3branchingloops;
// test IN: 3 4 OUT: ON
// test In: 6 7 OUT: OUT
// test IN: 0 0 OUT: IN

import java.util.Scanner;

public class U03CircleToPoint {

    public static void main(String[] args) {
        //input 
        final int IN = 2;
        final int OUT = 3;
        final int ON = 250;
        final double EPS = 0.00001; //presnost
        double px = 0;
        double py = 0;
        double sx = 3;
        double sy = 4;
        double r = 5;
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej hodnoty pro px, py, sx, sy a r: ");
        px = sc.nextDouble();
        py = sc.nextDouble();
        sx = sc.nextDouble();
        sy = sc.nextDouble();
        r = sc.nextDouble();
        //processing
        double distance = Math.sqrt(Math.pow(px - sx, 2) + Math.pow(py - sy, 2));
        //System.out.println(distance);
        
        double difference = distance - r;
        int position = OUT;
//        if (difference < 0) {
//            position = IN;
//
//        } else if (difference == 0) {
//            position = ON;
//        }
        if(Math.abs(difference) < EPS){
            position = ON;
        } else if (difference < 0){
            position = IN;
        } else{
            position = OUT;
        }
        // out
        switch (position) {
            case OUT -> System.out.println("Bod P lezi mimo kruznici");
            case IN -> System.out.println("Bod P lezi uvnitr kruznice");
            case ON -> System.out.println("Bod P lezi na kruznici");
            default -> System.out.println("Nastala chyba.");
        }
        
        //Ukazka nepresnosti realnych cisel
        double a = 5.4;
        double b = 6.2;
        System.out.println(a+b);
    }

}
