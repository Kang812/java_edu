public class CarExam01 {
    public static void main(String[] args){
        Bus b1 = new Bus();
        System.out.println("------------b1------------");
        b1.run();
        b1.안내방송();

        // 안내방송을 사용할 수 없다.
        // Bus로 부터 인스턴스를 할당을 받아도 타입이 Car 이기 때문에 안내방송을 사용할 수 없다.
        // 매소드가 오버라이딩 되면 무조건 자식의 메소드가 실행이된다.
        System.out.println("------------c1------------");
        Car c1 = new Bus(); //버스는 자동차다가 가능하기에 사용가능한 문법.
        c1.run();

        // 자동차 타입으로 참조해서 사용하고 있었지만, 버스가 가지고 있던 매소드들을 전부 사용해야하는 상황이라면
        // 타입변환을 통해서 사용할 수 있다.
        System.out.println("------------b2------------");
        Bus b2 = (Bus)c1;
        b2.run();
        b2.안내방송();

        System.out.println("------------c2------------");
        Car c2 = new SuperCar();
        c2.run();

    }
}
