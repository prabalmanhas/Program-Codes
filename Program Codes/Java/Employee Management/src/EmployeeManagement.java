import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

@SuppressWarnings("serial")
class Employee implements Serializable{

    int id;
    String name;
    float salary;
    long contact_no;
    String email_id;

    public Employee(int id, String name, float salary, long contact_no, String email_id)
    {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.contact_no = contact_no;
        this.email_id = email_id;
    }

    public String toString()
    {
        return "\n> EMPLOYEE DETAILS:" + "\n>EMPLOYEE ID: " + this.id + "\n>NAME: " + this.name + "\n>SALARY: " +
                this.salary + "\nContact No: " + this.contact_no + "\nEmail-id: " + this.email_id;
    }

}

public class EmployeeManagement
{
    static void display(ArrayList<Employee> al)
    {
        System.out.println("\n>>>>>>>>>>LIST OF EMPLOYEES<<<<<<<<<<<<<<\n");
        System.out.println(String.format("%-10s%-15s%-10s%-20s%-10s", "EMPLOYEE ID","NAME","SALARY","CONTACT NO.","MAIL ID"));
        for(Employee e : al)
        {
            System.out.println(String.format("%-5s%-20s%-10s%-15s%-10s",e.id,e.name,e.salary,e.contact_no,e.email_id));
        }
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args)
    {
        int id;
        String name;
        float salary;
        long contact_no;
        String email_id;

        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> al = new ArrayList<Employee>();

        File f = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos =null;
        try{

            f = new File("C:/Users/PRABAL MANHAS/IdeaProjects/EmployeeManagement/src/Prabal20BCS4513.txt");
            if(f.exists())
            {
                fis = new FileInputStream(f);
                ois = new ObjectInputStream(fis);
                al = (ArrayList<Employee>)ois.readObject();
            }

        }
        catch(Exception exp){
            System.out.println(exp);
        }
        do
        {
            System.out.println("\n~~~~~~~~~~~~~~ PRABAL MANHAS || 20BCS4513 || WS 4 ~~~~~~~~~~~~~~~\n");
            System.out.println("1 > ADD EMPLOYEES\n" +
                    "2 > SEARCH EMPLOYEES\n" +
                    "3 > EDIT EMPLOYEES DETAILS\n" +
                    "4 > DELETE EMPLOYEE DETAILS\n" +
                    "5). DISPLAY ALL EMPLOYEES\n" +
                    "6). EXIT\n");
            System.out.println("*** ENTER YOUR DESIRED CHOICE ***");
            int ch = sc.nextInt();

            switch(ch)
            {
                case 1:System.out.println("\n~~~~~ ENTER DETAILS TO ADD IN THE LIST ~~~~~\n");
                    System.out.println("> ENTER ID:");
                    id = sc.nextInt();
                    System.out.println("> ENTER NAME:");
                    name = sc.next();
                    System.out.println("> ENTER SALARY:");
                    salary = sc.nextFloat();
                    System.out.println("> ENTER CONTACT NO.");
                    contact_no = sc.nextLong();
                    System.out.println("> ENTER EMAIL ID:");
                    email_id = sc.next();
                    al.add(new Employee(id, name, salary, contact_no, email_id));
                    display(al);
                    break;

                case 2: System.out.println("ENTER SEARCH ~ ENTER EMPLOYEE ID");
                    id = sc.nextInt();
                    int i=0;
                    for(Employee e: al)
                    {
                        if(id == e.id)
                        {
                            System.out.println(e+"\n");
                            i++;
                        }
                    }
                    if(i == 0)
                    {
                        System.out.println("\nERR!! SORRY DETAILS NOT FOUND, PLEASE CHECK YOUR INPUT AGAIN");
                    }
                    break;

                case 3: System.out.println("\nTO EDIT DETAILS - ENTER EMPLOYEE ID");
                    id = sc.nextInt();
                    int j=0;
                    for(Employee e: al)
                    {
                        if(id == e.id)
                        {
                            j++;
                            do{
                                int ch1 =0;
                                System.out.println("\nEDIT EMPLOYEE DETAILS\n" +
                                        "1). EMPLOYEE ID\n" +
                                        "2). NAME\n" +
                                        "3). SALARY\n" +
                                        "4). CONTACT NO.\n" +
                                        "5). EMAIL ID\n" +
                                        "6). RETURN TO MAIN MENU\n");
                                System.out.println("ENTER YOUR DESIRED CHOICE");
                                ch1 = sc.nextInt();
                                switch(ch1)
                                {
                                    case 1: System.out.println("\nENTER THE NEW EMPLOYEE ID:");
                                        e.id =sc.nextInt();
                                        System.out.println(e+"\n");
                                        break;

                                    case 2: System.out.println("ENTER NEW EMPLOYEE NAME:");
                                        e.name =sc.nextLine();
                                        System.out.println(e+"\n");
                                        break;

                                    case 3: System.out.println("ENTER NEW EMPLOYEE SALARY:");
                                        e.salary =sc.nextFloat();
                                        System.out.println(e+"\n");
                                        break;

                                    case 4: System.out.println("ENTER NEW EMPLOYEE CONTACT NO.:");
                                        e.contact_no =sc.nextLong();
                                        System.out.println(e+"\n");
                                        break;

                                    case 5: System.out.println("ENTER NEW EMPLOYEE EMAIL ID:");
                                        e.email_id =sc.next();
                                        System.out.println(e+"\n");
                                        break;

                                    case 6: j++;
                                        break;

                                    default : System.out.println("\nENTER A CORRECT CHOICE FROM THE LIST:");
                                        break;

                                }
                            }
                            while(j==1);
                        }
                    }
                    if(j == 0)
                    {
                        System.out.println("\nNO DETAILS FOUND FOR THE ENTERED EMPLOYEE ID, CHECK AGAIN!!");
                    }

                    break;

                case 4: System.out.println("\nENTER THE EMPLOYEE ID YOU WANT TO DELETE FROM THE DATABASE");
                    id = sc.nextInt();
                    int k=0;
                    try{
                        for(Employee e: al)
                        {
                            if(id == e.id)
                            {
                                al.remove(e);
                                display(al);
                                k++;
                            }
                        }
                        if(k == 0)
                        {
                            System.out.println("\nEMPLOYEE DETAILS ARE NOT AVAILABLE, PLEASE CHECK");
                        }
                    }
                    catch(Exception ex){
                        System.out.println(ex);
                    }
                    break;

                case 5: try {
                    al = (ArrayList<Employee>)ois.readObject();

                } catch (ClassNotFoundException e2) {

                    System.out.println(e2);
                } catch (Exception e2) {

                    System.out.println(e2);
                }
                    display(al);
                    break;

                case 6: try {
                    fos = new FileOutputStream(f);
                    oos = new ObjectOutputStream(fos);
                    oos.writeObject(al);
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
                catch(Exception e2){
                    e2.printStackTrace();
                }
                finally{
                    try {
                        fis.close();
                        ois.close();
                        fos.close();
                        oos.close();
                    } catch (Exception e1) {
                        e1.printStackTrace();
                    }

                }
                    System.out.println("\nSAVING YOUR FILES PRABAL, EXITING PROGRAM......");
                    sc.close();
                    System.exit(0);
                    break;

                default : System.out.println("\nENTER A VALID CHOICE FROM THE LIST");
                    break;

            }
        }
        while(true);
    }

}