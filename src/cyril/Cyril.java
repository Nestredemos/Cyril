package cyril;

public class Cyril {
  
    public static void main(String[] args) {
        System.out.println("Hello World");
        String nom="Jacky";
        System.out.println("Test");
        int age= 22;
        int i = 0;
        Lapin JackyLeLapin = new Lapin("Jacky",22);
        while(i <=10) {
            JackyLeLapin.shout();
            i++;
        }
    }     
}
