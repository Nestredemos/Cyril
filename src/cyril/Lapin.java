package cyril;

public class Lapin {
    
    private String nom;
    private int age;
    
    public Lapin(String nom, int age){
        this.nom = nom;
        this.age = age;
    }
    public String getNom(){
        return nom;
    }
    public int getAge(){
        return age;
    }
    public void setNom(String nouveauNom){
        this.nom = nouveauNom;
    }
    public void setAge(int nouvelAge){
        this.age = nouvelAge;
    }
    public void shout(){
        System.out.println("HAAAAAA");
    }
}
