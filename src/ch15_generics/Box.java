package ch15_generics;

/*
 * ���� �����̵��� �� ���� �� �ִ� ����
 */
//public class Box {
//	private Object ob; //Object�� ���� ���� Ŭ�����ݾ�
//	
//	public void set(Object o) {
//		ob = o;
//	}
//	public Object get() {
//		return ob;
//	}
//}
public class Box<T> {//Objet ��� ���� ���Ƿ� �ƹ��ų� �ü� �ְ� T�� �ٲپ� ���� �ϴ�
	private T ob; 
	
	public void set(T o) {
		ob = o;
	}
	public T get() {
		return ob;
	}
}
//Box<T>��ü�� �ϳ��� Ÿ���̶�� ��������
