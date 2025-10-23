import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ShoppingCartTest {

    Locale localeEnglish = new Locale("en", "US");
    Locale localeSwedish = new Locale("sv", "SE");
    Locale localeFinnish = new Locale("fi", "Fi");
    Locale localeJapanese = new Locale("ja", "JP");



    @Test
    void testEnglishBundle(){
        ResourceBundle rb = ResourceBundle.getBundle("MessagesBundle", localeEnglish);
        assertEquals("Enter the number of items to purchase:", rb.getString("prompt.Item"));
    }
    @Test
    void testSwedishBundle(){
        ResourceBundle rb = ResourceBundle.getBundle("MessagesBundle", localeSwedish);
        assertEquals("Ange antalet varor att köpa:", rb.getString("prompt.Item"));
    }
    @Test
    void testFinnishBundle(){
        ResourceBundle rb = ResourceBundle.getBundle("MessagesBundle", localeFinnish);
        assertEquals("Syötä ostettavien tuotteiden määrä:", rb.getString("prompt.Item"));
    }
    void testJapaneseBundle(){
        ResourceBundle rb = ResourceBundle.getBundle("MessagesBundle", localeJapanese);
        assertEquals("購入する商品の数を入力してください:", rb.getString("prompt.Item"));
    }
}
