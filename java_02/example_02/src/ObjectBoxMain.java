public class ObjectBoxMain {
    public static void main(String[] args) {
        ObjectBox box = new ObjectBox();
        box.set("kim");
        String str = (String)box.get();
        System.out.println(str.toUpperCase());

        box.set(5);
        Integer i = (Integer)box.get();
        System.out.println(i.intValue());
    }
}
