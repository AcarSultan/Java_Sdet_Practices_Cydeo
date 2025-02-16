package choose_language;

public class ChooseLanguage {
    public static void main(String[] args) {

        System.out.println(choosingLanguage(1));

    }

    /**
     * Custom method for choosing a language
     * @param selection int
     * @return result
     */
    public static String choosingLanguage(int selection){

        String result= null;

        if (selection==1){
            result = "Hello, thank you for your call";
        } else if (selection==2) {
            result = "Hola, gracias por llamar";
        } else if (selection==3) {
            result = "Merhaba, aradığınız için teşekkürler";
        } else if (selection==4) {
            result = "Привет, спасибо за ваш звонок";
        } else if (selection==5){
            result = "Merci, pour votre appel";
        }

        return result;

    }



}
