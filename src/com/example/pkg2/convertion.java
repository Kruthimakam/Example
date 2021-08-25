package com.example.pkg2;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class convertion 
{
	private static ObjectMapper obj;
	static {
		obj = new ObjectMapper();
	}
	public static String convertJAVAtoJSON(Object object)
	{
		String jsonvalue="";
		try {
			jsonvalue = obj.writeValueAsString(object);
		} catch (JsonGenerationException e) {
			System.out.println("Exception occured while converting the java obj to json"+e.getMessage());
		} catch (JsonMappingException e) {
			System.out.println("Exception occured while converting the java obj to json"+e.getMessage());
		} catch (IOException e) {
			System.out.println("Exception occured while converting the java obj to json"+e.getMessage());
		}
		
		return jsonvalue;
		
	}
}
