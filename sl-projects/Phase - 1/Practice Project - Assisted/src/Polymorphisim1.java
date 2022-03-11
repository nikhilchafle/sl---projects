class Polymorphism
{  
int rollno(){return 0;}  
}  
class Student1 extends Polymorphism{  
int rollno(){return 8;}  
}  
class Student2 extends Polymorphism{  
int rollno(){return 7;}  
}  
class Student3 extends Polymorphism{  
int rollno(){return 9;}  
}  


class Polymorphism1{  
public static void main(String args[]){  
Polymorphism b;  
b=new Student1();  
System.out.println("roll no student1: "+b.rollno());  
b=new Student2();  
System.out.println("roll no student2: "+b.rollno());  
b=new Student3();  
System.out.println("roll no student3: "+b.rollno());  
}  
}  