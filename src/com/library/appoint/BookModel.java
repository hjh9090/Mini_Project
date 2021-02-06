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

	//898b87cc4451e02c54b510d0ba1c10e3 => kakao API 값
		public static void main(String[] args) {
			
			Scanner sc = null;
			//사이트와 연결하기 위한 매서드
			HttpsURLConnection huc = null;
			//검색어를 쓰기 위함.
			try {
				sc = new Scanner(System.in);
				System.out.println("검색어 : ");
				String str = sc.next();
				//UTF-8방식으로 인코딩을 해줘야 한다.
				str = URLEncoder.encode(str, "utf-8");
//				System.out.println(str);
				
				//도서 검색을 위한 주소 준비
				String url = "https://dapi.kakao.com/v3/search/book";
				url = url + "?query=" + str + "&size=5";
//				System.out.println(url);
				
				URL u = new URL(url);
				huc = (HttpsURLConnection) u.openConnection();
				
				//해더에 추가하는 매서드 => 다양한 방법들이 있다.
				huc.addRequestProperty("Authorization" ,"KakaoAK 898b87cc4451e02c54b510d0ba1c10e3");
				
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
//			//title 파라미터 값
//			String title = request.getParameter("title");
//			request.setAttribute("title", title);
//			
//			//책 배열
//			Book booksArr = null;
//			
//			//가 데이터 5권까지
//	books.add(new Book("일본어 상용한자 2136 이거 하나면 끝","황정현","솔데스크","8983007133 9788983007131","https://search1.kakaocdn.net/thumb/R120x174.q85/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flbook%2Fimage%2F1170365%3Ftimestamp%3D20210109150659\r\n" + 
//			""));
//	books.add(new Book("해커스 자동발사 중국어 첫걸음. 1(해커스 기초 중국어 회화 시리즈)",
//			"김범진","학원","8965422124 9788965422129","https://search1.kakaocdn.net/thumb/R120x174.q85/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flbook%2Fimage%2F913574%3Ftimestamp%3D20210109144332\r\n" + 
//					""));
//	books.add(new Book("스페인어 숙어 속담사전(엣센스)","서예슬","종로","8938707083 9788938707086","https://search1.kakaocdn.net/thumb/R120x174.q85/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flbook%2Fimage%2F554282%3Ftimestamp%3D20201213133553\r\n" + 
//			""));
//	books.add(new Book("영어회화 핵심패턴 233","임효진","을지로","1159240590 9791159240591","https://search1.kakaocdn.net/thumb/R120x174.q85/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flbook%2Fimage%2F1586757%3Ftimestamp%3D20210109144258\r\n" + 
//			""));
//	books.add(new Book("러셀의 행복 철학","팀 필립스","빅북","8996917737 9788996917731","https://search1.kakaocdn.net/thumb/R120x174.q85/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flbook%2Fimage%2F1475459%3Ftimestamp%3D20201102135126\r\n" + 
//			""));
//			
//			if(title.equals("일본어")) {
//				booksArr = books.get(0);
//				request.setAttribute("books", booksArr);
//			} else if(title.equals("중국어")) {
//				booksArr = books.get(1);
//				request.setAttribute("books", booksArr);
//			} else if(title.equals("스페인어")) {
//				booksArr = books.get(2);
//				request.setAttribute("books", booksArr);
//			} else if (title.equals("영어")) {
//				booksArr = books.get(3);
//				request.setAttribute("books", booksArr);
//			} else if(title.equals("철학")) {
//				booksArr = books.get(4);
//				request.setAttribute("books", booksArr);
//			}//end if
//		}//end fake data
	
	
}
