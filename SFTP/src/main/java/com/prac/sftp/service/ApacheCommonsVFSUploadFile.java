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
public class ApacheCommonsVFSUploadFile {

	public static void main(String[] args) throws FileSystemException {
		FileSystemManager manager = VFS.getManager();

		FileObject local = manager.resolveFile("C://temp//src.txt");
		FileObject remote = manager
				.resolveFile("sftp://" + "UAER" + ":" + "123" + "@" + "192.168.1.5" + "/" + "/target/" + "vfsFile.txt");

		remote.copyFrom(local, Selectors.SELECT_SELF);

		local.close();
		remote.close();

	}
}
