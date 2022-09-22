package document;

import java.util.Date;

public class EmployeeDocument extends Document {
    Date endDocument;
    String nameEmployee;

    public EmployeeDocument(){}

    public EmployeeDocument(Date documentDate, String documentNumber, Date endDocument, String nameEmployee) {
        super(documentDate, documentNumber);
        this.endDocument = endDocument;
        this.nameEmployee = nameEmployee;
    }

    @Override
    public String toString() {
        return "Контракт с сотрудником: endDocument=" + endDocument +
                ", nameEmployee='" + nameEmployee +
                super.toString();
    }
}
