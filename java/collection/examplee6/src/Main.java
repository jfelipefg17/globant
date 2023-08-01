import service.ServiceProduct;

import java.util.Scanner;

public class  Main {

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        boolean ss = true;
        ServiceProduct s1 = new ServiceProduct();

        do {
            System.out.println("1. add product");
            System.out.println("==============================");
            System.out.println("2. modify product");
            System.out.println("==============================");
            System.out.println("3. delete product");
            System.out.println("==============================");
            System.out.println("4. show products");
            System.out.println("==============================");
            System.out.println("5. exit");
            System.out.println("==============================");
            System.out.println("==============================");
            System.out.println("write number of option");
            int opt = num.nextInt();

            switch (opt) {
                case 1:
                    s1.addProduct();
                    break;
                case 2:
                    s1.modifyProduct();
                    break;
                case 3:
                    s1.deleteProduct();
                    break;
                case 4:
                    s1.showProduct();
                    break;
                case 5:
                    ss = false;
                    break;
            }
        }while (ss);

    }
}