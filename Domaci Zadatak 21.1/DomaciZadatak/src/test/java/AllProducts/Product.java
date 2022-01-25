package AllProducts;

public class Product {
    String name;
    String price;
    String description;
    int priceInt;

    public Product(String name, String price, String description, int priceInt) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.priceInt = priceInt;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public int getPriceInt() {
        return priceInt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ime proizvoda: ").append(name).append("\n");
        sb.append("Cena: ").append(price).append("\n");
        sb.append("Opis: ").append(description).append("\n");
        return sb.toString();
    }
}
