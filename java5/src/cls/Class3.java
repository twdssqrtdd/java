package cls;

public class Class3 {
	public static void main(String[] args) {
		Car 아빠차 = new Car();
		Car 엄마차 = new Car();
		Car 누나차 = new Car();
		Car 내차 = new Car();
		
		아빠차.차주 = "아빠";
		아빠차.차종 = "벤츠";
		아빠차.차색상 = "빨간색";
		아빠차.차정보();
		
		엄마차.차주 = "엄마";
		엄마차.차종 = "레이";
		엄마차.차색상 = "회색";
		엄마차.차정보();
		
		누나차.차주 = "누나";
		누나차.차종 = "모닝";
		누나차.차색상 = "흰색";
		누나차.차정보();
		
		내차.차주 = "홍길동";
		내차.차종 = "스파크";
		내차.차색상 = "파란색";
		내차.차정보();
	}
}
// class 자동차
// 데이터 : 차주인, 차종, 차색상
// 기능 : 차정보(주인이 누구인지, 차종은 무엇인지, 차색상은 무엇인지 안내하주는 출력)
class Car {
	String 차주;
	String 차종;
	String 차색상;
	
	void 차정보() {
		System.out.println(차주 + "의 차는 "+ 차종 +"이며 차색상은 " + 차색상 +"입니다.");
	}
	
}