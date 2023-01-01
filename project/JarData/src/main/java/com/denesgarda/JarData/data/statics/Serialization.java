package com.denesgarda.JarData.data.statics;

import com.denesgarda.JarData.data.Serialized;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Base64;

public class Serialization {
    public static Serialized serialize(Object object) throws IOException {
        try (ByteArrayOutputStream bos = new ByteArrayOutputStream()) {
            ObjectOutputStream out;
            out = new ObjectOutputStream(bos);
            out.writeObject(object);
            out.flush();
            return new Serialized(Base64.getEncoder().encodeToString(bos.toByteArray()));
        } catch (Exception e) {
            throw e;
        }
    }
}
