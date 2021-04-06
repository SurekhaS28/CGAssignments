package lab3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex7 {
	public static void main(String[] args) throws Exception {
		  Date date = new Date();  
		  SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");  
		  String strDate= sdf.format(date);  
		  System.out.println(strDate);  
	}

}
