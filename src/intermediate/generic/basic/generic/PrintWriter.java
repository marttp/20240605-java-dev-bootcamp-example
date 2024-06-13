package intermediate.generic.basic.generic;

public class PrintWriter<T> {

    public void print(T data) {
        System.out.println(data);
    }

    public String concat(T data) {
        return STR."Concat: \{data}";
    }
}
