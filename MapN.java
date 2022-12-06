public class MapN<K, V> {
    class Node<K, V> {
        K key;
        V values;

        Node<K, V> pre;

        public Node(K key, V value, Node node) {
            this.key = key;
            this.values = value;
            this.pre = node;
        }
    }

    public Node node = null;

    public MapN(){

    }

    void add(K key, V value){
        node = new Node<K,V>(key, value, node);
            // System.out.println(node.key);
            // System.out.println(node.values);
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
        for(Node n = node ; node != null ; n = node.pre){
            if(n.key == key){
                n = n.pre;
            }
            
            if(n.pre.key == key){
                n.pre = n.pre.pre;
                return true;
            }
        }
        return false;
    }

    // void show(){
        
    //     for(int i = 0 ; i<5 ;i++){
    //         System.out.println();

    //     }

    // }


    public static void main(String[] args) {
        MapN mymap2 = new MapN();

       for(int i = 1 ; i<= 5 ; i++){
        mymap2.add(i, i);
       }
       mymap2.remove(1);


    }
}
