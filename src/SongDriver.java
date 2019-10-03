public class SongDriver
{
    public static void main (String args[])
    {
        //1. Create a Song, or more
        Song someSong = new Song();
        Song fireworks = new Song("Fireworks", "Katy Perry", true, 234, 6.94 );
        Song deadLochs= new Song("DeadLochs","Blue Face", true, 150, 3.57);
        Song overture = new Song("1812 Overture", "Petyr Ilych Tchaicovsky", false, 230, 4.33);
        Song happysong = new Song("Moi", "The Happy Song", true , 0, 0.0);

        //4. Checks other methods and properties
        deadLochs.setLength(-5);
        System.out.println(deadLochs);
//        fireworks.title = "Happy Song";
//        System.out.println(fireworks);

        //3. Testing getters
//            System.out.println (fireworks.getTitle());
//            System.out.println (deadLochs.getArtist());
//            System.out.println (overture.getHasLyrics());
//
//            System.out.println ("In minutes: " + overture.toMinSec());

            //Testing Setters
//        System.out.println ("\n" + someSong + "\n");
//        someSong.setTitle("Lalalalala");
//        someSong.setArtist("A Singer");
//        someSong.setHasLyrics("que pasa");
//        someSong.setLength(100);
//        someSong.setFileSize(12.2);
//        System.out.println (someSong);


        //2. Print it out
//        System.out.println (happysong);
//        System.out.println (fireworks);
//        System.out.println ();
//        System.out.println (deadLochs);
//        System.out.println ("\n" + overture);
    }//end main method
}//end class SongDriver.  This is where all the fun stuff happens.
