package Models;

import Interface.IStreamable;

public class File implements IStreamable{
	
	private String name;
	public int Length;
	public int BytesSent;

	public File(String name, int length, int bytesSent) {

		this.name = name;
		Length = length;
		BytesSent = bytesSent;
	
	}

    
	@Override
	public int getLength() {
		return Length;
	}
	@Override
	public void setLength(int length) {
		Length = length;
	}

	@Override
	public int getBytesSent() {
		return BytesSent;
	}
	
	@Override
	public void setBytesSent(int bytesSent) {
		BytesSent = bytesSent;
	}



	
}