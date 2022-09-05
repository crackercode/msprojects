/**
 * 
 */
package com.prac.sftp.config;

import java.io.File;

import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;

/**
 * @author cracker
 *
 * @since 2022
 */
@MessagingGateway
public interface UploadGateway {

	@Gateway(requestChannel = "toSftpChannel")
	void upload(File file);

}
