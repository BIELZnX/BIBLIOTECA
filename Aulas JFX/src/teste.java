import java.util.Calendar;
import java.util.Date;

public class teste {
    public static void main(String[] args) {
        Calendar data = Calendar.getInstance();
        data.clear();
        data.set(Calendar.YEAR, 1988);
        data.set(Calendar.MONTH, 9);
        data.set(Calendar.DATE, 8);
        Date dataFim = data.getTime();
        System.out.println(dataFim);

    }
}