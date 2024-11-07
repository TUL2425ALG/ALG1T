/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package school.a5libraryclasses;

import static school.a5libraryclasses.NaturalNumberTools.factorial;

/**
 *
 * @author Vitvarova-J-31c9
 */
public class MathTools {
    
    public static void main(String[] args) {
        System.out.println(cos2(Math.PI/2, 0.00000001f)); // 0
        System.out.println(Math.cos(Math.PI/2)); // 0
        System.out.println(cos2(Math.PI, 0.00000001f)); // -1
        System.out.println(Math.cos(Math.PI)); // -1
        System.out.println(cos2(Math.PI/4, 0.00000001f)); // (2^1/2)/2
        System.out.println(Math.cos(Math.PI/4)); // (2^1/2)/2
    }
    
    /**
     * Computes the cosine of the given angle using a Taylor series expansion.
     * The method iteratively adds terms from the series until the last term is smaller than the given precision (epsilon).
     * 
     * @param x The angle in radians for which the cosine value is calculated.
     * @param eps The precision (epsilon) that determines when to stop the series expansion. 
     *             The series stops when the next term is smaller than this value.
     * @return The cosine of the angle {@code x} as a double-precision floating point number.
     * 
     */
    
    public static double cos(double x, float eps) {
        double cos = 1;
        double last;
        int i = 2;
        int k = 1;
        
        while (true) {
            last = Math.pow(x, i) / factorial(i);
            if (last < eps) {
                break;
            }
            cos += last * Math.pow(-1, k);
            i += 2;
            k++;
        }
        
        return cos;
    }
    
    public static double cos2(double x, float eps) {
        double sqx = Math.pow(x, 2);
        double last = sqx / 2;
        double cos = 1 - last;
        int i = 2;
        int sign = 1;
        
        while (true) {
            last = last * (sqx / ((i + 1) * (i + 2)));
            if (last < eps) {
                break;
            }
            cos += last * sign;
            i += 2;
            sign = -sign;
        }
        
        return cos;
    }
}
