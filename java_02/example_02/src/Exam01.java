public class Exam01 {
    public static void main(String[] args){
        Perent p1 = new Perent();
        System.out.println(p1.i);
        p1.printI();

        System.out.println("----------------------");

        Child c1 = new Child();
        System.out.println(c1.i);
        c1.printI();

        System.out.println("----------------------");

        // 필드의 경우, 오버라이딩이 된다고 해도, 자식의 값이 아닌 부모 것을 따라간다.
        Perent p2 = new Child(); //Child는 Perent의 후손이다. 혹은 자식이다.
        System.out.println(p2.i);
        p2.printI();
        p2.printII();

    }
}
