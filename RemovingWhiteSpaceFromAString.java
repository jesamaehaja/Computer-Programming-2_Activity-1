package REMOVINGWHITESPACEFROMASTRING;

public class RemovingWhiteSpaceFromAString {

public static void main(String[] args)
  
  {
  
    String str = "T A K E C A R E";
    
   
    str = str.replaceAll("\\s", ""); 

       

        System.out.println(str); 

 
  }
}
