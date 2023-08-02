public class Repeater {

    /**
     * The concept here is that the following characters styles must not repeat four times consecutively
     * - uppercase
     * - special characters
     * - numbers
     */

    private String allowed_special_chars = "";


    public Repeater(){

//        Boolean result = this.validateUpperCase(5, "WHATeveTESTrisHAPPYpeoplePAYDDF");
//
//        if(result){
//            System.out.println("UpperCase validation passed");
//        }else{
//            System.out.println("UpperCase validation failed");
//        }

//        Boolean numberResult = this.validateNumber(2, "WHATeveTESTrisHAPPYpeoplePAYDD2F123");
//
//        if(numberResult){
//            System.out.println("Number validation passed");
//        }else{
//            System.out.println("Number validation failed");
//        }


        Boolean specResult = this.validateSpecialChars(2, "@WHATeveTESTris@#HAPPYpeoplePAYDD2F123@!$$");

        if(specResult){
            System.out.println("Char validation passed");
        }else{
            System.out.println("Char validation failed");
        }

    }

    // the main entry of the class here
    public static void main(String[] args) {

        // create an instance of the class
        Repeater policy = new Repeater();

    }



    public boolean validateNumber(int max_number, String password){
        String digit_string = "";
        String old_digit_string = "";
        String other_string = "";

        if(password.length() != 0){

            for( int i = 0; i < password.length(); i++){
                //look for character with uppercase
                //add that to a string
                if(Character.isDigit(password.charAt(i))){
                    // this is a digit

                    // check whether this index is not 0
                    // if the index is not 0, then it means that there are characters already
                    if(i != 0){
                        // perform other checks
                        if(digit_string.length() > max_number ){

                            if(!password.contains(digit_string)){
                                // then reset
                                old_digit_string = digit_string;
                                digit_string = "";

                            }else{

                                // the test has failed
                                System.out.println("Test failed");
                                return false;

                            }




                        }
                    }

                    digit_string += password.charAt(i);




                }else{
                    // this lower case..
                    //this means a other_string character has been encountered..
                    //check if the length of the digit_string is already pass the requirements
                    if(digit_string.length() > max_number){
                        // there is no point continuing with the checkings
                        // break out the loop

                        System.out.println("Test failed");
                        return false;

                    }else{
                        other_string += password.charAt(i);
                        // continue to check for other parameters like other_string...
                        // look at the number of other_string present
                        if(other_string.length() <= 1){
                            // then there is  need to reset the uppercase_string
                            // reset the uppercase_string variable
                            // pass all data from uppercase_string variable to old_uppercase_string
                            old_digit_string = digit_string;
                            digit_string = "";
                        }else{
                            // reset the lowercase
                            other_string = "";
                        }
                    }

                }
                //System.out.println("Old Uppercase: " + old_digit_string);
            }


            digit_string = digit_string.trim();


            // check for old_digit_string and digit_string variables
            if(!old_digit_string.isEmpty() && !digit_string.isEmpty()){
                // there's data in both variables

                // you know that old_digit_string CANNOT be more than the required at this point
                // so the focus should be on uppercase_string
                if(digit_string.length() > max_number){
                    // test has failed

                    System.out.println("Test failed");
                    return false;
                }


                System.out.println("Test passed");
                return true;
            }

            // extra conditions
            if(digit_string.isEmpty()){
                // uppercase is empty
                if(old_digit_string.length() <= max_number){
                    System.out.println("Test Passed");
                    return true;

                }


            }

            if(!digit_string.isEmpty()){
                if(digit_string.length() > max_number){
                    System.out.println("Test Failed");
                    return false;
                }


                System.out.println("Test passed");
                return true;

            }



//            System.out.println(old_digit_string);
//            System.out.println(digit_string);


        }


        return false;


    }


    /**
     * This method validates the total number of uppercase that can be repeated consecutively
     * @param number
     * @param password
     * @return
     */
    public boolean validateUpperCase(int max_number, String password){

        String uppercase_string = "";
        String old_uppercase_string = "";
        String lowercase_string = "";

        if(password.length() != 0){

            for( int i = 0; i < password.length(); i++){
                //look for character with uppercase
                //add that to a string
                if(Character.isUpperCase(password.charAt(i))){
                    // this is upppercase

                    // check whether this index is not 0
                    // if the index is not 0, then it means that there are characters already
                    if(i != 0){
                        // perform other checks
                        // get the current uppercase_string
                        //System.out.println("Current Uppercase String: " + uppercase_string);
                        if(uppercase_string.length() > max_number ){

                            if(!password.contains(uppercase_string)){
                                // then reset
                                old_uppercase_string = uppercase_string;
                                uppercase_string = "";

                            }else{

                                // the test has failed
                                //System.out.println("Test failed");
                                return false;

                            }




                        }
                    }

                    uppercase_string += password.charAt(i);




                }else{
                    // this lower case..
                    //this means a lowercase character has been encountered..
                    //check if the length of the uppercase_string is already pass the requirements
                    if(uppercase_string.length() > max_number){
                        // there is no point continuing with the checkings
                        // break out the loop
//                        System.out.println("Test failed upper 1: "+ uppercase_string);
//                        System.out.println("Test failed old_upper 1: "+ old_uppercase_string);
//                        System.out.println("Test failed lower: 1 "+ lowercase_string);
                        //System.out.println("Test failed");
                        return false;

                    }else{
                        lowercase_string += password.charAt(i);
                        // continue to check for other parameters like lowercase...
                        // look at the number of lowercase present
                        if(lowercase_string.length() <= 1){
                            // then there is  need to reset the uppercase_string
                            // reset the uppercase_string variable
                            // pass all data from uppercase_string variable to old_uppercase_string
                            old_uppercase_string = uppercase_string;
                            uppercase_string = "";
                        }else{
                            // reset the lowercase
                            lowercase_string = "";
                        }
                    }

                }
                //System.out.println("Old Uppercase: " + old_uppercase_string);
            }


            uppercase_string = uppercase_string.trim();

//            System.out.println("Old Uppercase: " + old_uppercase_string);
//            System.out.println("New Uppercase: " + uppercase_string);

            // check for old_uppercase_string and uppercase_string variables
            if(!old_uppercase_string.isEmpty() && !uppercase_string.isEmpty()){
                // there's data in both variables

                // you know that old_uppercase_string CANNOT be more than the required at this point
                // so the focus should be on uppercase_string
                if(uppercase_string.length() > max_number){
                    // test has failed
//                    System.out.println("Test failed upper: 2 "+ uppercase_string);
//                    System.out.println("Test failed old_upper: 2 "+ old_uppercase_string);
//                    System.out.println("Test failed lower: 2 "+ lowercase_string);
                    //System.out.println("Test failed");
                    return false;
                }


//                System.out.println("Test PASSED upper: 2 "+ uppercase_string);
//                System.out.println("Test PASSED old_upper: 2 "+ old_uppercase_string);
//                System.out.println("Test PASSED lower: 2 "+ lowercase_string);
                //System.out.println("Test passed");
                return true;
            }

           // extra conditions
            if(uppercase_string.isEmpty()){
                // uppercase is empty
                if(old_uppercase_string.length() <= max_number){
                    //System.out.println("Test Passed");
                    return true;

                }


            }

            if(!uppercase_string.isEmpty()){
                if(uppercase_string.length() > max_number){
                    //System.out.println("Test Failed");
                    return false;
                }


                //System.out.println("Test passed");
                return true;

            }



//            System.out.println(old_uppercase_string);
//            System.out.println(uppercase_string);


        }


        return false;


    }



    public void setAllowedSpecialCharacters(String special_characters){
        this.allowed_special_chars = special_characters;

    }





    /**
     *
     * @param max_number
     * @param password
     * @return
     */
    public boolean validateSpecialChars(int max_number, String password){

        String special_char_string = "";
        String old_special_char_string = "";
        String other_char_string = "";

        //check if special character is set
        String specialChars = "!#$%&'()*+,-./:;<=>?@[]^_`{|}";
//        if(this.allowed_special_chars.trim().isEmpty()){
//            specialChars = this.allowed_special_chars;
//        }


        if(!password.isEmpty()){

            for( int i = 0; i < password.length(); i++){

             if( specialChars.contains(Character.toString(password.charAt(i))) ){
                 // the password contains a special character
                 if(i != 0){
                     // perform other checks

                     if(special_char_string.length() > max_number ){

                         if(!password.contains(special_char_string)){
                             // then reset
                             old_special_char_string = special_char_string;
                             special_char_string = "";

                         }else{

                             // the test has failed
                             //System.out.println("Test failed");
                             return false;

                         }




                     }
                 }

                 special_char_string += password.charAt(i);
             }else{

                 // this lower case..
                 //this means a lowercase character has been encountered..
                 //check if the length of the uppercase_string is already pass the requirements
                 if(special_char_string.length() > max_number){

                     return false;

                 }else{
                     other_char_string += password.charAt(i);
                     // continue to check for other parameters like lowercase...
                     // look at the number of lowercase present
                     if(other_char_string.length() <= 1){
                         // then there is  need to reset the uppercase_string
                         // reset the uppercase_string variable
                         // pass all data from uppercase_string variable to old_uppercase_string
                         old_special_char_string = special_char_string;
                         special_char_string = "";
                     }else{
                         // reset the lowercase
                         other_char_string = "";
                     }
                 }


             }

            }

            special_char_string = special_char_string.trim();


            // check for old_special_char_string and special_char_string variables
            if(!old_special_char_string.isEmpty() && !special_char_string.isEmpty()){
                // there's data in both variables


                if(special_char_string.length() > max_number){

                    return false;
                }

                return true;
            }

            // extra conditions
            if(special_char_string.isEmpty()){

                if(old_special_char_string.length() <= max_number){
                    //System.out.println("Test Passed");
                    return true;

                }


            }

            if(!special_char_string.isEmpty()){
                if(special_char_string.length() > max_number){
                    //System.out.println("Test Failed");
                    return false;
                }


                //System.out.println("Test passed");
                return true;

            }




        }


        return false;

    }


}
