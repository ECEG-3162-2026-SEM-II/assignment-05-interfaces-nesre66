package com.jju;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.lang.reflect.*;
import java.util.List;

public class PaymentTest {

    @Test
    public void testIsInterface() {
        assertTrue(PaymentMethod.class.isInterface(), "PaymentMethod must be an INTERFACE.");
    }

    @Test
    public void testCreditCardImplementation() {
        CreditCard card = new CreditCard("1234-5678");
        assertTrue(card instanceof PaymentMethod, "CreditCard must implement PaymentMethod.");
    }

    @Test
    public void testPayPalImplementation() {
        PayPal poly = new PayPal("test@example.com");
        assertTrue(poly instanceof PaymentMethod, "PayPal must implement PaymentMethod.");
    }

    @Test
    public void testPrivateFields() {
        Field[] cardFields = CreditCard.class.getDeclaredFields();
        for (Field f : cardFields) {
            assertTrue(Modifier.isPrivate(f.getModifiers()), "Fields in CreditCard must be private.");
        }
    }

    @Test
    public void testPolymorphicList() throws Exception {
        String content = java.nio.file.Files.readString(java.nio.file.Paths.get("src/main/java/Main.java"));
        assertTrue(content.contains("List<PaymentMethod>") || content.contains("ArrayList<PaymentMethod>"), 
            "Main.java must declare a List of the interface type (PaymentMethod).");
    }
}