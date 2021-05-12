import java.util.*;
public class _6switchcasestring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter country name ");
        String temp = sc.nextLine();
        String country = temp.toLowerCase();
        switch (country) {
            case "india":
            System.out.println("country code is +91");    
                break;
                case "usa":
                System.out.println("country code is +1");    
                    break;
                    case "italy":
                    System.out.println("country code is +39");    
                        break;
                        case "spain":
                        System.out.println("country code is +34");    
                            break;
            default:
                System.out.println("INVALID");
                sc.close();
        }
    }
}
