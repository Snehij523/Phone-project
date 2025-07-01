
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println( "are you a :");
        System.out.println("1.seller");
        System.out.println("2. buyer");
        int userType = sc.nextInt();
        if(userType ==1 ) {
            System.out.println("seller menu");
            System.out.println("1.add inventory");
            System.out.println("2.remove inventory");
            int sellerChoice = sc.nextInt();
            if (sellerChoice == 1) {
                System.out.println("which phone u want to add:");
                System.out.println("1.smartphone");
                System.out.println("2.featurephone");
                System.out.println("3.landline");
                int type = sc.nextInt();
                Phone phone = null;
                if (type == 1) phone = new SmartPhones();
                else if (type == 2) phone = new FeaturePhones();
                else if (type == 3) phone = new LandLines();
                phone.displayPhones();
                ((PhoneType) phone).showType();
                System.out.println("phones added to inventory");
            } else if (sellerChoice == 2) {
                System.out.println("which phone you want to remove");
                System.out.println("1.smartphone");
                System.out.println("2.featurephone");
                System.out.println("3.landline");
                int type = sc.nextInt();
                Phone phone = null;
                if (type == 1) phone = new SmartPhones();
                else if (type == 2) phone = new FeaturePhones();
                else if (type == 3) phone = new LandLines();
                phone.displayPhones();


            } else {
                System.out.println("invalid input");
            }
        }
            else if (userType==2){
                System.out.println("buyer menu ");
                System.out.println("which phone u want to buy");
                System.out.println("1.smartphone");
                System.out.println("2.featurephone ");
                System.out.println("3.landline");
                int type = sc.nextInt();
                Phone phone = null;
                if (type == 1) phone = new SmartPhones();
                else if (type == 2) phone = new FeaturePhones();
                else if (type == 3) phone = new LandLines();
                phone.displayPhones();
                    ((PhoneType) phone).showType();


            }
        else {
            System.out.println("invalid input");
        }





    }
}
interface PhoneType{
    void showType();
}

abstract  class Phone{
    String [] phoneNames = new String[10];
    int count = 0;
    public abstract void displayPhones();

}
class SmartPhones extends Phone implements PhoneType{
    public SmartPhones() {
        phoneNames[0] = "i phone";
        phoneNames[1] = "samsung galaxy";
        phoneNames[2] = "POCO M3";
        phoneNames[3] = "mi";
        phoneNames[4] = "realme";
         count = 5;
    }
         public void displayPhones () {
            System.out.println("Smartphones:");
            for (int i = 0; i < count; i++) {
                System.out.println("- " + phoneNames[i]);
            }
        }
    public void showType() {
        System.out.println("Type: smartphone");
    }

}
class FeaturePhones extends Phone implements PhoneType{
    public FeaturePhones(){
        phoneNames[0] = "nokia";
        phoneNames[1] = "samsung guru ";
        phoneNames[2] = "lava";
        phoneNames[3] = "itel";
        phoneNames[4] = "micromax";
           count = 5;
    }
    public void displayPhones(){
        System.out.println("featurephones");
        for(int i = 0; i< count; i++){
            System.out.println("- " + phoneNames[i]);
        }
    }
    public void showType() {
        System.out.println("Type: featurephone");
    }
}
class LandLines extends Phone implements PhoneType{
    public LandLines(){
        phoneNames[0] = "beetal";
        phoneNames[1] = "binatone";
        phoneNames[2] = "panasonic";
        phoneNames[3] = "gigatone";
        phoneNames[4] = "motorola";
          count = 5;
    }
    public void displayPhones() {
        System.out.println("landlines");

        for (int i = 0; i < count; i++) {
            System.out.println("- " + phoneNames[i]);
        }
    }
    public void showType() {
        System.out.println("Type:landline");
    }
}
