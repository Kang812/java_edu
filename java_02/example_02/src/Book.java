public class Book {
    private String title;
    private int price;

    //setter - getter - 프로퍼티(property) -> price 프로퍼티
    public int getPrice(){
        // this는 자기 자신의 인스턴스를 참조하는 예약어.
        return this.price*2;
    }

    public void setPrice(int price) {
        this.price = price;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
