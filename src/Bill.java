package 영수증;

import java.util.Scanner;

public class Bill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myInput = new Scanner(System.in);
		String menu, menu2, menu3, menu4;
        int price, quantity, price2, quantity2, price3, quantity3, price4, quantity4, sum, dis;
        
		System.out.print("1번 메뉴 이름은? ");        menu = myInput.nextLine();
        System.out.print("2번 메뉴 이름은? ");        menu2 = myInput.nextLine();
        System.out.print("3번 메뉴 이름은? ");        menu3 = myInput.nextLine();
        System.out.print("4번 메뉴 이름은? ");        menu4 = myInput.nextLine();
        System.out.print("1번 메뉴 금액은? ");        price = myInput.nextInt();
        System.out.print("1번 메뉴 수량은? ");        quantity = myInput.nextInt();
        System.out.print("2번 메뉴 금액은? ");        price2 = myInput.nextInt();
        System.out.print("2번 메뉴 수량은? ");        quantity2 = myInput.nextInt();
        System.out.print("3번 메뉴 금액은? ");        price3 = myInput.nextInt();
        System.out.print("3번 메뉴 수량은? ");        quantity3 = myInput.nextInt();
        System.out.print("4번 메뉴 금액은? ");        price4 = myInput.nextInt();
        System.out.print("4번 메뉴 수량은? ");        quantity4 = myInput.nextInt();
       
        sum = (price * quantity) + (price2 * quantity2) + (price3 * quantity3) + (price4 * quantity4);
        dis = 5500;
        
		System.out.println("\n\n              [영수증]              \n");
		System.out.println("나우카페(역삼점) / 123-45-67890 / 전상열");
		System.out.println("서울특별시 강남구 테헤란로 20길 20,  4층");		
		System.out.println("20-6049-2611  /  20190430-01-0012");
		System.out.println("2019-04-30 9:31:21");
		System.out.println("-----------------------------------");
		System.out.printf("%7s %11s %4s %6s \n", "상품명", "단가", "수량", "금액");
		System.out.printf("%s %8d %4d %8d \n", menu, price, quantity, price * quantity);
		System.out.printf("%s %14d %4d %8d \n", menu2, price2, quantity2, price2 * quantity2);
		System.out.printf("%s %8d %4d %8d \n", menu3, price3, quantity3, price3 * quantity3);
		System.out.printf("%s %14d %4d %8d \n", menu4, price4, quantity4, price4 * quantity4);
		System.out.println("-----------------------------------");
		System.out.printf("%s %25d \n", "합 계 금 액", sum);
		System.out.printf("%s %25d \n", "할 인 금 액", dis);
		System.out.println("-----------------------------------");
		System.out.printf("%s %10s %12d \n", "**할인내역 :", "서 비 스", dis);
		System.out.println("-----------------------------------");
		System.out.printf("%15s %15d \n", "부가세 과세물품가액", (sum-dis)-(sum-dis)/10);
		System.out.printf("%16s %16d \n", "부    가    세", (sum-dis)/10);
		System.out.println("-----------------------------------");
		System.out.println("     *** 신용승인정보(고객용)[1]***");
		System.out.println("");
		System.out.printf("%s %25s \n", "카드종류:", "신협체크");
		System.out.printf("%s %27s \n", "카드번호:", "1234-56**-****-7890");
		System.out.println("할부개월: 일시불");
		System.out.printf("%s %27d \n", "판매금액:", (sum-dis) - (sum-dis)/10);	
		System.out.printf("%s %28d \n", "부가세:", (sum-dis)/10);
		System.out.printf("%s %27d \n", "승인금액:", sum-dis);
		System.out.println("승인번호: 12345678");
		System.out.printf("%s %s \n", "승일일시:", "2019-04-30 9:31:21");
		System.out.printf("%s %d \n", "가맹점번호:", 123456789);
		System.out.println("EDC 매출표");

		myInput.close();
	}
}
