package Methods;

public class ReturnIsMandatory {
    public static void main(String[] args) {
        System.out.println(dwip(4));
    }
    public static int dwip(int a){
        if(a>5) {
            return  6;
        }
        return 8;
    }
}
