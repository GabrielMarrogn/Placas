import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String data;

        while ((data = br.readLine()) != null) {
            String[] arr = data.split("\\s+");

            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);
            int qtd = Integer.parseInt(arr[2]);

            for (int i = 0; i < qtd; i++) {
                String[] d = br.readLine().split("\\s+");

                int d1 = Integer.parseInt(d[0]);
                int d2 = Integer.parseInt(d[1]);

                if (d1 <= a && d2 <= b || d1 <= b && d2 <= a || d2 <= a && d1 <= b) {
                    System.out.println("Sim");
                } else {
                    System.out.println("Nao");
                }

            }
        }
    }

}
