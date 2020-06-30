package Models;

import Interface.IStreamable;

public class Music implements IStreamable {
	
	private String artist;
    private String album;
	public int Length;
	public int BytesSent;

    
    public Music(String artist, String album, int length, int bytesSent) {
        this.artist = artist;
        this.album = album;
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
