public class EmptyCommandLineArgumentExam {
    public static void main(String[] args) {
        if (args.length == 0){
            System.out.println("사용법 : CommandLineArgumentExam 값 값 ... ");
            System.exit(0);
        }

        for(String arg : args){
            System.out.println(arg);
        }
    }
}

// String[] args = new String[0] -> JVM이 args라는 0개 짜리 배열을 만듬
// main(args);

// javac EmptyCommandLineArgumentExam.java -> class 파일 생성
// java EmptyCommandLineArgumentExam -> 실행하는 방법
// a b c d e ->는 실행의 augmentation

/*
Hello.java 파일을 작성을하고,
javac Hello.java -> 컴파일이 잘 되었다 !! 무소식이 희소식 -> 유닉스 식 철학
명령을 실행 했을 때 성공하면 아무런 메시지를 싱행하지 않는다 -> 유닉스 철학

Linux도 Unix의 계열이다.
쉘 스트립트에서는 작은 명령들의 조합해서 다른 명령을 만든다.(쉘 스크립트 작성)

작은 명령들이 실행되고 종료될 때, 이게 성공했는지 실패했는지 궁금함
System.exit(0) -> 내 명령어의 종료 코드

*/
