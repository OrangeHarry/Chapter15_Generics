package ch15_generics;

public class FruitBox2 {
	public static void main(String[] args) {
		
//		ArrayList<String> list = new ArrayList<String>(); 이런구조 찾아서 더 공부하자
		
		//상자 생성
		Box<Apple> aBox = new Box<Apple>(); //타입을 지정해줘서 강제 형변환을 할 필요가 없대..
		Box<Orange> oBox = new Box<Orange>();

		// 상자에 과일 담기
		aBox.set(new Apple()); //Object형이라서 가능햐 objet가 더 크니 자동 형변환
		oBox.set(new Orange());

		// 상자에서 과일 꺼내기    //여기는 당연히 강제형변환을 해줘야지
		Apple ap = (Apple) aBox.get();
		Orange or = (Orange) oBox.get();

		System.out.println(ap);
		System.out.println(or);

	}
}
