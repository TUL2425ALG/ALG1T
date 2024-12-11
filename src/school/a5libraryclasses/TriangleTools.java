package school.a5libraryclasses;

public class TriangleTools {
    public static void main(String[] args) {
        System.out.println(triangleCircumcircle(5, 4, 8, 9, 3, 2));//17,73
        System.out.println(triangleCircumcircle(2, 5, 7, 6, 1, 4));//5,7
        System.out.println(triangleCircumcircle(2, 5, 7, 6, 2, 5));//nevalidni stav
        System.out.println(triangleCircumcircle(5, 8, 6, 2, 1, 3));//3,42
        
        System.out.println("Poloměr kružnice vepsané:");
        System.out.println(calculateInradius(0, 0, 3, 0, 0, 4)); // očekávaný výsledek 1.0
        System.out.println(calculateInradius(0, 0, 1, 1, 2, 0)); // očekávaný výsledek cca 0.207
        System.out.println(calculateInradius(0, 0, 1, 1, 10, 10)); // očekávaný výsledek -1 - nevalidní stav


    } 
    //Opsana kruznice
    /**
     * Calculates the radius of the circumcircle of a triangle defined by three points in Cartesian coordinates.
     * 
     * @param x1 the x-coordinate of point 1
     * @param y1 the y-coordinate of point 1
     * @param x2 the x-coordinate of point 2
     * @param y2 the y-coordinate of point 2
     * @param x3 the x-coordinate of point 3
     * @param y3 the y-coordinate of point 3
     * @return the radius of the circumcircle of the triangle or 0 when the the calculation was not possible
     */
    public static double triangleCircumcircle(double x1, double y1, double x2, double y2, double x3, double y3){
        //vypocet stran
        double a = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
        double b = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
        double c = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        //vypocet plochy
        double s = (0.5) * Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        if (s == 0) { //ostrou rovnost porovnavat idealne pomoci eps
            //System.out.println("Nevalidni vstupni hodnoty"); //v knihovnich metodach se pro nevalidni vstupy nepouziva sout, ale vyjimky
            return 0;
        }
        //vypocet polomeru
        double r = (a * b * c) / (4 * s);
        
        return r;
    }
    //vepsana kruznice
    /**
     * Calculates the inradius of a triangle with vertices at (ax, ay), (bx, by), and (cx, cy).
     *
     * @param ax x-coordinate of point A
     * @param ay y-coordinate of point A
     * @param bx x-coordinate of point B
     * @param by y-coordinate of point B
     * @param cx x-coordinate of point C
     * @param cy y-coordinate of point C
     * @return the inradius of the triangle
     */
    public static double calculateInradius(double ax, double ay, double bx, double by, double cx, double cy){
        double stranaA = Math.sqrt(Math.pow((bx - cx), 2) + Math.pow((by - cy), 2));
        double stranaB = Math.sqrt(Math.pow((ax - cx), 2) + Math.pow((ay - cy), 2));
        double stranaC = Math.sqrt(Math.pow((ax - bx), 2) + Math.pow((ay - by), 2));

        // lze trojúhelník sestrojit?
        if (stranaA + stranaB <= stranaC || stranaA + stranaC <= stranaB || stranaB + stranaC <= stranaA) {
            return -1; // pokud trojúhelník neexistuje
        }

        // poloviční obvod
        double malyObvod = (stranaA + stranaB + stranaC) / 2;

        //obsah pomocí Heronova vzorce
        double obsah = Math.sqrt(malyObvod * (malyObvod - stranaA) * (malyObvod - stranaB) * (malyObvod - stranaC));

        double polomerKruzniceVepsane = obsah/malyObvod;

        return polomerKruzniceVepsane;
    }
}
