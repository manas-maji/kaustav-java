import java.util.Scanner;

public class Hackerrank {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
            int length = s1.length();
            int spaces = 15 - length;
            System.out.printf("%s%s%03d", s1, generateSpace(spaces), x);
            System.out.println();

        }
    }

    static String generateSpace(int spaces) {
        String space = "";
        for (int i = 0; i < spaces; i++) {
            space += " ";

        }
        return space;
    }
}
