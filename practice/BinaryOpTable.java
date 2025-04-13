public class BinaryOpTable {
    public static void main (String[] args) {

        boolean p, q;

        // Print header
        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

        // Row 1: p = true, q = true
        p = true; q = true;
        System.out.print((p ? 1 : 0) + "\t" + (q ? 1 : 0) + "\t");
        System.out.print(((p & q) ? 1 : 0) + "\t" + ((p | q) ? 1 : 0) + "\t");
        System.out.println(((p ^ q) ? 1 : 0) + "\t" + ((!p) ? 1 : 0));

        // Row 2: p = true, q = false
        p = true; q = false;
        System.out.print((p ? 1 : 0) + "\t" + (q ? 1 : 0) + "\t");
        System.out.print(((p & q) ? 1 : 0) + "\t" + ((p | q) ? 1 : 0) + "\t");
        System.out.println(((p ^ q) ? 1 : 0) + "\t" + ((!p) ? 1 : 0));

        // Row 3: p = false, q = true
        p = false; q = true;
        System.out.print((p ? 1 : 0) + "\t" + (q ? 1 : 0) + "\t");
        System.out.print(((p & q) ? 1 : 0) + "\t" + ((p | q) ? 1 : 0) + "\t");
        System.out.println(((p ^ q) ? 1 : 0) + "\t" + ((!p) ? 1 : 0));

        // Row 4: p = false, q = false
        p = false; q = false;
        System.out.print((p ? 1 : 0) + "\t" + (q ? 1 : 0) + "\t");
        System.out.print(((p & q) ? 1 : 0) + "\t" + ((p | q) ? 1 : 0) + "\t");
        System.out.println(((p ^ q) ? 1 : 0) + "\t" + ((!p) ? 1 : 0));
        
    }
}