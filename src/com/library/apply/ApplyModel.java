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
		//검색어를 쓰기 위함.
		HttpsURLConnection huc = null;
		//사이트와 연결하기 위한 매서드
		try {
			String str = request.getParameter("bookName");
			//UTF-8방식으로 인코딩을 해줘야 한다.
			str = URLEncoder.encode(str, "utf-8");
//			System.out.println(str);
			
			//도서 검색을 위한 주소 준비
			String url = "https://dapi.kakao.com/v3/search/book";
			url = url + "?query=" + str + "&size=5";
//			System.out.println(url);
			
			URL u = new URL(url);
			huc = (HttpsURLConnection) u.openConnection();
			
			//해더에 추가하는 매서드 => 다양한 방법들이 있다.
			huc.addRequestProperty("Authorization" ,"KakaoAK 427fc45cc4ec0023020022d0ab35eb48");
			
			//데이터를 가져오기 위함
			InputStream is = huc.getInputStream(); // 인코딩 방식을 조절 할 수 없기 때문에 두 번 써야 한다.(is만든 이유)
			InputStreamReader isr = new InputStreamReader(is, "utf-8");
			
			//라이브러리가 필요하다. JSON, xml
			//json simple, kxml2에서 각각 jar파일 받음
			
			JSONParser jp = new JSONParser();
			//'{'로 시작하면 객체 => JsonArray
			//'['로 시작하면 배열 => ArrayList
			//json 오브젝트로 받아오기 때문에 형변환을 해줘야 한다.
			JSONObject kakaoData = (JSONObject) jp.parse(isr);
			//요청한 데이터
			
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
