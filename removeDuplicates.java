import java.util.*;
public class removeDuplicates {

   public static void removeDuplicates(String str,int idx,StringBuilder newStr,boolean map[]){
    if(idx==str.length()){
        System.out.println(newStr);
        return;
    }

//kaam
char currChar=str.charAt(idx);
if(map[currChar-'a']==true){
    //currChar-'a' se index nikalta hai
    //if its true 
    //then it's a duplicate
    removeDuplicates(str, idx+1, newStr, map);
}
else{
    //agar false hai matlab vo pehle nhi aaya hua
    map[currChar-'a']=true;
    //now append the current character to new string
    removeDuplicates(str, idx+1, newStr.append(currChar), map);
}

   }

        
    
    public static void main(String[] args) {
       
     String str="appnnacollege";
     removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);

    }
}
