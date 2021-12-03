
package Decorator;


public class SMS implements Notificacion{

    @Override
    public void createNote() {
        //Crea la notificacion por SMS
    }
}

class Email implements Notificacion{

    @Override
    public void createNote() {
        //Crea la notificacion por Email
    }
    
}