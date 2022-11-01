public class Marketing extends Staff{

    private int extraLanguage;
    private int extraLanguageRate;

    public Marketing(int salary, String name, int extraLanguage, int extraLanguageRate) {
        super(salary, name);
        this.extraLanguage = extraLanguage;
        this.extraLanguageRate = extraLanguageRate;
    }

    public int getExtraLanguage() {
        return extraLanguage;
    }

    public void setExtraLanguage(int extraLanguage) {
        this.extraLanguage = extraLanguage;
    }

    public int getExtraLanguageRate() {
        return extraLanguageRate;
    }

    public void setExtraLanguageRate(int extraLanguageRate) {
        this.extraLanguageRate = extraLanguageRate;
    }

    @Override
    public int getPayment() {
        return this.salary + (this.extraLanguage * this.extraLanguageRate);
    }

    public int getTax(){
        return this.getPayment()*3/100;
    }
}
