package school.a3branchingloops;

//test input: 780123 3540 output: validní
//test input: 850125 4420 output: neni
//test input: 770406 3345 output: validni
// test s nulou na zacatku

public class U15RcValidation {
    public static void main(String [] args){
    
    //input
    int c1 = 770406;
    int c2 = 3345;
   
    //proccess  
    //(1) vypočti zbytek po dělení prvních devíti číslic a čísla 11; 
    //(2) je-li zbytek 10, poslední číslice musí být 0; 
    //(3) jinak je poslední číslice rovna zbytku.
    int digits9 = c1*1000+c2/10;
    int z = digits9%11;
    int last = c2%10;
    boolean isvalid = false;
    if (z==10 && last==0){
        isvalid = true;
    }else if (last==z){
        isvalid=true;
    }
    System.out.println("Rodné číslo "+(isvalid? "je" : "není")+" validní");
    
    //long a = (long)c1*10000+c2;
    //System.out.println(a); //preteceni int
    }
}
