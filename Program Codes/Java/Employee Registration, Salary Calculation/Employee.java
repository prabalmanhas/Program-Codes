// Author - Prabal Manhas
// Subj - Project Based Learning (Java Lab)
// Dated - 17/02/2022

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Employee {
    String empId;
    String depName;
    String empDesignation;
    String empName;
    String dateJoin;
    int basic;
    int hra;
    int it;
    char designationCode;
    public static int da;

    public Employee(String empId, String depName,
            String empDesignation,
            String empName,
            String dateJoin, int basic, int hra,
            int it, char designationCode) {

        this.empId = empId;
        this.depName = depName;
        this.empDesignation = empDesignation;
        this.empName = empName;
        this.dateJoin = dateJoin;
        this.basic = basic;
        this.hra = hra;
        this.it = it;
        this.designationCode = designationCode;

    }

    public static int da(char designationCode)

    {
        switch (designationCode) {
            case 'e': {
                da = 20000;
                break;
            }
            case 'c': {
                da = 32000;
                break;
            }
            case 'k': {
                da = 12000;
                break;
            }
            case 'r': {
                da = 15000;
                break;
            }
            case 'm': {
                da = 40000;
                break;
            }
            default:
                throw new IllegalStateException("Unexpected value: " + designationCode);
        }
        return da;
    }

    public static int salary(int basic, int hra, int da, int it) {
        int salary = basic + hra + da - it;
        return salary;
    }

    public static void details(String empId, String empName, String depName, String empDesignation, int salary) {

        System.out.println("EMPLOYEE \tEMPLOYEE NAME\tDEPARTMENT\tDESIGNATION\t\tSALARY");
        System.out.println(empId + "\t\t" + empName + "\t\t" + depName + "\t\t" + empDesignation + "\t\t" + salary);

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String empId;
        int c = 0;
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("4513", "IOT", "SOPHOMORE", "PRABAL", "16/08/2020", 20000, 8000, 3000,
                'e');
        employees[1] = new Employee("4514", "CSE", "STUDENT", "MANHAS", "17/08/2021", 30000, 12000, 9000, 'c');
        employees[2] = new Employee("4515", "IOT", "ENGINEER", "SINGH", "29/05/2022", 10000, 8000, 1000,'k');

        System.out.println("< ----------------- PRABAL MANHAS WORKSHEET 1 JAVA LAB ----------------- >");

        // Adding 2 blank lines to make output more recognizable

        System.out.println();
        System.out.println();
        System.out.println("**** PLEASE ENTER EMPLOYEE ID **** ");
        empId = bufferedReader.readLine();

        for (int i = 0; i < 3; i++) {

            if (employees[i].empId.equals(empId)) {
                c = 1;
                int salary = salary(employees[i].basic, employees[i].hra, da(employees[i].designationCode),
                        employees[i].designationCode);
                details(employees[i].empId, employees[i].empName, employees[i].depName, employees[i].empDesignation,
                        salary);
                break;
            }
        }
        if (c != 1)
            System.out.println("SORRY!! THE ENTERED EMPLOYEE ID NOT FOUND, TRY AGAIN");
    }
}