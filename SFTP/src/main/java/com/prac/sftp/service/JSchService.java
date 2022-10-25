/**
 * 
 */
package com.prac.sftp.service;

import java.util.Properties;

import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.SftpException;

/**
 * @author cracker
 *
 * @since 2022
 */
public class JSchService {


	public static void main(String[] args) throws JSchException, SftpException {
		
		String localFile = "C://temp//src.txt";
		String remoteDir = "/remote_jsch/";
		String remoteFileName = "jschFile.txt";
		
		JSch jsch = new JSch();
//		jsch.setKnownHosts("G:\\MyPracticals\\GitHub\\msprojects\\SFTP\\src\\main\\resources\\known_hosts");
		jsch.addIdentity("C:\\Users\\UAER\\.ssh\\id_rsa");
//		jsch.setKnownHosts("C:\\Users\\UAER\\.ssh\\authorized_keys");
		Session jschSession = jsch.getSession("UAER", "192.168.1.5", 22);
		//connect using password
//		jschSession.setPassword("123");
//		Properties config = new Properties();
//		config.put("StrictHostKeyChecking", "no");
//		jschSession.setConfig(config);		
		jschSession.connect();
		System.out.println("Session Status : " + jschSession.isConnected());

		ChannelSftp channelSftp = (ChannelSftp) jschSession.openChannel("sftp");
		channelSftp.connect();

		//Raname File
//		channelSftp.rename(remoteDir, remoteFileName);
		
		//Upload File
		channelSftp.put(localFile, remoteDir + remoteFileName);

		channelSftp.exit();
		channelSftp.disconnect();
		jschSession.disconnect();
	}

}
