package com.myweb.ctrl;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.myweb.domain.ProductVO;
import com.myweb.service.ProductService;

@Controller
@RequestMapping("/Product/*")
public class ProductController {
	private static final Logger log = LoggerFactory.getLogger(ProductController.class);
	@Inject
	private ProductService psv;
	
	@RequestMapping(value="/write", method=RequestMethod.GET)
	public void write() {
		log.info(">>> 상품 등록 페이지 출력 - GET");
	}
	
	@RequestMapping(value="/write", method=RequestMethod.POST)
	public String write(ProductVO pvo, @RequestParam("imgfile")String imgfile, RedirectAttributes reAttr) {
		log.info(">>> 상품 등록 페이지 출력 -POST");
		psv.write(pvo);
		return "redirect:product/list";
	}
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public void list(Model model) {
		log.info(">>> 리스트 출력 - GET");
	}
	
	

	
}
