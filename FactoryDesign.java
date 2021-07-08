public class FactoryDesign {

    public OSInterface getInstance(String str){
        if(str.equals("IOS")){
            return new IOS1();
        } else if(str.equals("Android")){
            return new Android();
        } else if(str.equals("Windows")){
            return new Windows();
        }
        return null;
    }
}
