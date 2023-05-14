public class Bus3 extends Car3{
    public Bus3(){
        super("Bus!!");
        System.out.println("Bus3 기본 생성자");
    }

    // Car3를 상속 받은 버스3는 선언만한 run 매소드를 구현을 해주어야한다.
    @Override
    public void run(){
        System.out.println("후륜 구동으로 동작한다.");
    }
}
