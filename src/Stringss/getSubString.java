package Stringss;

import java.util.ArrayList;

public class getSubString {
    public static void main(String[] args) {
        System.out.println(getss("dev"));

    }

    public static ArrayList<String> getss (String str){
        char cc = str.charAt(0);
        String res = str.substring(1);
        ArrayList<String> my_result = new ArrayList();
        ArrayList<String> myrec = getss(res);
        for(int i = 0;i<myrec.size();i++){

        }
        return my_result;
    }
}
