package com.qingke.client;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.annotation.Annotation;
import java.net.HttpURLConnection;
import java.net.URL;


import com.qingke.first.FirstClass;

public class Client {
	public String name;
	public Client() {
		// TODO Auto-generated constructor stub
		setName("haha");
		Annotation[] a = FirstClass.class.getAnnotations();
		System.out.println(a.length);
		for (Annotation annotation : a) {
			System.out.println(annotation);
//			Class<? extends Annotation> clazz = annotation.getClass();
			Class<? extends Annotation> clazz = annotation.annotationType();
//			System.out.println(clazz);
			System.out.println(clazz.getConstructors());
//			Bean bean = (Bean) clazz.getAnnotation(Bean.class);
		}
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client t = new Client();
		t.run2();

	}
	
	public void run1() {//每次请求都是一次全新的请求。都会产生一个新的ssession
		try {
			String url = "http://localhost:8080/tomcat/FirstClass";
			URL u = new URL(url);
			HttpURLConnection conn = (HttpURLConnection) u.openConnection();
			conn.connect();
			int ret = conn.getResponseCode();
			if (ret == 200) {
				readAndPrint(conn);
			} else {
				System.out.println("Error: as return " + ret);
			}
			conn.disconnect();
			//try to visit again to see whether we have session now
			URL u2 = new URL(url);
			HttpURLConnection conn2 = (HttpURLConnection) u2.openConnection();
			conn2.connect();
			int ret2 = conn2.getResponseCode();
			if (ret2 == 200) {
				readAndPrint(conn2);
			} else {
				System.out.println("Error: as return " + ret2);
			}
			conn2.disconnect();
		} catch (Exception e) {
			System.err.println("Error in Exception " + e.getMessage());
		}
	}
	
	public void run2() {//直接把之前的ssession id放进来
		try {
			String sessionId = "9C3E0221C5169E2435219A73DB3D9B21";
			String url = "http://localhost:8080/tomcat/FirstClass";
			URL u = new URL(url);
			HttpURLConnection conn = (HttpURLConnection) u.openConnection();
			conn.addRequestProperty("Cookie", "JSESSIONID=" + sessionId);
			conn.connect();
			int ret = conn.getResponseCode();
			if (ret == 200) {
				readAndPrint(conn);
			} else {
				System.out.println("Error: as return " + ret);
			}
			conn.disconnect();
			
		} catch (Exception e) {
			System.err.println("Error in Exception " + e.getMessage());
		}
	}
	
	private void readAndPrint(HttpURLConnection conn) throws Exception {
		InputStream is = conn.getInputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		String line;
		while((line = br.readLine()) != null) {
			System.out.println(line);
		}
		br.close();
	}
}
