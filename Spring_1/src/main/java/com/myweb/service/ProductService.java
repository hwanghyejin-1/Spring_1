package com.myweb.service;
// Service는 DAO가 DB에서 받아온 데이터를 전달받아 가공하는 것
import java.util.List;

import com.myweb.domain.ProductVO;

public interface ProductService {
	public void write(ProductVO pvo);
	public List<ProductVO> list();
	public ProductVO detail(Integer pno);
	public void modify(ProductVO pvo);
	public void remove(Integer pno);	
}
