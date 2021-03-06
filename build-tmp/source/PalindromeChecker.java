import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class PalindromeChecker extends PApplet {

public void setup()
{
  String lines[] = loadStrings("palindromes.txt");
  println("there are " + lines.length + " lines");
  for (int i=0; i < lines.length; i++) 
  {
    if(palindrome(lines[i])==true)
    {
      println(lines[i] + " IS a palindrome.");
    }
    else
    {
      println(lines[i] + " is NOT a palindrome.");
    }
  }
}
public boolean palindrome(String word)
{
  String newOne=new String();
  String newTwo=new String();
  String oldOne=new String();
  String oldTwo = new String();
  for(int i=word.length()-1; i>=0; i--){
    newOne+=word.substring(i,i+1);
  }
  newOne=newOne.toLowerCase();
  oldOne=word.toLowerCase();
  //check if letter
  for(int i=0;i<oldOne.length();i++){
    if( oldOne.charAt(i)!=' '&& oldOne.charAt(i)!='!' && oldOne.charAt(i)!=',' && oldOne.charAt(i)!='\''){
      oldTwo+=oldOne.charAt(i);
    }
  }
  for(int i=0;i<newOne.length();i++){
    if(newOne.charAt(i)!=' '&&newOne.charAt(i)!='!' && newOne.charAt(i)!=','&& newOne.charAt(i)!='\''){
      newTwo+=newOne.charAt(i);
    } 
  }
  //println(oldTwo +" oldd ");
  //println(newTwo+ "  neww ");



  if(newTwo.equals(oldTwo)){
    return true;
  }
  else{
    return false;  
  }
  
}

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "PalindromeChecker" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
