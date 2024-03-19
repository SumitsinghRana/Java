import java.util.*;

class zeroTOone {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number->");
        String sr = s.next();
        String newSr = "";
        for (int i = 0; i < sr.length(); i++) {
            if (sr.charAt(i) == '0') {
                newSr += '1';
            } else {
                newSr += sr.charAt(i);
            }
        }
        System.out.println(newSr);

        s.close();
    }
}