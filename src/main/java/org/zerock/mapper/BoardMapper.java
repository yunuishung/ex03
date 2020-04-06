package org.zerock.mapper;

import java.util.List;

//import org.apache.ibatis.annotations.Select;
import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;

public interface BoardMapper {

	//@Select("select * from tbl_board where bno>0")
	public List<BoardVO> getList();
	
	public List<BoardVO> getListWithPaging(Criteria cri);
		
	public void insert(BoardVO board);
	
	public void insertSelectKey(BoardVO board);
	
	public BoardVO read(long bno);
	
	public long count(); 
	public long admin_scount();
	public long search_count(String writter);
	//public long search_list(@Param("num1"), int num1,@Param("num2") int num2)
	
	public int delete(long bno);
	
	public int update(BoardVO board);
	
	public List<BoardVO> quiz(long num);
	
	
}
