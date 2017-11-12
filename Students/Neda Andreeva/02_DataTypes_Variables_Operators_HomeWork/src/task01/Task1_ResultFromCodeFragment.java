package task01;

/**
 * Created by neda.andreeva on 11/06/2017.
 */
public class Task1_ResultFromCodeFragment {
    public static void main(String[] args) {
        /**
         * a) 54 беше моето предположение. Сгреших, защото предположих, че първо ще се извади 1 от b и след това ще се направи умножението.
         */
        int a = 5;
        int b = 10;
        int c = ++a * b--;

        System.out.println(c);

        /**
         * b) 12 и 3 беше моето предположение.
         */

        System.out.println("1 + 2 = " + 1 + 2);
        System.out.println("1 + 2 = " + (1 + 2));

        /**
         * c) 3abc и abc12 беше моето предположение.
         */

        System.out.println(1 + 2 + "abc");
        System.out.println("abc" + 1 + 2);

        /**
         * d) 39.2 39.2 беше моето предположение.
         */

        int x = 7;
        float y = 5.6F;
        float z = x * y;
        System.out.println(z + " " + (x * y));
    }
}
