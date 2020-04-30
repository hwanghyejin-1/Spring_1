package com.myweb.service;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.myweb.domain.ProductVO;
import com.myweb.persistence.ProductDAO;

@Service
public class ProductServiceImpl implements ProductService {
	private static final Logger log = LoggerFactory.getLogger(ProductServiceImpl.class);
	
	@Inject
	private ProductDAO pdao;
	

	@Override
	public void write(ProductVO pvo) {
		pdao.insert(pvo);
		
	}

	@Override
	public List<ProductVO> list() {
		return pdao.selectList();
	}

	@Override
	public ProductVO detail(Integer pno) {
		return pdao.selectOne(pno);
	}

	@Override
	public void modify(ProductVO pvo) {
		pdao.update(pvo);
		
	}

	@Override
	public void remove(Integer pno) {
		pdao.delete(pno);
		
	}



}
