package com.denesgarda.JarData.data.statics;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialization {
    public static String objectToString(Object object) {
        try {
            ByteArrayOutputStream bo = new ByteArrayOutputStream();
            ObjectOutputStream so = new ObjectOutputStream(bo);
            so.writeObject(object);
            so.flush();
            return bo.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public static <object> Object stringToObject(String string) {
        try {
            byte b[] = string.getBytes();
            ByteArrayInputStream bi = new ByteArrayInputStream(b);
            ObjectInputStream si = new ObjectInputStream(bi);
            return si.readObject();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
