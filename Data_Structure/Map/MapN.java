package Data_Structure.Map;
public class MapN<K, V> {
    class Node {
        K key;
        V values;

        Node next;
        Node pre;

        public Node(K key, V value, Node node) {
            this.key = key;
            this.values = value;
            this.pre = node;
            this.next = null;
            if (node != null)
                node.next = this;
        }
    }

    public Node node = null;

    public MapN() {
    }

    void add(K key, V value) {
        // Node n = node;
        // while(n!=null){
        //     if (n.key.equals(key)) {
        //         System.out.println("Key " + key + " is already, please try again !");
        //     }else{
                node = new Node(key, value, node);
        //     }
        // }

    }

    Boolean remove(K key) {
        for (Node n = node; n != null; n = n.pre) {
            if (n.key.equals(key)) {
                if (n.pre == null) {
                    n = n.next;
                    n.pre = null;

                } else if (n.next == null) {
                    node = node.pre;
                    node.next = null;
                    System.out.println(n.next);
                } else {
                    n.pre.next = n.next;
                    n.next.pre = n.pre;
                }
                show();
                return true;
            }

        }
        return false;
    }

    void show() {
        Node n = node;
        while (n != null) {
            System.out.println(n.key + " " + n.values);
            n = n.pre;
        }
    }

    public static void main(String[] args) {
        MapN mymap2 = new MapN();

        // for(int i = 1 ; i<= 5 ; i++){
        // mymap2.add(i, i);
        // }
        mymap2.add(1, 2);
        mymap2.add(2, 3);
        mymap2.show();
        System.out.println(mymap2.remove(2));
        mymap2.show();
    }

}
