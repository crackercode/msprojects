/**
 * 
 */
package com.prac.sftp.service;

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

	public static ChannelSftp setupJsch() throws JSchException {
		JSch jsch = new JSch();
		jsch.setKnownHosts("./known_hosts");
		Session jschSession = jsch.getSession("UAER", "192.168.1.5");
//		jschSession.setPassword("123");
		jschSession.connect();
		return (ChannelSftp) jschSession.openChannel("sftp");
	}

	public static void main(String[] args) throws JSchException, SftpException {

		ChannelSftp channelSftp = setupJsch();
		channelSftp.connect();

		String localFile = "C://temp//src.txt";
		String remoteDir = "remote_sftp_test/";

		channelSftp.put(localFile, remoteDir + "jschFile.txt");

		channelSftp.exit();
	}

}
