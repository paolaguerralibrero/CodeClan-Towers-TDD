public enum RoomType {

    SINGLE(1,1),
    DOUBLE(2,2),
    TRIPLE(3,3),
    FAMILY(4,4);

    private final int value;
    private int capacity;

    RoomType(int value, int capacity){
        this.value = value;
        this.capacity = capacity;

    }

    public int getValue(){
        return this.value;
    }
}
