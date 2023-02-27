package com.barclays.reclite.connector.model;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;
import org.springframework.stereotype.Component;

@Component
@CsvRecord(separator = ",", skipFirstLine = true)
public class SinkCsvRecord {

    @DataField(pos = 1, required = true, trim = true)
    private String departmentCode;
    @DataField(pos = 2, trim = true, defaultValue = " ")
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
        return "[CSV RECORD:: Department Code: " + this.departmentCode +
                "; Department Name: " + this.departmentName + "]";
    }
}
