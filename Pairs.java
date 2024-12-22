import java.util.HashSet;
import java.util.Scanner;


    public class Pairs {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();
            HashSet<String> pairs = new HashSet<>();
            for (int i = 0; i < T; i++) {
                String a = sc.next();
                String b = sc.next();
                sc.nextLine();
                pairs.add(a+","+b);
                System.out.println(pairs.size());
            }


        }
    }


