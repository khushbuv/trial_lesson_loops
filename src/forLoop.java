public class forLoop {

    public static void main(String [] args){


     /*   for(initialization;condition;iteration){

        }*/

    /*    for(int i = 0; i<100; i++){

            System.out.println("i is: "+ i);
        }*/

        int [] a= {1,3,5,7,9,5,7};

       /* a[0]=1;
        a[1]=3;
        a[6]=7;
        */
        int sum = 0;
        for(int i=0; i<a.length;i++){
//            sum = sum + a[i];
            sum += a[i];
            System.out.println("during loop sum is: "+sum);

        }

        System.out.println("final sum is: "+sum);

    }
}
