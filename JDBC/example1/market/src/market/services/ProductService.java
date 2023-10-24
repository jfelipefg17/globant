package market.services;

import market.entities.Manufacturer;
import market.entities.Product;
import market.persistence.ProductDAO;

import java.util.Collection;
import java.util.Scanner;

public class ProductService {

    private ProductDAO dao;

    public ProductService() {
        this.dao = new ProductDAO();
    }

    public void creatProduct() throws Exception {


        Scanner read = new Scanner(System.in);
        Scanner dou = new Scanner(System.in);

        Product product = new Product();
        Manufacturer manufacturer = new Manufacturer();

        System.out.println("=============");
        System.out.println("write name of yout product");
        String name = read.nextLine();
        System.out.println("=============");
        System.out.println("write price of the product");
        double price = dou.nextDouble();
        System.out.println("=============");
        System.out.println("");
        System.out.println("=============");


        try {

            if (dao.searchProductById(product.getIdProd()) != null) {
                throw new Exception("the product already exist");
            }

            dao.safeProduct(product);
        } catch (Exception e) {
            throw (e);
        }
    }

    public void searchAllProducts() throws Exception {

        try {

            Collection<Product> products = dao.searchAllProducts();

            if (products != null && !products.isEmpty()) {
                for (Product product : products) {

                    System.out.println("Codigo: " + product.getIdProd());
                    System.out.println("Nombre: " + product.getName());
                    System.out.println("Precio: " + product.getPrice());
                    System.out.println("Fabricante: " + product.getManuf());

                    System.out.println("======================");
                }
            } else {
                System.out.println("No se encontraron productos.");
            }
        } catch (Exception e) {
            throw (e);
        }

    }


    public void searchNameProducts() throws Exception {

        try {

            Collection<Product> products = dao.searchAllProducts();

            if (products != null && !products.isEmpty()) {
                for (Product product : products) {

                    System.out.println("Nombre: " + product.getName());

                    System.out.println("======================");
                }
            } else {
                System.out.println("No se encontraron productos.");
            }
        } catch (Exception e) {
            throw (e);
        }

    }

    public void searchNamePriceProducts() throws Exception {

        try {

            Collection<Product> products = dao.searchAllProducts();

            if (products != null && !products.isEmpty()) {
                for (Product product : products) {

                    System.out.println("Nombre: " + product.getName());
                    System.out.println("Precio: " + product.getPrice());

                    System.out.println("======================");
                }
            } else {
                System.out.println("No se encontraron productos.");
            }
        } catch (Exception e) {
            throw (e);
        }

    }

    public void lowestPrice () throws Exception {
        try {
            Product product = dao.lowestPrice();
            if (product != null ) {
                System.out.println("codigo" + product.getIdProd());
                System.out.println("Nombre: " + product.getName());
                System.out.println("Precio: " + product.getPrice());
                System.out.println("fabricante" + product.getManuf());
                System.out.println("======================");

            } else {
                System.out.println("No se encontraron productos.");
            }
        }catch (Exception e) {
            throw e;
        }
    }

    public void priceBetween() {
        try {
            Collection<Product> products = dao.searchNamePriceProducts();

            if (products != null && !products.isEmpty()) {
                for (Product product : products) {
                     if (product.getPrice() >= 120 && product.getPrice() <= 202) {
                         System.out.println("Nombre: " + product.getName());
                         System.out.println("Precio: " + product.getPrice());

                         System.out.println("======================");
                     }
                }
            } else {
                System.out.println("No se encontraron productos.");
            }

        } catch (Exception e) {
          throw new RuntimeException(e);
        }

    }

    public void portatiles() {
        try {
            Collection<Product> products = dao.searchAllProducts();

            if (products != null && !products.isEmpty()) {
                for (Product product : products) {
                    if (product.getName().toLowerCase().startsWith("port")) {
                        System.out.println("Codigo: " + product.getIdProd());
                        System.out.println("Nombre: " + product.getName());
                        System.out.println("Precio: " + product.getPrice());
                        System.out.println("Fabricante: " + product.getManuf());

                        System.out.println("======================");
                    }
                }
            } else {
                System.out.println("No se encontraron productos.");
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}
