## Working with RepeaterPolicies
### This project is intended for educational purposes at Cyclobold School of Software Engineering
Please report questions to **[olu@cyclobold.com](mailto:olu@cyclobold.com)**

Visit https://cyclobold.com for more information.
<hr>

- Add the code as a package to your project 
- Declare an import command at the top of your project: 
  ```java
     import com.cyclobold.repeaterplicies.Repeater;
    ```

- Create a new instance of the class. 
  ```java
     Repeater repeater = new Repeater();
  ```
- Now you can use the methods available
  ```java 
     repeater.validateUpperCase(4, "MySamplePASSWORD");
  ```

<hr>
<h4>Methods Available</h4>
<h5>1. validateUpperCase(int maxNumber, String password):</h5> 
This method enforces a policy that prevents repetition of uppercase beyond the maximum 
declared in the method (maxNumber). The second argument is the password to enforce the 
policy on.

<h5>2. validateNumber(int maxNumber, String password):</h5>
This method enforces a policy that prevents repetition of numbers beyond the maximum
declared in the method (maxNumber). The second argument is the password to enforce the
policy on.

<h5>3. validateSpecialChars(int maxNumber, String password):</h5>
This method enforces a policy that prevents repetition of special characters beyond the maximum
declared in the method (maxNumber). The second argument is the password to enforce the
policy on. Please feel free to directly edit the special characters to check. You will 
that editing the special characters is incredibly easy to do. Within the validateSpecialChars() 
method, you will find the variable **specialChars**