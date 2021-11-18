package p8_package;

public class WorkingTestClass
   {
    public static final char ASTERISK_CHAR = '*';

    public static final char SPACE_CHAR = ' ';

    public static void main(String[] args)
       {
          // print first line
             // methods : printSpaces, printAsterisks, printEndline
          printSpaces( 4 );
          printAsterisks( 5 );
          printEndline();
          
          // print second line
             // methods : printSpaces, printAsterisks, printEndline
          printSpaces( 3 );
          printAsterisks( 7 );
          printEndline();
          
          // print third line
             // methods : printSpaces, printAsterisks, printEndline
          printSpaces( 2 );
          printAsterisks( 9 );
          printEndline();
          
          // print fourth line
             // methods : printSpaces, printAsterisks, printEndline
          printSpaces( 2 );
          printAsterisks( 9 );
          printEndline();
       
          // print fifth line
             // methods : printSpaces, printAsterisks, printEndline
          printSpaces( 2 );
          printAsterisks( 9 );
          printEndline();
          
          // print sixth line
             // methods : printSpaces, printAsterisks, printEndline
          printSpaces( 3 );
          printAsterisks( 7 );
          printEndline();
          
          // print seventh line
          // methods : printSpaces, printAsterisks, printEndline
          printSpaces( 4 );
          printAsterisks( 5 );
          printEndline();
 
       }
          
    public static void printAsterisk()
       {
        System.out.print( "" + ASTERISK_CHAR );
       }
    
    public static void printSpace()
       {
        System.out.print( "" + SPACE_CHAR );
       }

    public static void printAsterisks( int numAsterisks )
       {
        if( numAsterisks > 0 )
           {
            printAsterisk();
            
            printAsterisks( numAsterisks - 1 );
           }
       }

    public static void printSpaces( int numSpaces )
       {
        if( numSpaces > 0 )
           {
            printSpace();
              
            printSpaces( numSpaces - 1 );
           }
       }

    public static void printEndline()
       {
        System.out.println();
       }
    
   }
