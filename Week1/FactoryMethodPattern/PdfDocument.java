package Deepskilling_SnowinCafasso.Week1.FactoryMethodPattern;

public class PdfDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening PDF Document.");
    }
}