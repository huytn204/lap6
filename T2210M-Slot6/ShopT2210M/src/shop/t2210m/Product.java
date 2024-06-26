package shop.t2210m;
import java.text.DecimalFormat;

public class Product {
    private String id;
    private String name;
    private Category category;
    private long amount;
    private long price;
    private long amountSale;

    public Product(String id, String name, Category category, long amount, long price, long amountSale) {}

    public String getId() {return id;}

    public void setId(String id) {this.id = id;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public Category getCategory() {return category;}

    public void setCategory(Category category) {this.category = category;}

    public long getAmount() {return amount;}

    public void setAmount(long amount) {this.amount = amount;}

    public long getPrice() {return price;}

    public void setPrice(long price) {this.price = price;}

    public long getAmountSale() {return amountSale;}

    public void setAmountSale(long amountSale) {this.amountSale = amountSale;}

    public static String formatPrice(long money) {
        DecimalFormat formatter = new DecimalFormat("###,###,##0.00");
        return formatter.format(money);
    }

    @Override
    public String toString() {
        return id + " - " + name + " - " + category.getValue() + " - " + amount + " - " + formatPrice(price) + " - " + amountSale;
    }
}
