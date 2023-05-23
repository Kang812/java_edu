public class GenericBoxMain {
    public static void main(String[] args) {
        GenericBox<String> genericbox = new GenericBox<>();
        genericbox.add("kim");
        String str = genericbox.get();
        System.out.println(str);

        GenericBox<Integer> intBox = new GenericBox<>();
        intBox.add(5);
        Integer intValue = intBox.get();
        System.out.println(intValue);

        GenericBox<Object> objBox = new GenericBox<>();
        objBox.add("hello");
        String str2 = (String)objBox.get();
        System.out.println(str2);
    }
}
