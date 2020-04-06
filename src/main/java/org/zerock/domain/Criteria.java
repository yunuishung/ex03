package org.zerock.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Criteria {
	private int pageNum;
	private int amount;//���������� ������ ������
	
	public Criteria(int pageNum,int amount) {
		this.pageNum=pageNum;
		this.amount = amount;
	}
	
	public Criteria() {//���ٸ� ������ ������ �ʱⰪ 1�ϰ� 10�� �������� ����
		this(1,10);//1�������� 10��
	}
}