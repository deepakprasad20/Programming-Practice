import java.util.List;

public class test {
    public static void main(String...k){
       Base derived = new Derived();
       derived.print();
    }
}
class Base{
    public Base(){
        System.out.println("Base class Constructor");
    }
    public void print(){
        System.out.println("Base class print method");
    }
}
class Derived extends Base{
    public Derived(){
        System.out.println("Derived class Constructor");
    }
    public void print1(){
        System.out.println("Derived class print method");
    }
}
