class Song{

    String title;
    Song next;
    Song prev;

    public Song(String title){
        this.title = title;
        this.next = null;
        this.prev = null;

    }
}

class PlayList{
    private Song head;
    private Song tail;
    private Song current;

    public void addSong(String title){
        Song newSong = new Song(title);
        if (head == null){
            head = tail = current = newSong;
        }else{
            tail.next = newSong;
            newSong.prev = tail;
            tail = newSong;
        }

        System.out.println("Added : "+title);
    }
}
public class PlayListApps {

}
