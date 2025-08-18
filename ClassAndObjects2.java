class Song{
    // declare variables
    String title;
    String artist;
    float duration;
    // declaring methods
    void play(){
        System.out.println("Playing the song "+title+" by "+ artist+" of duration "+duration);
    }
    void pause(){
        System.out.println(title+" song has been paused.");
    }

    void addToPlayList(){
        System.out.println(title+" song has been added to playlist.");
    }
}
// main class
class ClassAndObjects2{
    public static void main(String[] args) {
    //Creating obj1 for SOng class
    Song song1 = new Song();
    song1.title = "Mayavi";
    song1.artist = "Sonu Nigam";
    song1.duration = 5.6f;
    //Creating song 2
    Song song2 = new Song();
    song2.title ="Neenade Na";
    song2.artist = "Arman Mallik";
    song2.duration = 5.6f;

    //calling methods
    song1.play();
    song1.pause();
    song1.addToPlayList();
    song2.play();
    song2.pause();
    song2.addToPlayList();
    }
}



