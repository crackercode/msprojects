/**
 * 
 */
package com.prac.sftp.config;

import java.io.File;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.expression.common.LiteralExpression;
import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.file.FileNameGenerator;
import org.springframework.integration.sftp.outbound.SftpMessageHandler;
import org.springframework.integration.sftp.session.DefaultSftpSessionFactory;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHandler;

/**
 * @author cracker
 *
 * @since 2022
 */
@Configuration
public class SFTPConfig {
	
	@Value("${sftp.path}")
	private String remoteLocation;

	@Bean
	public DefaultSftpSessionFactory sftpSessionFactory() {
		DefaultSftpSessionFactory factory = new DefaultSftpSessionFactory(true);
		factory.setHost("192.168.1.5");
		factory.setPort(22);
		factory.setUser("UAER");
		factory.setPassword("123");
		factory.setAllowUnknownKeys(true);
		return factory;
	}

	@Bean
	@ServiceActivator(inputChannel = "toSftpChannel")
	public MessageHandler handler() {
		SftpMessageHandler handler = new SftpMessageHandler(sftpSessionFactory());
		handler.setRemoteDirectoryExpression(new LiteralExpression(remoteLocation));
		handler.setFileNameGenerator(new FileNameGenerator() {
			@Override
			public String generateFileName(Message<?> message) {
				if (message.getPayload() instanceof File) {
					return ((File) message.getPayload()).getName();
				} else {
					throw new IllegalArgumentException("File expected as payload.");
				}
			}
		});
		return handler;
	}

	@MessagingGateway
	public interface UploadGateway {

		@Gateway(requestChannel = "toSftpChannel")
		void upload(File file);

	}

//	@Bean
//	@ServiceActivator(inputChannel = "sftpChannel")
//	public MessageHandler handler() {
//		SftpOutboundGateway sftpOutboundGateway = new SftpOutboundGateway(sftpSessionFactory(), "get", "payload");
//		sftpOutboundGateway.setLocalDirectory(new File("G:\\MyPracticals\\SFTP"));
//		return sftpOutboundGateway;
//	}

//	 @Bean
//	    @ServiceActivator(inputChannel = "sftpChannel")
//	    public MessageHandler handler() {
//	        return new SftpOutboundGateway(ftpSessionFactory(), "ls", "'my_remote_dir/'");
//	    }

}
