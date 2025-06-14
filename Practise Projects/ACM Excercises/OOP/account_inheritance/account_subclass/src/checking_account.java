public class checking_account extends Account {

    private double overdraft;

    public checking_account(int ID,double balance,double overdraft){
        super(ID,balance);
        setOverdraft(overdraft);
    }

    public checking_account(){
        this(0, 0, 0);
    }

    public void setOverdraft(double overdraft){
        this.overdraft = overdraft < 0 ? overdraft : this.overdraft;
    }

    public double getOverdraft(){
        return overdraft;
    }
    @Override
    public boolean withdraw(double amount){
        if (getBalance() - amount > overdraft) {
            setBalance(getBalance() - amount);
            return true;
        }
        else{
            System.out.println("No money can be withdrawn");
            return false;
        }
    }
}
