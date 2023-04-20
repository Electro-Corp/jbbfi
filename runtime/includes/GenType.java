package runtime.includes;

public class GenType<T> {
   private T t;

    public T get() {
      return this.t;
    }

    public int set(T s) {
      this.t = s;
    }
}