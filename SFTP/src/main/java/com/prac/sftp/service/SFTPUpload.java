/**
 * 
 */
package com.prac.sftp.service;

import java.io.IOException;

import net.schmizz.sshj.SSHClient;
import net.schmizz.sshj.sftp.SFTPClient;
import net.schmizz.sshj.xfer.FileSystemFile;

/**
 * @author cracker
 *
 * @since 2022
 */
public class SFTPUpload {
	
	public static void main(String[] args)
            throws IOException {
        final SSHClient ssh = new SSHClient();
        ssh.loadKnownHosts();
        ssh.connect("192.168.1.5");
        try {
            ssh.authPublickey("UAER");
            final SFTPClient sftp = ssh.newSFTPClient();
            try {
                sftp.get("C://temp//src.txt", new FileSystemFile("/tmp"));
            } finally {
                sftp.close();
            }
        } finally {
            ssh.disconnect();
        }
    }

}
