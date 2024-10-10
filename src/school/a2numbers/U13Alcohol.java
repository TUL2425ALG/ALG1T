/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package school.a2numbers;

import java.util.Scanner;

/**
 *
 * @author jan kerslager
 */
public class U13Alcohol {
    public static void main(String[] args) {
        //---vstupy---
        Scanner sc = new Scanner(System.in);
        boolean isMan;
        System.out.println("Jste muz? [a/_]");
        isMan = sc.next().charAt(0) == 'a';
        
        //objem vypiteho napoje v ml
        System.out.println("Zadej mnozstvi vypiteho napoje v ml:");
        double Q = sc.nextInt(); 
        //podil alkoholu v napoji v %
        System.out.println("Zadej podil alkoholu v napoji v %:");
        double p = sc.nextInt();
        //hmotnost konzumenta
        System.out.println("Zadej svoji hmotnost v kg:");
        double m = sc.nextInt();
        
        
        //hustota ethanolu v g/cm^3
        final double rho = 0.789;
        //podil vody v organismu
        final double r = isMan ? 0.7 : 0.6;
        //rychlost odbouravani v g/hr
        final double beta = isMan ? 0.1 : 0.085;
        //m ethanolu [g]
        double meth = Q * p * rho / 100;
        //promile po konzumaci
        double prom = meth / (m * r);
        //rychlost odbouravani alkoholu pro konzumenta [g/hr]
        double uet = m * beta;
        //cas nez bude 0 promile [hr]
        double casDoNuly = meth / uet;
        
        System.out.format("po vypiti %.0fml napoje o %.0f%%:\n", Q, p);
        System.out.format("ihned po konzumaci %.1fg ethanolu -> %.3f promile\n", meth, prom);
        System.out.format("za hodinu budes mit %.3f promile\n", (meth - 1*uet)/(m * r));
        System.out.format("nutno pockat %f hodin nez budes mit 0 promile\n", casDoNuly);
    }
}
