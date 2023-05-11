public class Child extends Perent{
    public int i = 15; //필드에 대한 오버라이딩

    // 매소드에 대한 오버라이딩
    public void printI(){
        System.out.println(" child - printI() : " + i);
    }
}
