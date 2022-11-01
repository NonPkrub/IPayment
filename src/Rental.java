public class Rental implements IPayment{
    private int monthlyRate;

    public Rental(int monthlyRate) {
        this.monthlyRate = monthlyRate;
    }

    public int getMonthlyRate() {
        return monthlyRate;
    }

    public void setMonthlyRate(int monthlyRate) {
        this.monthlyRate = monthlyRate;

    }
    @Override
    public int getPayment() {
        return monthlyRate;
    }

    @Override
    public String getName(){
        return  null;
    }

    @Override
    public int getTax(){return 0; }

}
