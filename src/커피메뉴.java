package ������;

import java.util.Scanner;

public class Ŀ�Ǹ޴� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myInput = new Scanner(System.in);
		String menu;
        System.out.print("1�� �޴� �̸���? ");
        menu = myInput.nextLine();		
				
        int price;
        System.out.print("1�� �޴� �ݾ���? ");
        price = myInput.nextInt();
        
        int quantity;
        System.out.print("1�� �޴� ������? ");
        quantity = myInput.nextInt();

		String menu2;
        System.out.print("2�� �޴� �̸���? ");
        menu2 = myInput.nextLine();		
				
        int price2;
        System.out.print("2�� �޴� �ݾ���? ");
        price2 = myInput.nextInt();
        
        int quantity2;
        System.out.print("3�� �޴� ������? ");
        quantity2 = myInput.nextInt();
        
		String menu3;
        System.out.print("3�� �޴� �̸���? ");
        menu3 = myInput.nextLine();		
				
        int price3;
        System.out.print("3�� �޴� �ݾ���? ");
        price3 = myInput.nextInt();
        
        int quantity3;
        System.out.print("3�� �޴� ������? ");
        quantity3 = myInput.nextInt();

		String menu4;
        System.out.print("4�� �޴� �̸���? ");
        menu4 = myInput.nextLine();		
				
        int price4;
        System.out.print("4�� �޴� �ݾ���? ");
        price4 = myInput.nextInt();
        
        int quantity4;
        System.out.print("4�� �޴� ������? ");
        quantity4 = myInput.nextInt();
        
        
        System.out.println();        
        System.out.println();
		System.out.println("              [������]              ");
		System.out.println("����ī��(������) / 123-45-67890 / ����");
		System.out.println("����Ư���� ������ ������� 20�� 20,  4��");		
		System.out.println("20-6049-2611  /  20190430-01-0012");
		System.out.println("2019-04-30 9:31:21");
		System.out.println("-----------------------------------");
		System.out.printf("%7s %11s %4s %6s \n", "��ǰ��", "�ܰ�", "����", "�ݾ�");
		System.out.printf("%s %14d %4d %7d \n", menu, price, quantity, price * quantity);
		System.out.printf("%s %14d %4d %7d \n", menu2, price2, quantity2, price2 * quantity2);
		System.out.printf("%s %14d %4d %7d \n", menu3, price3, quantity3, price3 * quantity3);
		System.out.printf("%s %14d %4d %7d \n", menu4, price4, quantity4, price4 * quantity4);
		System.out.println("-----------------------------------");
		System.out.printf("%s %25d \n", "�� �� �� ��", (price * quantity) + (price2 * quantity2) + (price3 * quantity3) + (price4 * quantity4));
		System.out.printf("%s %25d \n", "�� �� �� ��", 0);
		System.out.println("-----------------------------------");
		System.out.printf("%s %10s %12d \n", "**���γ��� :", "�� �� ��", 0);
		System.out.println("-----------------------------------");
		System.out.printf("%15s %15d \n", "�ΰ��� ������ǰ����", (price * quantity) + (price2 * quantity2) + (price3 * quantity3) + (price4 * quantity4));
		System.out.printf("%16s %16d \n", "��    ��    ��", ((price * quantity) + (price2 * quantity2) + (price3 * quantity3) + (price4 * quantity4)) / 10);
		System.out.println("-----------------------------------");
		System.out.println("     *** �ſ��������(����)[1]***");
		System.out.println("");
		System.out.printf("%s %25s \n", "ī������:", "����üũ");
		System.out.printf("%s %27s \n", "ī���ȣ:", "1234-56**-****-7890");
		System.out.println("�Һΰ���: �Ͻú�");
		System.out.printf("%s %27d \n", "�Ǹűݾ�:", 14092);	
		System.out.printf("%s %28d \n", "�ΰ���:", 1408);
		System.out.printf("%s %27d \n", "���αݾ�:", 15500);
		System.out.println("���ι�ȣ: 12345678");
		System.out.printf("%s %s \n", "�����Ͻ�:", "2019-04-30 9:31:21");
		System.out.printf("%s %d \n", "��������ȣ:", 123456789);
		System.out.println("EDC ����ǥ");
		
		myInput.close();
	}
	
}
