

fun main() {
    var account = CurrentAccount(758862979, "OchwadaWalala", 56000)
    account.deposit(100.00)
    println(account.balance)
    account.deposit(200.50)
    println(account.balance)
    account.details()
    names()



}

//Create a class CurrentAccount with the following attributes:account
//number, account name, balance. It has the following functions:
//a.deposit(amount: Double) - Increments the balance by the
//amount deposited
//b.withdraw(amount: Double) - Decrements the balance by the
//amount withdrawn
//c.details() - Prints out the account number and balance and
//name in this format: “Account number x with balance y is
//operated by z
open class CurrentAccount(var accountNumber: Int, var accountName: String, var balance: Int) {
    fun deposit(amount: Double){
       balance+=amount
        return balance
    }

   open fun withdraw(amount: Double) {
        balance-=amount
        return balance

}

fun details() {
    println("Account number $accountNumber with balance $balance is operated by $accountName")
}

}
//Create another classSavingsAccount. It has the same functions and
//attributes as the current account except for one attribute,
//withdrawals: Int. Withdrawals is a counter variable that is used to
//keep track of how many withdrawals have been made from the account
//in a year. The only other difference is that the savings account
//withdraw() method first checks if the number of withdrawals is less
//than 4 for it to allow one to withdraw money from the account. It also
//increments the withdrawals attribute after a successful withdrawal
class SavingsAccount(accountNumber: Int, accountName: String, balance: Int):CurrentAccount(accountNumber, accountName, balance){
   fun withdrawals():Int{

   }

    override fun withdraw(amount: Double) {
       // super.withdraw(amount)
       if (withdrawals(<4){
           println()
        }
    }
}
//A product is represented by a data class with these attributes: name,
//weight, price, category. Category can either be groceries, hygiene or
//other. Write a function that takes in a product and uses a when
//statement to assign each product to a list based on its category
data class (var name:String, var weight:Int, var price:Int, var category:String){
    fun groceries(){

    }

}
//Write a function that given a string returns a string composed of only
//the characters in even indices. For example given “banana” it will return
//“bnn”
fun names(){
    var x = "Pineapple"
    println()

}