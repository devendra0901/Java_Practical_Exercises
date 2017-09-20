import java.util.Scanner;

public class Pe5 {

    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter a line full of integer:");
        int sum = 0;
        
        String  lines = inp.nextLine();    

        String[] s = lines.trim().split(" ");

            for (int i = 0; i < s.length; i++) {
            sum += Integer.parseInt(s[i]);
            }
        
            
        System.out.println(sum);
        
    }
}
