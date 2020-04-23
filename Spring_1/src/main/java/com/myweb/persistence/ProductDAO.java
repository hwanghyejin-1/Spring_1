package com.myweb.persistence;
//DAO는 DB를 사용해 데이터를 조회하거나 조작하는 기능을 전담하도록 만든 객체
import java.util.List;

import com.myweb.domain.ProductVO;

public interface ProductDAO {
	public void insert(ProductVO pvo);
	public List<ProductVO> selectList();
	public ProductVO selectOne(Integer pno);
	public void update(ProductVO pvo);
	public void delete(Integer pno);
}
