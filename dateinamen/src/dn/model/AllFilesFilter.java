package dn.model;

import java.io.File;
import java.io.FilenameFilter;

public class AllFilesFilter implements FilenameFilter {

	public AllFilesFilter() {
	}
	
	@Override
	public boolean accept(File arg0, String arg1) {
		// akzeptiere alle Files
		return true;
	}

}
