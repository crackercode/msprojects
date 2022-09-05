/**
 * 
 */
package com.prac.sftp.service;

import org.apache.commons.vfs2.FileObject;
import org.apache.commons.vfs2.FileSystemException;
import org.apache.commons.vfs2.FileSystemManager;
import org.apache.commons.vfs2.Selectors;
import org.apache.commons.vfs2.VFS;

/**
 * @author cracker
 *
 * @since 2022
 */
public class ApacheCommonsVFSDownloadFile {

	public static void main(String[] args) throws FileSystemException {
		FileSystemManager manager = VFS.getManager();

		FileObject local = manager.resolveFile("C://temp//download.txt");
		FileObject remote = manager
				.resolveFile("sftp://" + "UAER" + ":" + "123" + "@" + "192.168.1.5" + "/" + "remoteFile.txt");

		local.copyFrom(remote, Selectors.SELECT_SELF);

		local.close();
		remote.close();
	}

}
