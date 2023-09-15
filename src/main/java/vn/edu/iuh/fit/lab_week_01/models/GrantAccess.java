package vn.edu.iuh.fit.lab_week_01.models;

public class GrantAccess {
    private String role_id;
    private String account_id;
    private isGrant is_grand;
    private String note;

    public GrantAccess() {
    }

    public GrantAccess(String role_id, String account_id, isGrant is_grand, String note) {
        this.role_id = role_id;
        this.account_id = account_id;
        this.is_grand = is_grand;
        this.note = note;
    }

    public String getRole_id() {
        return role_id;
    }

    public void setRole_id(String role_id) {
        this.role_id = role_id;
    }

    public String getAccount_id() {
        return account_id;
    }

    public void setAccount_id(String account_id) {
        this.account_id = account_id;
    }

    public isGrant getIs_grand() {
        return is_grand;
    }

    public void setIs_grand(isGrant is_grand) {
        this.is_grand = is_grand;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
