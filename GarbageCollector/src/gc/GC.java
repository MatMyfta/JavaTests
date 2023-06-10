/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gc;

/**
 *
 * @author acer
 */
public class GC {
    
    static int x=1;
    
    class String5 {
	String s;
	
	String5() {
	    this.s = "" + (++x);
	}
	public void finalize() {
	    System.out.print(s);
	}
    }
    
    String5 a = new String5();
    
    void f() {
	    String5 a = new String5();
    }
    public void finalize() {
	    System.out.print("A");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GC a5 = new GC();
        a5.f();
        a5 = new GC();
        a5.f();
        System.gc();
        System.runFinalization();
    }
}
