package interview.upendra.com.interviewtest;

import java.io.Serializable;

/**
 * Created by upendra on 13/03/19.
 */


/**Serializable is the Marker Interface it did not contain any method,
 * If something implementing Seriazable means it ( instance Of Serializable means for specific purpose
 *
 * this student object can be shared across other network and system, As we know java is able to read the
 * Object from it Reference from the Heap memory. But other real world system can not read this reference,
 * means it has to convert into the Byte stream by using (FileOutputStream and Object output Stream)
 * And then deserilize using the (FileInput Stream and ObjectInputStream)
 *
 * It has the different behaviour for static variable and trasient variable
 *
 * Android user recommend used to Parcelable instead of Serialzable, because of is high performance
 * because it have his own write method
 *
 */

public class Student implements Serializable {

    //This value can be Serialize and Deserialize
    String name;
    // IF static variable is initialize, this will always return initialze value on Deserialize
    static String COUNTRY ="INDIA";
    // This will return null value of deserialize
    static String state;
    //This value will always retrun null value of deserialze even we initialize or set the variable
    transient String rollNumber;
    //This is govern by the 'static'
    static transient String school = "School";
    static transient String village;




}
