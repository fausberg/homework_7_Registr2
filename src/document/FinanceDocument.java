package document;

import java.util.Date;

public class FinanceDocument extends Document {
    double sumOfmounth;
    String codeDepartment;

    public FinanceDocument() {}

    public FinanceDocument(Date documentDate, String documentNumber, double sumOfmounth, String codeDepartment) {
        super(documentDate, documentNumber);
        this.sumOfmounth = sumOfmounth;
        this.codeDepartment = codeDepartment;
    }

    @Override
    public String toString() {
        return "Финансовая накладная: sumOfmounth=" + sumOfmounth +
                ", codeDepartment='" + codeDepartment +
                super.toString();
    }
}
