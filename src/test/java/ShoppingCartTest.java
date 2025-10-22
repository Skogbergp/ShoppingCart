import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartTest {
    ShoppingCart shoppingCart;
    @BeforeEach
    void setUp() {
        shoppingCart = new ShoppingCart();

    }


    @Test
    void getAmount() {
        assertEquals(0.0, shoppingCart.getAmount());
    }

    @Test
    void addToCart() {
        shoppingCart.addToCart("Banana",100.10);
    }

    @Test
    void removeFromCart() {
    }

    @Test
    void printCart() {
    }
}