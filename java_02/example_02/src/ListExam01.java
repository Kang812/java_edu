import java.util.ArrayList;
import java.util.Arrays;

// 제네릭을 사용하지 않고 ArrayList 사용하기
public class ListExam01 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Kim");
        list.add("lee");
        list.add("hong");

        String str1 = (String)list.get(0);
        String str2 = (String)list.get(1);
        String str3 = (String)list.get(2);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}
