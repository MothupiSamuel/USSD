
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Transaction Transaction1 = new Transaction();


        Scanner input = new Scanner(System.in);
        Scanner inputValues = new Scanner(System.in);

        System.out.print("\nPlease enter your mobile banking contact number: ");
        String contact_No = input.nextLine();


        double amount = Transaction1.getbalance();
        System.out.print("Enter your mobile banking pin: ");
        int pin1 = Integer.parseInt(input.nextLine());
        String options;
        int pin = Transaction1.getPin();
        String contact_No1 = Transaction1.getContact_No();
        do {
            if (pin == pin1 && contact_No1.equals(contact_No)) {
                System.out.println("\nWelcome" + " " + Transaction1.name + "," + " " + "Your balance is" + " " + "R" + amount);
                System.out.print("\nSelect an  option:\n 1. Deposit \n 2. Withdraw \n 3. Send money \n 4.Exit/Cancel");
                options = input.nextLine();

                switch (options) {

                    case "1":
                        System.out.print("Enter amount to Deposit: R ");
                        double deposit = inputValues.nextDouble();
                        System.out.print(deposit + " Has been withdrawn from your account.");
                        amount = amount + deposit;
                        break;

                    case "2":
                        System.out.print("Enter amount to Withdraw: R ");
                        double withdraw = inputValues.nextDouble();
                        if (amount >= withdraw && amount > 0) {
                            System.out.print(withdraw + " Has been withdrawn from your account.");
                            amount = amount - withdraw;
                            break;
                        } else {
                            System.out.print("You have insufficient funds in your account.");
                            break;
                        }

                    case "3":
                        System.out.print("Enter amount to send: R ");
                        double Sendmoney = inputValues.nextDouble();
                        String number = null;
                        if (amount >= Sendmoney && amount > 0) {
                            System.out.print("Enter contact number to send to: ");
                            number = input.next();
                            if (number.length() == 10) {
                                amount = amount - Sendmoney;
                                System.out.print(Sendmoney + " has been send to " + number);
                                System.out.print("\nBalance is" + " " + amount);
                                break;

                            } else {
                                System.out.print("You entered incorrect contact number");
                                break;
                            }
                        } else {
                            System.out.print("You have insufficient funds in your account");
                            break;
                        }
                    case "4":
                        System.out.print("Thank you for your Transaction" + " " + Transaction1.name);
                        break;
                    default:
                        System.out.print("You have entered a wrong pin or contact number");
                        break;
                }
            } else {
                System.out.println("You have entered an incorrect pin or contact number.");
                break;
            }

        }
        while (!(options.equalsIgnoreCase("4")));
    }
}