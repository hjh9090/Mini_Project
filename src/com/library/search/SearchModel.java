package com.library.search;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

public class SearchModel {

	public static void BookS(HttpServletRequest request) {	
		ArrayList<Book> books = new ArrayList<Book>();
		
		String title = request.getParameter("title");
		request.setAttribute("title", title);
		
		Book booksArr = null;
		
//		books.add(new Book("일본어 상용한자 2136 이거 하나면 끝","황정현","솔데스크","8983007133 9788983007131","https://search1.kakaocdn.net/thumb/R120x174.q85/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flbook%2Fimage%2F1170365%3Ftimestamp%3D20210109150659\r\n" + 
//				""));
//		books.add(new Book("해커스 자동발사 중국어 첫걸음. 1(해커스 기초 중국어 회화 시리즈)",
//				"김범진","학원","8965422124 9788965422129","https://search1.kakaocdn.net/thumb/R120x174.q85/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flbook%2Fimage%2F913574%3Ftimestamp%3D20210109144332\r\n" + 
//						""));
//		books.add(new Book("스페인어 숙어 속담사전(엣센스)","서예슬","종로","8938707083 9788938707086","https://search1.kakaocdn.net/thumb/R120x174.q85/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flbook%2Fimage%2F554282%3Ftimestamp%3D20201213133553\r\n" + 
//				""));
//		books.add(new Book("영어회화 핵심패턴 233","임효진","을지로","1159240590 9791159240591","https://search1.kakaocdn.net/thumb/R120x174.q85/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flbook%2Fimage%2F1586757%3Ftimestamp%3D20210109144258\r\n" + 
//				""));
//		books.add(new Book("러셀의 행복 철학","팀 필립스","빅북","8996917737 9788996917731","https://search1.kakaocdn.net/thumb/R120x174.q85/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flbook%2Fimage%2F1475459%3Ftimestamp%3D20201102135126\r\n" + 
//				""));
				
//				if(title.equals("일본어")) {
//					booksArr = books.get(0);
//					request.setAttribute("books", booksArr);
//				} else if(title.equals("중국어")) {
//					booksArr = books.get(1);
//					request.setAttribute("books", booksArr);
//				} else if(title.equals("스페인어")) {
//					booksArr = books.get(2);
//					request.setAttribute("books", booksArr);
//				} else if (title.equals("영어")) {
//					booksArr = books.get(3);
//					request.setAttribute("books", booksArr);
//				} else if(title.equals("철학")) {
//					booksArr = books.get(4);
//					request.setAttribute("books", booksArr);
//		}
		
		
	}
	
	
	
}
