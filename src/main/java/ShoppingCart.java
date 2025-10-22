import java.util.HashMap;
import java.util.Map;

/**
 * Simple ShoppingCart implementation that stores item names and their amounts.
 *
 * Contract:
 * - addToCart(key, amount): adds a new item or updates an existing item's amount.
 *   If the item exists, the cart total is adjusted to reflect the new value (old value removed, new value added).
 * - removeFromCart(key): removes the item if present and adjusts the total accordingly.
 * - getAmount(): returns the current total amount in the cart.
 *
 * Error modes:
 * - Passing a null key will throw IllegalArgumentException.
 * - Passing a negative amount to addToCart will throw IllegalArgumentException.
 */
public class ShoppingCart {
    // Map interface so implementation can be changed easily in future
    private Map<String, Double> shoppingCart;
    private double totalAmount;

    /**
     * Create an empty shopping cart.
     */
    public ShoppingCart(){
        shoppingCart = new HashMap<>();
        totalAmount = 0;
    }

    /**
     * Increase the cached total amount.
     * @param a amount to add (assumed non-negative when used internally)
     */
    private void addAmount(double a){
        totalAmount += a;
    }

    /**
     * Decrease the cached total amount.
     * @param a amount to subtract (assumed non-negative when used internally)
     */
    private void subtractAmount(double a){
        totalAmount -= a;
    }

    /**
     * Return true if the given key exists in the cart.
     * @param key item key
     * @return true if present
     */
    private Boolean isInCart(String key){
        return shoppingCart.containsKey(key);
    }

    /**
     * Get the current total amount for the cart.
     * @return total amount (sum of all item amounts)
     */
    public Double getAmount(){
        return totalAmount;
    }

    /**
     * Add or update an item in the cart.
     * If the item already exists, the previous amount is removed from the total and
     * replaced with the new amount.
     *
     * @param key item identifier (must not be null)
     * @param amount non-negative item amount
     * @throws IllegalArgumentException if key is null or amount is negative
     */
    public void addToCart(String key, double amount){
        if (key == null) {
            throw new IllegalArgumentException("key cannot be null");
        }
        if (amount < 0) {
            throw new IllegalArgumentException("amount cannot be negative");
        }

        if (shoppingCart.containsKey(key)) {
            // adjust total: remove old value before adding new one
            double old = shoppingCart.get(key);
            subtractAmount(old);
        }
        shoppingCart.put(key, amount);
        addAmount(amount);
    }

    /**
     * Remove an item from the cart. If the item is not present, this is a no-op.
     * @param key item identifier (must not be null)
     * @throws IllegalArgumentException if key is null
     */
    public void removeFromCart(String key){
        if (key == null) {
            throw new IllegalArgumentException("key cannot be null");
        }
        Double existing = shoppingCart.get(key);
        if (existing == null) {
            // nothing to remove
            return;
        }
        subtractAmount(existing);
        shoppingCart.remove(key);
    }

    /**
     * Print cart contents to stdout in the format: "key: value" per line.
     */
    public void printCart(){
        shoppingCart.forEach((k,v)->{System.out.println(k+": "+v);});
    }
}
