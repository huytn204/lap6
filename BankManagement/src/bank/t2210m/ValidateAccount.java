package bank.t2210m;

public class ValidateAccount {
    public final  String MOBILE ="0904999999";
    public final  String PASSWORD ="123456";
    public boolean validateAccount(String mobile, String password) {
        if (mobile.equals(MOBILE)) {
            if (password.equals(PASSWORD)) {
                System.out.println("Đăng nhập thành công");
                return true;
            }else {
                System.out.println("Tài khoản or mật khẩu kh chính xác");
                return false;
            }
        }else {
            System.out.println("Kiểm tra lại số  điện thoại hoặc pasworld");
            return false;
        }
    }
}
