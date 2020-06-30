package Models;

import Interface.IStreamable;

public class StreamProgressInfo {
	 private IStreamable file;

     public StreamProgressInfo(IStreamable file)
     {
         this.file = file;
     }

     public int CalculateCurrentPercent()
     {
         return file.BytesSent * 100 / file.Length;
     }

}
