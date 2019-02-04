package myCompanyUML;

public class ServerAccount {
    private String accountID;
    private int serverHDDAllocatedCapacity;

    public ServerAccount(String accountID, int serverHDDAllocatedCapacity) {
        this.accountID = accountID;
        this.serverHDDAllocatedCapacity = serverHDDAllocatedCapacity;
    }

    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public int getServerHDDAllocatedCapacity() {
        return serverHDDAllocatedCapacity;
    }

    public void setServerHDDAllocatedCapacity(int serverHDDAllocatedCapacity) {
        this.serverHDDAllocatedCapacity = serverHDDAllocatedCapacity;
    }
}
