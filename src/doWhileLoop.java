public class doWhileLoop {

    public static void main(String[] args){

        int multi=0;
       do {
//           multi=multi+1;
           multi+=1;

           System.out.println("multi is: "+multi);

       }while(multi<10 && multi>0);

       /*while(multi<10 && multi>0)
       {
           multi+=1;
           System.out.printf("multi is: "+multi);
       }*/
    }
}
