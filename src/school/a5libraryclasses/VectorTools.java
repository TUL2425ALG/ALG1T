package school.a5libraryclasses;
public class VectorTools {

    /**
     * Calculate the length of the vector between two points in 3D space.
     *
     * @param x1 X-coordinate of the first point
     * @param y1 Y-coordinate of the first point
     * @param z1 Z-coordinate of the first point
     * @param x2 X-coordinate of the second point
     * @param y2 Y-coordinate of the second point
     * @param z2 Z-coordinate of the second point
     * @return Length of the vector between the two points
     */
    public static double VectorLength(int x1, int y1, int z1, int x2, int y2, int z2) {
        int a = x2 - x1;
        int b = y2 - y1;
        int c = z2 - z1;
        return Math.sqrt(a * a + b * b + c * c);
    }
//    public static void main(String[] args) {
//        System.out.println(VectorLength(1, 1, 1, 8, 1,1));//7
//        System.out.println(VectorLength(1, 1, 1, 5, 6,18));//18,7
//        System.out.println(VectorLength(1, 1, 1, 8, 4,2));//7,7
//    }

    /**
     * Calculate the length of the vector with given components in 3D space.
     *
     * @param a The a-component of the vector
     * @param b The b-component of the vector
     * @param c The c-component of the vector
     * @return Length of the vector
     */

    public static double VectorLength(int a, int b, int c) {
        return Math.sqrt(a * a + b * b + c * c);
    }

//    public static void main(String[] args) {
//        System.out.println(VectorLength(1, 1, 1)); // 1.732 
//        System.out.println(VectorLength(8, 1, 1)); // 8.124
//        System.out.println(VectorLength(5, 6, 18)); // 19.729
//        System.out.println(VectorLength(8, 4, 2)); // 9.165 
//    }

    /**
     * Calculate the length of the vector resulting from multiplying two
     * vectors.
     *
     * @param a1 The first component of the first vector
     * @param a2 The second component of the first vector
     * @param a3 The third component of the first vector
     * @param b1 The first component of the second vector
     * @param b2 The second component of the second vector
     * @param b3 The third component of the second vector
     * @return Length of the vector resulting from the cross product of the two
     * vectors
     */
    public static double VectorLengthofTwo(int a1, int a2, int a3, int b1, int b2, int b3) {
        int c1 = a2 * b3 - a3 * b2;
        int c2 = a3 * b1 - a1 * b3;
        int c3 = a1 * b2 - a2 * b1;
        return VectorLength(c1, c2, c3);
    }
//        public static void main(String[] args) {
//        System.out.println(VectorLengthofTwo(1, 1, 1,1,1,1));//0
//        System.out.println(VectorLengthofTwo(1, 2, 3,4,5,6));//7,35
//        System.out.println(VectorLengthofTwo(-10, 0, 5,9,8,7));//145,7
//        System.out.println(VectorLengthofTwo(0, 0, 0,0,0,0));//0
//    }
}