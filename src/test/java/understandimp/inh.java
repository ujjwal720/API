package understandimp;

public class inh{

    public static void main(String[] args) {


        ps a=new po();

        a.jkl();



    }


}



class ps{

    public void jkl(){

        System.out.println("hello p");

    }



}


class po extends ps{

    @Override
public void jkl(){

        System.out.println("hello c");


    }


}