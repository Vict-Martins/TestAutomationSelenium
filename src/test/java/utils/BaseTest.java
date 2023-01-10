package utils;

import org.junit.After;
import org.junit.Before;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import static utils.Browser.close;
import static utils.Browser.getCurrentDriver;

public class BaseTest {

    public String cpfValidGenerator() throws Exception{

        int type1 = 0, type2 = 0, rest = 0;
        String nDigResult;
        String concatenationNumber ;
        String generateNumber;
        Random randomNumber = new Random();

        int n1 = randomNumber.nextInt( 10 );
        int n2 = randomNumber.nextInt( 10 );
        int n3 = randomNumber.nextInt( 10 );
        int n4 = randomNumber.nextInt( 10 );
        int n5 = randomNumber.nextInt( 10 );
        int n6 = randomNumber.nextInt( 10 );
        int n7 = randomNumber.nextInt( 10 );
        int n8 = randomNumber.nextInt( 10 );
        int n9 = randomNumber.nextInt( 10 );


        int sum = n9*2 + n8*3 + n7*4 + n6*5 + n5*6 + n4*7 + n3*8 + n2*9 + n1*10;

        int value = ( sum / 11 ) * 11;

        type1 = sum - value;

        rest = ( type1 % 11 );

        if( type1 < 2 ){
            type1 = 0;
        }
        else {
            type1 = 11 - rest;
        }

        int sum2 = type1 * 2 + n9*3 + n8*4 + n7*5 + n6*6 + n5*7 + n4*8 + n3*9 + n2*10 + n1*11;

        int value2 = ( sum2 / 11 )*11;

        type2 = sum2-value2;

        rest = ( type2 % 11 );

        if( type2 < 2 ){
            type2 = 0;
        }
        else {
            type2 = 11 - rest;
        }

        //Concatenação com formatação pontos e traço
        /*concatenationNumber  = String.valueOf(n1) + String.valueOf(n2) + String.valueOf(n3) +"." + String.valueOf(n4) +
                String.valueOf(n5) + String.valueOf(n6) +"."+ String.valueOf(n7) +String.valueOf(n8)  +
                String.valueOf(n9)+"-";*/

        concatenationNumber  = String.valueOf( n1 ) + String.valueOf( n2 ) + String.valueOf( n3 ) + String.valueOf( n4 ) +
                String.valueOf( n5 ) + String.valueOf( n6 ) + String.valueOf( n7 ) +String.valueOf( n8 )  +
                String.valueOf( n9 );

        nDigResult = String.valueOf( type1 ) + String.valueOf( type2 );

        generateNumber = concatenationNumber + nDigResult;

        return generateNumber;
    }


    /*
   * gera uma string aleatória
   * */
  
   public String randomString( int caracterSize ) {

        String theAlphaNumericS;
        StringBuilder builder;
        theAlphaNumericS = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz";
        //create the StringBuffer
        builder = new StringBuilder( caracterSize );

        for ( int m = 0; m < caracterSize; m++ ) {
            // generate numeric
            int myindex = ( int )( theAlphaNumericS.length() * Math.random() );
            // add the characters
            builder.append( theAlphaNumericS.charAt( myindex ) );
        }
        return builder.toString();
    }

    /*
    * Generate random email containing words, numbers with gmail.com suffix
    * */

    public String randomEmail() {

        String name = randomString(10);
        String suffix = "@gmail.com";
        String concatenation = name+randomNumber(1000000,10000000)+suffix;
        return concatenation;

    }

    /*
    * Generates a random integer within the range indicated in the parameter
    * */

    public String randomNumber( int min, int max ){

        Random num = new Random();
        int result = num.nextInt( ( max - min ) ) + min;
        //Casting int for string
        String resultCastingForString = String.valueOf( result );
        return resultCastingForString;

    }

    /*
    * apply delay in seconds
    * */

    public void delay( int num ) throws InterruptedException {

        TimeUnit.SECONDS.sleep( num );

    }

    /*
     * return day, month and year current
    */

    public String currentTime() {

        Date data = new Date( System.currentTimeMillis() ); 
        SimpleDateFormat formatarDate = new SimpleDateFormat( "yyyy/MM/dd" ); 
        return formatarDate.format( data );

    }

    @Before
    public void startTest() {

        getCurrentDriver();

    }

    @After
    public void finishTest()  {

        close();

    }

    public String getCurrentUrl()  {

        return getCurrentDriver().getCurrentUrl();

    }

}
