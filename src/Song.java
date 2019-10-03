public class Song {
    //1) Instance Variables
    private String title;
    private String artist; // can also be composer
    private boolean haslyrics;
    private int length; // in seconds
    private double filesize; //in megabytes

    //2) Constructors
    //Overloaded constructors (methods) have early binding
    public Song() {
        title = null;
        artist = null;
        haslyrics = false;
        length = 0;
        filesize = 0.0;
    }//end zero-arg pr default constructor

    public Song(String newTitle, String newArtist, Boolean newHasLyrics, int newLength, double newFileSize) {
        title = newTitle;
        artist = newArtist;
        haslyrics = newHasLyrics;
        length = checkLength(newLength);
        filesize = newFileSize;
    }//end multi-arg constructor

    public Song(String newTitle, String newArtist, boolean newHasLyrics, int newLength, double newFileSize)
    {
        title = newTitle;
        artist = newArtist;
        haslyrics = newHasLyrics;
        length = newLength;
        filesize = newFileSize;
    }


    //4. Getters
    public String getTitle()
    {
        return title;
    }
        //title getter
    public String getArtist()
    {
        return artist;
    }//artist getter
    public Boolean getHasLyrics()
    {
        return haslyrics;
    }//haslyrics getter
    public int getLength()
    {
        return length;
    }//length getter
    public double getFileSize()
    {
        return filesize;
    }//filesize getter

    //5. Setters
    public void setTitle(String newTitle)
    {
        title = newTitle;
    }//end title setter

    public void setArtist(String newArtist)
    {
        artist = newArtist;
    }//end artist setter

    public void setHasLyrics(Boolean newHasLyrics)
    {
        haslyrics = newHasLyrics;
    }//end haslyrics setter

    //Pre-Condition: the object exists
    //Post-Condition: length == newLength validated to (0,20)
    public void setLength(int newLength)
    {
        length =checkLength(newLength);
    }

    public void setFileSize(double newFileSize) { filesize = newFileSize; }//end filesize setter


    //6. Brain Methods
    public String toMinSec()
    {
        int minutes = length / 60;
        int seconds = length % 60;
       return minutes + "min " + seconds + "sec";
    }//end brain method to convert length

    /*
    CheckLength is a helper method. It is private because
    it "helps" the other public method by validating entry
    This is an example of method decomposition - each method does
    just one thing
     */
    private int checkLength(int newLength)
    {
        int tempLength = newLength;
        if (tempLength < 0 )
        {
            tempLength = 0;
        }//end if
        else if (tempLength > 1200)
        {
            tempLength = 1200;
        }//end else if
        return tempLength;
    }//end length validation method checkLength



    //3. toString a must have for every great object class
    public  String toString()
    {
        String output = "";
        output += "Title: " + title;
        output += "\nArtist: " + artist;
        output += "\nHasLyrics: " + haslyrics;
        output += "\nLength: " + length;
        output += "\nFileSize: " + filesize;

        return output;
    }//end toString
}//end class Song
