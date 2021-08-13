package ch15_generics;

public class FruitBox2 {
	public static void main(String[] args) {
		
//		ArrayList<String> list = new ArrayList<String>(); �̷����� ã�Ƽ� �� ��������
		
		//���� ����
		Box<Apple> aBox = new Box<Apple>(); //Ÿ���� �������༭ ���� ����ȯ�� �� �ʿ䰡 ����..
		Box<Orange> oBox = new Box<Orange>();

		// ���ڿ� ���� ���
		aBox.set(new Apple()); //Object���̶� ������ objet�� �� ũ�� �ڵ� ����ȯ
		oBox.set(new Orange());

		// ���ڿ��� ���� ������    //����� �翬�� ��������ȯ�� �������
		Apple ap = (Apple) aBox.get();
		Orange or = (Orange) oBox.get();

		System.out.println(ap);
		System.out.println(or);

	}
}
