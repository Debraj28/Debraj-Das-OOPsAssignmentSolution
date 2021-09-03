package com.greatlearning.departmentmain;
import com.greatlearning.department.AdminDepartment;
import com.greatlearning.department.HrDepartment;
import com.greatlearning.department.TechDepartment;


public class Driver {
	public static void main(String[] args) {
	
	AdminDepartment admindept = new AdminDepartment();
	HrDepartment hrdept = new HrDepartment();
	TechDepartment techdept = new TechDepartment();
	
	System.out.println(admindept.departmentName()+"\n"+admindept.getTodaysWork()+"\n"+admindept.getWorkDeadline()+"\n"+admindept.isTodayAHoliday()+"\n");

	System.out.println(hrdept.departmentName()+"\n"+hrdept.getTodaysWork()+"\n"+hrdept.getWorkDeadline()+"\n"+hrdept.doActivity()+"\n"+hrdept.isTodayAHoliday()+"\n");
	
	System.out.println(techdept.departmentName()+"\n"+techdept.getTodaysWork()+"\n"+techdept.getWorkDeadline()+"\n"+techdept.getTechStackInformation()+"\n"+techdept.isTodayAHoliday());

	}
	
}