public class FactoryMain {
    public static void main(String[] args){
        FactoryDesign factory = new FactoryDesign();
        OSInterface operatingSystem = factory.getInstance("IOS");
        operatingSystem.show();
    }
}
