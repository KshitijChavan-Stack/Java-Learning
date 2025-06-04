package crpto_Api;

import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.Base64;

public class Encrypt_decryptEx {

    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, NoSuchProviderException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {

        String plainText = "Hello my name is kshitij";
        String key = "5424215424215422"; // AES require sepcific key length
                                         // which are 16,24 and 32
        // here we can Auto Generate the key using the Key generator class and each time io run program it create a new one
        KeyGenerator keygen = KeyGenerator.getInstance("AES"); // spcify the algo 
        keygen.init(128);
        SecretKey secretKey = keygen.generateKey();

        String encodedKey = Base64.getEncoder().encodeToString(secretKey.getEncoded());
        System.out.println("Generated AES Key (Base64): " + encodedKey);


        //  SecretKey secretKey = new SecretKeySpec(key.getBytes(),"AES"); // this methods makes the key in a
                                                                                // java understanding format and also specify the algo
        // here we are encrypting
        Cipher encryptcipher = Cipher.getInstance("AES"); // tell cipher the algo
        encryptcipher.init(Cipher.ENCRYPT_MODE,secretKey); // we can change the mode here
        byte[] encryptedData = encryptcipher.doFinal(plainText.getBytes());//convert data to bytes dofinal() process and return bytes
        String encryptedtext = Base64.getEncoder().encodeToString(encryptedData); //bytes can have garbage, so the Base64 makes it clean
                                                                                  // safe to store in DB
        // and here decrypting
        Cipher decryptcipher = Cipher.getInstance("AES");
        decryptcipher.init(Cipher.DECRYPT_MODE,secretKey);
        byte[] decrypteddata = decryptcipher.doFinal(Base64.getDecoder().decode(encryptedtext));
        String decryptedtext = new String(decrypteddata);

        System.out.println("Encrypted Data : "+encryptedtext);
        System.out.println("Decrypted Data : "+decryptedtext);

    }

}
