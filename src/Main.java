import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner produs = new Scanner(System.in);
        String name = produs.nextLine();
        String category = produs.nextLine();
        Product product = new Product("Mere", 12, 0, "fructe");
        Product product1 = new Product("Pere", 15, 4, "fructe");
        Product product2 = new Product("cartofi", 6, 0, "legume");
        product.hasStock();
        product1.hasStock();
        product2.hasStock();
        product.isCategory();


    }
}