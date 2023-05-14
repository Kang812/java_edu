public abstract class Car3 {
    public Car3(String name){
        System.out.println("Car3() 생성자 호출");
    }

    // 추상메소드. Car3를 만든 사람은 run()이라는 메소드가 필요하다라고 생각을 하였다.
    // run()은 자동차마다 다르게 구현할 것 같아.
    public abstract void run(); //구현 부분 없이 매소드 선언만 해줌
}
