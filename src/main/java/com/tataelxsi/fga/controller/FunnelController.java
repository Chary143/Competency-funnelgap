package com.tataelxsi.fga.controller;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.tataelxsi.fga.service.FunnelService;

@RestController

public class FunnelController {
	
	private static final Logger logger = LoggerFactory.getLogger(FunnelController.class);

	

	@Autowired
	 FunnelService funnelService;
	@RequestMapping(value="/excel",method=RequestMethod.POST)
	public String ImportExcel(@RequestParam("file") MultipartFile files) throws IOException {
		logger.info("file is uploading.....");
		
		this.funnelService.ImportExcelFile(files);
		return "succesful";
	}
}
