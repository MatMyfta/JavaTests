/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloading;

/**
 *
 * @author acer
 */
public class Overloading {
    int x = 2;
    private Overloading(int x) {
        f(x);
        f();
        System.out.print(x);
    }
    void f(int x) {
        this.x++;
        x--;
        System.out.print(x);
    }
    void f() {
        x++;
        System.out.print(x);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	    Overloading x = new Overloading(9);
    }
    
}
