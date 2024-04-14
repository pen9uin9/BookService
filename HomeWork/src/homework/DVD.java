package homework;
import java.util.Scanner;
public class DVD {
	static final int NUM_DVD = 1;
	static final int NUM_DVDITEM = 11;
	
	public static void menuCartAddItem(String[][] dvd, String [] list) {
	      DVDList(dvd);
	      List(list);
	      for   (int k = 0; k < NUM_DVD; k++)
	         for (int j = 0; j < NUM_DVDITEM; j++)
	            System.out.print(list[j] + dvd[k][j] + "\n");
	         System.out.println(" ");
	   }
	
	public static void DVDList (String[][] DVD) {
		DVD[0][0] = "DVD1234";
	    DVD[0][1] = "탑건-매버릭";
	    DVD[0][2] = "12,000";
	    DVD[0][3] = "톰, 로렌";
	    DVD[0][4] = "파라마운트 픽처";
	    DVD[0][5] = "2023-03-23";
	    DVD[0][6] = "1";
	    DVD[0][7] = "돌비 디지털";
	    DVD[0][8] = "영어";
	    DVD[0][9] = "1시간 50분";
	    DVD[0][10] = "15세 이상";
	}
	public static void List(String list[]) {
		list[0] = "1. 제품번호:";
		list[1] = "2. 타이틀:";
		list[2] = "3. 가격:";
		list[3] = "4. 자요배우:";
		list[4] = "5. 배급사:";
		list[5] = "6. 배포날짜:";
		list[6] = "7. 지역코드:";
		list[7] = "8. 사운드:";
		list[8] = "9. 언어:";
		list[9] = "10. 상영시간:";
		list[10] = "11. 등급:";
	}

	public static void main(String[] args) {
		String[][] mDVD = new String[NUM_DVD][NUM_DVDITEM];
		String[] list = new String[NUM_DVDITEM];
		menuCartAddItem(mDVD, list);
	}
}