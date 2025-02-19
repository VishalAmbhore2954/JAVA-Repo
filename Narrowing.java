class Narrowing {
    public static void main(String args[]) {
        int a = 10;
        char b = (char) a;
        long c = 100;
        float d1 = c;
        double e = 10;
        byte e1 = (byte) e;
        int f = 10;
        short f1 = (short) f;
        double g = 10;
        short g1 =(short) g;
        double h = 11.11;
        char h1 =(char) h; //not printing value
        // boolean i = false;
        // double i1 = i;
        // boolean j= false;
        // char j1 =j;
        // boolean k=false;
        // int k1 = k;
        long l = 10;
        int l1 =(int) l;
        double m = 10.10;
        int m1 =(int) m;
        System.out.println(h1);
    }
}