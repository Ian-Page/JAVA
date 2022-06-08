public class Casting {
    public static void main(String[] args) {
    

    int[] myArray = new int[5];

    for(int i = 0; i < myArray.length; i++){
            System.out.println(myArray[i]);
    }

    String [] dildos = {"red","blue","purple","green"};
    String [] dildo = {"the dildo color is : ", "the vibrator color is:","the pocket rocket color is:","the bigWang color is"};
    String temp = dildos[0];
    dildos[0] = dildos[dildos.length -1];
    dildos[dildos.length-1] =temp;

    for(int z = 0; z < dildo.length; z++){
        System.out.println(dildo[z]);
        System.out.println(dildos[z]);
    }
    
}
}
