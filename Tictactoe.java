// Author Hariharan Ramar(rhariharanramar@gmail.com)
import java.util.*;
class Tictactoe {
    static int row,clm,fl=1,player=1;
    static void getvalue(){
        System.out.print("enter the row and colum player "+player+" turn : ");
        Scanner sc=new Scanner(System.in);
        row=sc.nextInt();
        clm=sc.nextInt();
    }
    static void printvalue(int[][] tac){
        for(int t=0;t<tac.length;t++){
        for (int i=0;i<tac[t].length;i++){
            if(t==row && i==clm){
                tac[t][i]=player==1?11:44;
            }
        System.out.print("[ "+tac[t][i]+" ] ");
        }
        System.out.println("");
        }
        player=player==1?2:1;
        checkarr(tac);
    }
    static void checkarr(int[][] tac){
        int te,rowch,colch,ro=0,cr;
       for(int i=0;i<tac.length;i++){
           te=tac[i][0];
           rowch=0;
           colch=0;
           for(int j=0;j<tac[i].length;j++){
               if(tac[i][j]==te && te != 0){
                   rowch=rowch+1;
               }
               if(tac[j][i]==te && te != 0){
                   colch=colch+1;
               }
           }
           cr=tac[0][0];
           if((tac[2][0] == tac[1][1])&&(tac[1][1] == tac[0][2])&&(tac[0][2] != 0)){
                   ro=3;
               }
           if(tac[i][i] == cr && cr != 0){
                   ro=ro+1;
               }
           if(rowch==3 || colch==3 || ro==3){
           fl=0;
           System.out.print("Mapla! You Won Mapla ");
           break;
       }
       }
       
    }
    public static void main(String[] args) {
        //List<Integer> nu = new LinkedList<>();
        int[][] tac = {{0,0,0},{0,0,0},{0,0,0}};
        System.out.print("welcome to the great girikalan game show \nPlz enter the pre players names : ");
        Scanner sc=new Scanner(System.in);
        String plyone=sc.nextLine();
        String plytwo=sc.nextLine();
        while(fl==1){
            getvalue();
            printvalue(tac);
        }
        if(fl==0){
            if(player==2){System.out.print(plytwo+" give interest to choco "+plyone);}
           else{System.out.print(plyone+" give interest to sweet chellom "+plytwo);}
        }
        }
    }
