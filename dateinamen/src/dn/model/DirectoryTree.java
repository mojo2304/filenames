package dn.model;

import java.io.File;
import java.util.ArrayList;

public class DirectoryTree {

	File _directory;
	ArrayList<DirectoryTree> _subDirectories;
	ArrayList<File> _files;
	
	public DirectoryTree(File currentDir) {
		_directory = currentDir;
		_subDirectories = new ArrayList<DirectoryTree>();
		_files = new ArrayList<File>();
	}
	
	public File getDirectoryEntry() {
		return _directory;
	}
	
	public ArrayList<DirectoryTree> getSubDirectories() {
		return _subDirectories;
	}
	
	public ArrayList<File> getFiles() {
		return _files;
	}
	
	public void buildDirectoryTree(int recursiveDepth) {
		buildDirectoryTree(this, recursiveDepth);
	}
	
	public void buildDirectoryTree(DirectoryTree tree, int recursiveDepth) {
		if (recursiveDepth < 0) return;

		for (File f : tree.getDirectoryEntry().listFiles(new AllFilesFilter())) {
			if ((f.isDirectory()) && (recursiveDepth > 0)) {
				DirectoryTree dt = new DirectoryTree(f);
				tree.getSubDirectories().add(dt);
				buildDirectoryTree(dt, recursiveDepth-1);
			} else if (f.isFile()) {
				tree.getFiles().add(f);
			}
		}
	}
	
	public void printDirectoryTree() {
		System.out.println(getDirectoryEntry());
		printDirectoryTree(this, 1);
	}
	
	public void printDirectoryTree(DirectoryTree tree, int depth) {
		for (DirectoryTree dt : tree.getSubDirectories()) {
			for (int i=0; i<depth; i++) {
				System.out.print("\t");
			}
			System.out.println(dt.getDirectoryEntry());
			printDirectoryTree(dt, depth+1);
		}
		for (File f : tree.getFiles()) {
			for (int i=0; i<depth; i++) {
				System.out.print("\t");
			}
			System.out.println(f);
		}
	}
}
