package com.demo.core.examples;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;

public class EncodeDecodeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Path path = Paths.get("c:/temp/test.xml");
		String s = "";
		try {
			s = Files.readString(path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String base64 = Base64.getEncoder().encodeToString(s.getBytes());
		System.out.println(base64);
		
		String decodedFromBase64 = new String (Base64.getDecoder().decode(base64));
		System.out.println(decodedFromBase64);

	}
	

}
