package com.example;

/*

1. 1 ~ 45까지 써있는 ball을 로또 기계에 넣는다.
2. 로또 기계에서 Ball을 썪는다.
3. 썩인 Ball 중에서 6개를 꺼낸다.

*/
public interface LottoMachine {
    int MAX_BALL_COUNT = 45;
    int RETURN_BALL_COUNT = 6;

    public void setBalls(Ball[] balls); // Ball[] Ball을 여러개를 받겠다.
    public void mix(); // 자기가 가지고 있는 Ball을 썪는다.
    public Ball[] getBalls();
}
