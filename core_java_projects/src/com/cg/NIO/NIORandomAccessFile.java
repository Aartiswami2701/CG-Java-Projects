package com.cg.NIO;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NIORandomAccessFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (RandomAccessFile aFile = new RandomAccessFile("output.txt", "rw");
	             FileChannel inChannel = aFile.getChannel()) {
	 
	            ByteBuffer buf = ByteBuffer.allocate(48); 
	            int bytesRead = inChannel.read(buf); 
	            while (bytesRead != -1) {
	                System.out.println("\n"+"Read " +" " + bytesRead + " bytes.");
	                buf.flip(); 
	                while (buf.hasRemaining()) {
	                    System.out.print((char) buf.get());
	                }
	                buf.clear(); 
	                bytesRead = inChannel.read(buf); 
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	}

}