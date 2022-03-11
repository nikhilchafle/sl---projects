    public class ThreadExample implements Runnable {  
      
        @Override  
        public void run() {  
            System.out.println("Thread has ended");  
        }  
       
        public static void main(String[] args) {  
        	ThreadExample t = new ThreadExample();  
            Thread t1= new Thread(t);  
            t1.start();  
            System.out.println("Hi");  
        }  
    }  