import javax.swing.Action


class Labmdas {

fun add (a:Int,b:Int,addsum:(Int,Int)->Int)
{
 addsum(a,b).also { println("The Sum Of Two Numbers is = $it") }
}


}
fun main()
{
var addsum: (Int,Int)->Int={a,b->a+b}
    val lamda=Labmdas()
    lamda.add(2,3,addsum) //one way  to call high oder function


    lamda.add(3,5,{a,b->a+b})// 2nd way

    lamda.add(5,10){g,a->a+g}//3rd way



}