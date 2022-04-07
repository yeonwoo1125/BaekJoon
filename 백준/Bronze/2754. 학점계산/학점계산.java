import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double score = 0.0;
        String input = br.readLine();

        if(input.charAt(0) == 'A'){
            score+=4;
        }
        else if(input.charAt(0) == 'B'){
            score+=3;
        }
        else if(input.charAt(0) == 'C'){
            score+=2;
        }
        else if(input.charAt(0) == 'D'){
            score+=1;
        }
        else if(input.charAt(0) == 'F'){
            System.out.println(0.0);
            return ;
        }
        

        if(input.charAt(1) == '+'){
            score+=0.3;
        }
        else if(input.charAt(1) == '-'){
            score-=0.3;
        }
        
        System.out.println(score);
    }
}