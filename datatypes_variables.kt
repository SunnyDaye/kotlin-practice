//Primitive Data Types
/*
    Type    Size(bits)    Min       Max
    Byte    8             -128      127    
    Short   16            -32768    32767
    Int     32            -2^31     2^31 - 1
    Long    64            -2^63     -2^63 - 1

    Float   32
    Double  64

    Boolean 8
    Char    8
 */

fun main(args: Array<String>){
//Variables
//Read only variable with an inferred type of string
val name = "Sunny"
//Changeable variable with an inferred type of integer
var fish = 2
//Read only variable with an explicit type of integer
val firstOffspring: Int = 71;
val secondOffspring: Int = 233;

fish += (firstOffspring + secondOffspring) - 13;
println("Number of fish after 2 rounds of offspring and a homocidal eel attack: " + fish);

val numberOfAquariums: Int = Math.ceil(fish / 30.0).toInt();
println("Number of aquariums needed: " + numberOfAquariums);

var rainbowColor: String = "yellow";

rainbowColor = "orange";

val blackColor: String = "Black";
// blackColor = "purple";   causes error
//  blackColor = null; data aren't nullable unless specified

var greenColor:String? = null;
var blueColor = null;

var firstList: List<Char?> = listOf(null, null);
var secondList:List<Int>? = null;

var number:Int? = null;
number?.plus(1) ?: 0;
println("Number looks like: " + number);
}
