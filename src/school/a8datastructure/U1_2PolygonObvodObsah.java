package school.a8datastructure;
import java.util.Scanner;
//
//        double[][] testpolygon1 = {{0, 1, 1, 0},    // obvod 4     0 0 1 0 1 1 0 1
//                                   {0 ,0 ,1 ,1}};   // obash 1
//        double[][] testpolygon2 = {{0, 3, 0},       // obovod 12   0 0 3 0 0 4  
//                                   {0, 0, 4}};      // obsah 6
//        double[][] testpolygon3 = {{0, 4, 4, 0},    // obvod 14    0 0 4 0 4 3 0 3
//                                   {0, 0, 3, 3}};   // obash 12
//
public class U1_2PolygonObvodObsah{

    public static void main(String[] args) {
        
        while(true){
        double[][] polygon = inputPolygon();
        
        if (polygon == null) {
            System.out.println("N-uhelnik musi mit alespon 3 body.");
        } else {
            System.out.println("Obvod n-uhleniku je " + polygonPerimeter(polygon));
            System.out.println("Obsah n-uhleniku je " + polygonArea(polygon));
        }
        
        System.out.println("Pro ukonceni stiskni 1");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n==1){
            break;
        }
    }
    }
    public static double[][] inputPolygon() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Zadejte pocet bodu n-uhelniku (min. 3)");
        int pointCount = sc.nextInt();

        if (pointCount < 3) {

            return null;
        }
        double[][] polygonMatrix = new double[2][pointCount];
        for (int i = 0; i < pointCount; i++) {
            System.out.println("Zadejte souradnice bodu " + (i+1));
            for (int j = 0; j < 2; j++) {
                polygonMatrix[j][i] = sc.nextDouble();
            }

        }
        return polygonMatrix;
    }

    public static double polygonPerimeter(double[][] polygon) {
        double perimeter = 0;
        int n = polygon[0].length;

        for (int i = 0; i < n - 1; i++) {
            double x1 = polygon[0][i];
            double y1 = polygon[1][i];
            double x2 = polygon[0][i + 1];
            double y2 = polygon[1][i + 1];
            perimeter = perimeter + Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        }

        double xLast = polygon[0][n - 1];
        double yLast = polygon[1][n - 1];
        double xFirst = polygon[0][0];
        double yFirst = polygon[1][0];
        perimeter = perimeter + Math.sqrt(Math.pow(xFirst - xLast, 2) + Math.pow(yFirst - yLast, 2));

        return perimeter;
    }

    public static double polygonArea(double[][] polygon) {
        double area = 0;
        int n = polygon[0].length; // Počet bodů

        // Iterace přes všechny body kromě posledního
        for (int i = 0; i < n - 1; i++) {
            double x1 = polygon[0][i];
            double y1 = polygon[1][i];
            double x2 = polygon[0][i + 1];
            double y2 = polygon[1][i + 1];
            area += x1 * y2 - x2 * y1;
        }

        // Spojení posledního bodu s prvním
        double xLast = polygon[0][n - 1];
        double yLast = polygon[1][n - 1];
        double xFirst = polygon[0][0];
        double yFirst = polygon[1][0];
        area += xLast * yFirst - xFirst * yLast;

        return Math.abs(area) / 2;
    }
}
