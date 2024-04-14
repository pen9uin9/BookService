// OOP-HomeWork3-구창현
package homework;
import java.util.ArrayList;
import java.util.Scanner;
public class Welcome {
	static final int NUM_BOOK = 3;
	//static final int NUM_ITEM = 7;

	public static void main(String[] args) {
		ArrayList<ArrayList<String>> bookList = new ArrayList<>();
		for (int i = 0; i < NUM_BOOK; i++) {
			bookList.add(new ArrayList<>());
		}
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("당신의 이름을 입력하세요 : ");
		String userName = input.next();
		int userMobile;
		System.out.print("연락처를 입력하세요 : ");
		while(!input.hasNextInt()) {
			System.out.print("에러! 숫자만 입력해주세요.\n");
			System.out.print("연락처를 입력하세요 : ");
			input.next();
		}
		
		userMobile = input.nextInt();
		String greeting = "Welcome to Shopping Mall";
		String tagline = "Welcome to Book Market!";
		
		boolean quit = false;
		while (!quit) {
			System.out.println("***********************************************");
			System.out.println("\t" + greeting);
			System.out.println("\t" + tagline);
			menuIntroduction();
			System.out.print("메뉴 번호를 선택해주세요. ");
			int n = input.nextInt();
			
			if (n < 1 || n > 8) {
				System.out.println("1부터 8까지의 숫자를 입력하세요.");
			}
			else {
				switch(n) {
					case 1:
						menuGuestInfo(userName, userMobile);
						break;
					case 2:
						menuCartItemList();
						break;
					case 3:
						menuCartClear();
						break;
					case 4:
						menuCartAddItem(bookList);
						break;
					case 5:
						menuCartRemoveItemCount();
						break;
					case 6:
						menuCartRemoveItem();
						break;
					case 7:
						menuCartBill();
						break;
					case 8:
						menuExit();
						quit = true;
						break;
				}
			}
		}
	}
	public static void menuIntroduction() {
		System.out.println("***********************************************");
		System.out.println(" 1. 고객 정보 확인하기 \t4. 장바구니에 항목 추가하기");
		System.out.println(" 2. 장바구니 상품 목록 보기\t5. 장바구니의 항목 수량 줄이기");
		System.out.println(" 3. 장바구니 비우기 \t6. 장바구니 항목 삭제하기");
		System.out.println(" 7. 영수증 표시하기 \t8. 종료");
		System.out.println("***********************************************");
	}
	public static void menuGuestInfo(String name, int mobile) {
		System.out.println("현재 고객 정보 : ");
		System.out.println("이름 " + name + " 연락처 " + mobile);
	}
	public static void menuCartItemList() {
		System.out.println("2. 장바구니 상품 목록 보기");
	}
	public static void menuCartClear() {
		System.out.println("3. 장바구니 비우기");
	}
	public static void menuCartAddItem(ArrayList<ArrayList<String>> bookList) {
		BookList(bookList);
		for	(ArrayList<String> book : bookList) {
			for (String item : book) {
				System.out.print(item + " | ");
			}
			System.out.println(" ");
		}
		boolean quit = false;
		while (!quit) {
			System.out.println("장바구니에 추가할 도서의 ID를 입력하세요 : ");
			Scanner input = new Scanner(System.in);
			String str = input.nextLine();
			boolean flag = false;
			int numId = -1;
			for (int i = 0; i < bookList.size(); i++) {
				if (str.equals(bookList.get(i).get(0))) {
					numId = i;
					flag = true;
					break;
				}
			}
			if (flag) {
				System.out.println("장바구니에 추가하겠습니까? Y | N");
				str = input.nextLine();
				if(str.toUpperCase().equals("Y")) {
					System.out.println(bookList.get(numId).get(0) + " 도서가 장바구니에 추가되었습니다.");
				}
				quit = true;
			} else
				System.out.println("다시 입력해 주세요");
		}
	}
	public static void menuCartRemoveItemCount() {
		System.out.println("5. 장바구니의 항목 수량 줄이기");
	}
	public static void menuCartRemoveItem() {
		System.out.println("6. 장바구니의 항목 삭제하기");
	}
	public static void menuCartBill() {
		System.out.println("7. 영수증 표시하기");
	}
	public static void menuExit() {
		System.out.println("8. 종료");
	}
	public static void BookList (ArrayList<ArrayList<String>> bookList) {
		ArrayList<String> book1 = new ArrayList<>();
        book1.add("ISBN1234");
        book1.add("쉽게 배우는 JSP 웹 프로그래밍");
        book1.add("27000");
        book1.add("송미영");
        book1.add("단계별로 쇼핑몰을 구현하며 배우는 JSP 웹 프로그래밍");
        book1.add("IT전문서");
        book1.add("2018/10/08");
        bookList.set(0, book1);

        ArrayList<String> book2 = new ArrayList<>();
        book2.add("ISBN1235");
        book2.add("안드로이드 프로그래밍");
        book2.add("33000");
        book2.add("우재남");
        book2.add("실습 단계별 명쾌한 멘토링");
        book2.add("IT전문서");
        book2.add("2022/01/22");
        bookList.set(1, book2);

        ArrayList<String> book3 = new ArrayList<>();
        book3.add("ISBN1236");
        book3.add("스크래치");
        book3.add("22000");
        book3.add("고광일");
        book3.add("컴퓨팅 사고력을 키우는 블록 코딩");
        book3.add("컴퓨터입문");
        book3.add("2019/06/10");
        bookList.set(2, book3);
	}
}