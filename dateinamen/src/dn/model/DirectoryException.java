package dn.model;

public class DirectoryException extends Exception {

	private static final long serialVersionUID = 1L;
	
	private String _message;
	
	public DirectoryException() {
		_message = "";
	}
	
	public DirectoryException(String message) {
		_message = message;
	}

	public String getMessage() {
		return _message;
	}
}
