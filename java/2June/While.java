public class While {
    public static void main(String[] args) {
        int i =0 ;
        while (i<=30) {
                i++;
                if (i%2==0) {
                    continue;
                    // break;
                    // return;
                }
                System.out.println(i);
        }
    }
}
