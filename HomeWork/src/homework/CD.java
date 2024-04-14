package homework;
public class CD {
	static final int NUM_CD = 1;
	static final int NUM_CDITEM = 9;
	
	public static void menuCartAddItem(String[][] cd, String [] list) {
	      DVDList(cd);
	      List(list);
	      for   (int k = 0; k < NUM_CD; k++)
	         for (int j = 0; j < NUM_CDITEM; j++)
	            System.out.print(list[j] + cd[k][j] + "\n");
	         System.out.println(" ");
	   }
	
	public static void DVDList (String[][] cd) {
		cd[0][0] = "";
		cd[0][1] = "CD1234";
		cd[0][2] = "싱어게인3";
		cd[0][3] = "10,000원";
		cd[0][4] = "홍길동, 이순신";
		cd[0][5] = "";
		cd[0][6] = "JTBC";
		cd[0][7] = "가요";
		cd[0][8] = "2024-02-01";
	}
	public static void List(String list[]) {
		list[0] = "1. 음악CD:";
		list[1] = "2. 제품번호:";
		list[2] = "3. 타이틀:";
		list[3] = "4. 가격:";
		list[4] = "5. 가수:";
		list[5] = "6. 노래 목록 (track):";
		list[6] = "7. 제작사:";
		list[7] = "8. 음악장르:";
		list[8] = "9. 배포날짜:";
	}

	public static void main(String[] args) {
		String[][] mCD = new String[NUM_CD][NUM_CDITEM];
		String[] list = new String[NUM_CDITEM];
		menuCartAddItem(mCD, list);
	}
}
