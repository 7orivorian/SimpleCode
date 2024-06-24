import java.io.PrintStream;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * The very first program any developer writes!
 */
@SuppressWarnings("ALL")
public class VerySimple {

    public static void main(String[] args) throws Throwable {
        AtomicReference<String> ref = new AtomicReference<>();
        final ExecutorService executorService;
        CompletableFuture<String> future = CompletableFuture.supplyAsync(new Supplier<String>() {
            private final BiFunction<String, String, String> concatFn = new BiFunction<String, String, String>() {
                @Override
                public String apply(String s, String s2) {
                    return new StringBuilder()
                            .append(s)
                            .append(s2)
                            .toString();
                }
            };

            @Override
            public String get() {
                String res = concatFn.apply(new Function<char[], String>() {
                    @Override
                    public String apply(char[] characters) {
                        final StringBuilder builder = new StringBuilder();
                        HashMap<char[], String> map = new HashMap<>();
                        map.computeIfAbsent(characters, new Function<char[], String>() {
                            @Override
                            public String apply(char[] chars) {
                                final StringBuilder builder = new StringBuilder();
                                for (int i = 0; i < chars.length; i++) {
                                    builder.append(i == 0 ? String.valueOf(chars[i]).toUpperCase(Locale.ROOT) : chars[i]);
                                }
                                return builder.toString();
                            }
                        });
                        return builder.append(map.get(characters)).toString();
                    }
                }.apply(new Supplier<char[]>() {
                    @Override
                    public char[] get() {
                        return new String(new byte[]{72, 101, 108, 108, 111, 32}).toCharArray();
                    }
                }.get()), new Function<char[], String>() {
                    @Override
                    public String apply(char[] characters) {
                        final StringBuilder builder = new StringBuilder();
                        HashMap<char[], String> map = new HashMap<>();
                        map.computeIfAbsent(characters, new Function<char[], String>() {
                            @Override
                            public String apply(char[] chars) {
                                final StringBuilder builder = new StringBuilder();
                                for (int i = chars.length - 1; i >= 0; i--) {
                                    builder.append(chars[i]);
                                }
                                return builder.reverse().toString();
                            }
                        });
                        return builder.append(map.get(characters)).toString();
                    }
                }.apply(new Supplier<char[]>() {
                    @Override
                    public char[] get() {
                        return new String(new byte[]{119, 111, 114, 108, 100, 33}).toCharArray();
                    }
                }.get()));
                return res;
            }
        }, executorService = Executors.newSingleThreadExecutor());
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    ref.set(future.get(1000L, TimeUnit.MILLISECONDS));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                } catch (ExecutionException e) {
                    throw new RuntimeException(e);
                } catch (TimeoutException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
        while (true) {
            if (ref.get() == null) {
                continue;
            }
            executorService.shutdown();
            MethodHandles.lookup().findVirtual(PrintStream.class, "println", MethodType.methodType(void.class, String.class))
                    .invokeExact(
                            (PrintStream) MethodHandles.lookup().findStaticGetter(System.class, "out", PrintStream.class).invokeExact(),
                            ref.get()
                    );
            break;
        }
    }
}