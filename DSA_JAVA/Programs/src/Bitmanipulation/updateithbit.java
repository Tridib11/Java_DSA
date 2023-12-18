package Bitmanipulation;

public class updateithbit {
    public static void main(String[] args) {
        System.out.println(update(10,2,1));
    }
    static int update(int n,int i,int newBit){
        if(newBit==0){
            return clearithbit(n,i);
        }
        else {
            return setithbit(n,i);
        }
    }
    static int clearithbit(int n,int i){
        return n&(~(1<<i));
    }
    static int setithbit(int n,int i){
        return n|(1<<2);
    }
}
