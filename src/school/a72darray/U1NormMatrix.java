package school.a72darray;

public class U1NormMatrix {

    public static void main(String[] args) {
        int[][] a = {{1, -15, 3},
        {6, -1, 3}};

        //hledam max abs
        int maxAbs = -1;
        int numberAbs;
        for (int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length; j++){
                numberAbs = Math.abs(a[i][j]);
                if (numberAbs > maxAbs){
                   maxAbs = numberAbs;
               }
            }
        }
        
        //nrmuju matici
        int[][] normed = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length; j++){
                normed[i][j] = a[i][j]/maxAbs;
            }
        }
        
        //vypsat normovanou matici
        for (int i = 0; i < normed.length; i++) {
            for(int j = 0; j < normed[i].length; j++){
                System.out.format(" %4d ", normed[i][j]);
            }
            System.out.println("");
        }
    }
}
