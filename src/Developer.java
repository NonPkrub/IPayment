public class Developer extends Staff {

    private int codingHour;
    private int codingRate;


    public int getCodingHour() {
        return codingHour;
    }

    public void setCodingHour(int codingHour) {
        this.codingHour = codingHour;
    }

    public int getCodingRate() {
        return codingRate;
    }

    public void setCodingRate(int codingRate) {
        this.codingRate = codingRate;
    }

    public Developer(int salary, String name, int codingHour, int codingRate) {
        super(salary,name);
        this.codingHour = codingHour;
        this.codingRate = codingRate;
    }

    @Override
    public int getPayment(){
        return  this.salary + (this.codingRate * this.codingHour);
    }

    public int getTax(){
        return this.getPayment()*3/100;
    }
}
