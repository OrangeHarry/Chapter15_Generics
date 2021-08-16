package ch15_generics;

/*
 * 무슨 과일이든지 다 담을 수 있는 상자
 */
//public class Box {
//	private Object ob; //Object가 제일 조상 클래스잖아
//	
//	public void set(Object o) {
//		ob = o;
//	}
//	public Object get() {
//		return ob;
//	}
//}
public class Box<T> {//Objet 대신 내가 임의로 아무거나 올수 있게 T로 바꾸어 놨어 일단
	private T ob; 
	
	public void set(T o) {
		ob = o;
	}
	public T get() {
		return ob;
	}
}
//Box<T>자체가 하나의 타입이라고 생각하자
