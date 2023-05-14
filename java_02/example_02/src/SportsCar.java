public class SportsCar extends Car3{
    public SportsCar(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("사륜 구동으로 동작한다.");
    }
}
