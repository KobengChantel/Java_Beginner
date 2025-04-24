package chapter14.Lesson14;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Jada
 */
public class TestClass {
    public static void main(String[] args) {
        TestClass tc = new TestClass();
        try{
            tc.testCheckedException();
        }catch(IOException e) {
            System.out.println(e);
        }  catch (Exception ex) {
            Logger.getLogger(TestClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void testCheckedException() throws Exception {
        File testFile = new File("//testFile.txt");
        testFile.createNewFile();
        System.out.println("testFile exists: " +
                testFile.exists());
    }
}
