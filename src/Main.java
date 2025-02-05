import java.util.Scanner;
import java.util.regex.Pattern;



//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String ratingCode;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your rating code");
        String inputCode = sc.nextLine();
        sc.close();
        String pattern ="W.*";
        boolean match = Pattern.matches(pattern,inputCode);
        if(inputCode.equals("WR17")){
            System.out.println("Expired");
        }else if(match){
            System.out.println("Downgraded");
        }else{
            System.out.println("normal");
        }
    }
}