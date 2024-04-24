package shop.t2210m;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       Repository rep = new Repository();
       Scanner scanner = new Scanner(System.in);
       Menu.mainMenu();
       int choice = scanner.nextInt();
       switch (choice) {
           case 0:
               System.exit(0);
               break;
           case 1:
               System.out.println("Danh Sách Sản Phẩm");
               rep.show();
               break;
           case 2:
               System.out.println("Các sản phẩm có giá trên 10.000: ");
               rep.filterProductByPrice();
               break;
           case 3:
               rep.countProductByAmountSate();
               break;
           case 4:
               rep.showProductByCategory();
               break;
           case 5:
               rep.printSortedProductsBySoldQuantity();
               break;
           case 6:
               rep.findAndPrintBestSellingProduct();
               break;
           case 7:
               System.out.println("San pham sau khi sap sep : ");
               rep.sortAndPrintProductByName();
               break;


       }
    }
}