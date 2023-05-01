public class MathBeanTest {
    public static void main(String[] args){
        MathBean mb = new MathBean();

        mb.printClassName();
        mb.printNumber(100);

        int a = mb.getOne();
        System.out.println(a);

        int b = mb.plus(100,100);
        System.out.println(b);
    }
}
