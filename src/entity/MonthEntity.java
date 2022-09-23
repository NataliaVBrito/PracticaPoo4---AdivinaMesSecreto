package entity;

public class MonthEntity {

    private String[] months;
    private String secretMonth;

    public MonthEntity() {
    }

    public MonthEntity(String[] months, String secretMonth) {
        this.months = months;
        this.secretMonth = secretMonth;
    }

    public String[] getMonths() {
        return months;
    }

    public void setMonths(String[] months) {
        this.months = months;
    }

    public String getSecretMonth() {
        return secretMonth;
    }

    public void setSecretMonth(String secretMonth) {
        this.secretMonth = secretMonth;
    }

}
