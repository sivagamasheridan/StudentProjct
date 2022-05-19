/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printingstudentdetails;

/**
 * object,storing array,printing
 * @author srinivsi
 */
public class PrintingStudentDetails {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
    //array of object
        Student[] list = new Student[3];
        
        Student s1 = new Student();
        s1.setName("john");
        s1.setAge(19);
        Student s2 = new Student();
        s2.setName("Peter");
        s2.setAge(19);
        Student s3 = new Student();
        s3.setName("harman");
        s3.setAge(19);
        list[0]=s1;
        list[1]=s2;
        list[2]=s3;
        for(int i=0;i<list.length;i++)
        {
     System.out.println(list[i].getName()+ " "+list[i].getAge());
        }
    }
    
}
