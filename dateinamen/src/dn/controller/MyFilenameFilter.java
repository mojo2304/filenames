package dn.controller;

import java.io.File;
import java.io.FilenameFilter;

public class MyFilenameFilter implements FilenameFilter {

	public MyFilenameFilter() {
	}
	
	@Override
	public boolean accept(File arg0, String arg1) {
		// akzeptiere alle Files
		return true;
	}

}
