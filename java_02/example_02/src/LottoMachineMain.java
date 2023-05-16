import com.example.Ball;
import com.example.LottoMachine;
import com.example.LottoMachineImpl;

public class LottoMachineMain {
    public static void main(String[] args){
        //변수가 45개 필요하다. Ball 인스턴스를 45개 참조할 수 있는 배열이 만들어진다.
        Ball[] balls = new Ball[LottoMachine.MAX_BALL_COUNT];

        for(int i = 0; i < LottoMachine.MAX_BALL_COUNT; i++){
            balls[i] = new Ball(i+1);
        }
        // LottoMachine 인스턴스가 생성되었다.
        LottoMachine lottomachine = new LottoMachineImpl();
        lottomachine.setBalls(balls);
        lottomachine.mix();
        Ball[] result = lottomachine.getBalls();

        for(int i = 0; i < result.length; i++){
            System.out.println(result[i].getNumber());
        }
    }
}
