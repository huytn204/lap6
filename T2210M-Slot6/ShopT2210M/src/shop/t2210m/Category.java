package shop.t2210m;

public enum Category {
    FOOD ("Thực Phẩm"), HOUSEWARE ("Đồ gia dụng"), COSMETICS ("Mĩ Phẩm"), FASHION ("Thời Trang");

    private String value;

    private Category(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }
}
