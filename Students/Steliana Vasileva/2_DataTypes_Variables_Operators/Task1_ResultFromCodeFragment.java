
public class Task1_ResultFromCodeFragment {

    public static void main(String[] args) {

        int a = 5;
        int b = 10;
        int c = ++a * b--; // 6*10=60
        System.out.println(c);

        System.out.println("1 + 2 = " + 1 + 2); //"1+2=12"
        System.out.println("1 + 2 = " + (1 + 2));//"1+2=3"

        System.out.println(1 + 2 + "abc");//3abc
        System.out.println("abc" + 1 + 2);//abc12


        int x = 7; float y = 5.6f;
        float z = x * y;
        System.out.println(z + " " + (x * y));
	
	// Милен: Къде са другите точки от първа задача ? 
    }
}
