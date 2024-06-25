package dev.tori.simple;
import sun.misc.Unsafe;

import java.io.PrintStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Field;

/**
 * @author <a href=https://github.com/CadenCCC>Caden</a>
 * @since my seasonal depression
 */
@SuppressWarnings("ALL")
public class SuperiorHelloWorld {
    public static void main(String[] args) throws Throwable {
        MethodHandle h = null;
        try {
            h = MethodHandles.lookup().findConstructor(StringHelper.class, MethodType.methodType(void.class));
        } catch (NoSuchMethodException e) {
            MethodHandle methodTypeHandle = MethodHandles.lookup().findStatic(MethodType.class, "methodType", MethodType.methodType(MethodType.class, Class.class, Class.class));
            MethodType voidAndByteArrayMethodType = (MethodType) methodTypeHandle.invokeExact(void.class, byte[].class);
            MethodType voidAndStringMethodType = (MethodType) methodTypeHandle.invokeExact(void.class, String.class);
            MethodType voidAndThrowableMethodType = (MethodType) methodTypeHandle.invoke(void.class, Throwable.class);
            Field unsafeField = Unsafe.class.getDeclaredField("theUnsafe");
            unsafeField.setAccessible(true);
            Unsafe unsafe = (Unsafe) unsafeField.get(null);
            MethodHandle getRuntimeException = MethodHandles.lookup().findConstructor(Throwable.class, voidAndStringMethodType);
            MethodHandle makeString = MethodHandles.lookup().findConstructor(String.class, voidAndByteArrayMethodType);
            byte[] stringByteArrayExceptionName = new byte[] {0b01011001, 0b01100101, 0b01100101, 0b01110010, 0b01110000, 0b00100000, 0b01010100, 0b01101000, 0b01100001, 0b01110100, 0b00100000, 0b01000110, 0b01100001, 0b01101001, 0b01101100, 0b01100101, 0b01100100};
            String stringExceptionCreator = (String) makeString.invokeExact(stringByteArrayExceptionName);
            Throwable exception = (Throwable) getRuntimeException.invokeExact(stringExceptionCreator);
            MethodHandle throwException = MethodHandles.lookup().findVirtual(Unsafe.class, "throwException", voidAndThrowableMethodType);
            throwException.invokeExact(unsafe, exception);
        } catch (IllegalAccessException e) {
            MethodHandle methodTypeHandle = MethodHandles.lookup().findStatic(MethodType.class, "methodType", MethodType.methodType(MethodType.class, Class.class, Class.class));
            MethodType voidAndByteArrayMethodType = (MethodType) methodTypeHandle.invokeExact(void.class, byte[].class);
            MethodType voidAndStringMethodType = (MethodType) methodTypeHandle.invokeExact(void.class, String.class);
            MethodType voidAndThrowableMethodType = (MethodType) methodTypeHandle.invoke(void.class, Throwable.class);
            Field unsafeField = Unsafe.class.getDeclaredField("theUnsafe");
            unsafeField.setAccessible(true);
            Unsafe unsafe = (Unsafe) unsafeField.get(null);
            MethodHandle getRuntimeException = MethodHandles.lookup().findConstructor(Throwable.class, voidAndStringMethodType);
            MethodHandle makeString = MethodHandles.lookup().findConstructor(String.class, voidAndByteArrayMethodType);
            byte[] stringByteArrayExceptionName = new byte[] {0b01011001, 0b01100101, 0b01100101, 0b01110010, 0b01110000, 0b00100000, 0b01010100, 0b01101000, 0b01100001, 0b01110100, 0b00100000, 0b01000110, 0b01100001, 0b01101001, 0b01101100, 0b01100101, 0b01100100};
            String stringExceptionCreator = (String) makeString.invokeExact(stringByteArrayExceptionName);
            Throwable exception = (Throwable) getRuntimeException.invokeExact(stringExceptionCreator);
            MethodHandle throwException = MethodHandles.lookup().findVirtual(Unsafe.class, "throwException", voidAndThrowableMethodType);
            throwException.invokeExact(unsafe, exception);
        }
        StringHelper sh = null;
        try {
            sh = (StringHelper) h.invokeExact();
        } catch (Throwable e) {
            MethodHandle methodTypeHandle = MethodHandles.lookup().findStatic(MethodType.class, "methodType", MethodType.methodType(MethodType.class, Class.class, Class.class));
            MethodType voidAndByteArrayMethodType = (MethodType) methodTypeHandle.invokeExact(void.class, byte[].class);
            MethodType voidAndStringMethodType = (MethodType) methodTypeHandle.invokeExact(void.class, String.class);
            MethodType voidAndThrowableMethodType = (MethodType) methodTypeHandle.invoke(void.class, Throwable.class);
            Field unsafeField = Unsafe.class.getDeclaredField("theUnsafe");
            unsafeField.setAccessible(true);
            Unsafe unsafe = (Unsafe) unsafeField.get(null);
            MethodHandle getRuntimeException = MethodHandles.lookup().findConstructor(Throwable.class, voidAndStringMethodType);
            MethodHandle makeString = MethodHandles.lookup().findConstructor(String.class, voidAndByteArrayMethodType);
            byte[] stringByteArrayExceptionName = new byte[] {0b01011001, 0b01100101, 0b01100101, 0b01110010, 0b01110000, 0b00100000, 0b01010100, 0b01101000, 0b01100001, 0b01110100, 0b00100000, 0b01000110, 0b01100001, 0b01101001, 0b01101100, 0b01100101, 0b01100100};
            String stringExceptionCreator = (String) makeString.invokeExact(stringByteArrayExceptionName);
            Throwable exception = (Throwable) getRuntimeException.invokeExact(stringExceptionCreator);
            MethodHandle throwException = MethodHandles.lookup().findVirtual(Unsafe.class, "throwException", voidAndThrowableMethodType);
            throwException.invokeExact(unsafe, exception);
        }
        MethodHandle bsm = null;
        try {
            bsm = MethodHandles.lookup().findVirtual(StringHelper.class, "buildString", MethodType.methodType(void.class, String.class));
        } catch (NoSuchMethodException e) {
            MethodHandle methodTypeHandle = MethodHandles.lookup().findStatic(MethodType.class, "methodType", MethodType.methodType(MethodType.class, Class.class, Class.class));
            MethodType voidAndByteArrayMethodType = (MethodType) methodTypeHandle.invokeExact(void.class, byte[].class);
            MethodType voidAndStringMethodType = (MethodType) methodTypeHandle.invokeExact(void.class, String.class);
            MethodType voidAndThrowableMethodType = (MethodType) methodTypeHandle.invoke(void.class, Throwable.class);
            Field unsafeField = Unsafe.class.getDeclaredField("theUnsafe");
            unsafeField.setAccessible(true);
            Unsafe unsafe = (Unsafe) unsafeField.get(null);
            MethodHandle getRuntimeException = MethodHandles.lookup().findConstructor(Throwable.class, voidAndStringMethodType);
            MethodHandle makeString = MethodHandles.lookup().findConstructor(String.class, voidAndByteArrayMethodType);
            byte[] stringByteArrayExceptionName = new byte[] {0b01011001, 0b01100101, 0b01100101, 0b01110010, 0b01110000, 0b00100000, 0b01010100, 0b01101000, 0b01100001, 0b01110100, 0b00100000, 0b01000110, 0b01100001, 0b01101001, 0b01101100, 0b01100101, 0b01100100};
            String stringExceptionCreator = (String) makeString.invokeExact(stringByteArrayExceptionName);
            Throwable exception = (Throwable) getRuntimeException.invokeExact(stringExceptionCreator);
            MethodHandle throwException = MethodHandles.lookup().findVirtual(Unsafe.class, "throwException", voidAndThrowableMethodType);
            throwException.invokeExact(unsafe, exception);
        } catch (IllegalAccessException e) {
            MethodHandle methodTypeHandle = MethodHandles.lookup().findStatic(MethodType.class, "methodType", MethodType.methodType(MethodType.class, Class.class, Class.class));
            MethodType voidAndByteArrayMethodType = (MethodType) methodTypeHandle.invokeExact(void.class, byte[].class);
            MethodType voidAndStringMethodType = (MethodType) methodTypeHandle.invokeExact(void.class, String.class);
            MethodType voidAndThrowableMethodType = (MethodType) methodTypeHandle.invoke(void.class, Throwable.class);
            Field unsafeField = Unsafe.class.getDeclaredField("theUnsafe");
            unsafeField.setAccessible(true);
            Unsafe unsafe = (Unsafe) unsafeField.get(null);
            MethodHandle getRuntimeException = MethodHandles.lookup().findConstructor(Throwable.class, voidAndStringMethodType);
            MethodHandle makeString = MethodHandles.lookup().findConstructor(String.class, voidAndByteArrayMethodType);
            byte[] stringByteArrayExceptionName = new byte[] {0b01011001, 0b01100101, 0b01100101, 0b01110010, 0b01110000, 0b00100000, 0b01010100, 0b01101000, 0b01100001, 0b01110100, 0b00100000, 0b01000110, 0b01100001, 0b01101001, 0b01101100, 0b01100101, 0b01100100};
            String stringExceptionCreator = (String) makeString.invokeExact(stringByteArrayExceptionName);
            Throwable exception = (Throwable) getRuntimeException.invokeExact(stringExceptionCreator);
            MethodHandle throwException = MethodHandles.lookup().findVirtual(Unsafe.class, "throwException", voidAndThrowableMethodType);
            throwException.invokeExact(unsafe, exception);
        }
        MethodHandle smh = null;
        try {
            smh = MethodHandles.lookup().findConstructor(String.class, MethodType.methodType(void.class, String.class));
        } catch (NoSuchMethodException e) {
            MethodHandle methodTypeHandle = MethodHandles.lookup().findStatic(MethodType.class, "methodType", MethodType.methodType(MethodType.class, Class.class, Class.class));
            MethodType voidAndByteArrayMethodType = (MethodType) methodTypeHandle.invokeExact(void.class, byte[].class);
            MethodType voidAndStringMethodType = (MethodType) methodTypeHandle.invokeExact(void.class, String.class);
            MethodType voidAndThrowableMethodType = (MethodType) methodTypeHandle.invoke(void.class, Throwable.class);
            Field unsafeField = Unsafe.class.getDeclaredField("theUnsafe");
            unsafeField.setAccessible(true);
            Unsafe unsafe = (Unsafe) unsafeField.get(null);
            MethodHandle getRuntimeException = MethodHandles.lookup().findConstructor(Throwable.class, voidAndStringMethodType);
            MethodHandle makeString = MethodHandles.lookup().findConstructor(String.class, voidAndByteArrayMethodType);
            byte[] stringByteArrayExceptionName = new byte[] {0b01011001, 0b01100101, 0b01100101, 0b01110010, 0b01110000, 0b00100000, 0b01010100, 0b01101000, 0b01100001, 0b01110100, 0b00100000, 0b01000110, 0b01100001, 0b01101001, 0b01101100, 0b01100101, 0b01100100};
            String stringExceptionCreator = (String) makeString.invokeExact(stringByteArrayExceptionName);
            Throwable exception = (Throwable) getRuntimeException.invokeExact(stringExceptionCreator);
            MethodHandle throwException = MethodHandles.lookup().findVirtual(Unsafe.class, "throwException", voidAndThrowableMethodType);
            throwException.invokeExact(unsafe, exception);
        } catch (IllegalAccessException e) {
            MethodHandle methodTypeHandle = MethodHandles.lookup().findStatic(MethodType.class, "methodType", MethodType.methodType(MethodType.class, Class.class, Class.class));
            MethodType voidAndByteArrayMethodType = (MethodType) methodTypeHandle.invokeExact(void.class, byte[].class);
            MethodType voidAndStringMethodType = (MethodType) methodTypeHandle.invokeExact(void.class, String.class);
            MethodType voidAndThrowableMethodType = (MethodType) methodTypeHandle.invoke(void.class, Throwable.class);
            Field unsafeField = Unsafe.class.getDeclaredField("theUnsafe");
            unsafeField.setAccessible(true);
            Unsafe unsafe = (Unsafe) unsafeField.get(null);
            MethodHandle getRuntimeException = MethodHandles.lookup().findConstructor(Throwable.class, voidAndStringMethodType);
            MethodHandle makeString = MethodHandles.lookup().findConstructor(String.class, voidAndByteArrayMethodType);
            byte[] stringByteArrayExceptionName = new byte[] {0b01011001, 0b01100101, 0b01100101, 0b01110010, 0b01110000, 0b00100000, 0b01010100, 0b01101000, 0b01100001, 0b01110100, 0b00100000, 0b01000110, 0b01100001, 0b01101001, 0b01101100, 0b01100101, 0b01100100};
            String stringExceptionCreator = (String) makeString.invokeExact(stringByteArrayExceptionName);
            Throwable exception = (Throwable) getRuntimeException.invokeExact(stringExceptionCreator);
            MethodHandle throwException = MethodHandles.lookup().findVirtual(Unsafe.class, "throwException", voidAndThrowableMethodType);
            throwException.invokeExact(unsafe, exception);
        }
        String hw = null;
        try {
            hw = (String) smh.invokeExact("Hello World!");
        } catch (Throwable e) {
            MethodHandle methodTypeHandle = MethodHandles.lookup().findStatic(MethodType.class, "methodType", MethodType.methodType(MethodType.class, Class.class, Class.class));
            MethodType voidAndByteArrayMethodType = (MethodType) methodTypeHandle.invokeExact(void.class, byte[].class);
            MethodType voidAndStringMethodType = (MethodType) methodTypeHandle.invokeExact(void.class, String.class);
            MethodType voidAndThrowableMethodType = (MethodType) methodTypeHandle.invoke(void.class, Throwable.class);
            Field unsafeField = Unsafe.class.getDeclaredField("theUnsafe");
            unsafeField.setAccessible(true);
            Unsafe unsafe = (Unsafe) unsafeField.get(null);
            MethodHandle getRuntimeException = MethodHandles.lookup().findConstructor(Throwable.class, voidAndStringMethodType);
            MethodHandle makeString = MethodHandles.lookup().findConstructor(String.class, voidAndByteArrayMethodType);
            byte[] stringByteArrayExceptionName = new byte[] {0b01011001, 0b01100101, 0b01100101, 0b01110010, 0b01110000, 0b00100000, 0b01010100, 0b01101000, 0b01100001, 0b01110100, 0b00100000, 0b01000110, 0b01100001, 0b01101001, 0b01101100, 0b01100101, 0b01100100};
            String stringExceptionCreator = (String) makeString.invokeExact(stringByteArrayExceptionName);
            Throwable exception = (Throwable) getRuntimeException.invokeExact(stringExceptionCreator);
            MethodHandle throwException = MethodHandles.lookup().findVirtual(Unsafe.class, "throwException", voidAndThrowableMethodType);
            throwException.invokeExact(unsafe, exception);
        }
        try {
            bsm.invokeExact(sh, hw);
        } catch (Throwable e) {
            MethodHandle methodTypeHandle = MethodHandles.lookup().findStatic(MethodType.class, "methodType", MethodType.methodType(MethodType.class, Class.class, Class.class));
            MethodType voidAndByteArrayMethodType = (MethodType) methodTypeHandle.invokeExact(void.class, byte[].class);
            MethodType voidAndStringMethodType = (MethodType) methodTypeHandle.invokeExact(void.class, String.class);
            MethodType voidAndThrowableMethodType = (MethodType) methodTypeHandle.invoke(void.class, Throwable.class);
            Field unsafeField = Unsafe.class.getDeclaredField("theUnsafe");
            unsafeField.setAccessible(true);
            Unsafe unsafe = (Unsafe) unsafeField.get(null);
            MethodHandle getRuntimeException = MethodHandles.lookup().findConstructor(Throwable.class, voidAndStringMethodType);
            MethodHandle makeString = MethodHandles.lookup().findConstructor(String.class, voidAndByteArrayMethodType);
            byte[] stringByteArrayExceptionName = new byte[] {0b01011001, 0b01100101, 0b01100101, 0b01110010, 0b01110000, 0b00100000, 0b01010100, 0b01101000, 0b01100001, 0b01110100, 0b00100000, 0b01000110, 0b01100001, 0b01101001, 0b01101100, 0b01100101, 0b01100100};
            String stringExceptionCreator = (String) makeString.invokeExact(stringByteArrayExceptionName);
            Throwable exception = (Throwable) getRuntimeException.invokeExact(stringExceptionCreator);
            MethodHandle throwException = MethodHandles.lookup().findVirtual(Unsafe.class, "throwException", voidAndThrowableMethodType);
            throwException.invokeExact(unsafe, exception);
        }
    }
    private static class StringHelper {
        public MethodHandle mhcb;
        public void buildString(String i) throws Throwable {
            try {
                mhcb = MethodHandles.lookup().findConstructor(CharBuilder.class, MethodType.methodType(void.class, char[].class));
            } catch (NoSuchMethodException e) {
                MethodHandle methodTypeHandle = MethodHandles.lookup().findStatic(MethodType.class, "methodType", MethodType.methodType(MethodType.class, Class.class, Class.class));
                MethodType voidAndByteArrayMethodType = (MethodType) methodTypeHandle.invokeExact(void.class, byte[].class);
                MethodType voidAndStringMethodType = (MethodType) methodTypeHandle.invokeExact(void.class, String.class);
                MethodType voidAndThrowableMethodType = (MethodType) methodTypeHandle.invoke(void.class, Throwable.class);
                Field unsafeField = Unsafe.class.getDeclaredField("theUnsafe");
                unsafeField.setAccessible(true);
                Unsafe unsafe = (Unsafe) unsafeField.get(null);
                MethodHandle getRuntimeException = MethodHandles.lookup().findConstructor(Throwable.class, voidAndStringMethodType);
                MethodHandle makeString = MethodHandles.lookup().findConstructor(String.class, voidAndByteArrayMethodType);
                byte[] stringByteArrayExceptionName = new byte[] {0b01011001, 0b01100101, 0b01100101, 0b01110010, 0b01110000, 0b00100000, 0b01010100, 0b01101000, 0b01100001, 0b01110100, 0b00100000, 0b01000110, 0b01100001, 0b01101001, 0b01101100, 0b01100101, 0b01100100};
                String stringExceptionCreator = (String) makeString.invokeExact(stringByteArrayExceptionName);
                Throwable exception = (Throwable) getRuntimeException.invokeExact(stringExceptionCreator);
                MethodHandle throwException = MethodHandles.lookup().findVirtual(Unsafe.class, "throwException", voidAndThrowableMethodType);
                throwException.invokeExact(unsafe, exception);
            } catch (IllegalAccessException e) {
                MethodHandle methodTypeHandle = MethodHandles.lookup().findStatic(MethodType.class, "methodType", MethodType.methodType(MethodType.class, Class.class, Class.class));
                MethodType voidAndByteArrayMethodType = (MethodType) methodTypeHandle.invokeExact(void.class, byte[].class);
                MethodType voidAndStringMethodType = (MethodType) methodTypeHandle.invokeExact(void.class, String.class);
                MethodType voidAndThrowableMethodType = (MethodType) methodTypeHandle.invoke(void.class, Throwable.class);
                Field unsafeField = Unsafe.class.getDeclaredField("theUnsafe");
                unsafeField.setAccessible(true);
                Unsafe unsafe = (Unsafe) unsafeField.get(null);
                MethodHandle getRuntimeException = MethodHandles.lookup().findConstructor(Throwable.class, voidAndStringMethodType);
                MethodHandle makeString = MethodHandles.lookup().findConstructor(String.class, voidAndByteArrayMethodType);
                byte[] stringByteArrayExceptionName = new byte[] {0b01011001, 0b01100101, 0b01100101, 0b01110010, 0b01110000, 0b00100000, 0b01010100, 0b01101000, 0b01100001, 0b01110100, 0b00100000, 0b01000110, 0b01100001, 0b01101001, 0b01101100, 0b01100101, 0b01100100};
                String stringExceptionCreator = (String) makeString.invokeExact(stringByteArrayExceptionName);
                Throwable exception = (Throwable) getRuntimeException.invokeExact(stringExceptionCreator);
                MethodHandle throwException = MethodHandles.lookup().findVirtual(Unsafe.class, "throwException", voidAndThrowableMethodType);
                throwException.invokeExact(unsafe, exception);
            }
            CharBuilder cb = null;
            try {
                cb = (CharBuilder) mhcb.invokeExact(i.toCharArray());
            } catch (Throwable e) {
                MethodHandle methodTypeHandle = MethodHandles.lookup().findStatic(MethodType.class, "methodType", MethodType.methodType(MethodType.class, Class.class, Class.class));
                MethodType voidAndByteArrayMethodType = (MethodType) methodTypeHandle.invokeExact(void.class, byte[].class);
                MethodType voidAndStringMethodType = (MethodType) methodTypeHandle.invokeExact(void.class, String.class);
                MethodType voidAndThrowableMethodType = (MethodType) methodTypeHandle.invoke(void.class, Throwable.class);
                Field unsafeField = Unsafe.class.getDeclaredField("theUnsafe");
                unsafeField.setAccessible(true);
                Unsafe unsafe = (Unsafe) unsafeField.get(null);
                MethodHandle getRuntimeException = MethodHandles.lookup().findConstructor(Throwable.class, voidAndStringMethodType);
                MethodHandle makeString = MethodHandles.lookup().findConstructor(String.class, voidAndByteArrayMethodType);
                byte[] stringByteArrayExceptionName = new byte[] {0b01011001, 0b01100101, 0b01100101, 0b01110010, 0b01110000, 0b00100000, 0b01010100, 0b01101000, 0b01100001, 0b01110100, 0b00100000, 0b01000110, 0b01100001, 0b01101001, 0b01101100, 0b01100101, 0b01100100};
                String stringExceptionCreator = (String) makeString.invokeExact(stringByteArrayExceptionName);
                Throwable exception = (Throwable) getRuntimeException.invokeExact(stringExceptionCreator);
                MethodHandle throwException = MethodHandles.lookup().findVirtual(Unsafe.class, "throwException", voidAndThrowableMethodType);
                throwException.invokeExact(unsafe, exception);
            }
            MethodHandle bshm = null;
            try {
                bshm = MethodHandles.lookup().findVirtual(CharBuilder.class, "buildString", MethodType.methodType(String.class));
            } catch (NoSuchMethodException e) {
                MethodHandle methodTypeHandle = MethodHandles.lookup().findStatic(MethodType.class, "methodType", MethodType.methodType(MethodType.class, Class.class, Class.class));
                MethodType voidAndByteArrayMethodType = (MethodType) methodTypeHandle.invokeExact(void.class, byte[].class);
                MethodType voidAndStringMethodType = (MethodType) methodTypeHandle.invokeExact(void.class, String.class);
                MethodType voidAndThrowableMethodType = (MethodType) methodTypeHandle.invoke(void.class, Throwable.class);
                Field unsafeField = Unsafe.class.getDeclaredField("theUnsafe");
                unsafeField.setAccessible(true);
                Unsafe unsafe = (Unsafe) unsafeField.get(null);
                MethodHandle getRuntimeException = MethodHandles.lookup().findConstructor(Throwable.class, voidAndStringMethodType);
                MethodHandle makeString = MethodHandles.lookup().findConstructor(String.class, voidAndByteArrayMethodType);
                byte[] stringByteArrayExceptionName = new byte[] {0b01011001, 0b01100101, 0b01100101, 0b01110010, 0b01110000, 0b00100000, 0b01010100, 0b01101000, 0b01100001, 0b01110100, 0b00100000, 0b01000110, 0b01100001, 0b01101001, 0b01101100, 0b01100101, 0b01100100};
                String stringExceptionCreator = (String) makeString.invokeExact(stringByteArrayExceptionName);
                Throwable exception = (Throwable) getRuntimeException.invokeExact(stringExceptionCreator);
                MethodHandle throwException = MethodHandles.lookup().findVirtual(Unsafe.class, "throwException", voidAndThrowableMethodType);
                throwException.invokeExact(unsafe, exception);
            } catch (IllegalAccessException e) {
                MethodHandle methodTypeHandle = MethodHandles.lookup().findStatic(MethodType.class, "methodType", MethodType.methodType(MethodType.class, Class.class, Class.class));
                MethodType voidAndByteArrayMethodType = (MethodType) methodTypeHandle.invokeExact(void.class, byte[].class);
                MethodType voidAndStringMethodType = (MethodType) methodTypeHandle.invokeExact(void.class, String.class);
                MethodType voidAndThrowableMethodType = (MethodType) methodTypeHandle.invoke(void.class, Throwable.class);
                Field unsafeField = Unsafe.class.getDeclaredField("theUnsafe");
                unsafeField.setAccessible(true);
                Unsafe unsafe = (Unsafe) unsafeField.get(null);
                MethodHandle getRuntimeException = MethodHandles.lookup().findConstructor(Throwable.class, voidAndStringMethodType);
                MethodHandle makeString = MethodHandles.lookup().findConstructor(String.class, voidAndByteArrayMethodType);
                byte[] stringByteArrayExceptionName = new byte[] {0b01011001, 0b01100101, 0b01100101, 0b01110010, 0b01110000, 0b00100000, 0b01010100, 0b01101000, 0b01100001, 0b01110100, 0b00100000, 0b01000110, 0b01100001, 0b01101001, 0b01101100, 0b01100101, 0b01100100};
                String stringExceptionCreator = (String) makeString.invokeExact(stringByteArrayExceptionName);
                Throwable exception = (Throwable) getRuntimeException.invokeExact(stringExceptionCreator);
                MethodHandle throwException = MethodHandles.lookup().findVirtual(Unsafe.class, "throwException", voidAndThrowableMethodType);
                throwException.invokeExact(unsafe, exception);
            }
            String bs = null;
            try {
                bs = (String) bshm.invokeExact(cb);
            } catch (Throwable e) {
                MethodHandle methodTypeHandle = MethodHandles.lookup().findStatic(MethodType.class, "methodType", MethodType.methodType(MethodType.class, Class.class, Class.class));
                MethodType voidAndByteArrayMethodType = (MethodType) methodTypeHandle.invokeExact(void.class, byte[].class);
                MethodType voidAndStringMethodType = (MethodType) methodTypeHandle.invokeExact(void.class, String.class);
                MethodType voidAndThrowableMethodType = (MethodType) methodTypeHandle.invoke(void.class, Throwable.class);
                Field unsafeField = Unsafe.class.getDeclaredField("theUnsafe");
                unsafeField.setAccessible(true);
                Unsafe unsafe = (Unsafe) unsafeField.get(null);
                MethodHandle getRuntimeException = MethodHandles.lookup().findConstructor(Throwable.class, voidAndStringMethodType);
                MethodHandle makeString = MethodHandles.lookup().findConstructor(String.class, voidAndByteArrayMethodType);
                byte[] stringByteArrayExceptionName = new byte[] {0b01011001, 0b01100101, 0b01100101, 0b01110010, 0b01110000, 0b00100000, 0b01010100, 0b01101000, 0b01100001, 0b01110100, 0b00100000, 0b01000110, 0b01100001, 0b01101001, 0b01101100, 0b01100101, 0b01100100};
                String stringExceptionCreator = (String) makeString.invokeExact(stringByteArrayExceptionName);
                Throwable exception = (Throwable) getRuntimeException.invokeExact(stringExceptionCreator);
                MethodHandle throwException = MethodHandles.lookup().findVirtual(Unsafe.class, "throwException", voidAndThrowableMethodType);
                throwException.invokeExact(unsafe, exception);
            }
            if (bs == null) {
                PrintStream out = null;
                try {
                    out = (PrintStream) MethodHandles.lookup().findStaticGetter(System.class, "out", PrintStream.class).invokeExact();
                } catch (Throwable e) {
                    MethodHandle methodTypeHandle = MethodHandles.lookup().findStatic(MethodType.class, "methodType", MethodType.methodType(MethodType.class, Class.class, Class.class));
                    MethodType voidAndByteArrayMethodType = (MethodType) methodTypeHandle.invokeExact(void.class, byte[].class);
                    MethodType voidAndStringMethodType = (MethodType) methodTypeHandle.invokeExact(void.class, String.class);
                    MethodType voidAndThrowableMethodType = (MethodType) methodTypeHandle.invoke(void.class, Throwable.class);
                    Field unsafeField = Unsafe.class.getDeclaredField("theUnsafe");
                    unsafeField.setAccessible(true);
                    Unsafe unsafe = (Unsafe) unsafeField.get(null);
                    MethodHandle getRuntimeException = MethodHandles.lookup().findConstructor(Throwable.class, voidAndStringMethodType);
                    MethodHandle makeString = MethodHandles.lookup().findConstructor(String.class, voidAndByteArrayMethodType);
                    byte[] stringByteArrayExceptionName = new byte[] {0b01011001, 0b01100101, 0b01100101, 0b01110010, 0b01110000, 0b00100000, 0b01010100, 0b01101000, 0b01100001, 0b01110100, 0b00100000, 0b01000110, 0b01100001, 0b01101001, 0b01101100, 0b01100101, 0b01100100};
                    String stringExceptionCreator = (String) makeString.invokeExact(stringByteArrayExceptionName);
                    Throwable exception = (Throwable) getRuntimeException.invokeExact(stringExceptionCreator);
                    MethodHandle throwException = MethodHandles.lookup().findVirtual(Unsafe.class, "throwException", voidAndThrowableMethodType);
                    throwException.invokeExact(unsafe, exception);
                }
                MethodHandle lh = null;
                try {
                    lh = MethodHandles.lookup().findVirtual(PrintStream.class, "println", MethodType.methodType(void.class, String.class));
                } catch (NoSuchMethodException e) {
                    MethodHandle methodTypeHandle = MethodHandles.lookup().findStatic(MethodType.class, "methodType", MethodType.methodType(MethodType.class, Class.class, Class.class));
                    MethodType voidAndByteArrayMethodType = (MethodType) methodTypeHandle.invokeExact(void.class, byte[].class);
                    MethodType voidAndStringMethodType = (MethodType) methodTypeHandle.invokeExact(void.class, String.class);
                    MethodType voidAndThrowableMethodType = (MethodType) methodTypeHandle.invoke(void.class, Throwable.class);
                    Field unsafeField = Unsafe.class.getDeclaredField("theUnsafe");
                    unsafeField.setAccessible(true);
                    Unsafe unsafe = (Unsafe) unsafeField.get(null);
                    MethodHandle getRuntimeException = MethodHandles.lookup().findConstructor(Throwable.class, voidAndStringMethodType);
                    MethodHandle makeString = MethodHandles.lookup().findConstructor(String.class, voidAndByteArrayMethodType);
                    byte[] stringByteArrayExceptionName = new byte[] {0b01011001, 0b01100101, 0b01100101, 0b01110010, 0b01110000, 0b00100000, 0b01010100, 0b01101000, 0b01100001, 0b01110100, 0b00100000, 0b01000110, 0b01100001, 0b01101001, 0b01101100, 0b01100101, 0b01100100};
                    String stringExceptionCreator = (String) makeString.invokeExact(stringByteArrayExceptionName);
                    Throwable exception = (Throwable) getRuntimeException.invokeExact(stringExceptionCreator);
                    MethodHandle throwException = MethodHandles.lookup().findVirtual(Unsafe.class, "throwException", voidAndThrowableMethodType);
                    throwException.invokeExact(unsafe, exception);
                } catch (IllegalAccessException e) {
                    MethodHandle methodTypeHandle = MethodHandles.lookup().findStatic(MethodType.class, "methodType", MethodType.methodType(MethodType.class, Class.class, Class.class));
                    MethodType voidAndByteArrayMethodType = (MethodType) methodTypeHandle.invokeExact(void.class, byte[].class);
                    MethodType voidAndStringMethodType = (MethodType) methodTypeHandle.invokeExact(void.class, String.class);
                    MethodType voidAndThrowableMethodType = (MethodType) methodTypeHandle.invoke(void.class, Throwable.class);
                    Field unsafeField = Unsafe.class.getDeclaredField("theUnsafe");
                    unsafeField.setAccessible(true);
                    Unsafe unsafe = (Unsafe) unsafeField.get(null);
                    MethodHandle getRuntimeException = MethodHandles.lookup().findConstructor(Throwable.class, voidAndStringMethodType);
                    MethodHandle makeString = MethodHandles.lookup().findConstructor(String.class, voidAndByteArrayMethodType);
                    byte[] stringByteArrayExceptionName = new byte[] {0b01011001, 0b01100101, 0b01100101, 0b01110010, 0b01110000, 0b00100000, 0b01010100, 0b01101000, 0b01100001, 0b01110100, 0b00100000, 0b01000110, 0b01100001, 0b01101001, 0b01101100, 0b01100101, 0b01100100};
                    String stringExceptionCreator = (String) makeString.invokeExact(stringByteArrayExceptionName);
                    Throwable exception = (Throwable) getRuntimeException.invokeExact(stringExceptionCreator);
                    MethodHandle throwException = MethodHandles.lookup().findVirtual(Unsafe.class, "throwException", voidAndThrowableMethodType);
                    throwException.invokeExact(unsafe, exception);
                }
                MethodHandle smh = null;
                try {
                    smh = MethodHandles.lookup().findConstructor(String.class, MethodType.methodType(void.class, byte[].class));
                } catch (NoSuchMethodException e) {
                    MethodHandle methodTypeHandle = MethodHandles.lookup().findStatic(MethodType.class, "methodType", MethodType.methodType(MethodType.class, Class.class, Class.class));
                    MethodType voidAndByteArrayMethodType = (MethodType) methodTypeHandle.invokeExact(void.class, byte[].class);
                    MethodType voidAndStringMethodType = (MethodType) methodTypeHandle.invokeExact(void.class, String.class);
                    MethodType voidAndThrowableMethodType = (MethodType) methodTypeHandle.invoke(void.class, Throwable.class);
                    Field unsafeField = Unsafe.class.getDeclaredField("theUnsafe");
                    unsafeField.setAccessible(true);
                    Unsafe unsafe = (Unsafe) unsafeField.get(null);
                    MethodHandle getRuntimeException = MethodHandles.lookup().findConstructor(Throwable.class, voidAndStringMethodType);
                    MethodHandle makeString = MethodHandles.lookup().findConstructor(String.class, voidAndByteArrayMethodType);
                    byte[] stringByteArrayExceptionName = new byte[] {0b01011001, 0b01100101, 0b01100101, 0b01110010, 0b01110000, 0b00100000, 0b01010100, 0b01101000, 0b01100001, 0b01110100, 0b00100000, 0b01000110, 0b01100001, 0b01101001, 0b01101100, 0b01100101, 0b01100100};
                    String stringExceptionCreator = (String) makeString.invokeExact(stringByteArrayExceptionName);
                    Throwable exception = (Throwable) getRuntimeException.invokeExact(stringExceptionCreator);
                    MethodHandle throwException = MethodHandles.lookup().findVirtual(Unsafe.class, "throwException", voidAndThrowableMethodType);
                    throwException.invokeExact(unsafe, exception);
                } catch (IllegalAccessException e) {
                    MethodHandle methodTypeHandle = MethodHandles.lookup().findStatic(MethodType.class, "methodType", MethodType.methodType(MethodType.class, Class.class, Class.class));
                    MethodType voidAndByteArrayMethodType = (MethodType) methodTypeHandle.invokeExact(void.class, byte[].class);
                    MethodType voidAndStringMethodType = (MethodType) methodTypeHandle.invokeExact(void.class, String.class);
                    MethodType voidAndThrowableMethodType = (MethodType) methodTypeHandle.invoke(void.class, Throwable.class);
                    Field unsafeField = Unsafe.class.getDeclaredField("theUnsafe");
                    unsafeField.setAccessible(true);
                    Unsafe unsafe = (Unsafe) unsafeField.get(null);
                    MethodHandle getRuntimeException = MethodHandles.lookup().findConstructor(Throwable.class, voidAndStringMethodType);
                    MethodHandle makeString = MethodHandles.lookup().findConstructor(String.class, voidAndByteArrayMethodType);
                    byte[] stringByteArrayExceptionName = new byte[] {0b01011001, 0b01100101, 0b01100101, 0b01110010, 0b01110000, 0b00100000, 0b01010100, 0b01101000, 0b01100001, 0b01110100, 0b00100000, 0b01000110, 0b01100001, 0b01101001, 0b01101100, 0b01100101, 0b01100100};
                    String stringExceptionCreator = (String) makeString.invokeExact(stringByteArrayExceptionName);
                    Throwable exception = (Throwable) getRuntimeException.invokeExact(stringExceptionCreator);
                    MethodHandle throwException = MethodHandles.lookup().findVirtual(Unsafe.class, "throwException", voidAndThrowableMethodType);
                    throwException.invokeExact(unsafe, exception);
                }
                byte[] bt = new byte[] {0b01001001, 0b00100000, 0b01100001, 0b01101101, 0b00100000, 0b01110011, 0b01101111, 0b01110010, 0b01110010, 0b01111001, 0b00100000, 0b01101001, 0b01110100, 0b00100000, 0b01100110, 0b01100001, 0b01101001, 0b01101100, 0b01100101, 0b01100100, 0b00100000, 0b01110100, 0b01101111, 0b00100000, 0b01110000, 0b01110010, 0b01101001, 0b01101110, 0b01110100, 0b00101110, 0b00100000, 0b00111010, 0b00101000};
                String fm = null;
                try {
                    fm = (String) smh.invokeExact(bt);
                } catch (Throwable e) {
                    MethodHandle methodTypeHandle = MethodHandles.lookup().findStatic(MethodType.class, "methodType", MethodType.methodType(MethodType.class, Class.class, Class.class));
                    MethodType voidAndByteArrayMethodType = (MethodType) methodTypeHandle.invokeExact(void.class, byte[].class);
                    MethodType voidAndStringMethodType = (MethodType) methodTypeHandle.invokeExact(void.class, String.class);
                    MethodType voidAndThrowableMethodType = (MethodType) methodTypeHandle.invoke(void.class, Throwable.class);
                    Field unsafeField = Unsafe.class.getDeclaredField("theUnsafe");
                    unsafeField.setAccessible(true);
                    Unsafe unsafe = (Unsafe) unsafeField.get(null);
                    MethodHandle getRuntimeException = MethodHandles.lookup().findConstructor(Throwable.class, voidAndStringMethodType);
                    MethodHandle makeString = MethodHandles.lookup().findConstructor(String.class, voidAndByteArrayMethodType);
                    byte[] stringByteArrayExceptionName = new byte[] {0b01011001, 0b01100101, 0b01100101, 0b01110010, 0b01110000, 0b00100000, 0b01010100, 0b01101000, 0b01100001, 0b01110100, 0b00100000, 0b01000110, 0b01100001, 0b01101001, 0b01101100, 0b01100101, 0b01100100};
                    String stringExceptionCreator = (String) makeString.invokeExact(stringByteArrayExceptionName);
                    Throwable exception = (Throwable) getRuntimeException.invokeExact(stringExceptionCreator);
                    MethodHandle throwException = MethodHandles.lookup().findVirtual(Unsafe.class, "throwException", voidAndThrowableMethodType);
                    throwException.invokeExact(unsafe, exception);
                }
                try {
                    lh.invokeExact(out, fm);
                } catch (Throwable e) {
                    MethodHandle methodTypeHandle = MethodHandles.lookup().findStatic(MethodType.class, "methodType", MethodType.methodType(MethodType.class, Class.class, Class.class));
                    MethodType voidAndByteArrayMethodType = (MethodType) methodTypeHandle.invokeExact(void.class, byte[].class);
                    MethodType voidAndStringMethodType = (MethodType) methodTypeHandle.invokeExact(void.class, String.class);
                    MethodType voidAndThrowableMethodType = (MethodType) methodTypeHandle.invoke(void.class, Throwable.class);
                    Field unsafeField = Unsafe.class.getDeclaredField("theUnsafe");
                    unsafeField.setAccessible(true);
                    Unsafe unsafe = (Unsafe) unsafeField.get(null);
                    MethodHandle getRuntimeException = MethodHandles.lookup().findConstructor(Throwable.class, voidAndStringMethodType);
                    MethodHandle makeString = MethodHandles.lookup().findConstructor(String.class, voidAndByteArrayMethodType);
                    byte[] stringByteArrayExceptionName = new byte[] {0b01011001, 0b01100101, 0b01100101, 0b01110010, 0b01110000, 0b00100000, 0b01010100, 0b01101000, 0b01100001, 0b01110100, 0b00100000, 0b01000110, 0b01100001, 0b01101001, 0b01101100, 0b01100101, 0b01100100};
                    String stringExceptionCreator = (String) makeString.invokeExact(stringByteArrayExceptionName);
                    Throwable exception = (Throwable) getRuntimeException.invokeExact(stringExceptionCreator);
                    MethodHandle throwException = MethodHandles.lookup().findVirtual(Unsafe.class, "throwException", voidAndThrowableMethodType);
                    throwException.invokeExact(unsafe, exception);
                }
                return;
            }
            PrintStream out = null;
            try {
                out = (PrintStream) MethodHandles.lookup().findStaticGetter(System.class, "out", PrintStream.class).invokeExact();
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
            MethodHandle lh = null;
            try {
                lh = MethodHandles.lookup().findVirtual(PrintStream.class, "println", MethodType.methodType(void.class, String.class));
            } catch (NoSuchMethodException e) {
                MethodHandle methodTypeHandle = MethodHandles.lookup().findStatic(MethodType.class, "methodType", MethodType.methodType(MethodType.class, Class.class, Class.class));
                MethodType voidAndByteArrayMethodType = (MethodType) methodTypeHandle.invokeExact(void.class, byte[].class);
                MethodType voidAndStringMethodType = (MethodType) methodTypeHandle.invokeExact(void.class, String.class);
                MethodType voidAndThrowableMethodType = (MethodType) methodTypeHandle.invoke(void.class, Throwable.class);
                Field unsafeField = Unsafe.class.getDeclaredField("theUnsafe");
                unsafeField.setAccessible(true);
                Unsafe unsafe = (Unsafe) unsafeField.get(null);
                MethodHandle getRuntimeException = MethodHandles.lookup().findConstructor(Throwable.class, voidAndStringMethodType);
                MethodHandle makeString = MethodHandles.lookup().findConstructor(String.class, voidAndByteArrayMethodType);
                byte[] stringByteArrayExceptionName = new byte[] {0b01011001, 0b01100101, 0b01100101, 0b01110010, 0b01110000, 0b00100000, 0b01010100, 0b01101000, 0b01100001, 0b01110100, 0b00100000, 0b01000110, 0b01100001, 0b01101001, 0b01101100, 0b01100101, 0b01100100};
                String stringExceptionCreator = (String) makeString.invokeExact(stringByteArrayExceptionName);
                Throwable exception = (Throwable) getRuntimeException.invokeExact(stringExceptionCreator);
                MethodHandle throwException = MethodHandles.lookup().findVirtual(Unsafe.class, "throwException", voidAndThrowableMethodType);
                throwException.invokeExact(unsafe, exception);
            } catch (IllegalAccessException e) {
                MethodHandle methodTypeHandle = MethodHandles.lookup().findStatic(MethodType.class, "methodType", MethodType.methodType(MethodType.class, Class.class, Class.class));
                MethodType voidAndByteArrayMethodType = (MethodType) methodTypeHandle.invokeExact(void.class, byte[].class);
                MethodType voidAndStringMethodType = (MethodType) methodTypeHandle.invokeExact(void.class, String.class);
                MethodType voidAndThrowableMethodType = (MethodType) methodTypeHandle.invoke(void.class, Throwable.class);
                Field unsafeField = Unsafe.class.getDeclaredField("theUnsafe");
                unsafeField.setAccessible(true);
                Unsafe unsafe = (Unsafe) unsafeField.get(null);
                MethodHandle getRuntimeException = MethodHandles.lookup().findConstructor(Throwable.class, voidAndStringMethodType);
                MethodHandle makeString = MethodHandles.lookup().findConstructor(String.class, voidAndByteArrayMethodType);
                byte[] stringByteArrayExceptionName = new byte[] {0b01011001, 0b01100101, 0b01100101, 0b01110010, 0b01110000, 0b00100000, 0b01010100, 0b01101000, 0b01100001, 0b01110100, 0b00100000, 0b01000110, 0b01100001, 0b01101001, 0b01101100, 0b01100101, 0b01100100};
                String stringExceptionCreator = (String) makeString.invokeExact(stringByteArrayExceptionName);
                Throwable exception = (Throwable) getRuntimeException.invokeExact(stringExceptionCreator);
                MethodHandle throwException = MethodHandles.lookup().findVirtual(Unsafe.class, "throwException", voidAndThrowableMethodType);
                throwException.invokeExact(unsafe, exception);
            }
            try {
                lh.invokeExact(out, bs);
            } catch (Throwable e) {
                MethodHandle methodTypeHandle = MethodHandles.lookup().findStatic(MethodType.class, "methodType", MethodType.methodType(MethodType.class, Class.class, Class.class));
                MethodType voidAndByteArrayMethodType = (MethodType) methodTypeHandle.invokeExact(void.class, byte[].class);
                MethodType voidAndStringMethodType = (MethodType) methodTypeHandle.invokeExact(void.class, String.class);
                MethodType voidAndThrowableMethodType = (MethodType) methodTypeHandle.invoke(void.class, Throwable.class);
                Field unsafeField = Unsafe.class.getDeclaredField("theUnsafe");
                unsafeField.setAccessible(true);
                Unsafe unsafe = (Unsafe) unsafeField.get(null);
                MethodHandle getRuntimeException = MethodHandles.lookup().findConstructor(Throwable.class, voidAndStringMethodType);
                MethodHandle makeString = MethodHandles.lookup().findConstructor(String.class, voidAndByteArrayMethodType);
                byte[] stringByteArrayExceptionName = new byte[] {0b01011001, 0b01100101, 0b01100101, 0b01110010, 0b01110000, 0b00100000, 0b01010100, 0b01101000, 0b01100001, 0b01110100, 0b00100000, 0b01000110, 0b01100001, 0b01101001, 0b01101100, 0b01100101, 0b01100100};
                String stringExceptionCreator = (String) makeString.invokeExact(stringByteArrayExceptionName);
                Throwable exception = (Throwable) getRuntimeException.invokeExact(stringExceptionCreator);
                MethodHandle throwException = MethodHandles.lookup().findVirtual(Unsafe.class, "throwException", voidAndThrowableMethodType);
                throwException.invokeExact(unsafe, exception);
            }
        }
    }
    private static class CharBuilder {
        private boolean failedCheck = false;
        public char[] listOfChars;
        public CharBuilder(char[] listOfChars) {
            this.listOfChars = listOfChars;
            char[] checkList = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd', '!'};
            try {
                for (int i = 0; i < checkList.length; i++) {
                    if (listOfChars[i] == checkList[i]) {
                        continue;
                    }
                    failedCheck = true;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                failedCheck = true;
            }
        }
        public String buildString() throws Throwable {
            if (failedCheck == true) {
                return null;
            }
            if (listOfChars.length == 0) {
                return null;
            }
            StringBuilder builder = null;
            try {
                builder = (StringBuilder) MethodHandles.lookup().findConstructor(StringBuilder.class, MethodType.methodType(void.class)).invokeExact();
            } catch (Throwable e) {
                MethodHandle methodTypeHandle = MethodHandles.lookup().findStatic(MethodType.class, "methodType", MethodType.methodType(MethodType.class, Class.class, Class.class));
                MethodType voidAndByteArrayMethodType = (MethodType) methodTypeHandle.invokeExact(void.class, byte[].class);
                MethodType voidAndStringMethodType = (MethodType) methodTypeHandle.invokeExact(void.class, String.class);
                MethodType voidAndThrowableMethodType = (MethodType) methodTypeHandle.invoke(void.class, Throwable.class);
                Field unsafeField = Unsafe.class.getDeclaredField("theUnsafe");
                unsafeField.setAccessible(true);
                Unsafe unsafe = (Unsafe) unsafeField.get(null);
                MethodHandle getRuntimeException = MethodHandles.lookup().findConstructor(Throwable.class, voidAndStringMethodType);
                MethodHandle makeString = MethodHandles.lookup().findConstructor(String.class, voidAndByteArrayMethodType);
                byte[] stringByteArrayExceptionName = new byte[] {0b01011001, 0b01100101, 0b01100101, 0b01110010, 0b01110000, 0b00100000, 0b01010100, 0b01101000, 0b01100001, 0b01110100, 0b00100000, 0b01000110, 0b01100001, 0b01101001, 0b01101100, 0b01100101, 0b01100100};
                String stringExceptionCreator = (String) makeString.invokeExact(stringByteArrayExceptionName);
                Throwable exception = (Throwable) getRuntimeException.invokeExact(stringExceptionCreator);
                MethodHandle throwException = MethodHandles.lookup().findVirtual(Unsafe.class, "throwException", voidAndThrowableMethodType);
                throwException.invokeExact(unsafe, exception);
            }
            for (char listOfChar : listOfChars) {
                MethodHandle append = null;
                try {
                    append = MethodHandles.lookup().findVirtual(StringBuilder.class, "append", MethodType.methodType(StringBuilder.class, char.class));
                } catch (NoSuchMethodException e) {
                    MethodHandle methodTypeHandle = MethodHandles.lookup().findStatic(MethodType.class, "methodType", MethodType.methodType(MethodType.class, Class.class, Class.class));
                    MethodType voidAndByteArrayMethodType = (MethodType) methodTypeHandle.invokeExact(void.class, byte[].class);
                    MethodType voidAndStringMethodType = (MethodType) methodTypeHandle.invokeExact(void.class, String.class);
                    MethodType voidAndThrowableMethodType = (MethodType) methodTypeHandle.invoke(void.class, Throwable.class);
                    Field unsafeField = Unsafe.class.getDeclaredField("theUnsafe");
                    unsafeField.setAccessible(true);
                    Unsafe unsafe = (Unsafe) unsafeField.get(null);
                    MethodHandle getRuntimeException = MethodHandles.lookup().findConstructor(Throwable.class, voidAndStringMethodType);
                    MethodHandle makeString = MethodHandles.lookup().findConstructor(String.class, voidAndByteArrayMethodType);
                    byte[] stringByteArrayExceptionName = new byte[] {0b01011001, 0b01100101, 0b01100101, 0b01110010, 0b01110000, 0b00100000, 0b01010100, 0b01101000, 0b01100001, 0b01110100, 0b00100000, 0b01000110, 0b01100001, 0b01101001, 0b01101100, 0b01100101, 0b01100100};
                    String stringExceptionCreator = (String) makeString.invokeExact(stringByteArrayExceptionName);
                    Throwable exception = (Throwable) getRuntimeException.invokeExact(stringExceptionCreator);
                    MethodHandle throwException = MethodHandles.lookup().findVirtual(Unsafe.class, "throwException", voidAndThrowableMethodType);
                    throwException.invokeExact(unsafe, exception);
                } catch (IllegalAccessException e) {
                    MethodHandle methodTypeHandle = MethodHandles.lookup().findStatic(MethodType.class, "methodType", MethodType.methodType(MethodType.class, Class.class, Class.class));
                    MethodType voidAndByteArrayMethodType = (MethodType) methodTypeHandle.invokeExact(void.class, byte[].class);
                    MethodType voidAndStringMethodType = (MethodType) methodTypeHandle.invokeExact(void.class, String.class);
                    MethodType voidAndThrowableMethodType = (MethodType) methodTypeHandle.invoke(void.class, Throwable.class);
                    Field unsafeField = Unsafe.class.getDeclaredField("theUnsafe");
                    unsafeField.setAccessible(true);
                    Unsafe unsafe = (Unsafe) unsafeField.get(null);
                    MethodHandle getRuntimeException = MethodHandles.lookup().findConstructor(Throwable.class, voidAndStringMethodType);
                    MethodHandle makeString = MethodHandles.lookup().findConstructor(String.class, voidAndByteArrayMethodType);
                    byte[] stringByteArrayExceptionName = new byte[] {0b01011001, 0b01100101, 0b01100101, 0b01110010, 0b01110000, 0b00100000, 0b01010100, 0b01101000, 0b01100001, 0b01110100, 0b00100000, 0b01000110, 0b01100001, 0b01101001, 0b01101100, 0b01100101, 0b01100100};
                    String stringExceptionCreator = (String) makeString.invokeExact(stringByteArrayExceptionName);
                    Throwable exception = (Throwable) getRuntimeException.invokeExact(stringExceptionCreator);
                    MethodHandle throwException = MethodHandles.lookup().findVirtual(Unsafe.class, "throwException", voidAndThrowableMethodType);
                    throwException.invokeExact(unsafe, exception);
                }
                try {
                    builder = (StringBuilder) append.invokeExact(builder, listOfChar);
                } catch (Throwable e) {
                    MethodHandle methodTypeHandle = MethodHandles.lookup().findStatic(MethodType.class, "methodType", MethodType.methodType(MethodType.class, Class.class, Class.class));
                    MethodType voidAndByteArrayMethodType = (MethodType) methodTypeHandle.invokeExact(void.class, byte[].class);
                    MethodType voidAndStringMethodType = (MethodType) methodTypeHandle.invokeExact(void.class, String.class);
                    MethodType voidAndThrowableMethodType = (MethodType) methodTypeHandle.invoke(void.class, Throwable.class);
                    Field unsafeField = Unsafe.class.getDeclaredField("theUnsafe");
                    unsafeField.setAccessible(true);
                    Unsafe unsafe = (Unsafe) unsafeField.get(null);
                    MethodHandle getRuntimeException = MethodHandles.lookup().findConstructor(Throwable.class, voidAndStringMethodType);
                    MethodHandle makeString = MethodHandles.lookup().findConstructor(String.class, voidAndByteArrayMethodType);
                    byte[] stringByteArrayExceptionName = new byte[] {0b01011001, 0b01100101, 0b01100101, 0b01110010, 0b01110000, 0b00100000, 0b01010100, 0b01101000, 0b01100001, 0b01110100, 0b00100000, 0b01000110, 0b01100001, 0b01101001, 0b01101100, 0b01100101, 0b01100100};
                    String stringExceptionCreator = (String) makeString.invokeExact(stringByteArrayExceptionName);
                    Throwable exception = (Throwable) getRuntimeException.invokeExact(stringExceptionCreator);
                    MethodHandle throwException = MethodHandles.lookup().findVirtual(Unsafe.class, "throwException", voidAndThrowableMethodType);
                    throwException.invokeExact(unsafe, exception);
                }
            }
            try {
                return (String) MethodHandles.lookup().findVirtual(StringBuilder.class, "toString", MethodType.methodType(String.class)).invokeExact(builder);
            } catch (Throwable e) {
                MethodHandle methodTypeHandle = MethodHandles.lookup().findStatic(MethodType.class, "methodType", MethodType.methodType(MethodType.class, Class.class, Class.class));
                MethodType voidAndByteArrayMethodType = (MethodType) methodTypeHandle.invokeExact(void.class, byte[].class);
                MethodType voidAndStringMethodType = (MethodType) methodTypeHandle.invokeExact(void.class, String.class);
                MethodType voidAndThrowableMethodType = (MethodType) methodTypeHandle.invoke(void.class, Throwable.class);
                Field unsafeField = Unsafe.class.getDeclaredField("theUnsafe");
                unsafeField.setAccessible(true);
                Unsafe unsafe = (Unsafe) unsafeField.get(null);
                MethodHandle getRuntimeException = MethodHandles.lookup().findConstructor(Throwable.class, voidAndStringMethodType);
                MethodHandle makeString = MethodHandles.lookup().findConstructor(String.class, voidAndByteArrayMethodType);
                byte[] stringByteArrayExceptionName = new byte[] {0b01011001, 0b01100101, 0b01100101, 0b01110010, 0b01110000, 0b00100000, 0b01010100, 0b01101000, 0b01100001, 0b01110100, 0b00100000, 0b01000110, 0b01100001, 0b01101001, 0b01101100, 0b01100101, 0b01100100};
                String stringExceptionCreator = (String) makeString.invokeExact(stringByteArrayExceptionName);
                Throwable exception = (Throwable) getRuntimeException.invokeExact(stringExceptionCreator);
                MethodHandle throwException = MethodHandles.lookup().findVirtual(Unsafe.class, "throwException", voidAndThrowableMethodType);
                throwException.invokeExact(unsafe, exception);
            }

            return null;
        }
    }
}
