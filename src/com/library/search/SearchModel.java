package com.library.search;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

public class SearchModel {

	public static void BookS(HttpServletRequest request) {	
		ArrayList<Book> books = new ArrayList<Book>();
		
		String title = request.getParameter("title");
		request.setAttribute("title", title);
		
		Book booksArr = null;
		
//		books.add(new Book("�Ϻ��� ������� 2136 �̰� �ϳ��� ��","Ȳ����","�ֵ���ũ","8983007133 9788983007131","https://search1.kakaocdn.net/thumb/R120x174.q85/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flbook%2Fimage%2F1170365%3Ftimestamp%3D20210109150659\r\n" + 
//				""));
//		books.add(new Book("��Ŀ�� �ڵ��߻� �߱��� ù����. 1(��Ŀ�� ���� �߱��� ȸȭ �ø���)",
//				"�����","�п�","8965422124 9788965422129","https://search1.kakaocdn.net/thumb/R120x174.q85/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flbook%2Fimage%2F913574%3Ftimestamp%3D20210109144332\r\n" + 
//						""));
//		books.add(new Book("�����ξ� ���� �Ӵ����(������)","������","����","8938707083 9788938707086","https://search1.kakaocdn.net/thumb/R120x174.q85/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flbook%2Fimage%2F554282%3Ftimestamp%3D20201213133553\r\n" + 
//				""));
//		books.add(new Book("����ȸȭ �ٽ����� 233","��ȿ��","������","1159240590 9791159240591","https://search1.kakaocdn.net/thumb/R120x174.q85/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flbook%2Fimage%2F1586757%3Ftimestamp%3D20210109144258\r\n" + 
//				""));
//		books.add(new Book("������ �ູ ö��","�� �ʸ���","���","8996917737 9788996917731","https://search1.kakaocdn.net/thumb/R120x174.q85/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flbook%2Fimage%2F1475459%3Ftimestamp%3D20201102135126\r\n" + 
//				""));
				
//				if(title.equals("�Ϻ���")) {
//					booksArr = books.get(0);
//					request.setAttribute("books", booksArr);
//				} else if(title.equals("�߱���")) {
//					booksArr = books.get(1);
//					request.setAttribute("books", booksArr);
//				} else if(title.equals("�����ξ�")) {
//					booksArr = books.get(2);
//					request.setAttribute("books", booksArr);
//				} else if (title.equals("����")) {
//					booksArr = books.get(3);
//					request.setAttribute("books", booksArr);
//				} else if(title.equals("ö��")) {
//					booksArr = books.get(4);
//					request.setAttribute("books", booksArr);
//		}
		
		
	}
	
	
	
}
