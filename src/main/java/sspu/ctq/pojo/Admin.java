package sspu.ctq.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class Admin implements Serializable {
    private int adnminId;
    private String adminName;
    private String password;

    public int getAdnminId() {
        return adnminId;
    }

    public void setAdnminId(int adnminId) {
        this.adnminId = adnminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Admin(int adnminId, String adminName, String password) {
        this.adnminId = adnminId;
        this.adminName = adminName;
        this.password = password;
    }

    public Admin() {
    }
}
