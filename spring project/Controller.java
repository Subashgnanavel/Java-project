package com.file.profile;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
@CrossOrigin("http://localhost:8082/")
@RequestMapping("/ece")
public class Controller{
    @Autowired
	Repository repo;
	@PostMapping("/savedata")
	public String save(@RequestBody StudModel d)
	{
		repo.save(d);
		return "insert success";
	}

	@GetMapping("/getdata")
	List<StudModel> getdata(){
		return repo.findAll();
	}
}
