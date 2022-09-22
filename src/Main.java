import document.Document;
import document.EmployeeDocument;
import document.FinanceDocument;
import document.ProductDocument;
import register.Register;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Register register = new Register();
        Document productDocument1 = new ProductDocument(new Date(), "2", "type", 123);
        Document productDocument2 = new ProductDocument(new Date(), "3", "type", 123);
        Document employeeDocument1 = new EmployeeDocument(new Date(), "4", new Date(), "Ivan");
        Document financeDocument1 = new FinanceDocument(new Date(), "5",3214, "512");
        register.saveDocument(productDocument1);
        register.saveDocument(productDocument2);
        register.saveDocument(employeeDocument1);
        register.saveDocument(financeDocument1);
        register.getDocumentInfo("2");
        register.getDocumentInfo("4");
        register.getDocumentInfo("5");
        register.getDocumentInfo("6");
    }
}