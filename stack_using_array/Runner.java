package stack_using_array;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Stack st = new Stack();
        int choice, value;

        System.out.println("Enter your choice: ");
        Scanner sc = new Scanner(System.in);

        System.out.println("1.push()");
        System.out.println("2..pop()");
        System.out.println("3.isEmpty()");
        System.out.println("4.display()");
        System.out.println("5.exit()");

        do{
            System.out.println("Select your choice: ");
            choice = sc.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println("Enter the value for adding to stack: ");
                    value = sc.nextInt();
                    st.push(value);
                    break;

                case 2: st.pop();
                break;
                case 3:
                    System.out.println(st.isEmpty());
                break;
                case 4: st.display();
                break;
                case 5: System.exit(1);
                break;
                default:
                    System.out.println("Invalid Choice");



            }

        }while (choice!=5);



    }
}
