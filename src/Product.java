public class Product {
    private String name;
    private int price;
    private double quantity;
    private String category;


    public Product(String name, int price, double quantity, String category) {
        System.out.println("Produs " + name + ",pret " + price + ",Cantitate " + quantity + ",Categoria " + category);
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int newPrice) {
        this.price = newPrice;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double newQuantity) {
        this.quantity = newQuantity;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String newCategory) {
        this.category = newCategory;
    }

    public void  hasStock() {
        boolean result = false;
        if (quantity != 0) {
            result = true;
        }
        System.out.println(result);

    }
    public void isCategory() {
        boolean result= false;
        if(this.name == name){
            result = true;
        }
        System.out.println(result);
    }
}
