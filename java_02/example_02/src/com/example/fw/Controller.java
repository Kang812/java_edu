package com.example.fw;

/*

controller의 종류가 여러개

초기화 - 같은 코드
실행 - 다른 코드가 실행
마무리 - 같은 코드

*/
public abstract class Controller {
    // protected는 같은 class 이거나 상속 받았을 경우에만 접근이 가능
    // final이 붙은 매소드는 오버라이딩을 금지한다.

    protected final void init(){
        System.out.println("초기화 하는 코드");
    }

    protected final void close(){
        System.out.println("마무리 하는 코드");
    }

    protected abstract void run(); //매번 다른 코드

    // 내가 가지고 있는 매소드를 호출한다.
    // 어떠한 순서를 가지고 있다. 이러한 매소드를 탬플릿 메소드라 한다.
    public void execute(){
        //초기화
        this.init(); // 생략 가능
        //실행
        this.run();
        //마무리
        this.close();
    }
}
