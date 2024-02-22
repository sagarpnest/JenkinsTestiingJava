class incla{
    void add()
    {
        System.out.println("Class");
    }
}
class hello extends incla{
    public static void main(String[] args)
    {
        hello obj= new hello();
        obj.add();
        System.out.println("Hello world");
    }
}