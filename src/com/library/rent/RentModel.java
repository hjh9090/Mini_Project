package com.library.rent;

import java.io.UnsupportedEncodingException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;


public class RentModel {

	
	public static void RentBook (HttpServletRequest request) throws UnsupportedEncodingException {
		request.setCharacterEncoding("utf-8");
		
		ArrayList<BookRent> books = new ArrayList<BookRent>();
		
		String title = request.getParameter("title");
		request.setAttribute("title", title);
		
		BookRent booksArr = null;
		
//books.add(new BookRent("�Ϻ��� ������� 2136 �̰� �ϳ��� ��","Ȳ����","�ֵ���ũ", "8983007133 9788983007131","https://search1.kakaocdn.net/thumb/R120x174.q85/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flbook%2Fimage%2F1170365%3Ftimestamp%3D20210109150659\r\n","�뿩��"));
//books.add(new BookRent("��Ŀ�� �ڵ��߻� �߱��� ù����. 1(��Ŀ�� ���� �߱��� ȸȭ �ø���)",
//		"�����","�п�","8965422124 9788965422129","https://search1.kakaocdn.net/thumb/R120x174.q85/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flbook%2Fimage%2F913574%3Ftimestamp%3D20210109144332\r\n","�뿩����" + 
//				""));
//books.add(new BookRent("�����ξ� ���� �Ӵ����(������)","������","����","8938707083 9788938707086","https://search1.kakaocdn.net/thumb/R120x174.q85/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flbook%2Fimage%2F554282%3Ftimestamp%3D20201213133553\r\n","�뿩��" + 
//		""));
//books.add(new BookRent("����ȸȭ �ٽ����� 233","��ȿ��","������","1159240590 9791159240591","https://search1.kakaocdn.net/thumb/R120x174.q85/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flbook%2Fimage%2F1586757%3Ftimestamp%3D20210109144258\r\n","�뿩����"+ 
//		""));
//books.add(new BookRent("������ �ູ ö��","�� �ʸ���","���","8996917737 9788996917731","https://search1.kakaocdn.net/thumb/R120x174.q85/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flbook%2Fimage%2F1475459%3Ftimestamp%3D20201102135126\r\n","�뿩��"+ 
//		""));
//books.add(new BookRent("�������� �ʴ� å�Դϴ�", "", "", "", "", null));


		if(title.contains("�Ϻ���")) {
			booksArr = books.get(0);
			request.setAttribute("books", booksArr);
		} else if(title.contains("�߱���")) {
			booksArr = books.get(1);
			request.setAttribute("books", booksArr);
		} else if(title.contains("�����ξ�")) {
			booksArr = books.get(2);
			request.setAttribute("books", booksArr);
		} else if (title.contains("����")) {
			booksArr = books.get(3);
			request.setAttribute("books", booksArr);
		} else if(title.contains("ö��")) {
			booksArr = books.get(4);
			request.setAttribute("books", booksArr);
		}else {
			booksArr = books.get(5);
			request.setAttribute("books", booksArr);
			
		}
	}//end method
	
	
	public static void DateRent(HttpServletRequest request) {
		
		
		Calendar cal = Calendar.getInstance();
		
		cal.setTime(new Date());
		SimpleDateFormat date = new SimpleDateFormat("yyyy�� MM�� dd��");
		cal.add(Calendar.DAY_OF_WEEK, 14);
		String returndate = date.format(cal.getTime());
		
//		cal.add(Calendar.DAY_OF_WEEK, 2);
//		
//		int returndate = cal.get(Calendar.DAY_OF_WEEK);
//		
//		System.out.println(returndate);
		
		//String returndate = date.format(cal.getTime());
		
//		System.out.println(returndate);
		
		request.setAttribute("returndate", returndate);
		
	}
	
	
}
