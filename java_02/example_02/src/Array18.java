import java.util.Arrays;

public class Array18 {
    public static void main(String[] args) {
        int[] array = {5,4,3,1,2};

        int i = Arrays.binarySearch(array, 1);
        System.out.println(i);

        Arrays.sort(array);

        // 정렬된 배열에서 부터 값을 찾는다!!
        i = Arrays.binarySearch(array, 1);
        System.out.println(i);
    }
}
