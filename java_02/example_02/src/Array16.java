import java.util.Arrays;
public class Array16 {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {1,2,3,4,5};

        // 양수, 0 음수(비교시에 주의!!)
        // x - y = 양수 -> x가 큰 값
        // x - y = 음수 -> y가 크다.
        // x - y = 0 -> 같다
        int compare1 = Arrays.compare(array1, array2);

        System.out.println(compare1);

        int[] array3 = {100,2,3,4,5};
        int[] array4 = {1,2,3,4,5};

        int compare2 = Arrays.compare(array3, array4);

        System.out.println(compare2);

    }
}
