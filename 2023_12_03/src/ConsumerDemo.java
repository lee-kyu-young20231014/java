import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.ObjIntConsumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		Consumer<String>  c= t ->System.out.println(t.toUpperCase());
		c.accept("abcdefg");
		
		BiConsumer<String, String> bc = (t, u) ->System.out.println(t+u);
		bc.accept("abc   ", "def");
		
		ObjIntConsumer<String> oic = (t, value) ->{
			for (int i = 0; i < value; i++) {
				System.out.println(t);
			}
		};
		oic.accept("안녕", 3);

	}

}
