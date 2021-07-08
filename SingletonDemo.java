public class SingletonDemo {
    public  static void main(String...k){
        Singleton firstObject = Singleton.getInstance();
        firstObject.showDetails("First object");
        Singleton secondObject = Singleton.getInstance();
        secondObject.showDetails("Second object");
        System.out.println("----------------------------");

    }
}
