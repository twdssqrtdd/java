package collection_;

import java.util.ArrayList;

public class List3 {
	public static void main(String[] args) {
		ArrayList3 arrr = new ArrayList3();
		arrr.go();
	}
}
class ArrayList3{
	//
	//
	//
	ArrayList<Integer> arr = new ArrayList<>();
	
	public void go() {
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		
		// set = 수정
		arr.set(0, 2);			// 방번호, 수정값
		
		// remove = 제거
		arr.remove(0);			// 방번호로 제거
		// indexof() = 찾기(찾아서 방번호를 return)
		arr.indexOf(4);
		System.out.println("4를 가지고 있는 방번호는 :" + arr.indexOf(4));
		
		for(int i = 0; i<arr.size(); i++) {
			System.out.println(arr.get(i));
		}
	}
}
