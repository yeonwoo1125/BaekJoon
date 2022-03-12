import java.io.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String me = br.readLine();
        String doctor = br.readLine();

        System.out.println(me.contains(doctor) ? "go" : "no");
    }
}