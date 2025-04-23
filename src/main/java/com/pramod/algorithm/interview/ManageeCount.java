package com.pramod.algorithm.interview;


import java.util.List;
import java.util.stream.Collectors;

public class ManageeCount {
    public static void main(String args[]){

        EmployeeNode employeeNodeA = new EmployeeNode();
        employeeNodeA.setName("A");
        EmployeeNode employeeNodeB = new EmployeeNode();
        employeeNodeB.setName("B");
        EmployeeNode employeeNodeC = new EmployeeNode();
        employeeNodeC.setName("C");
        EmployeeNode employeeNodeD = new EmployeeNode();
        employeeNodeD.setName("D");
        EmployeeNode employeeNodeE = new EmployeeNode();
        employeeNodeE.setName("E");
        EmployeeNode employeeNodeF = new EmployeeNode();
        employeeNodeF.setName("F");
        EmployeeNode employeeNodeG = new EmployeeNode();
        employeeNodeG.setName("g");
        EmployeeNode employeeNodeH = new EmployeeNode();
        employeeNodeA.setName("H");


        employeeNodeA.setReportees(List.of(employeeNodeB,employeeNodeC));
        employeeNodeB.setReportees(List.of(employeeNodeD,employeeNodeE));
        employeeNodeC.setReportees(List.of(employeeNodeF,employeeNodeG));
        employeeNodeG.setReportees(List.of(employeeNodeH));
        ManageeCount manageeCount = new ManageeCount();
     //   manageeCount.getManagesCount(employeeNodeA);
        System.out.println(manageeCount.getManagesCount(employeeNodeA));
        System.out.println(totalChildren(employeeNodeA));
        System.out.println(totalChildren(employeeNodeB));

    }

    public int getManagesCount(EmployeeNode empNode) {
        int count = 0;
       return getEmployeeManagesCount(empNode, count);
    }
    public int getEmployeeManagesCount(EmployeeNode empNode,int updatedCount) {

        if(empNode==null){

            return 0;
        }

        if(empNode!=null){
            List<EmployeeNode> reportees = empNode.reportees;

            if(reportees!=null){
                List<EmployeeNode> reporteesList =    reportees.stream().filter(employee->employee.reportees!=null).collect(Collectors.toList());
                for(EmployeeNode employeeNode :reporteesList){
                    updatedCount  = 1+getManagesCount(employeeNode);
//                   int     returnedcount =   getManagesCount(employeeNode);
//
//                    updatedCount  = count+getManagesCount(employeeNode);
                }
            }
        }
//        while(empNode!=null){
//            List<EmployeeNode> reportees = empNode.reportees;
//
//            if(reportees!=null){
//                int count = reportees.size();
//                List<EmployeeNode> reporteesList=    reportees.stream().filter(employee->employee.reportees!=null).collect(Collectors.toList());
//                for(EmployeeNode employeeNode :reportees){
//                    count =   getManagesCount(employeeNode);
//                    updatedCount  = updatedCount+count;
//                }
//            }
//
//
//        }

        return updatedCount;


    }
    public static int totalChildren(EmployeeNode node) {
        if (node == null) {
            return 0;
        }

        int total = 0;

        List<EmployeeNode> reportees = node.reportees;

        if(reportees!=null){

            for (EmployeeNode child : reportees) {
                total += 1 + totalChildren(child); // Count the child and all of its children

            }
        }

        return total;
    }

    }


