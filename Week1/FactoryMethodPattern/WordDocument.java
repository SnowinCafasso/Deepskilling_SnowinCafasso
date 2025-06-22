package Deepskilling_SnowinCafasso.Week1.FactoryMethodPattern;

public class WordDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening Word Document.");
    }
}