package s01_01.n3ejercicio1;

public abstract class News {


    protected String titular;
    protected String text;
    protected int punctuation;
    protected double price;

    public News(String titular) {
        this.titular = titular;
        this.text = " ";

    }

    public abstract void calculatePriceNews();
    public abstract void calculatePunctuation();

    

    public String getTitular() {
        return titular;
    }

    public String getText() {
        return text;
    }

    public int getPunctuation() {
        return punctuation;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setPunctuation(int punctuation) {
        this.punctuation = punctuation;
    }

    public void setText(String text) {
        this.text = text;
    }
}
