package com.example.mainclass;

import com.example.pkg1.employee;
import com.example.pkg2.convertion;

public class Mainclass {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		employee emp= new employee();
		emp.setId(10);
		emp.setName("Kruthi");
		String newstr=convertion.convertJAVAtoJSON(emp);
		System.out.println(newstr);
	}

}
