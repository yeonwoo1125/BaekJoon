import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> chessList = new ArrayList<>(Arrays.asList(1,1,2,2,2,8));
        ArrayList<String> inputList = new ArrayList<>(Arrays.asList(br.readLine().split(" ")));

        for(int i=0; i<6; i++){
            System.out.print(chessList.get(i) - Integer.parseInt(inputList.get(i))+" ");
        }
    }
}