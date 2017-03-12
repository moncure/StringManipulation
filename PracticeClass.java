
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Amy Moncure
 */


public class PracticeClass {
    


public String replace(String str,char oldchar, char newchar){
    
    //CONVERT A STRING TO A CHARACTER ARRAY
    char[] charArray = str.toCharArray();
    int length = charArray.length;
    
    for(int i = 0; i<length; i++)
        if (charArray[i]==oldchar)
            charArray[i] = newchar;
         
    //CONVERT CHARACTER ARRAY BACK TO A STRING
    String s = new String(charArray);
    
    
    return s;
    
    
    
}

private boolean replaceTest(){
    boolean case1 = replace("HelloWorld",'l','m').equals("HemmoWormd");
    
    boolean case2 = replace("",'a','b').equals("");
    boolean case3 = replace("Hello",'o','o').equals("Hello");
    boolean case4 = replace("Hello",'H','M').equals("Mello");
    boolean case5 = replace("Hello",'h','M').equals("Hello");
    
    return (case1 && case2 && case3 && case4 && case5);
}

public boolean sleepIn(boolean weekday, boolean vacation) {
/**
 * This method determines when to sleepIn
 * @param weekday  This variable is true if it is a weekday (M,T,W,R,F) or false if it is the weekend (Sat, Sun)
 * @param vacation. This variable is true if you are on vacation else it is false.
 * @return boolean. This returns true if it is NOT a weekday or you are on vacation.
 */

    return (!weekday || vacation);
      

}//end sleepIn

    private boolean sleepInTest(){
    /**
    * This method is the test method for sleepIn
    * @return boolean true if sleepIn works for all cases
    * 
    */
      boolean weekday;
      boolean vacation;

      weekday=false;  vacation = true;
      boolean case1 =sleepIn(weekday,vacation);   //It is the weekend and on vacay; return true;
      
      weekday=false;  vacation = false;
      boolean case2 =sleepIn(weekday,vacation);  //It is the weekend; return true
      
      weekday=true; vacation=true;  //You are on vacation; return true;
      boolean case3 =sleepIn(weekday,vacation);
      
      weekday=true; vacation=false;
      boolean case4=sleepIn(weekday,vacation);  //Is is a weekday and you are not on vacay; return false

      return(case1 && case2 && case3 && !case4);
    }//end sleepInTester

    
    public int diff21(int n){
        /**This method returns the absolute value of a number and 21.  
         * However, if the number is originally more than 21, return double the absolute value
         * @param int a number
         * @return int;  The absolute value or double the absolute value
         */
        
        if(n <=21)
            return Math.abs(n-21);
        else return 2*Math.abs(n-21);
    }//end diff21
    
    private boolean diff21Test(){
       boolean case1 =(21==diff21(0));  //returns 21;
       boolean case2 = (2==diff21(19));  //returns 2;
       boolean case3 = (11== diff21(10));  //returns 11
       boolean case4 = (0==diff21(21));  //returns 0;
       boolean case5 = (26==  diff21(-5));  //returns 26
       boolean case6 = (2== diff21(22));  //returns double of 1 which is 2
       boolean case7= (18== diff21(30));  //returns double of 9 which is 18
    
       return(case1 && case2 && case3 && case4 && case5 && case6&& case7);
       
    }//end diff2Test
    
    public String missingChar(String str, int n){
        /**
         * Given a non-empty string and an int n, return a new string where the 
         * char at index n has been removed. 
         * The value of n will be a valid index of a char in the original string 
         * (i.e. n will be in the range 0..str.length()-1 inclusive).
         */
        
        //boundary.  Remove the first letter
        if(n==0)
            return str.substring(1);
        
        //boundary.  Remove the last letter
        else if(n==(str.length()-1))
            return str.substring(0,n);
        //concatenate the two strings without the index character
        else return(str.substring(0,n).concat(str.substring(n+1)));
        
        
                
        
    }//end missingChar
    
    private boolean missingCharTest(){
        
        //missingChar assumes a valid index
       boolean case1 =  missingChar("kitten", 1).equals("ktten");
       boolean case2 =  missingChar("kitten", 0).equals("itten"); //boundary
       boolean case3 =  missingChar("kitten", 4).equals("kittn");
       boolean case4 =  missingChar("kitten", 5).equals("kitte"); //boundary
       
       if (!case1)
           System.out.println("broken case1");
       if (!case2)
           System.out.println("broken case2");
       if (!case3)
           System.out.println("broken case3");
       if(!case4)
           System.out.println("broken case4");
        
       return (case1 && case2 && case3 && case4);
        
    }//end missingCharTest()
    
    
    public String backAround(String str){
        /**
         * Given a string, take the last char and return a new string with the 
         * last char added at the front and back, so "cat" yields "tcatt". 
         * The original string will be length 1 or more.
         */
        
        char last = str.charAt(str.length()-1) ;
        return (last + str + last);
        
    }//end backAround
            
    
    private boolean backAroundTest(){
        boolean case1 =backAround("cat").equals("tcatt");
        boolean case2 =backAround("Hello").equals("oHelloo");
        boolean case3 =backAround("a").equals("aaa");
        
        return(case1 && case2 && case3);
    }//end backAroundTest
            
    public boolean nearHundred(int n){
        /**
         * 
         */
        return (  (Math.abs(100-n) <= 10)  ||  (Math.abs(200-n)<=10)  );
    }
    
    private boolean nearHundredTest(){
        /** 
         * This method tests whether a number is 10 away from 100 or 200
         */
            boolean case1=!nearHundred(89);   //89 returns false
            boolean case2=nearHundred(90);   //90 returns true
            boolean case3=nearHundred(91);   //91 returns true
            boolean case4=nearHundred(99);   //99 returns true
            boolean case5=nearHundred(100);  //100 returns true
            boolean case6=nearHundred(109);   //109 returns true
            boolean case7=nearHundred(110);  //110 returns true
            boolean case8=!nearHundred(111);   //111 returns false
            boolean case9=!nearHundred(189);   //189 returns false
            boolean case10=nearHundred(190);   //190 returns true
            boolean case11=nearHundred(191);   //191 returns true
            boolean case12=nearHundred(200);   //200 returns true
            boolean case13=nearHundred(209);   //209 returns true
            boolean case14=nearHundred(210);   //210 returns true
            boolean case15=!nearHundred(211);   //211 returns false
        
        return(case1 && case2 && case3 && case4 && case5 &&
               case6 && case7 && case8 && case9 && case10 &&
               case11 && case12 && case13 && case14 && case15);
        
    }//end nearHundredTest

    
    public boolean startHi(String str){
        
        return "hi".equalsIgnoreCase(str.substring(0,2));
        
    }//end startHi
    
    private boolean startHiTest(){
        
        boolean case1= startHi("hi there"); //true
        boolean case2 =startHi("hi");   //true
        boolean case3 =!startHi("hello hi");   //startHi returns false
        
        return(case1 && case2 && case3);
                
        
    }//end startHiTest()
    
    public boolean hasTeen(int a, int b, int c) {
        /**
         * We'll say that a number is "teen" if it is in the range 13..19 inclusive. 
         * Given 3 int values, return true if 1 or more of them are teen.
         * 
         */
        
        
        
        return (hasOneTeen(a)||hasOneTeen(b) || hasOneTeen(c));
                 
    }//end hasTeen
    
    private boolean hasOneTeen(int x){
            return (inRange(x,13,19));
        }
    
    public boolean hasTeenTest(){
        boolean case1 = hasTeen(13, 20, 10); //true
        boolean case2 = hasTeen(20, 19, 10); //true
        boolean case3 = hasTeen(20, 10, 13); //true
        boolean case4 = !hasTeen(10,10,12); //false
        boolean case5 = hasTeen(13,15,19);  //true
        boolean case6 = !hasTeen(20,21,22);  //false
        
        return(case1 && case2 && case3 && case4 && case5 && case6);
                
    }//end hasTeenTest
    
    public boolean mixStart(String str){
       /**
        * Return true if the given string begins with "mix", except the 'm' 
        * can be anything, so "pix", "9ix" .. all count.
        */ 
       
       return "ix".equals(str.substring(1,3));
    }//end mixStart
    
    private boolean mixStartTest(){
        boolean case1 = mixStart("mix snacks") //true
        boolean case2 = mixStart("pix snacks"); //true
        boolean case3 = !mixStart("piz snacks");  //false
        
        return (case1 && case2 && case3);
    }//end mixStartTest()
    
    public int close10(int a, int b){
        /**
         * Given 2 int values, return whichever value is nearest to the value 10,
         * or return 0 in the event of a tie. 
         * Note that Math.abs(n) returns the absolute value of a number.

         */
        
       int temp_a = Math.abs(10-a);
       int temp_b = Math.abs(10-b);
       
       if (temp_a == temp_b)     //the numbers are the same distance to 10
           return 0;
       else if(temp_a < temp_b)  //a is closer to 10
           return a;
       else return b;            //b is closer to 10
        
        
        
        
    }//end close10
    
    private boolean close10Test(){
        boolean case1 = (8 == close10(8, 13));
        boolean case2 = (8== close10(13, 8)); 
        boolean case3 = (0 == close10(13, 7));
        boolean case4 = (0 == close10(4,4));
        boolean case5 = (0 == close10(-5,25));
        boolean case6 = (-5 == close10(-5,26));
        
        if (!case1) System.out.println("Broken case1");
        if (!case2) System.out.println("Broken case2");
        if (!case3) System.out.println("Broken case3");
        if (!case4) System.out.println("Broken case4");
        if (!case5) System.out.println("Broken case5");
        if (!case6) System.out.println("Broken case6");

        return (case1 && case2 && case3 && case4 && case5 && case6);
    }//end close10Test
    
    
    public boolean stringE(String str){
        /**
         * Return true if the given string contains between 1 and 3 'e' chars.

         */
        
        int originalLength = str.length();
        str = str.replace("e", "");  //remove all occurrences of the char "e"
        int newLength = str.length(); //what is the length of the str with "e" removed
        
        int lengthDifference = originalLength - newLength;
        
        if(lengthDifference >=1 && lengthDifference <=3 )
            return true;
        else return false;
                    
                  
    }//end StringE
    
    private boolean stringETest(){
        boolean case1 = stringE("Hello");  //true
        boolean case2 = stringE("Heelle"); //true
        boolean case3 = !stringE("Heelele"); //false
        
        return (case1 && case2 && case3);
    }//end StringETest
    
    
    public String everyNth(String str, int n){
        /**
         * Given a non-empty string and an int N, return the string made starting 
         * with char 0, and then every Nth char of the string. 
         * So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.
         * 
         */
        
        int length = str.length();
        
        String temp = new String("" + str.charAt(0));
      
        StringBuilder s = new StringBuilder(temp);
        
        int index = n;
        
        while(index <= length-1){
            String t = new String("" + str.charAt(index));
            s.append(t);
            index = index + n;
        }
        
        return s.toString();
       
            
        
        
    }//end everyNth
    
    private boolean everyNthTest(){
        boolean case1 = everyNth("Miracle", 2).equals("Mrce");
        boolean case2 = everyNth("abcdefg", 2).equals("aceg");
        boolean case3 = everyNth("abcdefg", 3).equals("adg");
        
        return (case1 && case2 && case3);
    }//end everyNthTest
    
    
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile){
        /**
         * We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.

         */
        
        return((aSmile && bSmile) || (!aSmile && !bSmile));
        
    }//end monkeyTrouble
    
    private boolean monkeyTroubleTest() {
        boolean case1 = monkeyTrouble(true, true); // → true
        boolean case2 = monkeyTrouble(false, false); // → true
        boolean case3 = !monkeyTrouble(true, false); // → false
       
        
        return (case1 && case2 && case3);
    }//end monkeyTroubleTest
    
    
    public boolean parrotTrouble(boolean talking, int hour){
        /**
         * We have a loud talking parrot. 
         * The "hour" parameter is the current hour time in the 
         * range 0..23. We are in trouble if the parrot is talking 
         * and the hour is before 7 or after 20. 
         * Return true if we are in trouble.

         */
        
        if(   (talking && hour < 7)  || (talking &&  hour > 20))
            return true;
        else return false;
        
    }//end parrotTrouble
    
    private boolean parrotTroubleTest(){
        boolean case1 =parrotTrouble(true, 6); //true
        boolean case2 = !parrotTrouble(true, 7);// → false
        boolean case3 = !parrotTrouble(false, 6); // → false
        boolean case4 = !parrotTrouble(true, 20); //false
        boolean case5 = parrotTrouble(true,21); //true        
        
        return (case1 && case2 && case3 && case4 && case5);

    }//end parrotTroubleTest
    
    public boolean posNeg(int a, int b, boolean negative){
        /**
         * Given 2 int values, return true if one is negative and one is positive. 
         * Except if the parameter "negative" is true, then return true only 
         * if both are negative.

         */
                             //both negative                       one negative
        return ((negative && a < 0  && b < 0) || (!negative && (a < 0 || b < 0) ));
               
    }//end posNeg
    
    private boolean posNegTest(){
        boolean case1 = posNeg(1, -1, false); //true
        boolean case2 = posNeg(-1, 1, false); // → true
        boolean case3 = posNeg(-4, -5, true);  //true
        boolean case4 = !posNeg(-4,5,true); //false
        boolean case5 = !posNeg(3,2,true); //false
        boolean case6 = !posNeg(3,2, false); //false
        
        return (case1 && case2 && case3 && case4 && case5 && case6);
        
                
        
    }//end posNegTest
    
    public String frontBack(String str){
        /**
         * Given a string, return a new string where the first and last chars 
         * have been exchanged.
         */
        
        int length = str.length();
        char[] ch=str.toCharArray();
        char[] newch = new char[length];
      
        
        for(int i=0;i<ch.length;i++) { 
             newch[i] = ch[length - 1 - i];    
        }
        
        return (new String(newch));
        
        
    }//end front back
    
    private boolean frontBackTest(){
        boolean case1 = frontBack("code").equals("edoc");
        boolean case2 = frontBack("a").equals("a");
        boolean case3 = frontBack("ab").equals("ba");
        
        
        return (case1 && case2 && case3);
        
    }//end frontBackTest
    
    public boolean or35(int n){
        /**
         * Return true if the given non-negative number is a multiple of 3 or 
         * a multiple of 5. Use the % "mod" operator 
         */
        
        return (   (  (n % 3)== 0) || (  (n %5) == 0)    );
        
    }//end or35
    
    private boolean or35Test(){
        boolean case1 = or35(3);  //true
        boolean case2 = or35(10); // → true
        boolean case3 = !or35(8); // → false
        
        return (case1 && case2 && case3);
    }//or35Test
    
    public boolean icyHot(int a, int b){
        /**
         * Given two temperatures, return true if one is less 
         * than 0 and the other is greater than 100
         */
        return (  (a<0) || b<0) && (a>100 || b>100));
    }//end icyHot
    
    private boolean icyHotTest(){
        boolean case1 = icyHot(120, -1); // → true
        boolean case2 = icyHot(-1, 120); // → true
        boolean case3 = !icyHot(2, 120); // → false
        
        return (case1 && case2 && case3);

        
    }//end icyHotTest()
    
    public boolean loneTeen(int a, int b){
        
        //the ^ XOR operator only returns true if 
        //only A is true or 
        //if only B is true; 
        //If both are true return false; If both are false return false
        return(hasOneTeen(a) ^ hasOneTeen(b));
        
        
    }//end loneTeen
    
    private boolean loneTeenTest(){
        boolean case1 =loneTeen(13, 99); // → true
        boolean case2 =loneTeen(21, 19); // → true
        boolean case3 =!loneTeen(13, 13); // → false
        boolean case4 =!loneTeen(12,20); //false
        
        return (case1 && case2 && case3 && case4);
        
    }//end loneTeenTest()
    
    public String startOz(String str){
        /**
         * Given a string, return a string made of the first 2 chars (if present), 
         * however include first char only if it is 'o' and include the second 
         * only if it is 'z', so "ozymandias" yields "oz".
         */
        
        int length = str.length();
         StringBuilder s = new StringBuilder("");
        if(length >= 1 && str.charAt(0) == 'o')
            s.append("o");
        
        if(length >= 2 && str.charAt(1) == 'z')
            s.append("z");
     
        return s.toString();
       
    }//end startOz
    
    private boolean startOzTest(){
        boolean case1 = startOz("ozymandias").equals("oz");
        boolean case2 = startOz("bzoo").equals("z");
        boolean case3 = startOz("oxx").equals("o");
        boolean case4 = startOz("Trev").equals("");
        boolean case5 = startOz("Y").equals("");
        
        return (case1 && case2 && case3 && case4 && case5);
        
    }//end startOzTest()
    private boolean inRange(int a, int min, int max){
        return ( (a>=min)&&(a<=max)  );
    }
            
    
    public boolean in3050(int a, int b){
        return( (  inRange(a,30,40) && inRange(b,30,40)  ) ||
                (  inRange(a,40,50) && inRange(b,40,50)  )   );
    }//end in3050
    
    private boolean in3050Test(){
        boolean case1 = in3050(30, 31); // → true
        boolean case2 = !in3050(30, 41); // → false
        boolean case3 = in3050(40, 50); // → true
        boolean case4 = !in3050(29,51);  //false
        
        return (case1 && case2 && case3 && case4);
        
    }//end in3050Test
    
    public boolean lastDigit(int a, int b){
        
        if (a%10 == b%10)
            return true;
        else return false;
        
        
    }//end lastDigit
    
    private boolean lastDigitTest(){
        boolean case1 = lastDigit(7, 17); // → true
        boolean case2 = !lastDigit(6, 17); // → false
        boolean case3 = lastDigit(3, 113); // → true
        boolean case4 = lastDigit(20,4000); //true
        boolean case5 = lastDigit(0,50);  //true
        boolean case6 = lastDigit(1,1201);  //true
        
        
        return (case1 && case2 && case3 && case4 && case5 && case6) ;
        
    }//end lastDigit
    
    public int sumDouble(int a, int b){
        /**
         * Given two int values, return their sum. Unless the two values are 
         * the same, then return double their sum.
         */
        
        if (a != b)
            return (a+b);
        else return (2*(a+b));
        
    }//end sumDouble
    
    private boolean sumDoubleTest(){
        boolean case1 = sumDouble(1, 2) == 3;
        boolean case2 = sumDouble(3, 2) == 5;   
        boolean case3 = sumDouble(2, 2) == 8;
        
        return (case1 && case2 && case3);
        
    }//end sumDoubleTest
    
    public boolean makes10(int a, int b){
        /**
         * Given 2 ints, a and b, return true if one if them is 10 
         * or if their sum is 10.
         */
        return (a==10 || b== 10 || (a+b)==10);
            
    }//end makes10
    
    private boolean makes10Test(){
        boolean case1 =makes10(9, 10); // → true
        boolean case2 = !makes10(9, 9); // → false
        boolean case3 = makes10(1, 9); // → true
        
        return (case1 && case2 && case3);
    }//end makes10Test
    
    
    public String notString(String str){
        /**
         * Given a string, return a new string where "not " has been
         * added to the front. 
         * However, if the string already begins with "not", 
         * return the string unchanged. Note: use .equals() to 
         * compare 2 strings.

         */
      int length = str.length();
      if (length >=3){
          if(str.substring(0,3).equals("not")){
              return str;
          }else return ("not " + str);
      }
      //String does not contain NOT bc it is too small, append and return
      return ("not " + str);
    
              
      
      
    }//end notString
    
    private boolean notStringTest(){
        boolean case1 = notString("candy").equals("not candy");
        boolean case2 = notString("x").equals("not x");
        boolean case3 = notString("not bad").equals("not bad");
        
        return (case1&& case2 && case3);
    }//end notStringTest
    
    public String front3(String str){
        /**
         * Given a string, we'll say that the front is the first 3 chars 
         * of the string. If the string length is less than 3, 
         * the front is whatever is there. 
         * Return a new string which is 3 copies of the front.

         *
        */
        int length = str.length();
        if (length >=3){
          String temp = str.substring(0,3);
          return (temp+temp+temp);
        }
        return (str+str+str);
        
    }//end front3
    
    private boolean front3Test(){
        boolean case1 = front3("Java").equals("JavJavJav");
        boolean case2 = front3("Chocolate").equals("ChoChoCho");
        boolean case3 = front3("abc").equals("abcabcabc");
        boolean case4 = front3("bo").equals("bobobo");
        
        return (case1 && case2 && case3 && case4);
        
    }//end front3Test()
    
    public String front22(String str){
        int length = str.length();
        if (length >=2)
            return (str.substring(0,2) + str + str.substring(0,2));
        return (str + str + str);
    }//end front22
    
    private boolean front22Test(){
        boolean case1 = front22("kitten").equals("kikittenki");
        boolean case2 = front22("Ha").equals("HaHaHa");
        boolean case3 = front22("abc").equals("ababcab");
        boolean case4 = front22("d").equals("ddd");
        
        return (case1 && case2 && case3 && case4);
    }//end front22Test
    
    public boolean in1020(int a, int b){
        /**
         * Given 2 int values, return true if either of them is in the 
         * range 10..20 inclusive.
         */
        return ((inRange (a,10,20)) || (inRange(b,10,20)));
        
    }//end in1020
    
    private boolean in1020Test(){
        boolean case1 = in1020(12, 99); // → true
        boolean case2 = in1020(21, 12); // → true
        boolean case3 = !in1020(8, 99); // → false
        
        return (case1 && case2 && case3);
        
    }//end in1020Test
    
    public String delDel(String str){
        int length = str.length();
           
        if (length >=4 && str.substring(1,4).equals("del")) 
             return (str.substring(0,1) + str.substring(4));
        
        return str;
        
    }//end delDel
    
    private boolean delDelTest(){
        boolean case1 = delDel("adelbc").equals("abc");
        boolean case2 = delDel("adelHello").equals("aHello");
        boolean case3 = delDel("adedbc").equals("adedbc");
        
        return (case1 && case2 && case3);
        
    }//end delDelTest
            
    public int intMax(int a, int b, int c){
        /**
         * Given three int values, a b c, return the largest.
         */
        return intMax( intMax(a,b), c);
        
    }//end intMax
    
    private int intMax(int a, int b){
        /**
         * Given two int values, a b, return the largest.
         */
        if (a >=b) return a;
        return b;
    }//end intMax
    
    private boolean intMaxTest(){
        boolean case1 = intMax(1, 2, 3)== 3;
        boolean case2 = intMax(1, 3, 2) == 3;
        boolean case3 = intMax(3, 2, 1) ==3;
        boolean case4 = intMax(3,1,1) == 3;
        boolean case5 = intMax(1,3,3) == 3;
        
        return (case1 && case2 && case3 && case4 && case5);
        
    }//end intMaxTest
    
    public int max1020(int a, int b){
        /**
         * Given 2 positive int values, return the larger value that is 
         * in the range 10..20 inclusive, or return 0 if neither is in 
         * that range.
         */
        if( inRange(a,10,20) && inRange(b,10,20))
            return intMax(a,b);
        else if (inRange(a,10,20))
            return a;
        else if (inRange(b,10,20))
            return b;
        else return 0;
        
        
    }//end max1020
    
    private boolean max1020Test(){
        boolean case1 = max1020(11, 19) ==19;
        boolean case2 = max1020(19, 11) == 19;
        boolean case3 = max1020(11, 9) == 11;
        boolean case4 = max1020(4, 9) == 0;
        boolean case5 = max1020(10,21) == 10;
        
        
        return (case1 && case2 && case3 && case4 && case5);
        
    }//end max1020Test()
            
   public String endUp(String str){
       int length = str.length();
       final int UPPERLAST = 3;
       
       if (length >=  UPPERLAST)
           return (str.substring(0,length - UPPERLAST) + 
                   str.substring(length - UPPERLAST).toUpperCase());
       return str.toUpperCase(); //the string length is less than 3
   }//end endUp
   
   private boolean endUpTest(){
       boolean case1 = endUp("Hello").equals("HeLLO");
       boolean case2 = endUp("hi there").equals("hi thERE");
       boolean case3 = endUp("hi").equals("HI");
       
       return (case1 && case2 && case3);
       
   }//end endUpTest
           
   
   public String helloName(String name){
       /**
        * Given a string name, e.g. "Bob", return a greeting of the 
        * form "Hello Bob!".
        */
       return ("Hello " + name + "!");
   }//end helloName
   
   private boolean helloNameTest(){
       boolean case1 = helloName("Bob").equals("Hello Bob!");
       boolean case2 = helloName("Alice").equals("Hello Alice!");
       boolean case3 = helloName("X").equals("Hello X!");
       
       return (case1 && case2 && case3);
       
   }//end helloNameTest
   
   public String makeOutWord(String out, String word) {
       return (out.substring(0,2) + word + out.substring(2));
   }//end makeOutWord
   
   private boolean makeOutWordTest(){
       boolean case1 = makeOutWord("<<>>", "Yay").equals("<<Yay>>");
       boolean case2 = makeOutWord("<<>>", "WooHoo").equals("<<WooHoo>>");
       boolean case3 = makeOutWord("[[]]", "word").equals("[[word]]");
       
       return (case1 && case2 && case3);
   }//end makeOutWord()
    
   public String firstHalf(String str){
       /**
        * Given a string of even length, return the first half. 
        * So the string "WooHoo" yields "Woo".
        */
       int length = str.length();
       return str.substring(0, (length/2));
   }
   
   private boolean firstHalfTest(){
       boolean case1 = firstHalf("WooHoo").equals("Woo");
       boolean case2 = firstHalf("HelloThere").equals("Hello");
       boolean case3 = firstHalf("abcdef").equals("abc");
       
       return (case1 && case2 && case3);
   }//end firstHalfTest()
   
   public String nonStart(String a, String b) {
       /**
        * Given 2 strings, return their concatenation, except omit the first 
        * char of each. The strings will be at least length 1.
        */
       return (a.substring(1) + b.substring(1));
       
   }
   
   private boolean nonStartTest(){
       boolean case1 = nonStart("Hello", "There").equals("ellohere");
       boolean case2 = nonStart("java", "code").equals("avaode");
       boolean case3 = nonStart("shotl", "java").equals("hotlava");
       
       return (case1 && case2 && case3);
   }
   
   public String theEnd(String str, boolean front){
       /**
        * Given a string, return a string length 1 from its front, unless 
        * front is false, in which case return a string length 1 from its 
        * back. The string will be non-empty.
        */
       
       
       if (front)
           return str.substring(0,1);
       return str.substring(str.length()-1);
   }
   
   private boolean theEndTest(){
       boolean case1 = theEnd("Hello", true).equals("H");
       boolean case2 = theEnd("Hello", false).equals("o");
       boolean case3 = theEnd("oh", true).equals("o");
       
       return (case1 && case2 && case3);
   }
   
   public boolean endsLy(String str){
       /**
        * Given a string, return true if it ends in "ly".
        */
       
       int length = str.length();
       
       if (length <2)
           return false;
       if (str.substring(length-2).equals("ly"))
           return true;
       return false;
                  
       
   }
   
   private boolean endsLyTest(){
       boolean case1 = endsLy("oddly"); //true
       boolean case2 = !endsLy("y"); // → false
       boolean case3 = !endsLy("oddy");// → false
       boolean case4 = endsLy("ly"); //true
       boolean case5 = endsLy("ily"); //true
       boolean case6 = !endsLy("bob"); //false
       boolean case7 = !endsLy("it"); //false
       
       return (case1 && case2 && case3 && case4 && case5 && case6 && case7);
   }
   
   public String middleThree(String str) {
       /**
        * Given a string of odd length, return the string length 3 from its middle,
        * so "Candy" yields "and". The string length will be at least 3.
        */
       
       int length = str.length();
       
       if (length < 3)
           return str;
       return (str.substring(length/2 -1 ,length/2 + 2 ));
           
   }
   
   private boolean middleThreeTest(){
       boolean case1 = middleThree("Candy").equals("and");
       boolean case2 = middleThree("and").equals("and");
       boolean case3 = middleThree("solving").equals("lvi");
       
       return (case1 && case2 && case3);
   }
   
   public String lastChars(String a, String b) {
       /**
        * Given 2 strings, a and b, return a new string made of the first char 
        * of a and the last char of b, so "yo" and "java" yields "ya". 
        * If either string is length 0, use '@' for its missing char.
        */
       
       int lengthA = a.length();
       int lengthB = b.length();
       
       String strA;
       String strB;
       
       if (lengthA == 0 )
           strA = "@";
       else strA = a.substring(0,1);
       
       if (lengthB == 0)
           strB = "@";
       else strB = b.substring(lengthB - 1);
       
       return (strA + strB);
       
       
   }//end lastChars
   
   private boolean lastCharsTest(){
       boolean case1 = lastChars("last", "chars").equals("ls");
       boolean case2 = lastChars("yo", "java").equals("ya");
       boolean case3 = lastChars("hi", "").equals("h@");
       boolean case4 = lastChars("","").equals("@@");
       boolean case5 = lastChars("","friend").equals("@d");
       boolean case6 = lastChars("a","b").equals("ab");
       
       return (case1 && case2 && case3 && case4 && case5 && case6);
       
   }
   
   public String seeColor(String str){
       /**
        * Given a string, if the string begins with "red" or "blue" return that 
        * color string, otherwise return the empty string.
        */
       
       int length = str.length();
       
       if (length >=3 && str.substring(0,3).equals("red"))
            return "red";
       if (length >=4 && str.substring(0,4).equals("blue"))
           return "blue";
       return "";
            
   }
   
   private boolean seeColorTest() {
       boolean case1 = seeColor("redxx").equals("red");
       boolean case2 = seeColor("xxred").equals("");
       boolean case3 = seeColor("blueTimes").equals("blue");
       
       return (case1 && case2 && case3);
   }
   
   public String doubleChar(String str){
       /**
        * Given a string, return a string where for every char in the original, 
        * there are two chars.
        */
       int length = str.length();
       String doubleIt = ""; 
       
       for(int i = 0; i < length; i++)
           doubleIt = doubleIt + str.substring(i,i+1) + str.substring(i,i+1);
       
       //System.out.println(doubleIt);
       if(length != 0)
           return doubleIt;
       return str;
       
           
   }
   
   private boolean doubleCharTest(){
       boolean case1 = doubleChar("The").equals("TThhee");
       boolean case2 = doubleChar("AAbb").equals("AAAAbbbb");
       boolean case3 = doubleChar("Hi-There").equals("HHii--TThheerree");
       
       return (case1 && case2 && case3);
   }
   
   public int countCode(String str){
        /**
         * Return the number of times that the string "code" appears anywhere in 
         * the given string, except we'll accept any letter for the 'd', so "cope" 
         * and "cooe" count.
         */
   
        int length = str.length();
        final int FOUR = 4;  //"code" is a four letter word
        int count = 0;
        
        for (int i=0; i< length; i++)
            if(str.substring(i,i+1).equals("c"))
                if (i+FOUR <=length)
                    if (str.substring(i+1,i+2).equals("o") && str.substring(i+3,i+4).equals("e"))
                        count++;
        
        return count;        
        
   }//end codeCount
   
   private boolean countCodeTest(){
       boolean case1 = countCode("aaacodebbb") ==1;
       boolean case2 = countCode("codexxcode") == 2;
       boolean case3 = countCode("cozexxcope") == 2;
       boolean case4 = countCode("abc") == 0;
       boolean case5 = countCode("helloco") == 0;
       
       return (case1 && case2 && case3 && case4 && case5);
       
   }//end codeCountTest
   
   public boolean bobThere(String str){
       /**
        * Return true if the given string contains a "bob" string,
        * but where the middle 'o' char can be any char.

        */
       
       boolean found = false;
       int length = str.length();
       final int WORDLENGTH = 3;
       
       for (int i = 0; i<length; i++)
           if (str.substring(i,i+1).equals("b") && (i+WORDLENGTH <=length) &&
              str.substring(i+2,i+3).equals("b"))
               found = true;
       
       return found;
      
   }
   
   private boolean bobThereTest(){
       boolean case1 = bobThere("abcbob");// → true
       boolean case2 = bobThere("b9b"); // → true
       boolean case3 = !bobThere("bac"); // → false
       boolean case4 = !bobThere(""); //false
       boolean case5 = !bobThere("hi");//false
       boolean case6 = !bobThere("hibo");
       
       return (case1 && case2 && case3 && case4 && case5 && case6);
   }
   
   public String repeatEnd(String str, int n){
       /*
       *Given a string and an int n, return a string made of n repetitions 
       *of the last n characters of the string. You may assume that n is 
       *between 0 and the length of the string, inclusive.

       */
       
       String repeated = "";
       int length = str.length();
       
       for(int i = 0; i<n; i++)
           repeated = repeated + str.substring(length-n);
       
       return repeated;
               
   }
   
   private boolean repeatEndTest(){
       boolean case1 = repeatEnd("Hello", 3).equals("llollollo");
       boolean case2 = repeatEnd("Hello", 2).equals("lolo");
       boolean case3 = repeatEnd("Hello", 1).equals("o");
       
       return (case1 && case2 && case3);
       
   }
   
   public boolean prefixAgain(String str, int n){
       /**
        * Given a string, consider the prefix string made of the first N chars
        * of the string. Does that prefix string appear somewhere else in the 
        * string? Assume that the string is not empty and that N is in the 
        * range 1..str.length().
        */
       
       int length = str.length();
       boolean found = false;
       String prefix = str.substring(0,n);
     
       
       for (int i = 1; i<length; i++)
           if (i+n <= length)
               if (prefix.equals(str.substring(i,i+n)))
                   found = true;
                 
       return found;
       
        
   }
   
   private boolean prefixAgainTest(){
       boolean case1 = prefixAgain("abXYabc", 1); // → true
       boolean case2 = prefixAgain("abXYabc", 2); //→ true
       boolean case3 = !prefixAgain("abXYabc", 3);// → false
               
       return (case1 && case2 && case3);
               
   }
   
   public boolean cigarParty(int cigars, boolean isWeekend){
       /**
        * When squirrels get together for a party, they like to have cigars. 
        * A squirrel party is successful when the number of cigars is between 
        * 40 and 60, inclusive. 
        * Unless it is the weekend, in which case there is no upper bound on 
        * the number of cigars. Return true if the party with the given values 
        * is successful, or false otherwise.
        */
       
       
       
       return (isWeekend || inRange(cigars,40,60));
           
           
   }
   
   private boolean cigarPartyTest(){
       boolean case1 = !cigarParty(30, false);// → false
       boolean case2 = cigarParty(50, false); // → true
       boolean case3 = cigarParty(70, true);// → true
       
       return (case1 && case2 && case3);
   }
   
   public int caughtSpeeding(int speed, boolean isBirthday){
       /**
        * 
*You are driving a little too fast, and a police officer stops you. 
* Write code to compute the result, encoded as an int value: 0=no ticket, 
* 1=small ticket, 2=big ticket. 
* If speed is 60 or less, the result is 0. 
* If speed is between 61 and 80 inclusive, the result is 1. 
* If speed is 81 or more, the result is 2. 
* Unless it is your birthday -- on that day, your speed can be 5 higher in all cases.
        */
       
       int result = 0;
       int goodSpeed = 60;
       int minSpeeding1 = 61;
       int maxSpeeding1 = 80;
       int minSpeed2 = 81;
       
       if(isBirthday) //all limits 5 miles higher
       {
           goodSpeed+=5; 
           minSpeeding1+=5;
           maxSpeeding1+=5;
           minSpeed2+=5;
       }
       if (inRange(speed, minSpeeding1,maxSpeeding1))
            result = 1; 
       
       else if (speed >=minSpeed2)
           result = 2;  
       
       return result;
               
       
   }
   
   private boolean caughtSpeedingTest(){
       boolean case1 = caughtSpeeding(60, false) == 0;
       boolean case2 = caughtSpeeding(65, false) == 1;
       boolean case3 = caughtSpeeding(65, true) == 0;
       boolean case4 = caughtSpeeding(82,false) == 2;
       boolean case5 = caughtSpeeding(82, true) == 1;
       
       return (case1 && case2 && case3 && case4 && case5);
   }
   
   public String stringTimes(String str, int n){
       /**
        * 
        *Given a string and a non-negative int n, return a larger string that is n 
        * copies of the original string.
        */
       String repeated = "";
       
       for(int i = 0; i < n; i++)
           repeated = repeated + str;
       
       return repeated;
   }
   
   private boolean stringTimesTest(){
       boolean case1 = stringTimes("Hi", 2).equals("HiHi");
       boolean case2 = stringTimes("Hi", 3).equals("HiHiHi");
       boolean case3 = stringTimes("Hi", 1).equals("Hi");
       
       return (case1 && case2 && case3);
       
   }
   
   public boolean doubleX(String str){
       /*
       
       Given a string, return true if the first instance of "x" in the string is 
       immediately followed by another "x".
       */
       
       int length = str.length();
       boolean doubleXFound = false;
       
       for(int i =0; i < length - 1; i++)
           if (str.substring(i,i+2).equals("xx"))
           {
               doubleXFound= true;
               break;
           }
       
       return doubleXFound;
       
   }
   
   private boolean doubleXTest(){
       boolean case1 = doubleX("axxbb"); // → true
       boolean case2 = !doubleX("axaxax"); // → false
       boolean case3 = doubleX("xxxxx");// → true
       
       return (case1 && case2 && case3);
       
   }
   
   
    public boolean practiceClassUnitTest() {
        /**This method executes each of the test methods in PracticeClass
         * This method returns as soon as a logic error is found.
         * Therefore it is possible that all of the methods are not tested if an error was found in a previous method.
         *@return is true if all methods work; If one method does not work return false
         *
       */
       
        //sleepInTest should return true if the method works
        //therefore !sleepInTest means the method does not work
        if (!replaceTest()){
            System.out.println("The replace method is broken");
            return false;
        }
        
        if (!sleepInTest()){
            System.out.println("The sleepIn method is broken");
            return false;
        }
        
       
        if (!diff21Test()){
            System.out.println("The diff2 method is broken");
            return false;
        }
        
        if (!nearHundredTest()){
            System.out.println("nearHundred() is broken");
            return false;
        }
       
          if (!missingCharTest()){
            System.out.println("missingCharTest() is broken");
            return false;
        }  
         
          if (!backAroundTest()){
            System.out.println("backAroundTest() is broken");
            return false;
        } 
        
           if (!startHiTest()){
            System.out.println("startHiTest() is broken");
            return false;
        } 
          
         if (!hasTeenTest()){
            System.out.println("hasTeenTest() is broken");
            return false;
        }    
           
        if (!mixStartTest()){
            System.out.println("mixStartTest() is broken");
            return false;
        }  
        
        if (!close10Test()){
            System.out.println("close10Test() is broken");
            return false;
        } 
        
        if (!stringETest()){
            System.out.println("stringETest() is broken");
            return false;
        } 
        
        if (!everyNthTest()){
            System.out.println("everyNthTest() is broken");
            return false;
        } 
        
         if (!monkeyTroubleTest()){
            System.out.println("monkeyTroubleTest() is broken");
            return false;
        } 
         
        if (!parrotTroubleTest()){
            System.out.println("parrotTroubleTest() is broken");
            return false;
        } 
        
        if (!posNegTest()){
            System.out.println("posNegTest() is broken");
            return false;
        }
         
        
        if (!frontBackTest()){
            System.out.println("frontBackTest() is broken");
            return false;
        }
        
        if (!or35Test()){
            System.out.println("or35Test() is broken");
            return false;
        }
        
        if (!icyHotTest()){
            System.out.println("icyHotTest() is broken");
            return false;
        }
        
        if (!loneTeenTest()){
            System.out.println("loneTeenTest() is broken");
            return false;
        }
        
        if (!startOzTest()){
            System.out.println("startOzTest() is broken");
            return false;
        }
        
        if (!in3050Test()){
            System.out.println("in3050Test() is broken");
            return false;
        }
        
        if (!lastDigitTest()){
            System.out.println("lastDigitTest() is broken");
            return false;
        }
        
        if (!sumDoubleTest()){
            System.out.println("sumDoubleTest() is broken");
            return false;
        }
        
        if (!makes10Test()){
            System.out.println("makes10Test() is broken");
            return false;
        }
        
        if (!notStringTest()){
            System.out.println("notStringTest() is broken");
            return false;
        }
        
        if (!front3Test()){
            System.out.println("front3Test() is broken");
            return false;
        }
        
        if (!front22Test()){
            System.out.println("front22Test() is broken");
            return false;
        }
        
        if (!in1020Test()){
            System.out.println("in1020Test() is broken");
            return false;
        }
        
        if (!delDelTest()){
            System.out.println("delDelTest() is broken");
            return false;
        }
        
        if (!intMaxTest()){
            System.out.println("intMaxTest() is broken");
            return false;
        }
        
        if (!max1020Test()){
            System.out.println("max1020Test() is broken");
            return false;
        }
        
        if (!endUpTest()){
            System.out.println("endUpTest() is broken");
            return false;
        }
        
        if (!helloNameTest()){
            System.out.println("helloNameTest() is broken");
            return false;
        }
        
        if (!makeOutWordTest()){
            System.out.println("makeOutWordTest() is broken");
            return false;
        }
        
        if (!firstHalfTest()){
            System.out.println("firstHalfTest() is broken");
            return false;
        }
        
        if (!nonStartTest()){
            System.out.println("nonStartTest() is broken");
            return false;
        }
        
        if (!theEndTest()){
            System.out.println("theEndTest() is broken");
            return false;
        }
        
        if (!endsLyTest()){
            System.out.println("endsLyTest() is broken");
            return false;
        }
        
        if (!middleThreeTest()){
            System.out.println("middleThreeTest() is broken");
            return false;
        }
        
        if (!lastCharsTest()){
            System.out.println("lastCharsTest() is broken");
            return false;
        }
        
        if (!seeColorTest()){
            System.out.println("seeColorTest() is broken");
            return false;
        }
        
        if (!doubleCharTest()){
            System.out.println("doubleCharTest() is broken");
            return false;
        }
        
        if (!countCodeTest()){
            System.out.println("countCodeTest() is broken");
            return false;
        }
        
        if (!bobThereTest()){
            System.out.println("bobThereTest() is broken");
            return false;
        }
        
        if (!repeatEndTest()){
            System.out.println("repeatEndTest() is broken");
            return false;
        }
        
        if (!prefixAgainTest()){
            System.out.println("prefixAgainTest() is broken");
            return false;
        }
        
        if (!cigarPartyTest()){
            System.out.println("cigarPartyTest() is broken");
            return false;
        }
        
        if (!caughtSpeedingTest()){
            System.out.println("caughtSpeedingTest() is broken");
            return false;
        }
        
        if (!stringTimesTest()){
            System.out.println("stringTimesTest() is broken");
            return false;
        }
        
        if (!doubleXTest()){
            System.out.println("doubleXTest() is broken");
            return false;
        }
        
        return true;   //all method currently working.
        }//end practiceClassUnitTest
        
   
    
    
    

    public static void main(String args[]){
        PracticeClass p = new PracticeClass();
        if(p.practiceClassUnitTest())
            System.out.println("All is well");
        else System.out.println("errors");
        
    }//end main
            
}//end PracticeClass