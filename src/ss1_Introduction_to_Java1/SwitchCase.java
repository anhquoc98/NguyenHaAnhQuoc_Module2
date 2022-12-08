package Introduction_to_Java1;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("mời bạn nhập số");
        String number = scanner.nextLine();
        if (number.length() == 1) {
            switch (number) {
                case "0":
                    System.out.println("zero");
                    break;
                case "1":
                    System.out.println("One");
                    break;
                case "2":
                    System.out.println("two");
                    break;
                case "3":
                    System.out.println("three");
                    break;
                case "4":
                    System.out.println("Four");
                    break;
                case "5":
                    System.out.println("five");
                    break;
                case "6":
                    System.out.println("six");
                    break;
                case "7":
                    System.out.println("sever");
                    break;
                case "8":
                    System.out.println("eight");
                    break;
                case "9":
                    System.out.println("nice");
                    break;
                case "10":
                    System.out.println("ten");
                    break;
            }
        } else if (number.length() == 2) {
            if (Integer.parseInt(number)<20){
               switch (Integer.parseInt(number)){
                   case 10:
                       System.out.println("ten");
                       break;
                   case 11:
                       System.out.println("eleven");
                       break;
                   case 12:
                       System.out.println("twelve");
                       break;
                   case 13:
                       System.out.println("thirteen");
                       break;
                   case 14:
                       System.out.println("fourteen");
                       break;
                   case 15:
                       System.out.println("fifteen");
                       break;
                   case 16:
                       System.out.println("sixteen");
                       break;
                   case 17:
                       System.out.println("seventeen");
                       break;
                   case 18:
                       System.out.println("eighteen");
                       break;
                   case 19:
                       System.out.println("nineteen");
                       break;
               }
            }else {
                switch (number.charAt(0)) {
                    case '2':
                        System.out.println("twenty");
                        break;
                    case '3':
                        System.out.println("thirty");
                        break;
                    case '4':
                        System.out.println("forty");
                        break;
                    case '5':
                        System.out.println("fifty");
                        break;
                    case '6':
                        System.out.println("sixties");
                        break;
                    case '7':
                        System.out.println("seventies");
                        break;
                    case '8':
                        System.out.println("eighty");
                        break;
                    case '9':
                        System.out.println("ninety");
                        break;

                }
                switch (number.charAt(1)) {
                    case '1':
                        System.out.println("One");
                        break;
                    case '2':
                        System.out.println("two");
                        break;
                    case '3':
                        System.out.println("three");
                        break;
                    case '4':
                        System.out.println("Four");
                        break;
                    case '5':
                        System.out.println("five");
                        break;
                    case '6':
                        System.out.println("six");
                        break;
                    case '7':
                        System.out.println("sever");
                        break;
                    case '8':
                        System.out.println("eight");
                        break;
                    case '9':
                        System.out.println("nice");
                        break;

                }
            }

        }
        else if (number.length()==3) {
            switch (number.charAt(0)){
                case '1':
                    System.out.println("One hundred");
                    break;
                case '2':
                    System.out.println("two hundred");
                    break;
                case '3':
                    System.out.println("three hundred");
                    break;
                case '4':
                    System.out.println("Four hundred");
                    break;
                case '5':
                    System.out.println("five hundred");
                    break;
                case '6':
                    System.out.println("six hundred");
                    break;
                case '7':
                    System.out.println("sever hundred");
                    break;
                case '8':
                    System.out.println("eight hundred");
                    break;
                case '9':
                    System.out.println("nice hundred");
                    break;
            }
            switch (number.charAt(1)) {
                case '1':
                    System.out.println("ten");
                case '2':
                    System.out.println("twenty");
                    break;
                case '3':
                    System.out.println("thirty");
                    break;
                case '4':
                    System.out.println("forty");
                    break;
                case '5':
                    System.out.println("fifty");
                    break;
                case '6':
                    System.out.println("sixties");
                    break;
                case '7':
                    System.out.println("seventies");
                    break;
                case '8':
                    System.out.println("eighty");
                    break;
                case '9':
                    System.out.println("ninety");
                    break;

            }
            switch (number.charAt(2)) {
                case '1':
                    System.out.println("One");
                    break;
                case '2':
                    System.out.println("two");
                    break;
                case '3':
                    System.out.println("three");
                    break;
                case '4':
                    System.out.println("Four");
                    break;
                case '5':
                    System.out.println("five");
                    break;
                case '6':
                    System.out.println("six");
                    break;
                case '7':
                    System.out.println("sever");
                    break;
                case '8':
                    System.out.println("eight");
                    break;
                case '9':
                    System.out.println("nice");
                    break;

            }
        }
    }
}
