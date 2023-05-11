public class BookExam01 {
    public static void main(String[] args){
        Book b1 = new Book();
        // 필드를 이렇게 직접적으로 접근하는 것은 좋지 않다 !!
        // 보통 필드에 private를 사용하며, private field의 경우 직접적으로 접근하지 못합니다.
        //b1.price = 100;
        //System.out.println(b1.price);

        // 필드의 값을 수정하고 얻기 위한 메소드를 만든다. setter, getter

        b1.setPrice(500);
        System.out.println(b1.getPrice());

        b1.setTitle("즐거운 자바");
        System.out.println(b1.getTitle());
        
    }
}
