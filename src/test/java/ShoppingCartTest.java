import static org.junit.jupiter.api.Assertions.*;
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
        assertEquals("Enter the price for item:", rb.getString("Price"));
        assertEquals("Enter the quantity for item:", rb.getString("quantity"));
        assertEquals("Total cost:", rb.getString("totalCost"));
    }
    @Test
    void testSwedishBundle(){
        ResourceBundle rb = ResourceBundle.getBundle("MessagesBundle", localeSwedish);
        assertEquals("Ange antalet varor att köpa:", rb.getString("prompt.Item"));
        assertEquals("Ange priset för varan:", rb.getString("Price"));
        assertEquals("Ange mängden varor:", rb.getString("quantity"));
        assertEquals("Total kostnad:", rb.getString("totalCost"));
    }
    @Test
    void testFinnishBundle(){
        ResourceBundle rb = ResourceBundle.getBundle("MessagesBundle", localeFinnish);
        assertEquals("Syötä ostettavien tuotteiden määrä:", rb.getString("prompt.Item"));
        assertEquals("Syötä tuotteen hinta:", rb.getString("Price"));
        assertEquals("Syötä tuotteen määrä:", rb.getString("quantity"));
        assertEquals("Kokonaishinta:", rb.getString("totalCost"));
    }
    @Test
    void testJapaneseBundle(){
        ResourceBundle rb = ResourceBundle.getBundle("MessagesBundle", localeJapanese);
        assertEquals("購入する商品の数を入力してください:", rb.getString("prompt.Item"));
        assertEquals("商品の価格を入力してください:", rb.getString("Price"));
        assertEquals("商品の数量を入力してください:", rb.getString("quantity"));
        assertEquals("合計金額:", rb.getString("totalCost"));
    }
}
