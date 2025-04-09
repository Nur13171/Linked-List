

 class Nod{
    int data;
    Nod next;

    Nod(int d){
        data = d;
        next = null;
    }
}

public class LinkedListExample2 {
    public static void main(String args[]){
        Nod head = new Nod(10);
        Nod temp = head; //10|null ,  20| null,

        for (int i =2; i < 6 ; i++){
            temp.next = new Nod(i*10); // 10|* -> 20| null
            temp = temp.next;
        }


        Nod n = head;

        while (n != null){
            System.out.print(n.data +"\t");
            n = n.next;
        }

    }
}
