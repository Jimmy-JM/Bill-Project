package ������;

import java.util.Scanner;

public class Bill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myInput = new Scanner(System.in);
		String menu, menu2, menu3, menu4;
        int price, quantity, price2, quantity2, price3, quantity3, price4, quantity4, sum, dis;
        
		System.out.print("1�� �޴� �̸���? ");        menu = myInput.nextLine();
        System.out.print("2�� �޴� �̸���? ");        menu2 = myInput.nextLine();
        System.out.print("3�� �޴� �̸���? ");        menu3 = myInput.nextLine();
        System.out.print("4�� �޴� �̸���? ");        menu4 = myInput.nextLine();
        System.out.print("1�� �޴� �ݾ���? ");        price = myInput.nextInt();
        System.out.print("1�� �޴� ������? ");        quantity = myInput.nextInt();
        System.out.print("2�� �޴� �ݾ���? ");        price2 = myInput.nextInt();
        System.out.print("2�� �޴� ������? ");        quantity2 = myInput.nextInt();
        System.out.print("3�� �޴� �ݾ���? ");        price3 = myInput.nextInt();
        System.out.print("3�� �޴� ������? ");        quantity3 = myInput.nextInt();
        System.out.print("4�� �޴� �ݾ���? ");        price4 = myInput.nextInt();
        System.out.print("4�� �޴� ������? ");        quantity4 = myInput.nextInt();
       
        sum = (price * quantity) + (price2 * quantity2) + (price3 * quantity3) + (price4 * quantity4);
        dis = 5500;
        
		System.out.println("\n\n              [������]              \n");
		System.out.println("����ī��(������) / 123-45-67890 / ����");
		System.out.println("����Ư���� ������ ������� 20�� 20,  4��");		
		System.out.println("20-6049-2611  /  20190430-01-0012");
		System.out.println("2019-04-30 9:31:21");
		System.out.println("-----------------------------------");
		System.out.printf("%7s %11s %4s %6s \n", "��ǰ��", "�ܰ�", "����", "�ݾ�");
		System.out.printf("%s %8d %4d %8d \n", menu, price, quantity, price * quantity);
		System.out.printf("%s %14d %4d %8d \n", menu2, price2, quantity2, price2 * quantity2);
		System.out.printf("%s %8d %4d %8d \n", menu3, price3, quantity3, price3 * quantity3);
		System.out.printf("%s %14d %4d %8d \n", menu4, price4, quantity4, price4 * quantity4);
		System.out.println("-----------------------------------");
		System.out.printf("%s %25d \n", "�� �� �� ��", sum);
		System.out.printf("%s %25d \n", "�� �� �� ��", dis);
		System.out.println("-----------------------------------");
		System.out.printf("%s %10s %12d \n", "**���γ��� :", "�� �� ��", dis);
		System.out.println("-----------------------------------");
		System.out.printf("%15s %15d \n", "�ΰ��� ������ǰ����", (sum-dis)-(sum-dis)/10);
		System.out.printf("%16s %16d \n", "��    ��    ��", (sum-dis)/10);
		System.out.println("-----------------------------------");
		System.out.println("     *** �ſ��������(����)[1]***");
		System.out.println("");
		System.out.printf("%s %25s \n", "ī������:", "����üũ");
		System.out.printf("%s %27s \n", "ī���ȣ:", "1234-56**-****-7890");
		System.out.println("�Һΰ���: �Ͻú�");
		System.out.printf("%s %27d \n", "�Ǹűݾ�:", (sum-dis) - (sum-dis)/10);	
		System.out.printf("%s %28d \n", "�ΰ���:", (sum-dis)/10);
		System.out.printf("%s %27d \n", "���αݾ�:", sum-dis);
		System.out.println("���ι�ȣ: 12345678");
		System.out.printf("%s %s \n", "�����Ͻ�:", "2019-04-30 9:31:21");
		System.out.printf("%s %d \n", "��������ȣ:", 123456789);
		System.out.println("EDC ����ǥ");

		myInput.close();
	}
}
