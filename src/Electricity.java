public class Electricity implements IPayment{
    private int unitOfUse;

    private int rate;

    public Electricity(int unitOfUse, int rate) {
        this.unitOfUse = unitOfUse;
        this.rate = rate;
    }

    public int getUnitOfUse() {
        return unitOfUse;
    }

    public void setUnitOfUse(int unitOfUse) {
        this.unitOfUse = unitOfUse;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    @Override
    public int getPayment() {
        return unitOfUse * rate;
    }

    @Override
    public String getName(){
        return null;
    }

    @Override
    public int getTax(){return 0; }
}
