package com.library.appoint;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Scanner;

import javax.net.ssl.HttpsURLConnection;
import javax.servlet.http.HttpServletRequest;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class BookModel {

	//898b87cc4451e02c54b510d0ba1c10e3 => kakao API ��
		public static void main(String[] args) {
			
			Scanner sc = null;
			//����Ʈ�� �����ϱ� ���� �ż���
			HttpsURLConnection huc = null;
			//�˻�� ���� ����.
			try {
				sc = new Scanner(System.in);
				System.out.println("�˻��� : ");
				String str = sc.next();
				//UTF-8������� ���ڵ��� ����� �Ѵ�.
				str = URLEncoder.encode(str, "utf-8");
//				System.out.println(str);
				
				//���� �˻��� ���� �ּ� �غ�
				String url = "https://dapi.kakao.com/v3/search/book";
				url = url + "?query=" + str + "&size=5";
//				System.out.println(url);
				
				URL u = new URL(url);
				huc = (HttpsURLConnection) u.openConnection();
				
				//�ش��� �߰��ϴ� �ż��� => �پ��� ������� �ִ�.
				huc.addRequestProperty("Authorization" ,"KakaoAK 898b87cc4451e02c54b510d0ba1c10e3");
				
				//�����͸� �������� ����
				InputStream is = huc.getInputStream(); // ���ڵ� ����� ���� �� �� ���� ������ �� �� ��� �Ѵ�.(is���� ����)
				InputStreamReader isr = new InputStreamReader(is, "utf-8");
				
				//���̺귯���� �ʿ��ϴ�. JSON, xml
				//json simple, kxml2���� ���� jar���� ����
				
				JSONParser jp = new JSONParser();
				//'{'�� �����ϸ� ��ü => JsonArray
				//'['�� �����ϸ� �迭 => ArrayList
				//json ������Ʈ�� �޾ƿ��� ������ ����ȯ�� ����� �Ѵ�.
				JSONObject kakaoData = (JSONObject) jp.parse(isr);
				//��û�� ������
				
//				System.out.println(kakaoData);
				
				
				JSONArray ja = (JSONArray) kakaoData.get("documents");
				ArrayList<Book> books = new ArrayList<Book>();
				
				
				for (int i = 0; i < ja.size(); i++) {
				JSONObject book = (JSONObject) ja.get(i);
				
				JSONArray au = (JSONArray) book.get("authors");
				//System.out.println(au.get(i));
				
//				books.add(new Book((String)book.get("title"),
//						(String)book.get("publisher"),
//						(String)book.get("isbn"),
//						(String)book.get("thumbnail"),
//						(String)au.get(0)));
				}
				
				for (Book b : books) {
					System.out.println(b.getTitle());
					System.out.println(b.getAuthors());
					System.out.println(b.getPublisher());
					System.out.println(b.getIsbn());
					System.out.println(b.getThumbnail());
				}
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}//end main
		
//		public static void search (HttpServletRequest request) {
//			ArrayList<Book> books = new ArrayList<Book>();
//			
//			//title �Ķ���� ��
//			String title = request.getParameter("title");
//			request.setAttribute("title", title);
//			
//			//å �迭
//			Book booksArr = null;
//			
//			//�� ������ 5�Ǳ���
//	books.add(new Book("�Ϻ��� ������� 2136 �̰� �ϳ��� ��","Ȳ����","�ֵ���ũ","8983007133 9788983007131","https://search1.kakaocdn.net/thumb/R120x174.q85/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flbook%2Fimage%2F1170365%3Ftimestamp%3D20210109150659\r\n" + 
//			""));
//	books.add(new Book("��Ŀ�� �ڵ��߻� �߱��� ù����. 1(��Ŀ�� ���� �߱��� ȸȭ �ø���)",
//			"�����","�п�","8965422124 9788965422129","https://search1.kakaocdn.net/thumb/R120x174.q85/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flbook%2Fimage%2F913574%3Ftimestamp%3D20210109144332\r\n" + 
//					""));
//	books.add(new Book("�����ξ� ���� �Ӵ����(������)","������","����","8938707083 9788938707086","https://search1.kakaocdn.net/thumb/R120x174.q85/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flbook%2Fimage%2F554282%3Ftimestamp%3D20201213133553\r\n" + 
//			""));
//	books.add(new Book("����ȸȭ �ٽ����� 233","��ȿ��","������","1159240590 9791159240591","https://search1.kakaocdn.net/thumb/R120x174.q85/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flbook%2Fimage%2F1586757%3Ftimestamp%3D20210109144258\r\n" + 
//			""));
//	books.add(new Book("������ �ູ ö��","�� �ʸ���","���","8996917737 9788996917731","https://search1.kakaocdn.net/thumb/R120x174.q85/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flbook%2Fimage%2F1475459%3Ftimestamp%3D20201102135126\r\n" + 
//			""));
//			
//			if(title.equals("�Ϻ���")) {
//				booksArr = books.get(0);
//				request.setAttribute("books", booksArr);
//			} else if(title.equals("�߱���")) {
//				booksArr = books.get(1);
//				request.setAttribute("books", booksArr);
//			} else if(title.equals("�����ξ�")) {
//				booksArr = books.get(2);
//				request.setAttribute("books", booksArr);
//			} else if (title.equals("����")) {
//				booksArr = books.get(3);
//				request.setAttribute("books", booksArr);
//			} else if(title.equals("ö��")) {
//				booksArr = books.get(4);
//				request.setAttribute("books", booksArr);
//			}//end if
//		}//end fake data
	
	
}
