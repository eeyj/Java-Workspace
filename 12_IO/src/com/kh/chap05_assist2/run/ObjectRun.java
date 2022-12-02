package com.kh.chap05_assist2.run;

import com.kh.chap05_assist2.model.dao.ObjectDao;
import com.kh.chap05_assist2.model.dao.ObjectsDao;

public class ObjectRun {

	public static void main(String[] args) {

		
		ObjectDao od = new ObjectDao();
		
		//od.fileSave("phone.txt");
		//od.fileRead();
		
		ObjectsDao ods = new ObjectsDao();
		//ods.fileSave("phoneList.txt");
		ods.fileRead();

	
	
	
	
	
	}

}
