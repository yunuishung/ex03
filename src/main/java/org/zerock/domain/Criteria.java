package org.zerock.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Criteria {
	private int pageNum;
	private int amount;//한페이지에 보여줄 데이터
	
	public Criteria(int pageNum,int amount) {
		this.pageNum=pageNum;
		this.amount = amount;
	}
	
	public Criteria() {//별다른 설정이 없으면 초기값 1하고 10을 가지도록 설정
		this(1,10);//1페이지에 10개
	}
}
