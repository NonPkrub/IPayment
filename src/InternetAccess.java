public class InternetAccess implements IPayment{
    private int monthlySub;

    public InternetAccess(int monthlySub) {
        this.monthlySub = monthlySub;
    }

    public int getMonthlySub() {
        return monthlySub;
    }

    public void setMonthlySub(int monthlySub) {
        this.monthlySub = monthlySub;
    }

    @Override
    public int getPayment() {
        return monthlySub;
    }

    @Override
    public String getName(){
        return null;
    }

    @Override
    public int getTax(){return 0; }
}
