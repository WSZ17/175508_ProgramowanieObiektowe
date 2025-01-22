package Zad_3;

public class WindowDisplay {
    Message message;

    public WindowDisplay(Message message){
        this.message=message;
    }

    public void wyslij(String napis){
        message.mess(napis);
    }
}
