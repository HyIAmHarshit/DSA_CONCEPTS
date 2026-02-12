
public class Strings{
    public static void printletters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
    }
    public static void checkpalindrom(String str){
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                System.out.print("not palindrom");
                return;
            }
        }
        System.out.print("palindrom");
    }

    public static void shortestpath(String str){
        int y=0;
        int x=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='N'){
                y++;
            }
            else if(str.charAt(i)=='E'){
                x++;
            }
            else if(str.charAt(i)=='S'){
                y--;
            }
            else{
                x--;
            }
            
        }
        int x2=x*x;
        int  y2=y*y;
        System.out.print(Math.sqrt(x2+y2));
    }

    public static String substring(String str, int si,int ei){
        String substr="";
        for(int i=si;i<=ei;i++){
            substr += str.charAt(i);
        }
        return substr;
        }

        public static void firstuppercase(String str){
            StringBuilder sb = new StringBuilder("");
            char ch = Character.toUpperCase(str.charAt(0));
            sb.append(ch);
            for(int i=1; i<str.length(); i++) {
            if(str.charAt(i) == ' '&& i<str. length()-1) {
            sb.append(str.charAt(i));
                i++;
            sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
           sb.append(str.charAt(i));
}

}
            System.out.print(sb);
       
        }

       public static void strcom(String str) {
    if (str == null || str.length() == 0) {
        System.out.println("");
        return;
    }

    StringBuilder sb = new StringBuilder();
    int count = 1;

    for (int i = 1; i < str.length(); i++) {
        if (str.charAt(i) == str.charAt(i - 1)) {
            count++;
        } else {
            sb.append(str.charAt(i - 1));
            sb.append(count);
            count = 1;
        }
    }

    sb.append(str.charAt(str.length() - 1));
    sb.append(count);

    System.out.println(sb.toString());
}


    

    public static void main(String args[]){
        // char arr[]={'a','b','c','d'};
        // String  firstname = "Harshit";
        // String lastname = "Khandelwal";
        // String fullname = firstname + " " + lastname;
        // System.out.println(fullname);

        // printletters();
        //checkpalindrom
        // String pal = "raacecaar";
        // checkpalindrom(pal);
        // String Q = "WNEENESENNN";
        // shortestpath(Q);

        //.equals();
        // String s1 = "Harshit";
        // String s2 = "Harshit";
        // String s3 = new String("Harshit");
        // if(s1.equals(s3)){
        //     System.out.println("this is same");
        // }
        // if(s1.equals(s3)){
        //     System.out.println("this is same");
        // }

        //substring
        // String str  = "Hellow World";
        // str.substring(0,1);
        // System.out.println(substring(str, 0, 5));

        //compareTo function
        // String fruits[]={"apple","mango","banana"};
        // String largest = fruits[0];
        // for(int i=1;i<fruits.length;i++){
        //     if(largest.compareToIgnoreCase(fruits[i])<0){
        //         largest = fruits[i];
        //     }
        // }
        // System.out.println(largest);

        //StringBuilder=

        // StringBuilder sb = new StringBuilder("");
        // for(char ch='a';ch<='z';ch++){
        //     sb.append(ch);
        // }
        // //o(26)
        // System.out.print(sb);

        //question
        // firstuppercase("hy i am harshit");

        //question
        strcom("aaabbccddd");


         



    }
}