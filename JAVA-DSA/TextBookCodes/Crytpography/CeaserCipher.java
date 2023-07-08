package Crytpography;

public class CeaserCipher {
    protected char[] encoder=new char[26];
    protected char[] decoder=new char[26];
    /* Constructor that intitializes the encryption and decryption arrays */
    public CeaserCipher(int rotation){
        for(int i=0;i<26;i++){
            encoder[i]=(char)('A'+(i+rotation)%26);
            decoder[i]=(char)('A'+(i-rotation+26)%26);
        }
    }
    /* Returns transformation of original String using given code */
    private String transform(String original, char code[]){
        char msg[]=original.toCharArray();
        for(int i=0;i<msg.length;i++){
            if(Character.isUpperCase(msg[i])){
                int j=msg[i]-'A';
                msg[i]=code[j];
            }
        }
        return new String(msg);
    }
    /* Return String representing encrtpted message */
    public String encrypt(String message){
        return transform(message, encoder);
    }
    /* Return decrypted message given encrpted secret */
    public String decrypt(String secret){
        return transform(secret, decoder);
    }

    public static void main(String args[]){
        CeaserCipher cipher=new CeaserCipher(3);
        System.out.println("Encryption code = "+ new String(cipher.encoder));
        System.out.println("Decryption code = "+ new String(cipher.decoder));
        String message="THE EAGLE IS IN PLAY; MEET AT JOE'S";
        String coded=cipher.encrypt((message));
        System.out.println("Secret : "+ coded);
        String answer=cipher.decrypt(coded);
        System.out.println("Message : "+ answer);
    }

}