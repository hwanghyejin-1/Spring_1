package com.myweb.persistence;
//DAO�� DB�� ����� �����͸� ��ȸ�ϰų� �����ϴ� ����� �����ϵ��� ���� ��ü
import java.util.List;

import com.myweb.domain.ProductVO;

public interface ProductDAO {
	public void insert(ProductVO pvo);
	public List<ProductVO> selectList();
	public ProductVO selectOne(Integer pno);
	public void update(ProductVO pvo);
	public void delete(Integer pno);
}
