package com.pramod.algorithm.interview;

import java.util.List;

public class EmployeeNode {
    String name;
    Integer exp;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getExp() {
        return exp;
    }

    public void setExp(Integer exp) {
        this.exp = exp;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public List<EmployeeNode> getReportees() {
        return reportees;
    }

    public void setReportees(List<EmployeeNode> reportees) {
        this.reportees = reportees;
    }

    Integer level;
    List<EmployeeNode> reportees;
}
