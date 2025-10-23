import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale locale;
        ResourceBundle rb = null;
        int amountOfItems = 0;

        double totalCost = 0.0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Select language:");
        System.out.println("1. English");
        System.out.println("2. Finnish");
        System.out.println("3. Swedish");
        System.out.println("4. Japanese");

        switch (sc.nextInt()) {
            case 1:
                locale =  new Locale("en", "US") ;
                rb = setBundle(locale);
                break;
            case 2:
                locale =  new Locale("fi", "FI") ;
                rb = setBundle(locale);
                break;
            case 3:
                locale =  new Locale("sw", "SE") ;
                rb = setBundle(locale);
                break;
            case 4:
                locale =  new Locale("ja", "JP") ;
                rb = setBundle(locale);
                break;

            default:
                System.out.println("Invalid input");
        }


        System.out.println(rb.getString("amountOfItems"));
        amountOfItems = sc.nextInt();

        double price = 0;
        int quantity = 0;

        for(int i = 0; i < amountOfItems; i++) {
            System.out.println(rb.getString("Price"));
            price = sc.nextDouble();


            System.out.println(rb.getString("quantity"));
            quantity = sc.nextInt();
            totalCost += price * quantity;
        }

        System.out.println(rb.getString("totalCost") + totalCost);




    }
    private static ResourceBundle setBundle(Locale locale){
        return ResourceBundle.getBundle("MessagesBundle", locale);

    }
}
