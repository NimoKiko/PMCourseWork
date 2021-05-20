package sspu.ctq.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {

    private int uid;            //用户编号
    private String username;    //用户名
    private String password;    //用户密码

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
