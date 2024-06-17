package vn.codegym.model;

public class Login {
/*
* TODO: Bước 3: Tạo model Login
    - Lớp com.codegym.model.Login mô tả
      các thông tin của bao gồm: account và password.
* */

    private String account;
    private String password;

    public Login() {
    }

    public Login(String account, String password) {
        this.account = account;
        this.password = password;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
