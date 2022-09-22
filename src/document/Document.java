package document;

import java.util.Date;

public abstract class Document {
    private Date documentDate;
    private String documentNumber;

    Document(){}

    Document(Date documentDate, String documentNumber){
        this.documentDate = documentDate;
        this.documentNumber = documentNumber;
    }

    public Date getDocumentDate() {
        return documentDate;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    @Override
    public String toString() {
        return ", documentDate=" + documentDate +
                ", documentNumber=" + documentNumber;
    }
}
