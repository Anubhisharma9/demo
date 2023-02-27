package com.barclays.reclite.connector.model;


import java.io.Serializable;

public class SinkBean implements Serializable {

    private String departmentCode;

    private String departmentName;

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return "[ RECORD:: Department Code: " + this.departmentCode +
                "; Department Name: " + this.departmentName + "]";
    }
}
