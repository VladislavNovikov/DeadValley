package incubator.course.dead.valley.application.model;

public class User {
    private String name;
    private String sureName;
    private int userId;
    private int account;

    public User() { }

    public User(String name, String sureName, int userId, int account) {
        this.name = name;
        this.sureName = sureName;
        this.userId = userId;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public String getSureName() {
        return sureName;
    }

    public int getUresId() {
        return userId;
    }

    public int getAccount() {
        return account;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSureName(String sureName) {
        this.sureName = sureName;
    }

    public void setUresId(int uresId) {
        this.userId = uresId;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return  name +" "+ sureName + ", userId=" + userId + ", account=" + account;
    }
}
