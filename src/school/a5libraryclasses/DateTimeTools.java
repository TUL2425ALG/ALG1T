package school.a5libraryclasses;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author Honza
 */

public class DateTimeTools {
    int den,mesic,rok,K,J;
    String day;
    public String den_tydne(int den,int mesic,int rok){
        if (mesic>12 || mesic<0){
            return "spatne zadany mesic";
        }
            if(mesic%2==1 && den>30 ||mesic==2 && den>29 && rok%4!=0 && rok%100==0 && rok%400!=0 ||mesic==2 && den>28||den>31||den<1){
                return "spatne zadany den";
            }
        this.den =den;
        
        if(mesic>3){
            this.mesic =mesic;
            this.K =rok%100;
        }else{
            this.mesic =mesic+12;
            this.K =(rok%100)-1;
        }
        this.rok=rok;
        this.J =rok/100;
        int h = (this.den+(13*(this.mesic+1)/5)+this.K+this.K/4+this.J/4-2*this.J)%7;
        h=((h+5)%7)+1;
        switch (h) {
            case 1:
                this.day="Pondeli";
                break;
            case 2:
                this.day="Utery";
                break;
            case 3:
                this.day="Streda";
                break;
            case 4:
                this.day="Ctvrtek";
                break;
            case 5:
                this.day="Patek";
                break;
            case 6:
                this.day="Sobota";
                break;
            case 7:
                this.day="Nedele";
                break;
        }
        return this.day;
    }

    public static void main(String[] args) {
      DateTimeTools test=new DateTimeTools();
      Scanner sc =new Scanner(System.in);
      boolean pokracovat=true;
      while(pokracovat){
      System.out.println("Napiste den pr 11");
      int den=sc.nextInt();
      System.out.println("Napiste mesic pr 1");
      int mesic=sc.nextInt();
      System.out.println("Napiste rok pr 1981");
      int rok=sc.nextInt();
      System.out.println(test.den_tydne(den,mesic,rok));
      System.out.println("Chcete pokracovat? Y/N");
       if(sc.next().toUpperCase().charAt(0)!='Y'){
           pokracovat=false;
       }
      }
    }
}

