import week2.ex3_6.*;;

public class Test {
    public static void main(String[] args) {
        Account a = new Account(1, 100);
        Account b = new Account(2, 200);

        System.out.println(a);
        System.out.println(b);
        a.transferTo(30, b);
        System.out.println(a);
    }
}
