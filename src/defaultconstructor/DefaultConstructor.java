/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package defaultconstructor;

/**
 *
 * @author jeremyhodgson
 */
public class DefaultConstructor {

    int x = 10;
    int y = 11;
    
    public DefaultConstructor(int i){
        System.out.println("parameterized constructor used to pass int " + i);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DefaultConstructor test = new DefaultConstructor(5);
            System.out.println("default constructor used to pass instance variable: x, " + test.x);
            System.out.println("default constructor used to pass instance variable: y, " + test.y);            
    }
    
}
