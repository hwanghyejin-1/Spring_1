package org.myweb.ctrl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;

import org.myweb.domain.SampleDTO;
import org.myweb.domain.SampleDTOList;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/sample/*")
@Log4j
public class SampleController {
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		binder.registerCustomEditor(java.util.Date.class, new CustomDateEditor(dateFormat, false));
	}
	
	@RequestMapping("")
	public void basic() {
		
		log.info(">>> basic .................");
	}
	@RequestMapping(value = "/basic", method = {RequestMethod.GET, RequestMethod.POST})
		public void basicGet() {
		log.info("basic get .....................");
	}
	
	@GetMapping("/basicOnlyGet")
	public void basicGet2() {
		log.info("basic get only get ..................");
	}
	
	@GetMapping("/PART02")
	public String PART02(SampleDTO dto) {
		log.info("" + dto);
		
		return "PART02";
	}
	@GetMapping("/PART02")
	public String PART02(@RequestParam("name") String name,
			@RequestParam("age") int age) {
		log.info("name: "+ name);
		log.info("age: "+ age );
		
		return "PART02";
	}
	
	@GetMapping("/PART02List")
	 public String PART02List(@RequestParam("ids")ArrayList<String> ids) {
		log.info("ids: " + ids);
		return "PART02List";
	}
	
	@GetMapping("/PART02Array")
	 public String PART02Array(@RequestParam("ids") String[] ids) {
		log.info("array ids: " + Arrays.deepToString(ids));
		return "PART02Array";
	}
	@GetMapping("/ex02Bean")
	 public String ex02Bean(SampleDTOList list) {
		log.info("list dtos: " + list);
		return "ex02Bean";
	}
	@GetMapping("/ex04")
	public String ex04(SampleDTO dto, @ModelAttribute("page") int page) {
		log.info("dto: " + dto);
		log.info("page: " + page);

		return "/sample/ex04";
	}
	@GetMapping("/ex05")
	public void ex05() {
		log.info("/ex05 ......... ");
	}
	@GetMapping("/ex06")
	public @ResponseBody SampleDTO ex06() {
		log.info("/ex06 ......... ");
		SampleDTO dto = new SampleDTO();
		dto.setAge(10);
		dto.setName("홍길동");
	
		return dto;
	}
	 @GetMapping("/ex07")
	 public ResponseEntity<String> ex07() {
		 log.info("ex07...........");
		 
		 //{"name":"홍길동"}
		 String msg = "{\"name\": \"홍길동\"}";
		 
		 HttpHeaders header = new HttpHeaders();
		 header.add("Content-Type", "application/json;charset=UTF-8");
		 
		 return new ResponseEntity<>(msg, header, HttpStatus.OK);
	 }
	 @GetMapping("/exUpload")
	  public void exUpload() {
		 log.info("/exUpload ...........");
	 }
	 @GetMapping("/exUploadPost")
	 public void exUploadPost(ArrayList<MultipartFile> files) {
		 files.forEach(file -> {
			 log.info("----------------------------------------");
			 log.info("name:" + file.getOriginalFilename());
			 log.info("size:" + file.getSize());
		 });
	 }
}

