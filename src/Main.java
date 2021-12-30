public class Main {
    public static boolean asalMı(int sayi){
        for (int i=2;i<sayi;i++){
            if (sayi%i==0){
                return false;
            }
        }
        return  true;
    }

    public static void main(String[] args) {
	// write your code here
        for (int i=2;i<1000;i++){
            if (asalMı(i)){
                System.out.println(i);
            }
        }
    }
}
