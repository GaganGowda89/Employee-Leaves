package com.company;

import java.util.*;

public class Main {

   static int total_annual_leaves = 15;
   static int total_sick_leaves = 10;

  static class Employee {
  private String eName;
  private int empid;
  private int eanualeave;
  private int esickleave;

  public Employee(String name, int eid, int anualeave, int sickleave) {
   eName = name;
   empid = eid;
   eanualeave = anualeave;
   esickleave = sickleave;
  }

  public String getName() {
   return eName;
  }

  public int geteid() {
   return empid;
  }

  public int getanualeave() {
   return eanualeave;
  }

  public int getsickleave() {
   return esickleave;
  }
 }


    public static void main(String[] args) {

     System.out.println("----- Enter the Employee details -----");

     ArrayList<Employee> emp = new ArrayList<Employee>();
     ArrayList<Integer> al = new ArrayList<Integer>();

     Scanner in = new Scanner(System.in);

     System.out.println("Enter the number of employees you want to feed in the details with:");
     int count = in.nextInt();

     for(int x =0 ; x<count; x++) {

      System.out.print("Enter your name: ");
      String name = in.next();
      System.out.println("Name: " + name);
      System.out.print("Enter your EmpID: ");
      int i = in.nextInt();
      System.out.println("empid: " + i);
      System.out.print("Enter your Annual leaves: ");
      int d = in.nextInt();
      System.out.println("Annual Leaves: " + d);

      System.out.print("Enter your Sick leaves: ");
      int s = in.nextInt();
      System.out.println("Sick Leaves: " + s);


      emp.add(new Employee(name, i, d, s));

      //Calculate the remaining leaves
       al.add( remaining_leaves(d, s));
     }
     System.out.println("== Name == \t == EmpID == \t == Al == \t == SL == \t == LR== \n");

     for (int j = 0; j < emp.size(); j++) {
      System.out.println("== " + emp.get(j).eName + " == \t == " + emp.get(j).empid + " == \t == " + emp.get(j).eanualeave + " == \t == " + emp.get(j).esickleave + " == \t == " + al.get(j) + " == ");
     }
     in.close();
    }

    public static int remaining_leaves(int al , int sl){
          int la = (total_annual_leaves - al) + (total_sick_leaves - sl );

        return la;
    }
}
