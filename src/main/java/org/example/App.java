package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        MyTree t = new MyTree();

        t.insert(5);
        t.insert(2);
        t.insert(6);
        t.insert(3);
        t.insert(10);
        //t.insert(5);

        t.delete(10);

        t.inorder();
        t.postorder();
        t.preorder();

        System.out.println( "Hello World!" );
    }
}
