class SongNode{
    String title;
    SongNode next;
    SongNode prev;
    public SongNode(String title){
        this.title = title;
        this.next = null;
        this.prev = null;
    }
}
public class DoublyLinkListExample {

    SongNode head;

    public void add(String data){
        SongNode newSong = new SongNode(data);

        if (head == null){
            head = newSong;
            return;
        }

        SongNode temp = head;

        while(temp.next !=null){
            temp = temp.next;
        }

        temp.next = newSong;
        newSong.prev = temp;



    }

    public static void main(String args[]){
        DoublyLinkListExample list = new DoublyLinkListExample();
        list.add("A");
        list.add("B");
        list.add("C");


    }
}
