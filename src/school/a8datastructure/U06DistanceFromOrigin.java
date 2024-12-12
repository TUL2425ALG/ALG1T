/**
 * Sort vertices by their distance from origin.
 *
 * @author NiousekCZ
 */

package school.a8datastructure;

// import java.util.Scanner;

public class U06DistanceFromOrigin {
        // static Scanner sc = new Scanner(System.in); // In the case, you want to load by system.
    
    static int n = 5; // Number of vertices
    static int d = 2; // Dimension
        
    public static void main(String[] args) {  
        // Get properties from user ?
        // d = sc.nextInt();
        // n = sc.nextInt(); // With current equippment is very inefficient to try load unknown number of vertices.
        // Dimension 0 makes no sense
        if (d <= 0) {
            System.out.println("Zero dimension.");
            return;
        }
        // Allocate space
        double[][] data = new double[n][d];
        double[] tmp = new double[d];
        
        // Feed data
        // Test
        //2,828
        data[1][0] = 2; // d = 1
        data[1][1] = 2; // d = 2
        //data[1][2] = 3; // d = 3
        //6,082
        data[0][0] = 1;
        data[0][1] = 6;
        //7
        data[2][0] = 7;
        data[2][1] = 0;
        //12,369        
        data[3][0] = 12;
        data[3][1] = 3;
        //3,605
        data[4][0] = 3;
        data[4][1] = 2;
        // Automatic ?
        // for (int cnt = 0; cnt < n; cnt++) {
        //     for (int dim = 0; dim < d; dim++) {
        //         data[cnt][d] = sc.nextDouble();
        //     }
        // }
        
        // Sort
        double[] valholder = new double[n]; // holds values for all points
        for (int idx = 0; idx < n; idx++) {
            valholder[idx] = getVal(data[idx]); // Get value for each point
        }
        double temp = 0;
        for (int i = 0; i < n - 1; i++) { // Bubble sort ?
            for (int j = 0; j < n - i - 1; j++) {
                if (valholder[j] > valholder[j + 1]) {
                    // Swap value
                    temp = valholder[j];
                    valholder[j] = valholder[j + 1];
                    valholder[j + 1] = temp;
                    // Swap data corresponding to value
                    tmp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = tmp;
                }
            }
        }
        
        
        // Output
        switch (d) {
            case 1:
                System.out.println("+----------+-+----------+");
                System.out.println(String.format("| %8s | | %8s |", "COORD_1", "DISTANCE"));
                System.out.println("+----------+-+----------+");
                for (int i = 0; i < n; i++) {
                    System.out.println(String.format("| %8.3f | | %8.3f |", data[i][0], valholder[i]));
                }
                System.out.println("+----------+-+----------+");
                break;
            case 2:
                System.out.println("+----------+----------+-+----------+");
                System.out.println(String.format("| %8s | %8s | | %8s |", "COORD_1", "COORD_2", "DISTANCE"));
                System.out.println("+----------+----------+-+----------+");
                for (int i = 0; i < n; i++) {
                    System.out.println(String.format("| %8.3f | %8.3f | | %8.3f |", data[i][0], data[i][1], valholder[i]));
                }
                System.out.println("+----------+----------+-+----------+");
                break;
            case 3:
                System.out.println("+----------+----------+----------+-+----------+");
                System.out.println(String.format("| %8s | %8s | %8s | | %8s |", "COORD_1", "COORD_2", "COORD_3", "DISTANCE"));
                System.out.println("+----------+----------+----------+-+----------+");
                for (int i = 0; i < n; i++) {
                    System.out.println(String.format("| %8.3f | %8.3f | %8.3f | | %8.3f |", data[i][0], data[i][1], data[i][2], valholder[i]));
                }
                System.out.println("+----------+----------+----------+-+----------+");
                break;
            default:
                // Custom
                break;
        }
        
    }
    
    /**
     * Get distance from origin over all dimensions.
     * @param var data
     * @return distance from origin
     */
    private static double getVal(double[] var) {
        double res = 0;
        // Sum all dimensions
        for (int q = 0; q < d; q++) {
            res = (res + Math.pow(var[q], 2));
        }
        return Math.sqrt(res);
    }
}