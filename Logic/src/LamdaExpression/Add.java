package LamdaExpression;

public interface Add {
    int draw(int a, int b);

    public static void main(String[] args) {
        Add ob = (int a, int b) ->
        {
            return a + b;
        };
        System.out.println(ob.draw(3, 5));
    }
}