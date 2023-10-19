package market.main;

import market.entities.Product;
import market.services.ProductService;

import java.util.Collection;

public class Main {
    public static void main(String[] args) throws Exception {

//        Product product = new Product(12,"paleta",5000,8);
//        System.out.println(product.toString());
        ProductService productService = new ProductService();
//
//        productService.creatProduct(product);


        Collection<Product> products = productService.searchAllProducts();

        if (products.isEmpty()) {
            System.out.println("yes");
        }


// Verifica si la colección de productos no es nula y no está vacía
        if (products != null && !products.isEmpty()) {
            // Itera a través de los productos e imprime cada uno
            for (Product product : products) {
                System.out.println("ID: " + product.getId());
                System.out.println("Nombre: " + product.getName());
                System.out.println("Precio: " + product.getPrice());
                System.out.println("ID de fabricante: " + product.getIdManuf());
                System.out.println("======================");
            }
        } else {
            System.out.println("No se encontraron productos.");
        }
    }


}