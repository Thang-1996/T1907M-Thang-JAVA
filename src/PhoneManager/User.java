package PhoneManager;

public class User {
    public String name;
    public String sdt;

    public User() {
    }

    public User(String name, String sdt) {
        this.name = name;
        this.sdt = sdt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
}
