package NOK_NOD;

public class Evclid {

    public static void main(String[] args) {
        System.out.println(nod(15, 21));
        System.out.println(nok(15, 21));
    }
    public static int nod(int a,int b) {
        while (b !=0) {
            int tmp = a%b;
            a = b;
            b = tmp;
        }
        return a;
    }
    public static int nok(int c, int d){
        int g = c*d;
        while (d !=0) {
            int tmp = c%d;
            c = d;
            d = tmp;
        }
        return g/c;
    }
}
