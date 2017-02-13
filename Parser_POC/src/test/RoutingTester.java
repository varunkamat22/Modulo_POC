package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class RoutingTester {

	public static void main(String[] args) {
		int count = 0;
		for (int i = 0; i < 25; i++) {

			Thread t = new Thread(() -> {
				URL url;
				try {
					url = new URL("http://localhost:8080/RoutingPOC/news");
					HttpURLConnection conn = (HttpURLConnection) url.openConnection();
					conn.setRequestMethod("GET");
					conn.setConnectTimeout(20000);
					conn.connect();
					BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
					String inputLine;
					StringBuffer res = new StringBuffer();

					while ((inputLine = in.readLine()) != null) {
						res.append(inputLine);
					}
					in.close();
					System.out.println("done");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
			t.start();
			
			Thread t2 = new Thread(() -> {
				URL url;
				try {
					url = new URL("http://localhost:8080/RoutingPOC/news");
					HttpURLConnection conn = (HttpURLConnection) url.openConnection();
					conn.setRequestMethod("GET");conn.setConnectTimeout(20000);
					conn.connect();
					BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
					String inputLine;
					StringBuffer res = new StringBuffer();

					while ((inputLine = in.readLine()) != null) {
						res.append(inputLine);
					}
					in.close();
					System.out.println("done");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
			t2.start();
			
			Thread t3 = new Thread(() -> {
				URL url;
				try {
					url = new URL("http://localhost:8080/RoutingPOC/news");
					HttpURLConnection conn = (HttpURLConnection) url.openConnection();
					conn.setRequestMethod("GET");conn.setConnectTimeout(20000);
					conn.connect();
					BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
					String inputLine;
					StringBuffer res = new StringBuffer();

					while ((inputLine = in.readLine()) != null) {
						res.append(inputLine);
					}
					in.close();
					System.out.println("done");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			});
			t3.start();
			
			Thread t4 = new Thread(() -> {
				URL url;
				try {
					url = new URL("http://localhost:8080/RoutingPOC/news");
					HttpURLConnection conn = (HttpURLConnection) url.openConnection();
					conn.setRequestMethod("GET");conn.setConnectTimeout(20000);
					conn.connect();
					BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
					String inputLine;
					StringBuffer res = new StringBuffer();

					while ((inputLine = in.readLine()) != null) {
						res.append(inputLine);
					}
					in.close();
					System.out.println("done");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
			t4.start();
			
			Thread t5 = new Thread(() -> {
				URL url;
				try {
					url = new URL("http://localhost:8080/RoutingPOC/news");
					HttpURLConnection conn = (HttpURLConnection) url.openConnection();
					conn.setRequestMethod("GET");conn.setConnectTimeout(20000);
					conn.connect();
					BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
					String inputLine;
					StringBuffer res = new StringBuffer();

					while ((inputLine = in.readLine()) != null) {
						res.append(inputLine);
					}
					in.close();
					System.out.println("done");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
			t5.start();
			
			Thread t7 = new Thread(() -> {
				URL url;
				try {
					url = new URL("http://localhost:8080/RoutingPOC/news");
					HttpURLConnection conn = (HttpURLConnection) url.openConnection();
					conn.setRequestMethod("GET");conn.setConnectTimeout(20000);
					conn.connect();
					BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
					String inputLine;
					StringBuffer res = new StringBuffer();

					while ((inputLine = in.readLine()) != null) {
						res.append(inputLine);
					}
					in.close();
					System.out.println("done");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
			t7.start();
			
			Thread t8 = new Thread(() -> {
				URL url;
				try {
					url = new URL("http://localhost:8080/RoutingPOC/news");
					HttpURLConnection conn = (HttpURLConnection) url.openConnection();
					conn.setRequestMethod("GET");conn.setConnectTimeout(20000);
					conn.connect();
					BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
					String inputLine;
					StringBuffer res = new StringBuffer();

					while ((inputLine = in.readLine()) != null) {
						res.append(inputLine);
					}
					in.close();
					System.out.println("done");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
			t8.start();
			
			Thread t9 = new Thread(() -> {
				URL url;
				try {
					url = new URL("http://localhost:8080/RoutingPOC/news");
					HttpURLConnection conn = (HttpURLConnection) url.openConnection();
					conn.setRequestMethod("GET");conn.setConnectTimeout(20000);
					conn.connect();
					BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
					String inputLine;
					StringBuffer res = new StringBuffer();

					while ((inputLine = in.readLine()) != null) {
						res.append(inputLine);
					}
					in.close();
					System.out.println("done");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
			t9.start();
		}
	}
}
