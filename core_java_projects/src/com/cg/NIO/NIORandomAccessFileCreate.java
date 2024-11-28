package com.cg.NIO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NIORandomAccessFileCreate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath = "data/nio-data.txt"; 
        createFile(filePath);
        //readFile(filePath);
	}

	private static void createFile(String filePath) {
		// TODO Auto-generated method stub
		new File("data").mkdirs();
		 
        String content = "Hello, Happy Diwali :):):).....!\n";
        try (FileOutputStream fos = new FileOutputStream(filePath)) {
            fos.write(content.getBytes()); 
            System.out.println("File created and content written to " + filePath);
        } catch (IOException e) {
            e.printStackTrace(); 
        }
	}
	@SuppressWarnings("unused")
	private static void readFile(String filePath) {

		        // Use try-with-resources to ensure resources are closed automatically

		        try (RandomAccessFile aFile = new RandomAccessFile(filePath, "r");

		             FileChannel inChannel = aFile.getChannel()) {
	 
		            ByteBuffer buf = ByteBuffer.allocate(48); // Allocate a buffer of size 48 bytes
	 
		            int bytesRead = inChannel.read(buf); // Read data from the channel into the buffer
	 
		            // Loop until the end of the file

		            while (bytesRead != -1) {

		                System.out.println("Read " + bytesRead + " bytes.");
	 
		                buf.flip(); // Prepare the buffer for reading
	 
		                while (buf.hasRemaining()) {

		                    // Print each character read from the buffer

		                    System.out.print((char) buf.get());

		                }
	 
		                buf.clear(); // Clear the buffer for the next read

		                bytesRead = inChannel.read(buf); // Read again

		            }

		        } catch (IOException e) {

		            e.printStackTrace(); // Handle exceptions

		        }

		    }

		}

	 

