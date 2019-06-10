package com.biz.exec;

import com.biz.model.ScoreVO;

public class Exec_04 {

	public static void main(String[] args) {
		//scores는 ScoreVO 클래스를 20개의 배열로 예약만 한 상태
		ScoreVO[] scores = new ScoreVO[20];
		
		//아직은 scores를 사용할 수 없다.
		
		//scores[0].setNumber("1");
		//scores는 ScoreVO 클래스를 20개의 배열로 예약만 한 상태NullPointerException이 발생하는 이유는 초기화를 안시켜놔서이다.
		
		
		//클래스 배열은 예약만 한 상태에서는 
		//읽거나 쓰기 모두 불가능하다.
		//배열 요소요소들을 모두 다시 초기화 시켜줘야한다.
		for(int i =0; i<scores.length; i++) {
			scores[i] = new ScoreVO();
		}
	}

}
