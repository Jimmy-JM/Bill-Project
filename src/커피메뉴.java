package 영수증;

import java.util.Scanner;

public class 커피메뉴 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myInput = new Scanner(System.in);
		String menu;
        System.out.print("1번 메뉴 이름은? ");
        menu = myInput.nextLine();		
				
        int price;
        System.out.print("1번 메뉴 금액은? ");
        price = myInput.nextInt();
        
        int quantity;
        System.out.print("1번 메뉴 수량은? ");
        quantity = myInput.nextInt();

		String menu2;
        System.out.print("2번 메뉴 이름은? ");
        menu2 = myInput.nextLine();		
				
        int price2;
        System.out.print("2번 메뉴 금액은? ");
        price2 = myInput.nextInt();
        
        int quantity2;
        System.out.print("3번 메뉴 수량은? ");
        quantity2 = myInput.nextInt();
        
		String menu3;
        System.out.print("3번 메뉴 이름은? ");
        menu3 = myInput.nextLine();		
				
        int price3;
        System.out.print("3번 메뉴 금액은? ");
        price3 = myInput.nextInt();
        
        int quantity3;
        System.out.print("3번 메뉴 수량은? ");
        quantity3 = myInput.nextInt();

		String menu4;
        System.out.print("4번 메뉴 이름은? ");
        menu4 = myInput.nextLine();		
				
        int price4;
        System.out.print("4번 메뉴 금액은? ");
        price4 = myInput.nextInt();
        
        int quantity4;
        System.out.print("4번 메뉴 수량은? ");
        quantity4 = myInput.nextInt();
        
        
        System.out.println();        
        System.out.println();
		System.out.println("              [영수증]              ");
		System.out.println("나우카페(역삼점) / 123-45-67890 / 전상열");
		System.out.println("서울특별시 강남구 테헤란로 20길 20,  4층");		
		System.out.println("20-6049-2611  /  20190430-01-0012");
		System.out.println("2019-04-30 9:31:21");
		System.out.println("-----------------------------------");
		System.out.printf("%7s %11s %4s %6s \n", "상품명", "단가", "수량", "금액");
		System.out.printf("%s %14d %4d %7d \n", menu, price, quantity, price * quantity);
		System.out.printf("%s %14d %4d %7d \n", menu2, price2, quantity2, price2 * quantity2);
		System.out.printf("%s %14d %4d %7d \n", menu3, price3, quantity3, price3 * quantity3);
		System.out.printf("%s %14d %4d %7d \n", menu4, price4, quantity4, price4 * quantity4);
		System.out.println("-----------------------------------");
		System.out.printf("%s %25d \n", "합 계 금 액", (price * quantity) + (price2 * quantity2) + (price3 * quantity3) + (price4 * quantity4));
		System.out.printf("%s %25d \n", "할 인 금 액", 0);
		System.out.println("-----------------------------------");
		System.out.printf("%s %10s %12d \n", "**할인내역 :", "서 비 스", 0);
		System.out.println("-----------------------------------");
		System.out.printf("%15s %15d \n", "부가세 과세물품가액", (price * quantity) + (price2 * quantity2) + (price3 * quantity3) + (price4 * quantity4));
		System.out.printf("%16s %16d \n", "부    가    세", ((price * quantity) + (price2 * quantity2) + (price3 * quantity3) + (price4 * quantity4)) / 10);
		System.out.println("-----------------------------------");
		System.out.println("     *** 신용승인정보(고객용)[1]***");
		System.out.println("");
		System.out.printf("%s %25s \n", "카드종류:", "신협체크");
		System.out.printf("%s %27s \n", "카드번호:", "1234-56**-****-7890");
		System.out.println("할부개월: 일시불");
		System.out.printf("%s %27d \n", "판매금액:", 14092);	
		System.out.printf("%s %28d \n", "부가세:", 1408);
		System.out.printf("%s %27d \n", "승인금액:", 15500);
		System.out.println("승인번호: 12345678");
		System.out.printf("%s %s \n", "승일일시:", "2019-04-30 9:31:21");
		System.out.printf("%s %d \n", "가맹점번호:", 123456789);
		System.out.println("EDC 매출표");
		
		myInput.close();
	}
	
}
