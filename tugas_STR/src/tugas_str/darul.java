
package tugas_str;

public class darul {
    public static void main(String[] args) {
        int awal=1;
        int akhir=10;
        ulang(awal, akhir);
        
    }
    public static void ulang (int i, int n){
        if (n>=i){
            
            if (i%2==0){
                System.out.println("Genap");
                i++;
                ulang (i, n);
            }else{
                System.out.println("Ganjil");
                i++;
                ulang (i, n);
            }
        }else{
            System.out.println("\nSELESAI");
        }
    }
}
