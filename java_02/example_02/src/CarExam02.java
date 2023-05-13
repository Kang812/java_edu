public class CarExam02 {
    public static void main(String[] args){
        Car c1 = new Car();
        System.out.println(c1);
        c1.printName();
        System.out.println("-----------------------------");
        Car c2 = new Car("urstroy");
        c2.printName();
    }
}
