package school.a3branchingloops;

public class U32_35Stars {
    public static void main(String[] args) {
        //line
        int count = 10;
        for(int i = 0; i < count; i++) {
            System.out.print("* ");
        }
        System.out.println("");
        
        //rectangle
        System.out.println("");
        int y = 8;
        int x = 4;
        for(int i = 0; i < y; i++) {
            for(int j = 0; j < x; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
        
        //triangle 90 degrees
        System.out.println("");
        //i je cislo radku 
        int n = 8;
        for(int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        
        //triangle
        System.out.println("");
        //i je cislo radku 
        int v = 5;
        for(int i = 1; i <= v; i++) { //v radku
            for (int j = 0; j < (v-i); j++) { //na radku v-i mezer
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) { //na radku i hvezdicek
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
