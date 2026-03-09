package Assessment1.Model4;

class GarbageCollectionExample {

    String objectName;

    GarbageCollectionExample(String name) {
        objectName = name;
    }

    protected void finalize() {
        System.out.println(objectName + " object is being garbage collected");
    }

    public static void main(String[] args) {

        GarbageCollectionExample firstObject =
                new GarbageCollectionExample("First");

        GarbageCollectionExample secondObject =
                new GarbageCollectionExample("Second");

        firstObject = null;
        secondObject = null;

        System.gc();   
    }
}