package Deepskilling_SnowinCafasso.Week1.FactoryMethodPattern;

public class WordDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}