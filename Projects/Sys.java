public class Sys {
    public static void main( String [] args ) {
        Runtime rt = Runtime.getRuntime();
        try {
            rt.exec( "cmd.exe /c start a.py" );
        }
        catch (Throwable t) {
            System.out.println( "oops" );
        }
    }
}