
package school.a6array;

import java.util.Scanner;


public class LoadPrintArrayDynamic {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int size = 0;
        int[] numbers = new int[1];
        System.out.println("Zadej nezaporne cislo, ktere chces ulozit do pole (pokud chces zadavani ukoncit zadej zaporne cislo");
        
        
        while((number=sc.nextInt()) >= 0)
        {
            //zvetsovani o vzdy jeden prvek
            /*if(size == numbers.length)
            {
                int[] b = new int[numbers.length+1];
                System.arraycopy(numbers, 0, b, 0, numbers.length);
                numbers = b; //aktualizace reference na pole numbers
            }
            */

            //exponencialni zvetsovani
            if(size == numbers.length)
            {
                int[] b = new int[numbers.length*2];
                System.arraycopy(numbers, 0, b, 0, numbers.length);
                numbers = b; //aktualizace reference na pole numbers
            }
            
            numbers[size] = number;
            size++;
                
            
        }
        
        //upraveni velikosti pole
        int[] vyslednePole = new int[size];
        System.arraycopy(numbers, 0, vyslednePole, 0, size);
        
        
        //vypis pomoci nasi metody printArray()
        school.a6array.LoadPrintArray.printArray(vyslednePole);
    }
}
