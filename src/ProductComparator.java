import java.util.Comparator;

public class ProductComparator implements Comparable<Product> {

    @Override
    public int compareTo(Product o) {
        return 0;
    }

    public class ProductComparators {
        public static Comparator priceAscending() {
            return Comparator.comparingDouble(Product::getPrice);
        }

        public static Comparator priceDescending() {
            return Comparator.comparingDouble(Product::getPrice).reversed();
        }

        public static Comparator rating() {
            return Comparator.comparingDouble(Product::getRating).reversed();
        }

        public static Comparator stock() {
            return Comparator.comparingInt(Product::getStock);
        }
    }
}
