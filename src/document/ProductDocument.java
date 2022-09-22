package document;

import java.util.Date;


public class ProductDocument extends Document {
    private String productType;
    private int numberOfProducts;

    public ProductDocument(){}

    public ProductDocument(Date documentDate, String documentNumber, String productType, int numberOfProducts) {
        super(documentDate, documentNumber);
        this.productType = productType;
        this.numberOfProducts = numberOfProducts;
    }

    @Override
    public String toString() {
        return "Контракт продуктов: productType=" + productType +
                ", numberOfProducts=" + numberOfProducts +
                super.toString();
    }
}
