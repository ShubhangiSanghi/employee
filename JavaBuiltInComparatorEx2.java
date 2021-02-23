package com;
import java.util.*;
class Employee {

    private String name;
    private String department;

    public String getName() {
        return name;
    }
    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getDepartment() {

        return this.department;
    }
   @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("name='").append(name).append('\'');
        sb.append(", department=").append(department);
        sb.append('}');
        return sb.toString();
    }
}
public class JavaBuiltInComparatorEx2 {

    public static void main(String[] args) {
          String s,d;
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the number of employees");
    	int n=sc.nextInt();
    	sc.nextLine();
    	 List<Employee> vals = new ArrayList<>();
    	for(int i=0;i<n;i++)
    	{
    		System.out.println("Enter name");
    		s=sc.nextLine();
    		System.out.println("Enter department");
    		d=sc.nextLine();
    		 Employee p = new Employee(s,d);
    		 vals.add(p);

    	}
      /*  Employee p1 = new Employee("Robert", "ECE");
        Employee p2 = new Employee("Monika", "CSE");
        Employee p3 = new Employee("Tom", "MCE");
        Employee p4 = new Employee("Elisabeth", "SEE");

       */
        vals.sort(Comparator.comparing(Employee::getName));
        vals.forEach(System.out::println);
    }
}

