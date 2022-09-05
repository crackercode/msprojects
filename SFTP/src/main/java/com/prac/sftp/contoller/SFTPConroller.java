/**
 * 
 */
package com.prac.sftp.contoller;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prac.sftp.config.SFTPConfig.UploadGateway;

/**
 * @author cracker
 *
 * @since 2022
 */
@RestController
@RequestMapping("/service")
public class SFTPConroller {

	@Autowired
	private UploadGateway uploadGateway;

	@GetMapping("/upload")
	public String get() {
		File file = new File("C://temp//src.txt");
		String name = file.getName();
		uploadGateway.upload(file);
		return "Success";
	}

}
