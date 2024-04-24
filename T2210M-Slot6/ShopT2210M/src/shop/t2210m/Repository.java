package shop.t2210m;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;

public class Repository {
    List<Product> listproduct = new ArrayList<>();
    public Repository() {
        listproduct.add(new Product("01", "Bánh Doreamon 3 Vị", Category.FOOD, 100, 3500, 57));

        listproduct.add(new Product("02", "xúc xích sườn non", Category.FOOD, 150, 3500, 12));

        listproduct.add(new Product("03", "thanh cua", Category.FOOD, 100, 5000, 85));

        listproduct.add(new Product("04", "bánh khoai môn", Category.FOOD, 200, 42000, 78));

        listproduct.add(new Product("05", "thìa ăn com inox mạ vàng", Category.HOUSEWARE, 50, 8000, 4));

        listproduct.add(new Product("06", "bát đựng gia vị", Category.HOUSEWARE, 65, 4000, 44));

        listproduct.add(new Product("07", "Nước Hoa hồng Soothing", Category.COSMETICS, 140, 92000, 88));

        listproduct.add(new Product("08", "Combo gọi xả HAIRBURST", Category.COSMETICS, 100, 639000, 7));

        listproduct.add(new Product("09", "Tinh Dưỡng ẩm sâu Klairs", Category.COSMETICS, 50, 249000, 24));

        listproduct.add(new Product("10", "Kem dưỡng thể Paula's", Category.COSMETICS, 80, 715000, 63));

        listproduct.add(new Product("11", "Áo Thun TSUN", Category.FASHION, 250, 320000, 146));
    }
    public void show(){
        listproduct.forEach(product -> System.out.println(product));
    }

    public void sortProductByName(){
        listproduct.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
    }

    public void filterProductByPrice(){
        listproduct.stream()
                .filter(product -> product.getPrice() > 10000)
                .forEach(product -> System.out.println(product));
    }

    public void countProductByAmountSate(){
        long count  = listproduct.stream()
                .filter(product -> product.getAmountSale() > 50)
                .count();

        System.out.println("Số lượng bán được từ 50 trở lên là: " + count);
    }

    public void showProductByCategory() {
        for (Category category : Category.values()) {
            System.out.println("Products in category " + category + ":");
            for (Product pro : listproduct) {
                if (pro.getCategory() == category) {
                    System.out.println(pro);
                }
            }
            System.out.println(); // Add a blank line for separation
        }
    }

    public void printSortedProductsBySoldQuantity() {
        // Sắp xếp sản phẩm từ cao tới thấp
        sortBySoldQuantity(true);
        // In ra danh sách sản phẩm đã sắp xếp
        System.out.println("\n------------------------------------------\n");
        // Sắp xếp sản phẩm từ thấp tới cao
        sortBySoldQuantity(false);
        System.out.println("\n------------------------------------------\n");
    }

    public void sortBySoldQuantity(boolean descending) {
        // Sắp xếp sản phẩm theo số lượng bán được
        for (int i = 0; i < listproduct.size() - 1; i++) {
            for (int j = 0; j < listproduct.size() - i - 1; j++) {
                if (descending) {
                    if (listproduct.get(j).getAmountSale() < listproduct.get(j + 1).getAmountSale()) {
                        // Hoán đổi vị trí của hai sản phẩm
                        Product temp = listproduct.get(j);
                        listproduct.set(j, listproduct.get(j + 1));
                        listproduct.set(j + 1, temp);
                    }
                } else {
                    if (listproduct.get(j).getAmountSale() > listproduct.get(j + 1).getAmountSale()) {
                        // Hoán đổi vị trí của hai sản phẩm
                        Product temp = listproduct.get(j);
                        listproduct.set(j, listproduct.get(j + 1));
                        listproduct.set(j + 1, temp);
                    }
                }
            }
        }

        // Hiển thị danh sách sản phẩm đã sắp xếp
        if (descending) {
            System.out.println("Danh sách sản phẩm đã sắp xếp từ cao tới thấp theo số lượng bán được:");
        } else {
            System.out.println("Danh sách sản phẩm đã sắp xếp từ thấp tới cao theo số lượng bán được:");
        }
        for (Product product : listproduct) {
            System.out.println(product);
        }
    }



    // Constructor and other methods...

    public void sortAndPrintProductByName() {
        // Sắp xếp sản phẩm từ A-Z
        sortByProductName(true);
        // In ra dòng phân tách
        System.out.println("\n------------------------------------------\n");
        // Sắp xếp sản phẩm từ Z-A
        sortByProductName(false);
    }

    private void sortByProductName(boolean ascending) {
        // Sắp xếp sản phẩm theo tên
        Collections.sort(listproduct, new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                if (ascending) {
                    return p1.getName().compareTo(p2.getName());
                } else {
                    return p2.getName().compareTo(p1.getName());
                }
            }
        });

        // Hiển thị danh sách sản phẩm đã sắp xếp
        if (ascending) {
            System.out.println("Danh sách sản phẩm đã sắp xếp từ A-Z theo tên:");
        } else {
            System.out.println("Danh sách sản phẩm đã sắp xếp từ Z-A theo tên:");
        }
        for (Product product : listproduct) {
            System.out.println(product);
        }
    }
    public void findAndPrintBestSellingProduct() {
        // Sắp xếp danh sách sản phẩm theo số lượng bán từ cao xuống thấp
        Collections.sort(listproduct, new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return Integer.compare((int) p2.getAmountSale(), (int) p1.getAmountSale());
            }
        });

        // Lấy sản phẩm đầu tiên trong danh sách đã sắp xếp
        if (!listproduct.isEmpty()) {
            Product bestSellingProduct = listproduct.get(0);
            System.out.println("Sản phẩm được bán nhiều nhất là:");
            System.out.println(bestSellingProduct);
        } else {
            System.out.println("Không có sản phẩm nào trong danh sách.");
        }
    }
    public void sortBySoldQuantity() {
    }
}
