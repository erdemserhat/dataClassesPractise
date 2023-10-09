fun main(args: Array<String>) {

    //Define some variable...
    var myJavaVariable=ProgrammingLanguage("JAVA",true,true,1992)
    var myCSharpVariable=ProgrammingLanguage("C#",true,true,2005)
    var myKotlinVariable=myJavaVariable.copy(name="KOTLIN")
    var copyJavaVariable=myJavaVariable.copy()

    println("myJavaVariable and copyJavaVariable's refers the  ${if (myJavaVariable===copyJavaVariable) "same object" else "different objects"}")
    println("myJavaVariable and copyJavaVariable properties are ${if(myJavaVariable==copyJavaVariable) "equivalent" else "different"}")

    println("myJavaVariable and myCSharpVariable refers the ${if(myJavaVariable===myCSharpVariable) "same object" else "different object"} ")
    println("myJavaVariable and myCSharpVariable's properties are ${if(myJavaVariable==myCSharpVariable) "equivalent" else "different"}")

    //Note:
    /**
     * === operator controls where variables reference the same object or not.
     * == operator controls where variable's attributes are equivalent or not.
     */



}