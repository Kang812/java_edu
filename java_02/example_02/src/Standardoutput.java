public class Standardoutput {
    public void println(boolean b){
        System.out.println(b);
    }

    public void println(int i){
        System.out.println(i);
    }

    public void println(double d){
        System.out.println(d);
    }

    public void println(String s ){
        System.out.println(s);
    }

    public static void main(String[] args){
        Standardoutput output = new Standardoutput();
        output.println(100);
        output.println("Hello");
        output.println(false);
        output.println(10.5);
    }
}
