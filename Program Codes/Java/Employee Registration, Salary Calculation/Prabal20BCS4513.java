import java.io.*; 

      class Prabal20BCS4513
    
        { 
            int UID,salary; 
            String EmployeeName; 
            void SetData() 
            throws IOException 

              { 
                  BufferedReader bf=new BufferedReader(new InputStreamReader(System.in)); 
                  String s; 
                  
                  System.out.println("<------ PRABAL MANHAS 20BCS4513 ------>"); 
                  System.out.println("ENTER UID OF EMPLOYEE :"); 

                  s=bf.readLine(); 
                  UID=Integer.parseInt(s); 


                  System.out.println("ENTER EMPLOYEE NAME :"); 
                  EmployeeName=bf.readLine(); 


                  System.out.println("ENTER SALARY : "); 
                  s=bf.readLine(); 
                  salary=Integer.parseInt(s); 

              } 
                 void ShowDetail() 
                 { 
                    System.out.println("UID :"+ UID); 
                    System.out.println("NAME : "+ EmployeeName); 
                    System.out.println("SALARY :"+ salary); 
                 } 
       } 

                class EmployeesArrayofObjects 
                   { 
                       public static void main(String args[]) 
                          { 
                             int i; 
                               try 
                                 { 
                                     Prabal20BCS4513 Employee[]= new Prabal20BCS4513[3]; 
                                     System.out.println("ENTER THE DETAILS OF THE WORKERS"); 
                                     for(i=0;i<=2;i++) 
                                         { 
                                             Employee[i]=new Prabal20BCS4513(); 
                                             Employee[i].SetData(); 
                                         } 
                                            System.out.println("******************* THE FETCHED DETAILS FOR THE ENTERED EMPLOYEES ARE : *************************"); 
                                            for(i=0;i<=2;i++) 
                                                 { 
                                                    Employee[i].ShowDetail(); 
                                                  } 
                                 } 
                                         catch(IOException e) 
                                            { 
                                             } 
                          } 
                  };