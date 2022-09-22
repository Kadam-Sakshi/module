import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class chocolate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> chocolates = new ArrayList<String>();

        for (int i = 0; i < 10; i++)
            chocolates.add(sc.nextLine());

        HashMap<String, Integer> numberOfConcolates = new HashMap<String, Integer>();
        for (int i = 0; i < chocolates.size(); i++) {
            String c = chocolates.get(i);
            if (numberOfConcolates.containsKey(c)) {
                int n = numberOfConcolates.get(c);
                numberOfConcolates.put(c, n + 1);
            } else {
                numberOfConcolates.put(c, 1);
            }
        }
        System.out.println(numberOfConcolates);
    }

}