
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OnlineStore {
    private static Object priceAscending;

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();

        Product.add(new Product("Milk", 1.45, 8, 38));
        Product.add(new Product("Sugar",1.18,7,8));
        Product.add(new Product("Butter",2.39,6,40));
        Product.add(new Product("Salt",0.49,17,23));

        Scanner scanner=new Scanner(System.in);
        System.out.println("Выберите способ сортировки: 1 - по цене (возрастание)," +
                " 2 - по цене (убывание), 3 - по рейтингу, 4 - по количеству на складе");
        int choice= scanner.nextInt();
        switch (choice){

            Collections.sort(Product.product, ProductComparator.ProductComparators.priceAscending());

        }
        



    }
}
