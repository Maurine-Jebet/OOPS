fun main() {

    var me = Human("morin",22,44)
    me.eat(5)
    me.weight
    me.birthdday()
    me.speak("I am learning kotlin")



    val User = User("Morin","Jebet","morinjebet@gmail.com","0744445","morin@gmail.com")
    println(User.email)
    println(User.FirstName)








}
class Human(var name: String,var age: Int,var weight: Int){


fun eat(foodWeight: Int){
    println("I am eating $foodWeight kgs of food")
    weight += foodWeight
    println(weight)

         }
    fun speak(speak: String){
        println(speak)
    }
    fun birthdday(){
        age += 1
        println(age)
    }
                                                                                                       }


data class User(var FirstName: String,var LastName: String,val email: String,val PhoneNumber: String, var Password: String)



