package cz.sam.march.utils;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;

public class Hash {

    private static byte[] salt = {
            -73, 81, 116, -74, -17, 115, 24, 117, -31, 28, 5, 40, 54, -46, 58, 102
    };

    public static String sha512(String text) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-512");
            md.update(salt);

            byte[] hashedPassword = md.digest(text.getBytes(StandardCharsets.UTF_8));

            Base64.Encoder enc = Base64.getEncoder();

            return enc.encodeToString(hashedPassword);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return null;
    }

}
