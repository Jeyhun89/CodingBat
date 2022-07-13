package string3;

public class MirrorEnds {
    public String mirrorEnds(String string) {

        String resSub = "";
        for(int i=0; i<=string.length(); i++){
            String sub = string.substring(0, i);
            if(string.startsWith(sub) && string.endsWith(reverse(sub)))
                resSub = sub;
        }
        return resSub;
    }

    String reverse(String str){
        String reversed = "";
        for(int i=str.length()-1; i>=0; i--)
            reversed += str.charAt(i);
        return reversed;
    }
}
