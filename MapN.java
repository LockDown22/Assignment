public class MapN<K, V> {
    class Node{
        K key;
        V values;

        Node next;
        Node pre;
        
        public Node(K key, V value, Node node) {
            this.key = key;
            this.values = value;
            this.pre = node;
            this.next = null;
            if(node != null) node.next = this;
        }
    }

    public Node node = null;

    public MapN(){
    }

    void add(K key, V value){
        node = new Node(key, value, node);
    }


    Object get(K key){
        for(Node n = node; node!=null; n = node.pre){
            if(n.key ==key){
                return n.values;
            }
        }
        return null;
    }


    Boolean remove(K key){
        for(Node n = node ; n != null ; n = n.pre){
            if(n.key.equals(key)){
                if(n.pre == null){
                    n = n.next;
                }else if(n.next == null){
                    n = n.pre;
                }else{;
                    n.pre.next = n.next;
                    n.next.pre = n.pre;
                }
                show();
                return true;
            }

        }
        return false;
    }



    void show(){
        Node n = node;
        while (n!=null) {
            System.out.println(n.key + " " + n.values);
            n = n.pre;
        }
    }
    
    public static void main(String[] args) {
        MapN mymap2 = new MapN();

       for(int i = 1 ; i<= 5 ; i++){
        mymap2.add(i, i);
       }

       mymap2.show();
       System.out.println(mymap2.remove(2));
       System.out.println(mymap2.remove(1));
       mymap2.show();
    }
}
