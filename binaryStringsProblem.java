public class binaryStringsProblem {
    public static void printBinaryStrings(int n,int lastPlace,String str){
//base case
if(n==0){
    System.out.println(str);
    return;
}
        
        // if(lastPlace==0){
        //     //sit 0 on chair n
        //     printBinaryStrings(n-1, lastPlace, str.append("0"));
        //     printBinaryStrings(n-1, 1, str.append("1"));
        // }

        // else{
        //     printBinaryStrings(n-1, 0, str.append("0"));
        // }

//kaam
//0 ko to maine bithana hi hai
printBinaryStrings(n-1, 0, str+"0"); 
//agar last place 0 hai to main 1 ko bhi bitha dunga    
if(lastPlace==0){
    printBinaryStrings(n-1, 1, str+"1");
} 
    }
    public static void main(String[] args) {
        printBinaryStrings(3, 0, "");
    }
}
