import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Boolean validfirst = false;
        Boolean validsecond = false;
        Boolean validop = false;
        int num1 = 1;
        int num2 = 1;

        while (validop != true){
            while (validfirst != true){
                System.out.println("Enter a number");
                String firstnum = scanner.next();
    
                try{
                    num1 = Integer.parseInt(firstnum);
                    validfirst = true;
    
                }
                catch (NumberFormatException e){
                    System.out.println("Invalid entry");
                    e.printStackTrace();
                }
            }
    
            System.out.println("Enter an operator (*, /, -, +)");
            String operator = scanner.next();
    
            while (validsecond != true){
                System.out.println("Enter a number");
                String secondnum = scanner.next();
    
                try{
                    num2 = Integer.parseInt(secondnum);
                    validsecond = true; 
                }
                catch (NumberFormatException e){
                    System.out.println("Invalid entry");
                    e.printStackTrace();
                }
            }
    
            switch (operator){
                case "*":
                    if(num1 == 0 || num2 == 0){
                        System.out.println("Multiplication by 0");
                        validop = true;
                    }
                    else{
                        System.out.println("Answer: " + (num1 * num2));
                        validop = true;
                    }
                    break;
                case "/":
                    if (num1 == 0 || num2 == 0){
                        System.out.println("Division by 0");
                        validop = true;

                    }
                    else{
                        System.out.println("Answer: " + (num1 / num2));
                        validop = true;
                    }
                    break;
                case "+":
                    System.out.println("Answer: " + (num1 + num2));
                    validop = true;

                    break;
                case "-":
                    System.out.println("Answer: " + (num1 - num2));
                    validop = true;

                    break;
                default:
                    System.out.println("Invalid operator\nRestarting program");
                    break;
            }    
        }
        
        System.out.println("Enter e to exit. Any key to restart");
        char choice = scanner.next().charAt(0);

        if (choice == 'e' || choice == 'E'){
            System.exit(0);
        }

        scanner.close();
    }
}
