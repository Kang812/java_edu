public class UserExam {
    public static void main(String[] args){
        User user = new User("변강원", "naver@naver.com");
        //System.out.println(user.getEmail());
        //System.out.println(user.getName());
        System.out.println(user);

        System.out.println("--------------------------------------------------------------");

        User user2 = new User("홍길동", "hong@example.com", "1234");
        //System.out.println(user2.getName());
        //System.out.println(user2.getEmail());
        //System.out.println(user2.getPassword());
        System.out.println(user2);
    }
}
