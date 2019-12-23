package com.program;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import org.json.JSONObject;

public class Assigment {
	public static void main(String[] args) {
		try {
			File file = new File("D:\\assigment.txt"); 
			FileReader fr = new FileReader(file); 
			BufferedReader br = new BufferedReader(fr); 
			String line;
			JSONObject obj = new JSONObject();

			while ((line = br.readLine()) != null) {

				String key = line.substring(0, line.indexOf(":"));
				String value = line.substring(line.indexOf(":") + 1, line.length()).trim();

				obj.put(key, value);

			}
			System.out.println(obj);
			fr.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
