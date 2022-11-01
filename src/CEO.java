public class CEO extends Staff{

    private int experience;
    private int experienceRate;

    public CEO(int salary, String name, int experience, int experienceRate) {
        super(salary, name);
        this.experience = experience;
        this.experienceRate = experienceRate;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getExperienceRate() {
        return experienceRate;
    }

    public void setExperienceRate(int experienceRate) {
        this.experienceRate = experienceRate;
    }

    @Override
    public int getPayment() {
        return this.salary + (this.experience * this.experienceRate);
    }

    public int getTax(){
        return this.getPayment()*3/100;
    }
}
