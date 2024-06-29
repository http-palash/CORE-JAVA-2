class A5
{
    public static void main(String[] args)
    {
        String name = "Pal";
        //Position printing
        System.out.println(name.charAt(0));
        //Length finding
        System.out.println(name.length());
        // to replace
        String name2 = name.replace( oldChar : 'a' ,newChar : 'b');
        System.out.println(name2);
    }
}