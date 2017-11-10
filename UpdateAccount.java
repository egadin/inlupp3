import java.io.Serializable;

public class UpdateAccount implements Serializable {
    private Account oldAccount;
    private Account newAccount;

    public void AddOldAccount(Account old) {
        this.oldAccount=old;
    }

    public void AddNewAccount(Account newAccount) {
        this.newAccount=newAccount;
    }

    public Account getOldAccount() {
        return this.oldAccount;
    }
    
    public Account getNewAccount() {
        return this.newAccount;
    }
}
