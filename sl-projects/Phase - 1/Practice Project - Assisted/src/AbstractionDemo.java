    abstract class Dog{  
    abstract void running();  
    }  
     
    class Animal extends Dog{  
    void running(){System.out.println("dog is running");}  
    }  
    class Cat extends Dog{  
    void running(){System.out.println("cat is running ");}  
    }  

    class AbstractionDemo{  
    public static void main(String args[]){  
    Dog s=new Cat();  
    s.running();  
    }  
    }  