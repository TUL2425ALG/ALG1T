package school.a5libraryclasses;

public class TriangleTools {
    public static void main(String[] args) {
        System.out.println(triangleCircumcircle(5, 4, 8, 9, 3, 2));//17,73
        System.out.println(triangleCircumcircle(2, 5, 7, 6, 1, 4));//5,7
        System.out.println(triangleCircumcircle(2, 5, 7, 6, 2, 5));//nevalidni stav
        System.out.println(triangleCircumcircle(5, 8, 6, 2, 1, 3));//3,42


    } 
    
    /**
     * Calculates the radius of the circumcircle of a triangle defined by three points in Cartesian coordinates.
     * 
     * @param x1 the x-coordinate of point 1
     * @param y1 the y-coordinate of point 1
     * @param x2 the x-coordinate of point 2
     * @param y2 the y-coordinate of point 2
     * @param x3 the x-coordinate of point 3
     * @param y3 the y-coordinate of point 3
     * @return the radius of the circumcircle of the triangle
     */
    public static double triangleCircumcircle(double x1, double y1, double x2, double y2, double x3, double y3){
        //vypocet stran
        double a = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
        double b = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
        double c = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        //vypocet plochy
        double s = (0.5) * Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        if (s == 0) {
            System.out.println("Nevalidni vstupni hodnoty");
            return 0;
        }
        //vypocet polomeru
        double r = (a * b * c) / (4 * s);
        
        return r;
    }
}
