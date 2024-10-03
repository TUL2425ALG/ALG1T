package school.a2numbers;

import school.a1introduction.ToSeconds;

//test in: 13:20:36; 13:50:36 out: 50
//test in: 13:20:36; 13:57:36 out: 40,54  (jel méne)
//test in: 13:20:36; 13:27:36 out: 164,29 (jel více)
public class U09CarSpeed {
    public static void main(String[] args) {
        //Input
        final int MAX_SPEED = 50; //nemuseli byt konstanty, mohli by se taky zadavat uzivatelem 
        final int TRACK_IN_KM = 25; //nemuseli byt konstanty, mohli by se taky zadavat uzivatelem
        
        int hour1 = 13;
        int minute1 = 20;
        int second1 = 36;
        
        int hour2 = 13;
        int minute2 = 50;
        int second2 = 36;
        
        //Proccesing
        
        //final int SEC_IN_HOUR = 3600;
        //final int SEC_IN_MIN = 60;
        
        //zjistit rozdil casu v sekundach 
        //int casVjezd = (hour1 * SEC_IN_HOUR) + (minute1 * SEC_IN_MIN) + second1;
        //int casVyjezd = (hour2 * SEC_IN_HOUR) + (minute2 * SEC_IN_MIN) + second2;
        int casVjezd = ToSeconds.convertToSeconds(hour1, minute1, second1); //volani metody
        int casVyjezd = ToSeconds.convertToSeconds(hour2, minute2, second2);
        
        int CasCelkem = casVyjezd - casVjezd;
        
        //vypocitat avg rychlost v km/s
        double avgRychlostKMS = TRACK_IN_KM / (double)CasCelkem;
        //prevod na km/h
        double avgRychlostKMH = avgRychlostKMS * 3600;
        //o kolik prekrocil max rychlost
        double prekroceniRychlostiO = avgRychlostKMH - MAX_SPEED;
        boolean prekroceniRychlosti = prekroceniRychlostiO > 0; 
        
        //Output
        if (prekroceniRychlosti){
            System.out.format("Řidič vozidla překročil rychlost v našem úseku o: %.2f km/h. \n",prekroceniRychlostiO);
        }
        else{
            System.out.format("Řidič vozidla jel podle předpisů a nepřekročil rychlost v našem úseku a jel: %.2f km/h. \n",avgRychlostKMH);
        }
    }
}
