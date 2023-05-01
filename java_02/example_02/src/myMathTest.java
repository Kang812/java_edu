public class myMathTest {
    public static void main(String[] args){
        int value = myMath.abs(-5);
        System.out.println(value);

        //메모리에 인스턴스를 만들지 못하게 함.. !! 메로리 낭비
        // private를 사용해서 인스턴스를 못 만들게함
        myMath m = new myMath();

    }
}
