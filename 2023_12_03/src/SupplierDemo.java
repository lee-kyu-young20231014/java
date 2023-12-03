import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		Supplier<String> s = () -> "고양이";
		System.out.println(s.get());
		
		
		IntSupplier is = () -> (int)(Math.random()*10);
		System.out.println( is.getAsInt() );
		
		DoubleSupplier ds = () -> Math.random()*10;
		System.out.println(ds.getAsDouble());
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy년 MM월 dd일(E요일) a hh:mm:ss");
		s = () -> format.format(new Date());
		System.out.println(s.get());

	}

}
