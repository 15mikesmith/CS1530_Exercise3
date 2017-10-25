public class ex3{

    public static void main(String args[]){
        int inNum = 0;
        //System.out.println(args.length);

        if(args.length != 1){
            System.err.println("Invalid arg length");
            System.exit(1);
        }

        try {
            inNum = Integer.parseInt(args[0]);
        } catch(NumberFormatException nf){
            System.err.println("Invalid Arguments");
            System.exit(1);
        }


        System.out.println("Tri("+ inNum +") = " + Tri(inNum));
        System.out.println("Lazy("+ inNum +") = " + Lazy(inNum));

        System.exit(0);
    }

    public static int Tri(int num){
        return (num*(num+1))/2;
    }

    public static int Lazy(int num){
        return ((num*num)+num+2)/2;
    }

}
