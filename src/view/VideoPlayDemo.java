package view;

import java.io.*;

import java.io.IOException;

public class VideoPlayDemo {
    static void Run(String filePath)
    {
        Runtime r = Runtime.getRuntime();
        try 
        {
            r.exec("cmd /c start "+filePath);
        } catch (IOException e) 
        {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        VideoPlayDemo.Run("C:\\Users\\林十三\\Desktop\\元创游戏平台资料\\绝地求生官方宣传片");
     
    }
}
