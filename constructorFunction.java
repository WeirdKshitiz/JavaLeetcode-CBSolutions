public class constructorFunction {
    public static void main(String[] args) {
        Student s1=new Student();
        // Student s2=new Student("Kshitiz");
        // Student s3=new Student(12345);
        // System.out.println(s1.name);
        s1.name="Kshitiz";
        s1.roll=456;
        s1.password="abcd";
        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=80;

         Student s2=new Student(s1); //copy constructor
         s2.password="xyz";
         //using shallow copy
         //agar hum copy krne ke baad koi changes krte hain,to vo changes
         //s2 mein show nhi honi chahiye,but somehow vo show hoti hain s2 mein 
         //bcaz s2 mein pura ka pura array ka referrence copy hoke aaya hai
         

         //using deep copy
         //ismein humein marks unchanged milenge
         s1.marks[2]=36;
         for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
         }
    }
}

class Student{
    String name;
    int roll;
    String password;
    int marks[];


    //shallow copy constructor
// Student(Student s1){
//     marks=new int[3];
//     this.name=s1.name;
//     this.roll=s1.roll;
//     this.marks=s1.marks; 
// }


//deep copy constructor
Student(Student s1){
    marks=new int[3];
        this.name=s1.name;
      this.roll=s1.roll;
      for(int i=0;i<marks.length;i++){
        this.marks[i]=s1.marks[i];
      }
}


    Student(){
        System.out.println("constructor is called ");
    }
    Student(String name){
        this.name=name;
    }
    Student(int roll){
        this.roll=roll;
    }
}