public class Main {
    public static void main(String[] args) {
     int j = 1;
     while (j<=5){
         System.out.println(j);
         j++;
     }

    int k = 1;
     while (true){
         if(k > 5){
             break;
         }
         System.out.println(k);
         k++;
     }
// il  ciclo do while esegue il ciclo almeno una volta
     int l = 1;
     boolean isReady = true;
     do {
         if (l>5){
             break;
         }
         System.out.println(l);
         l++;
     }while (isReady);

// qui facciamo un ciclo while utilizzando il continue che sostanzialmente skippa il ciclo desiderato inserendo la condizione
     int number = 0;
        while(number<50){
            number+=5;
            if (number % 25 == 0){
                continue;
            }
            System.out.print(number+ "_");
        }
    }


}