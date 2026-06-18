public class Unary {
    public static void main(String[] args) {
        int x = 5;
        int y = -x;
        System.out.println(y);
        int z = x+y;
        System.out.println(z);


        int a = 5;
        a = a + 1;
        System.out.println(a);
        a += 1;
        System.out.println(a);
        a++;
        System.out.println(a);

        System.out.println("Watching Increment");
        int p = 8;
        System.out.println(p++);
        System.out.println(p);

        System.out.println(++p);
        System.out.println(p);
    }
}
