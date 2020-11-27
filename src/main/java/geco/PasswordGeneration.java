package geco;

import java.nio.charset.Charset;
import java.util.Random;

public class PasswordGeneration {

    /**
     * Mot de passe random genere par la classe.
     */
    private String randomPassword;
    /**
     * Nombre de caractères d'un mot de passe.
     */
    private int NB_CARACTERES = 8;

    /**
     * Construit un mot de passe aleatoire.
     */
    public PasswordGeneration(){
        generatePassword();
    }

    /**
     * Génère un mot de passe aléatoire.
     */
    public void generatePassword(){
        StringBuilder s = new StringBuilder();
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789 !#$%&()*+,-./:;<=>?@[]^_{|}~";
        int tmp;
        for(int i=0; i<NB_CARACTERES; i++){
            tmp = new Random().nextInt(alphabet.length());
            s.append(alphabet.charAt(tmp));
        }
        this.randomPassword = s.toString();
    }

    /**
     * Renvoit le mot de passe.
     * @return randomPassword
     */
    public String getRandomPassword() {
        return randomPassword;
    }
}
