package com.library.apply;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;

import javax.net.ssl.HttpsURLConnection;
import javax.servlet.http.HttpServletRequest;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ApplyModel {

	
	public static void searchBook(HttpServletRequest request) throws UnsupportedEncodingException {
		request.setCharacterEncoding("utf-8");
		//�˻�� ���� ����.
		HttpsURLConnection huc = null;
		//����Ʈ�� �����ϱ� ���� �ż���
		try {
			String str = request.getParameter("bookName");
			//UTF-8������� ���ڵ��� ����� �Ѵ�.
			str = URLEncoder.encode(str, "utf-8");
//			System.out.println(str);
			
			//���� �˻��� ���� �ּ� �غ�
			String url = "https://dapi.kakao.com/v3/search/book";
			url = url + "?query=" + str + "&size=5";
//			System.out.println(url);
			
			URL u = new URL(url);
			huc = (HttpsURLConnection) u.openConnection();
			
			//�ش��� �߰��ϴ� �ż��� => �پ��� ������� �ִ�.
			huc.addRequestProperty("Authorization" ,"KakaoAK 427fc45cc4ec0023020022d0ab35eb48");
			
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
			
			JSONArray ja = (JSONArray) kakaoData.get("documents");
			ArrayList<Book2> books = new ArrayList<Book2>();

			
			String authorss = null;
			for (int i = 0; i < ja.size(); i++) {
				JSONObject book = (JSONObject) ja.get(i);
				String title = (String)book.get("title");
				String publisher = (String)book.get("publisher");
				String isbn = (String)book.get("isbn");
				String thumbnail = (String)book.get("thumbnail");
				JSONArray authors = (JSONArray) book.get("authors");
				for (Object t : authors) {
					authorss = (String) t;
					authorss = authorss + " ";
				}
				books.add(new Book2(title,publisher,isbn,thumbnail,authorss));
			}
			request.setAttribute("books", books);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}//end parsing
	
	
	public static Book2 ApplyBean (HttpServletRequest request) {
		String title = request.getParameter("title");
		String authorss = request.getParameter("authorss");
		String publisher = request.getParameter("publisher");
		String isbn = request.getParameter("isbn");
		String thumbnail = request.getParameter("thumbnail");
		Book2 book2 = new Book2(title,authorss,publisher,isbn,thumbnail);
		return book2;
		
	}
}
