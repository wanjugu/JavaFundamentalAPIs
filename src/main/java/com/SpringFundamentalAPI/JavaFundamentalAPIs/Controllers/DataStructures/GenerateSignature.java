package com.SpringFundamentalAPI.JavaFundamentalAPIs.Controllers.DataStructures;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class GenerateSignature {
    public static void main(String[] args) {
        generateSignature();



    }

    public static String generateSignature(){

        String reference = "688634936365581";

        String secret = reference;
        String account = "1000102038316";
        String amount = "1000";
        String currency = "UGX";
        String txnType = "CREDIT";


        String input = account + "&" + amount + "&" + currency + "&" + txnType;

        return hmacSha256(input, secret);

    }

    private static String hmacSha256(String input, String key) {
        String cypher = "";
        try {

            Mac sha256_HMAC = Mac.getInstance("HmacSHA256");
            SecretKeySpec secret_key = new SecretKeySpec(key.getBytes(), "HmacSHA256");
            sha256_HMAC.init(secret_key);

          //  cypher = org.apache.commons.codec.binary.Base64.encodeBase64String(sha256_HMAC.doFinal(input.getBytes()));

        } catch (NoSuchAlgorithmException | InvalidKeyException | IllegalStateException ex) {
            ex.printStackTrace();
            //BaseException.handleException(ex);
        }
        return cypher;
    }
}
