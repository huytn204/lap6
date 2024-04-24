package shop.t2210m;

public class Menu {
    public static void mainMenu(){
        System.out.println("1- Xem thông tin sản phẩm");
        System.out.println("2- In danh sách sản phẩm có giá trên 10.000");
        System.out.println("3- Đếm số sản phẩm có số lượng bán từ 50 trở lên");
        System.out.println("4- liệt kê sản phẩm theo loại sản phẩm");
        System.out.println("5- sắp xếp sản phẩm theo số lượng bán được");
        System.out.println("6- đưa ra sản phẩm bán được nhiều nhất");
        System.out.println("7- sắp xếp sản phẩm theo tên");
        System.out.println("0- thoát chương trình");
        System.out.println("Lựa chọn của bạn là: ");
    }

    public static void chooseCategory(){
        System.out.println("1- Thực Phẩm");
        System.out.println("2- Đồ gia dụng");
    }

    public static void secondMenu(){
        System.out.println("1- sửa thông tin sản phẩm");
        System.out.println("2- xóa sản phẩm");
        System.out.println("0- Quay về trang chủ");
        System.out.println("Lựa chọn của bạn là: ");
    }
}
