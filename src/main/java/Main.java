import java.sql.SQLOutput;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale locale;
        ResourceBundle rb;
        ShoppingCart shoppingCart = new ShoppingCart();
        Scanner sc = new Scanner(System.in);
        System.out.println("Select language:");
        System.out.println("1. English");
        System.out.println("2. Finnish");
        System.out.println("3. Swedish");
        System.out.println("5. Japanese");

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
        }





    }
    private static ResourceBundle setBundle(Locale locale){
        return ResourceBundle.getBundle("MessagesBundle", locale);

    };
}
