package javaBase.api.io;

import org.junit.Test;

import java.io.*;
import java.util.Scanner;

public class Test_main {


    @Test
    public void test1()
    {
        DataInput dataInput ;
    }

    @Test
    public void test2()
    {
       // byte[] buffer = new byte[1024];
        byte[] buffer = "1".getBytes();
        ByteArrayInputStream bytesStream = new ByteArrayInputStream(buffer);
        int content = bytesStream.read();
        System.out.println(content);
    }

    @Test
    public void test3()
    {
        MessageReciver messageReciver = new MessageReciver();
        MessageSender messageSender = new MessageSender();
        try {
            messageSender.getSendStream().connect(messageReciver.getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
        messageSender.start();
        messageReciver.start();
    }

    @Test
    public void test4() throws Exception
    {
        String filepath = "D:/testfile.txt";
        File file = new File(filepath);
        if(!file.exists()) file.createNewFile();
        RandomAccessFile randomAccessFile = new RandomAccessFile(file,"rw");
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext())
        {
            String content = scanner.next();
            randomAccessFile.write(content.getBytes());
        }
    }



}





//数据发送者
class MessageSender extends Thread{

    private PipedOutputStream sendStream = new PipedOutputStream();

    public PipedOutputStream getSendStream()
    {
        return sendStream;
    }

    public String sendContent = "hello world asdfasdfa 6a54651asfe5哈哈啊啊水电费";
    @Override
    public void run() {
        try {
            sendStream.write(sendContent.getBytes());
        }catch (Exception e)
        {

        }finally {
            try {
                sendStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
//数据接受者
class MessageReciver extends Thread {

    private PipedInputStream inputStream = new PipedInputStream();
    private byte[] buf = new byte[1024];

    public PipedInputStream getInputStream()
    {
        return inputStream;
    }

    @Override
    public void run() {
        try {
            while (inputStream.read(buf) > 0)
            {
                System.out.println(new String(buf));
            }
        }catch (Exception e)
        {

        }finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}