package com.example.asome.asome_sourcerequire.Project;

public class Role {
    String roel_name,role_end_date, role_start_date;

    public Role(String roel_name, String role_end_date, String role_start_date) {
        this.roel_name = roel_name;
        this.role_end_date = role_end_date;
        this.role_start_date = role_start_date;
    }

    public String getRole_name() {
        return roel_name;
    }

    public void setRoel_name(String roel_name) {
        this.roel_name = roel_name;
    }

    public String getRole_end_date() {
        return role_end_date;
    }

    public void setRole_end_date(String role_end_date) {
        this.role_end_date = role_end_date;
    }

    public String getRole_start_date() {
        return role_start_date;
    }

    public void setRole_start_date(String role_start_date) {
        this.role_start_date = role_start_date;
    }
}
