package week9;

public class eksepsi {
    static void checkAge(int age){
        if (age <18){
            System.out.println("tidak boleh nonton ini hanya 18 ++");
        }
        else{
            System.out.println("monggo kamu sudah dewasa");
        }
    }

    public static void main(String[] args) {
        checkAge(19);
    }
     
}