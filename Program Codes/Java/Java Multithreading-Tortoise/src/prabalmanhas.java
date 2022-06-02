public class prabalmanhas

    {

        public static void main(String[] args)
        {
            System.out.println("++++++++ PBLJ WS 2.3 | 20BCS4513 ++++++++++");
            Thread tortoise = new Tortoise();        //Creating an object of the tortoise  thread
            tortoise.start();                         //Starting the first thread
            for(int p=1;p<51;p++)
            {

                System.out.println("> THE DISTANCE COVERED BY HARE = "+(p));
            }

System.out.println(">>>>>>>>> THE HARE IS GOING TO SLEEP ... <<<<<<<<<<<<");   //hare going to sleep

            try
            {
                Thread.sleep(3000);                           // current thread is hare
            }
            catch(InterruptedException ignored)
            {

            }

System.out.println(">>>>> HARE STARTED TO RACE AGAIN <<<<<");           //hare wakes up

            for(int q=51;q<101;q++)
                System.out.println("> THE DISTANCE COVERED BY HARE = "+(q));
System.out.println(">>>> HARE COMPLETED THE RACE! <<<<");


        }
    }

    class Tortoise extends Thread
    {
        public void run()
        {
            for(int r=1;r<101;r++)
            {
                System.out.println(">>>> THE DISTANCE COVERED BY TORTOISE = "+r);
            }
            System.out.println(">>>> TORTOISE WON THE RACE <<<<");     // tortoise won the race

        }

    }

