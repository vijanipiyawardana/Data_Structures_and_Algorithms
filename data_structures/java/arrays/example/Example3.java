public class Example3 {

    // O(N) linear running time complexity
    // because, consider every single letter exactly once.
    public boolean solve(String s) {

        int forward = 0;
        int backward = s.length() - 1;

        while (forward < backward) {
            if (s.charAt(forward) != s.charAt(backward)) {
                return false;
            }
            forward++;
            backward--;
        }

        return true;

    }

    public static void main(String[] args) {
        Example3 e3 = new Example3();
        System.out.println(e3.solve("radar"));
        System.out.println(e3.solve("rader"));
        System.out.println(e3.solve("radam"));
        System.out.println(e3.solve("madar"));
        System.out.println(e3.solve("acca"));
    }
}
