package bank.t2210m;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ValidateAccount validate = new ValidateAccount();
        Controller controller = new Controller();

        boolean isCheck = false;
        while(!isCheck) {
            System.out.println("Enter account number");
            String mobile = sc.nextLine();

            System.out.println("Enter account password");
            String password = sc.nextLine();

            isCheck = validate.validateAccount(mobile, password);
        }
        while(true) {
            menu();
            int choice = sc.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("Số dư: ");
                    long balance = controller.getBalanceNumber();
                    System.out.println(Controller.formatMoney(balance));
                    break;
                case 2:
                    controller.actionTransfer();
                    break;
                case 3:
                    System.out.println("Lịch Sử giao dịch: ");
                    controller.getHistory();
                    break;
                case 0:
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
                    break;
            }
        }
    }
    public static void menu() {
        System.out.println("Lựa chọn của bạn: ");
        System.out.println("1: Xem số dư tài khoản");
        System.out.println("2: chuyển khoản");
        System.out.println("3: Lịch sử giao dịch");
        System.out.println("0: thoát");
    }
}