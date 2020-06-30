package Interface;

public interface IStreamable {
	int Length = 1;
	int BytesSent = 1;
	
	public int getLength();
	public int getBytesSent();
	public void setBytesSent(int length);
	public void setLength(int bytesSent);
	
}