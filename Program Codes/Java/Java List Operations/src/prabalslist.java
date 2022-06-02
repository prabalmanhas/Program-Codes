/*
JAVA PROGRAM to perform the basic operations like insert, delete, display and search in list.
List contains String object items where these operations are to be performed.

Program Made By - PRABAL MANHAS
UID - 20BCS4513
SUBJECT - PBLJ WS 2.2

*/

import java.util.List;
import java.util.ArrayList;
public class prabalslist {
    public static void main(String[]args) {

        List mylist = new ArrayList();

        System.out.println(">>>>>>>>>>>>>> PRABAL MANHAS EXP 2.2 PBLJ <<<<<<<<<<<<<<\n");

        //CREATING A LIST  WITH SOME STRING OBJECTS STORED IN IT
        mylist.add("Hello Folks");
        mylist.add("I am Prabal Manhas");

        // PRINTING THE RAW INPUT LIST

        System.out.println(">>>> [1. DISPLAY OPERATION] - THE STRING PRESENT IN RAW LIST IS:");
        System.out.print(mylist);
        System.out.println();


        // PERFORMING THE INSERT OPERATION ON MY LIST & ADDING STRING OBJECT AT INDEX 2 AND 3 IN MY LIST

        mylist.add(2,"Student of 20AIT1A IOT");
        mylist.add(3,"THANKYOU");

        // PERFORMING THE DISPLAY OPERATION ON MY LIST
        System.out.println();
        System.out.println(">>>> [2. INSERT OPERATION] - INSERTING STRING THANKYOU IN YOUR LIST ....\n");
        System.out.println("THE LIST AFTER PERFORMING INSERT OPERATION IS:");
        System.out.println(mylist);

        // PERFORMING THE DELETE OPERATION ON MY LIST & REMOVING THE ELEMENT THANKYOU FROM LIST
        System.out.println();
        System.out.println(">>>> [3. DELETE OPERATION] - DELETING STRING THANKYOU FROM YOUR LIST ....\n");
        mylist.remove("THANKYOU");

        // DISPLAY THE LIST AFTER THE DELETION OPERATION

        System.out.println("THE LIST AFTER PERFORMING DELETE/REMOVE OPERATION IS:");
        System.out.println(mylist);
        System.out.println();

        // PERFORMING THE SEARCH OPERATION ON MY LIST & SEARCHING FOR ELEMENT "I am Prabal Manhas" in MY LIST

        if (mylist.contains("I am Prabal Manhas")){
            System.out.println(">>>> [4. SEARCH OPERATION] - SEARCHING FOR THE DESIRED STRING IN LIST ....\n");
            System.out.println("YES YOUR LIST CONTAINS THE SEARCHED STRING\n");
        }
        else{
               System.out.println("NO!!!, THE LIST DOES NOT CONTAINS THE SEARCHED STRING\n");
        }
        System.out.println("*************** EXITING PROGRAM ..... THANKYOU PRABAL *********************");

    }
}