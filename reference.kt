class Name{
    var name:String = ""
    
    fun printName(){
        println("The name is $name" )
    }
    
    }

fun main() {
    val emma = Name()
    emma.name = "emma"
    emma.printName()
    
    val jack = emma
    jack.printName()
    
    emma.name = "newName"
    emma.printName()
    
    jack.printName()
    
    if( jack === emma)
    	println("they are the same")
    
}
