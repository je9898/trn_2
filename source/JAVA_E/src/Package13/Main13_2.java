package Package13;

public class Main13_2 {
    public static void main(String[] args) {
        Main13_2 m = new Main13_2();
        try {
            m.SayNick("바다");
            m.SayNick("바보");
            m.SayNick("야호");
        }catch (FoolEx e){
            System.out.println("Err : " + e);
        }
    }

    public void SayNick(String nick) throws FoolEx{
        if("바보".equals(nick)){
            throw new FoolEx();
        }
        System.out.println(nick);
    }
}

class FoolEx extends RuntimeException{

}

