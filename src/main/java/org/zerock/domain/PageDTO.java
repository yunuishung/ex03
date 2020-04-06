package org.zerock.domain;

import lombok.Getter;

@Getter

public class PageDTO {
	private int startPage;
	private int endPage;
	private boolean prev, next;
	
	private Criteria cri;   //현재 페이지와 몇개를 보여줄지 정보
	private int total;   //전체 데이타 수
	
	public PageDTO( Criteria cri, int total) {//생성자
		this.cri = cri;
		this.total = total;
		
		//마지막 페이지
		this.endPage = (int)(Math.ceil(cri.getPageNum() /10.0))*10;
		//시작 페이지
		this.startPage = this.endPage - 9;     //페이지 하단에 페이지 번호는 10개씩
		
		int realEnd = (int) (Math.ceil(total*1.0)/ cri.getAmount());  //진짜 마지막 페이지
		//계산한  endPage가 실제 페이지 보다 크면 실제 페이지로 바꿔야 하죠
		if( this.endPage > realEnd) {
			this.endPage = realEnd;
		}
		
		this.prev = this.startPage > 1;
		this.next = this.endPage < realEnd;
	}

	@Override
	public String toString() {
		return "PageDTO [startPage=" + startPage + ", endPage=" + endPage + ", prev=" + prev + ", next=" + next
				+ ", cri=" + cri + ", total=" + total + ", getStartPage()=" + getStartPage() + ", getEndPage()="
				+ getEndPage() + ", isPrev()=" + isPrev() + ", isNext()=" + isNext() + ", getCri()=" + getCri()
				+ ", getTotal()=" + getTotal() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
}
