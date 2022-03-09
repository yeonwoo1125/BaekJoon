import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());


        for(int i=0; i<n; i++){
            int score = 0;
            int sum = 0;
            String ox = br.readLine();
            for(int j=0; j<ox.length(); j++){
                if(ox.charAt(j) == 'O'){
                    score++;
                }
                else{  
                    score = 0;
                }
                sum+=score;
            }
            System.out.println(sum);
            
        }
  
    }
}