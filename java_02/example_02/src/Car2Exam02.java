public class Car2Exam02 {
    public static void main(String[] args){
        //Car2 c = new Car3("urstory");

        Bus3 b = new Bus3();
        b.run();

        SportsCar s1 = new SportsCar("SportsCar!!");
        s1.run();

        Car3 c2 = new Bus3();
        c2.run();

        Car3 c3 = new SportsCar("a");
        c3.run();

        System.out.println("-----------------------------------------------");

        Car3[] array = new Car3[2];
        array[0] = new Bus3();
        array[1] = new SportsCar("SportsCar!!");

        for(Car3 c4 : array){
            c4.run();
        }
    }
}
